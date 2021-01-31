package ��֮����;

import java.io.File;

import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.SourceDataLine;
import javax.swing.JFrame;

public class MusicThread implements MusicFiles{
	public static class MusicRun implements Runnable{
        private boolean isStop = false;
        private int n = 0;
        public void setMusic(int n) {
        	this.n = n;
        }
        public void setStop(){
            this.isStop = true;
        }
        @Override
        public void run() {
            while (!isStop){
                playMusic(music[n]);
            }
        } 
    }
	public static void playMusic(String filepath) {// �������ֲ���
		try {
			AudioInputStream ais = AudioSystem.getAudioInputStream(new File(filepath));
			AudioFormat aif = ais.getFormat();
			final SourceDataLine sdl;
			DataLine.Info info = new DataLine.Info(SourceDataLine.class, aif);
			sdl = (SourceDataLine) AudioSystem.getLine(info);
			sdl.open(aif);
			sdl.start();
			FloatControl fc = (FloatControl) sdl.getControl(FloatControl.Type.MASTER_GAIN);
			// value��������������������0-2.0
			double value = 2;
			float dB = (float) (Math.log(value == 0.0 ? 0.0001 : value) / Math.log(10.0) * 20.0);
			fc.setValue(dB);
			int nByte = 0;
			int writeByte = 0;
			final int SIZE = 1024 * 64;
			byte[] buffer = new byte[SIZE];
			while (nByte != -1) {
				nByte = ais.read(buffer, 0, SIZE);
				sdl.write(buffer, 0, nByte);
			}
			sdl.stop();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
