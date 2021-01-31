package ��֮����;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.*;

import ��֮����.MusicThread.MusicRun;



public class MemInfo extends JFrame{
	private ImageIcon back;
	private ImageIcon memImage;
	private String name;
	private String sex;
	private String briefInfo;
	private ImageIcon skill1;
	private ImageIcon skill2;
	private ImageIcon maxskill;
	
	public MemInfo(String framename, AllXiaos xiao, AllXiaos xiaobefore){
		super(framename);
		
		this.name = xiao.getName();
		this.back = xiao.getBack();
		this.memImage = xiao.getMemImage();
		this.sex = xiao.getSex();
		this.briefInfo = xiao.getBriefInfo();
		this.skill1 = xiao.getSkill1();
		this.skill2 = xiao.getSkill2();
		this.maxskill = xiao.getMaxskill();
		
		MusicRun MR = new MusicRun();//��BGM
		switch (this.name) {
		case "�Ƕ�":MR.setMusic(3);break;
		case "�ɶ�":MR.setMusic(4);break;
		case "������":MR.setMusic(5);break;
		case "���ǲ���":MR.setMusic(6);break;
		case "��������":MR.setMusic(7);break;
		case "����":MR.setMusic(8);break;
		case "��":MR.setMusic(9);break;
		case "С��":MR.setMusic(10);break;
		case "���":MR.setMusic(11);break;
		case "�ϴ���":MR.setMusic(12);break;
		case "Ы":MR.setMusic(13);break;
		}
		Thread MT = new Thread(MR);
		MT.start();

		setBounds(0,0,2*memImage.getIconWidth(), memImage.getIconHeight());//���ô��ڴ�С
		setLocationRelativeTo(null);//���ô���λ������Ļ����
		setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		setResizable(false);
		
		Container ct = this.getContentPane();
		ct.setLayout(new GridLayout(1,2));
		
		JPanel p1 = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(memImage.getImage(), 0, 0, memImage.getIconWidth(), memImage.getIconHeight(), memImage.getImageObserver());
            }
		};
		p1.setLayout(null);
		JButton Bback = new JButton(back);
		Bback.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				MT.stop();
				if(framename.equals("ѡ���ɫA"))
	        		new selectMem("ѡ���ɫA", new AllXiaos());
	        	else new selectMem("ѡ���ɫB", xiaobefore);
			}
			
		});
		Bback.setContentAreaFilled(false);
		Bback.setBorderPainted(false);
		p1.add(Bback);
		Bback.setBounds(-5, -5, back.getIconWidth(), back.getIconHeight());
		
		ImageIcon ����info = new ImageIcon("Image\\���ڱ���\\����info.jpg");
		JPanel p2 = new JPanel() {
			public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(����info.getImage(), 0, 0, ����info.getIconWidth(), ����info.getIconHeight(), ����info.getImageObserver());
            }
		};
		p2.setLayout(null);
		
		
		JLabel b1 = new JLabel("����: "+name);
		b1.setFont(new Font("�꿬��", Font.BOLD, 40));
		b1.setBounds(70, 30, 300, 150);
		JLabel b2 = new JLabel("�Ա�: "+sex);
		b2.setFont(new Font("�꿬��", Font.BOLD, 40));
		b2.setBounds(70, 90, 200, 150);
		JTextArea b3 = new JTextArea(briefInfo);
		b3.setLineWrap(true);
		b3.setWrapStyleWord(true);
		b3.setEditable(false);
		b3.setBounds(70, 220, 400, 130);
		b3.setOpaque(false);
		
		JLabel b4 = new JLabel(skill1);
		b4.setBounds(70, 600-116-116, 483, 116);
		JLabel b5 = new JLabel(skill2);
		b5.setBounds(70, 600-116+10, 483, 116);
		JLabel b6 = new JLabel(maxskill);
		b6.setBounds(70, 600+20, 483, 116);

		p2.add(b1);
		p2.add(b2);
		p2.add(b3);
		p2.add(b4);
		p2.add(b5);
		p2.add(b6);
		
		ct.add(p1);
		ct.add(p2);
		
		this.setVisible(true);
		
		this.requestFocus();//����д��setVisible����
		this.addKeyListener(new KeyAdapter() {
		    public void keyPressed(KeyEvent e) {
		        // ��ȡ��ֵ���� KeyEvent.VK_XXXX �����Ƚ�ȷ�������µİ���
		        int keyCode = e.getKeyCode();
		        System.out.println("����: " + e.getKeyCode());
		        if(keyCode==8) {
		        	setVisible(false);
		        	MT.stop();
		        	if(framename.equals("ѡ���ɫA"))
		        		new selectMem("ѡ���ɫA", new AllXiaos());
		        	else new selectMem("ѡ���ɫB", xiaobefore);
		        }
		        else if(keyCode==10) {
		        	setVisible(false);
		        	MT.stop();
		        	if(framename.equals("ѡ���ɫA")) {
		        		new selectMem("ѡ���ɫB", xiao);
		        	}
		        	else if(framename.equals("ѡ���ɫB")) {
						new GameWindow(xiaobefore, xiao);
		        	}
		        }
		    }
		});
	}
}
