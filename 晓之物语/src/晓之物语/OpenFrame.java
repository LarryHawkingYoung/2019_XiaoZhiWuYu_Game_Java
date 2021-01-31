package 晓之物语;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.io.File;
import java.io.FileInputStream;
import java.net.MalformedURLException;
import java.net.URI;

import javax.print.DocFlavor.URL;
import javax.sound.sampled.AudioFormat;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.DataLine;
import javax.sound.sampled.FloatControl;
import javax.sound.sampled.SourceDataLine;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.WindowConstants;
import 晓之物语.MusicThread.MusicRun;

public class OpenFrame extends JFrame implements MusicFiles {
	public OpenFrame(String name) {
		super(name);
		
		MusicRun MR0 = new MusicRun();//放BGM
		MR0.setMusic(0);
		Thread MT0 = new Thread(MR0);
		MT0.start();
		
		ImageIcon openBg = new ImageIcon("Image\\窗口背景\\oo.gif");
		this.setBounds(0,0,openBg.getIconWidth(), openBg.getIconHeight());//设置窗口大小
		this.setLocationRelativeTo(null);//设置窗口位置在屏幕中心
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JPanel jpBg = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(openBg.getImage(), 0, 0, getWidth(), getHeight(), openBg.getImageObserver());
            }
		};
		
		UpdateThread ut = new UpdateThread(jpBg);
		ut.start();
		
		this.addKeyListener(new KeyListener() {
			@Override
		    public void keyPressed(KeyEvent e) {
		        int keyCode = e.getKeyCode();
		        System.out.println("按下: " + e.getKeyCode());
		        if(keyCode==10) {
		        	setVisible(false);
		        	MT0.stop();
		        	new selectMem("选择角色A", new AllXiaos());
		        }
		    }
		    public void keyTyped(KeyEvent e) {}
		    public void keyReleased(KeyEvent e) {}
		});
		this.setContentPane(jpBg);
		this.setVisible(true);
	}
}
	
	
