package 晓之物语;

import java.awt.Graphics;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import 晓之物语.MusicThread.MusicRun;

public class Winner extends JFrame implements MusicFiles {
	public Winner(AllXiaos winner) {
		MusicRun MR = new MusicRun();//放BGM
		MR.setMusic(winner.getWinMusic());
		Thread MT = new Thread(MR);
		MT.start();
		
		setTitle("获胜者："+winner.getName());
		this.setBounds(0,0,winner.getWin().getIconWidth(), winner.getWin().getIconHeight());//设置窗口大小
		this.setLocationRelativeTo(null);//设置窗口位置在屏幕中心
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
		        System.out.println("按下: " + e.getKeyCode());
		        if(keyCode==10) {
		        	setVisible(false);
		        	MT.stop();
		        	new OpenFrame("晓の物语-----by LarryHawkingYoung");
		        }
		    }
			public void keyTyped(KeyEvent e) {}
			public void keyReleased(KeyEvent e) {}
		});
		this.setContentPane(jpBg);
		this.setVisible(true);
	}
}
