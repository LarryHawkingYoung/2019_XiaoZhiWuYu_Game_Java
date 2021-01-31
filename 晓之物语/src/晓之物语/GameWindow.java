package ��֮����;

import java.awt.*;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import ��֮����.MusicThread.MusicRun;

public class GameWindow extends JFrame implements GameConfig {
	public GameWindow (AllXiaos xiaoA, AllXiaos xiaoB) {
		MusicRun MR = new MusicRun();//��BGM
		MR.setMusic(2);
		Thread MT = new Thread(MR);
		MT.start();
		
		setTitle(xiaoA.getName() + " vs " + xiaoB.getName());// ���ñ���
		setSize(length, width);// ���ô�С
		setLayout(new FlowLayout());// ���ò���
		setDefaultCloseOperation(3);// ���ô���رղ���
		setLocationRelativeTo(null);// ���ô������
		setResizable(false);// �������
		
		JPanel panel = setpanel();
		add(panel);
		setVisible(true);// ��ʾ����

		// ��װ���̼�����
		PanelListenner plis = new PanelListenner();
		addKeyListener(plis);

		// ���������ƶ��߳�
		PlayerA playerA = new PlayerA(xiaoA);
		PlayerB playerB = new PlayerB(xiaoB);
		playerA.start();
		playerB.start();
		// ����ˢ������߳�
		UpdateThread ut = new UpdateThread(panel);
		ut.start();
		
		Thread GameOver = new Thread(new Runnable() {
			@Override
			public void run() {
				while (true) {
					if(playerA.bloodleft==0 && playerB.skill1==false && playerB.skill2==false && playerB.maxskill==false && playerA.skill1==false && playerA.skill2==false && playerA.maxskill==false) {
						playerB.skill1=false;
						playerB.skill2=false;
						playerB.maxskill=false;
						try {  
			                Thread.sleep(10);  
			            } catch (InterruptedException e) {  
			                e.printStackTrace();  
			            }
						playerB.skill1=false;
						playerB.skill2=false;
						playerB.maxskill=false;
						MT.stop();
						playerB.stop();
						playerA.stop();
						ut.stop();
						setVisible(false);
						new Winner(xiaoB);
						break;
					}
					else if(playerB.bloodleft==0 && playerB.skill1==false && playerB.skill2==false && playerB.maxskill==false && playerA.skill1==false && playerA.skill2==false && playerA.maxskill==false) {
						playerA.skill1=false;
						playerA.skill2=false;
						playerA.maxskill=false;
						try {  
			                Thread.sleep(10);  
			            } catch (InterruptedException e) {  
			                e.printStackTrace();  
			            }
						playerA.skill1=false;
						playerA.skill2=false;
						playerA.maxskill=false;
						MT.stop();
						playerB.stop();
						playerA.stop();
						ut.stop();
						setVisible(false);
						new Winner(xiaoA);
						break;
					}
					try {  
		                Thread.sleep(10);  
		            } catch (InterruptedException e) {  
		                e.printStackTrace();  
		            }
				}
			}
		});
		GameOver.start();
		
		this.addKeyListener(new KeyListener() {
			@Override
		    public void keyPressed(KeyEvent e) {
		        int keyCode = e.getKeyCode();
		        System.out.println("����: " + e.getKeyCode());
		        if(keyCode==8) {
		        	MT.stop();
					playerB.stop();
					playerA.stop();
					ut.stop();
					GameOver.stop();
					setVisible(false);
		        	new GameWindow(xiaoA, xiaoB);
		        }
		        else if(keyCode==27) {
		        	MT.stop();
					playerB.stop();
					playerA.stop();
					ut.stop();
					GameOver.stop();
					setVisible(false);
					new selectMem("ѡ���ɫA", new AllXiaos());
		        }
		        else if(keyCode==10) {
		        	if(playerA.bloodleft<playerB.bloodleft) {
			        	MT.stop();
						playerB.stop();
						playerA.stop();
						ut.stop();
						GameOver.stop();
						setVisible(false);
						new Winner(xiaoB);
		        	}
		        	else if(playerA.bloodleft>playerB.bloodleft) {
			        	MT.stop();
						playerB.stop();
						playerA.stop();
						ut.stop();
						GameOver.stop();
						setVisible(false);
						new Winner(xiaoA);
		        	}
		        }
		    }
		    public void keyTyped(KeyEvent e) {}
		    public void keyReleased(KeyEvent e) {}
		});
	}
	public JPanel setpanel() {
		JPanel panel = new MyPanel();
		// ������Ϸ����С
		panel.setPreferredSize(new Dimension(length, width));
		panel.setLayout(null);
		return panel;
	}
	class MyPanel extends JPanel {
		@Override
		public void paint(Graphics g) {
			super.paint(g);

			g.drawImage(GameBG, 0, 0, length, width, null);
			PlayerA.draw(g);
			PlayerB.draw(g);
		}
	}
	class PanelListenner extends KeyAdapter {
		// ����������
		public void keyPressed(KeyEvent e) {
			int code = e.getKeyCode();
			switch (code) {
			case 65:
				PlayerA.left = true;
				break;
			case 68:
				PlayerA.right = true;
				break;
			case 87:
				// A��
				PlayerA.up = true;
				break;
			case 83:
				// D��
				PlayerA.down = true;
				break;
			case KeyEvent.VK_LEFT:
				PlayerB.left = true;
				break;
			case KeyEvent.VK_RIGHT:
				PlayerB.right = true;
				break;
			case KeyEvent.VK_UP:
				// A��
				PlayerB.up = true;
				break;
			case KeyEvent.VK_DOWN:
				// D��
				PlayerB.down = true;
				break;
				// 74=J 75=K 76=L
			case 74:
				PlayerB.skill1 = true;
				if(PlayerB.towards==2 && PlayerB.py_x <= PlayerA.py_x)
				{
					if(PlayerA.py_x-PlayerB.py_x <= PlayerB.skill1DistX && PlayerB.py_y-PlayerA.py_y<=PlayerB.skill1DistY && PlayerA.py_y-PlayerB.py_y<=PlayerB.skill1DistY)
					{
						PlayerA.hurted1();
					}
				}
				else if(PlayerB.towards==1 && PlayerB.py_x >= PlayerA.py_x)
				{
					if(PlayerB.py_x-PlayerA.py_x <= PlayerB.skill1DistX+PlayerB.staWidth && PlayerB.py_y-PlayerA.py_y<=PlayerB.skill1DistY && PlayerA.py_y-PlayerB.py_y<=PlayerB.skill1DistY)
					{
						PlayerA.hurted1();
					}
				}
				break;
			case 75:
				PlayerB.skill2 = true;
				if(PlayerB.towards==2 && PlayerB.py_x <= PlayerA.py_x)
				{
					if(PlayerA.py_x-PlayerB.py_x <= PlayerB.skill2DistX && PlayerB.py_y-PlayerA.py_y<=PlayerB.skill2DistY && PlayerA.py_y-PlayerB.py_y<=PlayerB.skill2DistY)
					{
						PlayerA.hurted1();
					}
				}
				else if(PlayerB.towards==1 && PlayerB.py_x >= PlayerA.py_x)
				{
					if(PlayerB.py_x-PlayerA.py_x <= PlayerB.skill2DistX+PlayerB.staWidth && PlayerB.py_y-PlayerA.py_y<=PlayerB.skill2DistY && PlayerA.py_y-PlayerB.py_y<=PlayerB.skill2DistY)
					{
						PlayerA.hurted1();
					}
				}
				break;
			case 76:
				PlayerB.maxskill = true;
				if(PlayerB.towards==2 && PlayerB.py_x <= PlayerA.py_x)
				{
					if(PlayerA.py_x-PlayerB.py_x <= PlayerB.maxskillDistX && PlayerB.py_y-PlayerA.py_y<=PlayerB.maxskillDistY && PlayerA.py_y-PlayerB.py_y<=PlayerB.maxskillDistY)
					{
						PlayerA.hurted2();
					}
				}
				else if(PlayerB.towards==1 && PlayerB.py_x >= PlayerA.py_x)
				{
					if(PlayerB.py_x-PlayerA.py_x <= PlayerB.maxskillDistX+PlayerB.staWidth && PlayerB.py_y-PlayerA.py_y<=PlayerB.maxskillDistY && PlayerA.py_y-PlayerB.py_y<=PlayerB.maxskillDistY)
					{
						PlayerA.hurted2();
					}
				}
				break;
			case 49:
				PlayerA.skill1 = true;
				if(PlayerA.towards==2 && PlayerB.py_x >= PlayerA.py_x)
				{
					if(PlayerB.py_x-PlayerA.py_x <= PlayerA.skill1DistX+PlayerA.staWidth && PlayerB.py_y-PlayerA.py_y<=PlayerA.skill1DistY && PlayerA.py_y-PlayerB.py_y<=PlayerA.skill1DistY)
					{
						PlayerB.hurted1();
					}
				}
				else if(PlayerA.towards==1 && PlayerB.py_x <= PlayerA.py_x)
				{
					if(PlayerA.py_x-PlayerB.py_x <= PlayerB.skill1DistX && PlayerB.py_y-PlayerA.py_y<=PlayerA.skill1DistY && PlayerA.py_y-PlayerB.py_y<=PlayerA.skill1DistY)
					{
						PlayerB.hurted1();
					}
				}
				break;
			case 50:
				PlayerA.skill2 = true;
				if(PlayerA.towards==2 && PlayerB.py_x >= PlayerA.py_x)
				{
					if(PlayerB.py_x-PlayerA.py_x <= PlayerA.skill2DistX+PlayerA.staWidth && PlayerB.py_y-PlayerA.py_y<=PlayerA.skill2DistY && PlayerA.py_y-PlayerB.py_y<=PlayerA.skill2DistY)
					{
						PlayerB.hurted1();
					}
				}
				else if(PlayerA.towards==1 && PlayerB.py_x <= PlayerA.py_x)
				{
					if(PlayerA.py_x-PlayerB.py_x <= PlayerA.skill2DistX && PlayerB.py_y-PlayerA.py_y<=PlayerA.skill2DistY && PlayerA.py_y-PlayerB.py_y<=PlayerA.skill2DistY)
					{
						PlayerB.hurted1();
					}
				}
				break;
			case 51:
				PlayerA.maxskill = true;
				if(PlayerA.towards==2 && PlayerA.py_x <= PlayerB.py_x)
				{
					if(PlayerB.py_x-PlayerA.py_x <= PlayerA.maxskillDistX + PlayerA.staWidth && PlayerB.py_y-PlayerA.py_y<=PlayerA.maxskillDistY && PlayerA.py_y-PlayerB.py_y<=PlayerA.maxskillDistY)
					{
						PlayerB.hurted2();
					}
				}
				else if(PlayerA.towards==1 && PlayerB.py_x <= PlayerA.py_x)
				{
					if(PlayerA.py_x-PlayerB.py_x <= PlayerA.maxskillDistX && PlayerB.py_y-PlayerA.py_y<=PlayerA.maxskillDistY && PlayerA.py_y-PlayerB.py_y<=PlayerA.maxskillDistY)
					{
						PlayerB.hurted2();
					}
				}
				break;
			default:
				break;
			}
		}

		// �������ͷ�
		public void keyReleased(KeyEvent e) {
			int code = e.getKeyCode();
			switch (code) {
			case 65:
				PlayerA.left = false;
				break;
			case 68:
				PlayerA.right = false;
				break;
			case 87:
				// A��
				PlayerA.up = false;
				break;
			case 83:
				// D��
				PlayerA.down = false;
				break;
			// 74=J 75=K 76=L
			case KeyEvent.VK_LEFT:
				PlayerB.left = false;
				break;
			case KeyEvent.VK_RIGHT:
				PlayerB.right = false;
				break;
			case KeyEvent.VK_UP:
				// A��
				PlayerB.up = false;
				break;
			case KeyEvent.VK_DOWN:
				// D��
				PlayerB.down = false;
				break;
			case 74:
				PlayerB.skill1 = false;
				break;
			case 75:
				PlayerB.skill2 = false;
				break;
			case 76:
				PlayerB.maxskill = false;
				break;
			case 49:
				PlayerA.skill1 = false;
				break;
			case 50:
				PlayerA.skill2 = false;
				break;
			case 51:
				PlayerA.maxskill = false;
				break;
			default:
				break;
			}
		}
	}
}
