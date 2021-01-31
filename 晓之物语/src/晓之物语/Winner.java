package ��֮����;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import ��֮����.MusicThread.MusicRun;

public class Winner extends JFrame implements MusicFiles {
	public Winner(AllXiaos winner) {
		MusicRun MR = new MusicRun();//��BGM
		MR.setMusic(winner.getWinMusic());
		Thread MT = new Thread(MR);
		MT.start();
		
		setTitle("��ʤ�ߣ�"+winner.getName());
		this.setBounds(0,0,winner.getWin().getIconWidth(), winner.getWin().getIconHeight());//���ô��ڴ�С
		this.setLocationRelativeTo(null);//���ô���λ������Ļ����
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		JPanel jpBg = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(winner.getWin().getImage(), 0, 0, getWidth(), getHeight(), winner.getWin().getImageObserver());
            }
		};
		UpdateThread ut = new UpdateThread(jpBg);
		ut.start();
		this.addKeyListener(new KeyListener() {
			@Override
		    public void keyPressed(KeyEvent e) {
		        int keyCode = e.getKeyCode();
		        System.out.println("����: " + e.getKeyCode());
		        if(keyCode==10) {
		        	setVisible(false);
		        	MT.stop();
		        	new OpenFrame("��������-----by LarryHawkingYoung");
		        }
		    }
			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		this.setContentPane(jpBg);
		this.setVisible(true);
	}
}
