package ��֮����;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import ��֮����.MusicThread.MusicRun;


public class selectMem extends JFrame {
	public selectMem(String framename, AllXiaos xiaobefore) {
		super(framename);
		
		MusicRun MR1 = new MusicRun();
		MR1.setMusic(1);
		Thread MT1 = new Thread(MR1);
		MT1.start();
		
		ImageIcon selectBg = new ImageIcon("Image\\���ڱ���\\selectBg.jpg");
		
		this.setBounds(0,0,selectBg.getIconWidth(), selectBg.getIconHeight());//���ô��ڴ�С
		this.setLocationRelativeTo(null);//���ô���λ������Ļ����
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JPanel jpBg = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("Image\\�Ƕ�\\�Ƕ�name.jpg").getImage(), 0, 0, new ImageIcon("Image\\�Ƕ�\\�Ƕ�name.jpg").getIconWidth(), new ImageIcon("Image\\�Ƕ�\\�Ƕ�name.jpg").getIconHeight(), new ImageIcon("Image\\�Ƕ�\\�Ƕ�name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\�ɶ�\\�ɶ�name.jpg").getImage(), 119, 0, new ImageIcon("Image\\�ɶ�\\�ɶ�name.jpg").getIconWidth(), new ImageIcon("Image\\�ɶ�\\�ɶ�name.jpg").getIconHeight(), new ImageIcon("Image\\�ɶ�\\�ɶ�name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\������\\������name.jpg").getImage(), 237, 0, new ImageIcon("Image\\������\\������name.jpg").getIconWidth(), new ImageIcon("Image\\������\\������name.jpg").getIconHeight(), new ImageIcon("Image\\������\\������name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\��������\\��������name.jpg").getImage(), 357, 0, new ImageIcon("Image\\��������\\��������name.jpg").getIconWidth(), new ImageIcon("Image\\��������\\��������name.jpg").getIconHeight(), new ImageIcon("Image\\��������\\��������name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\���ǲ���\\���ǲ���name.jpg").getImage(), 475, 0, new ImageIcon("Image\\���ǲ���\\���ǲ���name.jpg").getIconWidth(), new ImageIcon("Image\\���ǲ���\\���ǲ���name.jpg").getIconHeight(), new ImageIcon("Image\\���ǲ���\\���ǲ���name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\����\\����name.jpg").getImage(), 593, 0, new ImageIcon("Image\\����\\����name.jpg").getIconWidth(), new ImageIcon("Image\\����\\����name.jpg").getIconHeight(), new ImageIcon("Image\\����\\����name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\��\\��name.jpg").getImage(), 761, 0, new ImageIcon("Image\\��\\��name.jpg").getIconWidth(), new ImageIcon("Image\\��\\��name.jpg").getIconHeight(), new ImageIcon("Image\\��\\��name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\С��\\С��name.jpg").getImage(), 876, 0, new ImageIcon("Image\\С��\\С��name.jpg").getIconWidth(), new ImageIcon("Image\\С��\\С��name.jpg").getIconHeight(), new ImageIcon("Image\\С��\\С��name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\���\\���name.jpg").getImage(), 995, 0, new ImageIcon("Image\\���\\���name.jpg").getIconWidth(), new ImageIcon("Image\\���\\���name.jpg").getIconHeight(), new ImageIcon("Image\\���\\���name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\�ϴ���\\�ϴ���name.jpg").getImage(), 1112, 0, new ImageIcon("Image\\�ϴ���\\�ϴ���name.jpg").getIconWidth(), new ImageIcon("Image\\�ϴ���\\�ϴ���name.jpg").getIconHeight(), new ImageIcon("Image\\�ϴ���\\�ϴ���name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\��ɰ֮Ы\\Ыname.jpg").getImage(), 1232, 0, new ImageIcon("Image\\��ɰ֮Ы\\Ыname.jpg").getIconWidth(), new ImageIcon("Image\\��ɰ֮Ы\\Ыname.jpg").getIconHeight(), new ImageIcon("Image\\��ɰ֮Ы\\Ыname.jpg").getImageObserver());
            }
		};
		
		this.setContentPane(jpBg);
		jpBg.setLayout(null);
		
		Container ct = this.getContentPane();
		
		ImageIcon I�Ƕ� = new ImageIcon("Image\\�Ƕ�\\�Ƕ�.jpg");
		ImageIcon I�ɶ� = new ImageIcon("Image\\�ɶ�\\�ɶ�.jpg");
		ImageIcon I������ = new ImageIcon("Image\\������\\������.jpg");
		ImageIcon I�������� = new ImageIcon("Image\\��������\\��������.jpg");
		ImageIcon I���ǲ��� = new ImageIcon("Image\\���ǲ���\\���ǲ���.jpg");
		ImageIcon I���� = new ImageIcon("Image\\����\\����.jpg");
		ImageIcon I�� = new ImageIcon("Image\\��\\��.jpg");
		ImageIcon IС�� = new ImageIcon("Image\\С��\\С��.jpg");
		ImageIcon I��� = new ImageIcon("Image\\���\\���.jpg");
		ImageIcon I�ϴ��� = new ImageIcon("Image\\�ϴ���\\�ϴ���.jpg");
		ImageIcon I��ɰ֮Ы = new ImageIcon("Image\\��ɰ֮Ы\\��ɰ֮Ы.jpg");
		
		JPanel P�Ƕ� = new JPanel() {
			public void paint(Graphics g) {
				g.drawImage(I�Ƕ�.getImage(), 0, 0, 118, 768, I�Ƕ�.getImageObserver());
			}
		};
		JPanel P�ɶ� = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I�ɶ�.getImage(), 0, 0, 117, 768, I�ɶ�.getImageObserver());
			}
		};
		JPanel P������ = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I������.getImage(), 0, 0, 119, 768, this);
			}
		};
		JPanel P�������� = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I��������.getImage(), 0, 0, 117, 768, this);
			}
		};
		JPanel P���ǲ��� = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I���ǲ���.getImage(), 0, 0, 117, 768, this);
			}
		};
		JPanel P���� = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I����.getImage(), 0, 0, 167, 768, this);
			}
		};
		JPanel P�� = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I��.getImage(), 0, 0, 114, 768, this);
			}
		};
		JPanel PС�� = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(IС��.getImage(), 0, 0, 118, 768, this);
			}
		};
		JPanel P��� = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I���.getImage(), 0, 0, 116, 768, this);
			}
		};
		JPanel P�ϴ��� = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I�ϴ���.getImage(), 0, 0, 119, 768, this);
			}
		};
		JPanel P��ɰ֮Ы = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I��ɰ֮Ы.getImage(), 0, 0, 116, 768, this);
			}
		};
		
		P�Ƕ�.setBounds(0, 0, 118, 768);
		P�ɶ�.setBounds(119, 0, 117, 768);
		P������.setBounds(237, 0, 119, 768);
		P��������.setBounds(357, 0, 117, 768);
		P���ǲ���.setBounds(475, 0, 117, 768);
		P����.setBounds(593, 0, 167, 768);
		P��.setBounds(761, 0, 114, 768);
		PС��.setBounds(876, 0, 118, 768);
		P���.setBounds(995, 0, 116, 768);
		P�ϴ���.setBounds(1112, 0, 119, 768);
		P��ɰ֮Ы.setBounds(1232, 0, 116, 768);
		
		AllXiaos Xjiaodu = new AllXiaos();
		Xjiaodu.setMemImage(new ImageIcon("Image\\�Ƕ�\\�Ƕ�info.jpg"));
		Xjiaodu.setBack(new ImageIcon("Image\\�Ƕ�\\�Ƕ�back.png"));
		Xjiaodu.setBriefInfo("��֮������������Ǯ������ǿ�ҵĿ���������������Ĳ�������ָ�ɴ�ɱ������Ӱ��ʧ�ܺ�õ����ӵ��ط���֮��������޺ͽ������ӣ��������˴������̵����ࡣӵ�ж������ĽǶ���Ϊ�������ٲ���������֮һ��ǿ��Ľ����Լ������ۻ���ս�����飬ʹ���Ϊ�ֲ��Ĵ��ڡ�");
		Xjiaodu.setName("�Ƕ�");
		Xjiaodu.setSex("��");
		Xjiaodu.setSkill1(new ImageIcon("Image\\�Ƕ�\\�Ƕ�skill1.jpg"));
		Xjiaodu.setSkill2(new ImageIcon("Image\\�Ƕ�\\�Ƕ�skill2.jpg"));
		Xjiaodu.setMaxskill(new ImageIcon("Image\\�Ƕ�\\�Ƕ�maxskill.jpg"));
		
		AllXiaos Xfeiduan = new AllXiaos();
		Xfeiduan.setMemImage(new ImageIcon("Image\\�ɶ�\\�ɶ�info.jpg"));
		Xfeiduan.setBack(new ImageIcon("Image\\�ɶ�\\�ɶ�back.png"));
		Xfeiduan.setBriefInfo("�������ʱ����Ʒ��ʹ�࣬��ֹ����ɱ¾��ӵ�в���֮����һ��ף��������һ�����䡣������Ϊ�����ɹ���ʵ���壬��ս�ķɶζ�ս�������˿������κζ�а�񲻾����˶����ܵ��ɶε��������䣬������Գ�ɰ�˹��Ҳ����һ�١�������������������������ֻ��մ����Ʒ��Ѫ�����ɽ��������׸�а��ķɶΣ������������о��Կֲ��Ĵ��ڡ�");
		Xfeiduan.setName("�ɶ�");
		Xfeiduan.setSex("��");
		Xfeiduan.setSkill1(new ImageIcon("Image\\�ɶ�\\�ɶ�skill1.jpg"));
		Xfeiduan.setSkill2(new ImageIcon("Image\\�ɶ�\\�ɶ�skill2.jpg"));
		Xfeiduan.setMaxskill(new ImageIcon("Image\\�ɶ�\\�ɶ�maxskill.jpg"));
		
		AllXiaos Xdashewan = new AllXiaos();
		Xdashewan.setMemImage(new ImageIcon("Image\\������\\������info.jpg"));
		Xdashewan.setBack(new ImageIcon("Image\\������\\������back.png"));
		Xdashewan.setBriefInfo("��˵�е�ľҶ����֮һ����Ż���������ӰҲ�������ޡ�Ȼ���ڸ�ĸ��ɱ��ȴ��������;��׷���ϲ�������������ͼ�������������е���������ͨ���������о��ʹ�������Ʒ��������������Ҳȷʵ������а���ת�������;��˵�����������Ȼ����ת��ǰ��������ʱ������͵Ϯ��ѹ�ƣ�ֱ�������ǲ�����ʮȭ����ӡ������Ļ��������ռ尾��");
		Xdashewan.setName("������");
		Xdashewan.setSex("��");
		Xdashewan.setSkill1(new ImageIcon("Image\\������\\������skill1.jpg"));
		Xdashewan.setSkill2(new ImageIcon("Image\\������\\������skill2.jpg"));
		Xdashewan.setMaxskill(new ImageIcon("Image\\������\\������maxskill.jpg"));
		
		AllXiaos Xganshiguijiao = new AllXiaos();
		Xganshiguijiao.setMemImage(new ImageIcon("Image\\��������\\��������info.jpg"));
		Xganshiguijiao.setBack(new ImageIcon("Image\\��������\\��������back.png"));
		Xganshiguijiao.setBriefInfo("�������ޣ����侪�˵Ĳ����������������ββ�ޡ� ��ԭΪ���̡��̵������ڡ�֮һ��ӵ�п���ȡ���˲����תΪ���õĴ��޼����������������޳���һ����������Ŷ����������������Ҳ���������ľ���Ρ�����θ��ͨ��Ҳ�ܺã����޼�ҧס���˺ܿ��������ݽߡ���������ˮ�Լ�ˮ��֮�����ҿ��Ժ��޼���Ϊһ�壬һ�����ݹ��������ˮ��֮�У�����������ߵ����ʱ�̶��������Σ�ա�");
		Xganshiguijiao.setName("��������");
		Xganshiguijiao.setSex("��");
		Xganshiguijiao.setSkill1(new ImageIcon("Image\\��������\\��������skill1.jpg"));
		Xganshiguijiao.setSkill2(new ImageIcon("Image\\��������\\��������skill2.jpg"));
		Xganshiguijiao.setMaxskill(new ImageIcon("Image\\��������\\��������maxskill.jpg"));
		Xganshiguijiao.setSTAR(new ImageIcon("Image\\��������\\ganshiguijiaoSTAR.png"));
		Xganshiguijiao.setSTAL(new ImageIcon("Image\\��������\\ganshiguijiaoSTAL.png"));
		Xganshiguijiao.setRUNR(new ImageIcon("Image\\��������\\ganshiguijiaoRUNR.gif"));
		Xganshiguijiao.setRUNL(new ImageIcon("Image\\��������\\ganshiguijiaoRUNL.gif"));
		Xganshiguijiao.setSkill1Right(new ImageIcon("Image\\��������\\ganshiguijiaoSkill1R.gif"));
		Xganshiguijiao.setSkill1Left(new ImageIcon("Image\\��������\\ganshiguijiaoSkill1L.gif"));
		Xganshiguijiao.setSkill2Right(new ImageIcon("Image\\��������\\ganshiguijiaoSkill2R.gif"));
		Xganshiguijiao.setSkill2Left(new ImageIcon("Image\\��������\\ganshiguijiaoSkill2L.gif"));
		Xganshiguijiao.setMaxskillRight(new ImageIcon("Image\\��������\\ganshiguijiaoMaxSkillR.gif"));
		Xganshiguijiao.setMaxskillLeft(new ImageIcon("Image\\��������\\ganshiguijiaoMaxSkillL.gif"));
		Xganshiguijiao.setSkill1DistX(400);
		Xganshiguijiao.setSkill1DistY(10);
		Xganshiguijiao.setSkill2DistX(400);
		Xganshiguijiao.setSkill2DistY(10);
		Xganshiguijiao.setMaxskillDistX(500);
		Xganshiguijiao.setMaxskillDistY(15);
		Xganshiguijiao.setWin(new ImageIcon("Image\\��������\\ganshiguijiaoAOYI.gif"));
		Xganshiguijiao.setWinMusic(7);
		
		AllXiaos Xyuzhiboyou = new AllXiaos();
		Xyuzhiboyou.setMemImage(new ImageIcon("Image\\���ǲ���\\���ǲ���info.jpg"));
		Xyuzhiboyou.setBack(new ImageIcon("Image\\���ǲ���\\���ǲ���back.png"));
		Xyuzhiboyou.setBriefInfo("�Ժ�ɫ��˫�ۿ������磬����Ը�������У���֯����ʵ���� ����ʱ�Ϳ��۵ġ�д���ۡ�����Ȼ�������������ı��硣�������á�д���ۡ���ͫ�������֮�⣬����������������Ҳ�ǳ��߳��������������������������������Ͽ����������� ��ÿ���˶��������Լ���֪ʶ���뷨�����ұ���Щ���������ţ����ƺ���Щ����Ϊ��ʵ����");
		Xyuzhiboyou.setName("���ǲ���");
		Xyuzhiboyou.setSex("��");
		Xyuzhiboyou.setSkill1(new ImageIcon("Image\\���ǲ���\\���ǲ���skill1.jpg"));
		Xyuzhiboyou.setSkill2(new ImageIcon("Image\\���ǲ���\\���ǲ���skill2.jpg"));
		Xyuzhiboyou.setMaxskill(new ImageIcon("Image\\���ǲ���\\���ǲ���maxskill.jpg"));
		Xyuzhiboyou.setSTAR(new ImageIcon("Image\\���ǲ���\\yuzhiboyouSTAR.png"));
		Xyuzhiboyou.setSTAL(new ImageIcon("Image\\���ǲ���\\yuzhiboyouSTAL.png"));
		Xyuzhiboyou.setRUNR(new ImageIcon("Image\\���ǲ���\\yuzhiboyouRUNR.gif"));
		Xyuzhiboyou.setRUNL(new ImageIcon("Image\\���ǲ���\\yuzhiboyouRUNL.gif"));
		Xyuzhiboyou.setSkill1Right(new ImageIcon("Image\\���ǲ���\\yuzhiboyouSkill1R.gif"));
		Xyuzhiboyou.setSkill1Left(new ImageIcon("Image\\���ǲ���\\yuzhiboyouSkill1L.gif"));
		Xyuzhiboyou.setSkill2Right(new ImageIcon("Image\\���ǲ���\\yuzhiboyouSkill2R.gif"));
		Xyuzhiboyou.setSkill2Left(new ImageIcon("Image\\���ǲ���\\yuzhiboyouSkill2L.gif"));
		Xyuzhiboyou.setMaxskillRight(new ImageIcon("Image\\���ǲ���\\yuzhiboyouMaxSkillR.gif"));
		Xyuzhiboyou.setMaxskillLeft(new ImageIcon("Image\\���ǲ���\\yuzhiboyouMaxSkillL.gif"));
		Xyuzhiboyou.setSkill1DistX(550);
		Xyuzhiboyou.setSkill1DistY(10);
		Xyuzhiboyou.setSkill2DistX(450);
		Xyuzhiboyou.setSkill2DistY(10);
		Xyuzhiboyou.setMaxskillDistX(500);
		Xyuzhiboyou.setMaxskillDistY(15);
		Xyuzhiboyou.setWin(new ImageIcon("Image\\���ǲ���\\yuzhiboyouAOYI.gif"));
		Xyuzhiboyou.setWinMusic(6);
		
		AllXiaos Xafei = new AllXiaos();
		Xafei.setMemImage(new ImageIcon("Image\\����\\����info.jpg"));
		Xafei.setBack(new ImageIcon("Image\\����\\����back.png"));
		Xafei.setBriefInfo("�����������ɡ������ǲ��ߡ�����������Ļ���ϴ�Ϊʵ�֡���֮�ۡ��ƻ�����ҩʦ�����Ϸ������Ĵ��̽��ս����Ȼ��������Գơ����ǲ��ߡ����������Ը�������ı���Ϳ����ѱ�����ǲ��߽�Ȼ�෴�������Գƺ���ǧ�����䡣�����ڸ������ޡ������ȼ�������ǰժ�¹���ߣ�����ʵ���������Ȼ�Ǹ��ա�");
		Xafei.setName("����");
		Xafei.setSex("��");
		Xafei.setSkill1(new ImageIcon("Image\\����\\����skill1.jpg"));
		Xafei.setSkill2(new ImageIcon("Image\\����\\����skill2.jpg"));
		Xafei.setMaxskill(new ImageIcon("Image\\����\\����maxskill.jpg"));
		
		AllXiaos Xjue = new AllXiaos();
		Xjue.setMemImage(new ImageIcon("Image\\��\\��info.jpg"));
		Xjue.setBack(new ImageIcon("Image\\��\\��back.png"));
		Xjue.setBriefInfo("��ͬʳ��ֲ�����ǣ��ڰ׸�����Դ����������˼ά�����ԶԻ���˫���˸��ڡ�������Ҳ������ë���Ȼ�Ĵ��ڣ��̽����Ҫս�����������ж�����ӡ���롰������Ļ��������ǲ�������֮�󣬸����¼ս���������顣�ڰߵ����Դ�̽�����������ͬʱ��Ҳ����ս����ֻ�ǵ���������Ķ���ɹ�����?���ǡ���");
		Xjue.setName("��");
		Xjue.setSex("��");
		Xjue.setSkill1(new ImageIcon("Image\\��\\��skill1.jpg"));
		Xjue.setSkill2(new ImageIcon("Image\\��\\��skill2.jpg"));
		Xjue.setMaxskill(new ImageIcon("Image\\��\\��maxskill.jpg"));
		
		AllXiaos Xpeien = new AllXiaos();
		Xpeien.setMemImage(new ImageIcon("Image\\���\\���info.jpg"));
		Xpeien.setBack(new ImageIcon("Image\\���\\���back.png"));
		Xpeien.setBriefInfo("���������������Ӣ�ġ�Pain(ʹ��)��������ֻ����Ҫ�ػ�����������������ս��֮�ࡢ������ų���ĳ��ţ��ڻ��������ܵ���вʱ�������˴�˵�е���ǿͫ�������ֻ��ۡ�����ɽ������һս�У�������Ϊ������С�϶��Լ�ײ�ϳ��ŵĿ���ʱ���������綼ʧȥ��ɫ�ʣ�ֻ��Ļ��ϯ�صı����ڻҶȵĿռ�������������������������ʹ���ӡ��ų�����������Ǹ����꣬�����֮��������������Ľ��١���");
		Xpeien.setName("���");
		Xpeien.setSex("��");
		Xpeien.setSkill1(new ImageIcon("Image\\���\\���skill1.jpg"));
		Xpeien.setSkill2(new ImageIcon("Image\\���\\���skill2.jpg"));
		Xpeien.setMaxskill(new ImageIcon("Image\\���\\���maxskill.jpg"));
		
		AllXiaos Xxiaonan = new AllXiaos();
		Xxiaonan.setMemImage(new ImageIcon("Image\\С��\\С��info.jpg"));
		Xxiaonan.setBack(new ImageIcon("Image\\С��\\С��back.png"));
		Xxiaonan.setBriefInfo("��������Ψһ��Ů�Գ�Ա�����������塢����һ��������Ļ�����������������ƽ�����ܹ�����Ҳ������ָ�����ó�����ֽ��ص��������ڳ������������ˡ�������֯����Ϊ�������ŵ��������չ���Ծ������򲻵ж���ɱ��ֻ���������ֽƬ��ѩ�׷ɡ���");
		Xxiaonan.setName("С��");
		Xxiaonan.setSex("Ů");
		Xxiaonan.setSkill1(new ImageIcon("Image\\С��\\С��skill1.jpg"));
		Xxiaonan.setSkill2(new ImageIcon("Image\\С��\\С��skill2.jpg"));
		Xxiaonan.setMaxskill(new ImageIcon("Image\\С��\\С��maxskill.jpg"));
		
		AllXiaos Xdidala = new AllXiaos();
		Xdidala.setMemImage(new ImageIcon("Image\\�ϴ���\\�ϴ���info.jpg"));
		Xdidala.setBack(new ImageIcon("Image\\�ϴ���\\�ϴ���back.png"));
		Xdidala.setBriefInfo("�ϴ��������������̴���������ʦ���ڴ���������Ľ���֮���ڡ���ճ�����ı�ը�з������Լ���׷��ġ�����������������롰������֯������һλ�����ҳ�ɰ֮Ыһ������ͬ��Ы������֮�������ϴ�����Ϊ��������˲���Ѥ�ã����������������������������������ʱ���������裬����һֱ��Ҫ����д���ۡ�����ս���У��ܹ��侲�ķ���ս���������ݵ��˵��ص�����ճ����Ϊ��֤���Լ���������������ϧ������Ϊ���ۡ�");
		Xdidala.setName("�ϴ���");
		Xdidala.setSex("��");
		Xdidala.setSkill1(new ImageIcon("Image\\�ϴ���\\�ϴ���skill1.jpg"));
		Xdidala.setSkill2(new ImageIcon("Image\\�ϴ���\\�ϴ���skill2.jpg"));
		Xdidala.setMaxskill(new ImageIcon("Image\\�ϴ���\\�ϴ���maxskill.jpg"));
		
		AllXiaos Xxie = new AllXiaos();
		Xxie.setMemImage(new ImageIcon("Image\\��ɰ֮Ы\\Ыinfo.jpg"));
		Xxie.setBack(new ImageIcon("Image\\��ɰ֮Ы\\Ыback.png"));
		Xxie.setBriefInfo("ԭ�������Ҹ���ͥ��Ы�����ڿ���ʦ���ң���ɰ�̴�ԭ���ϡ���һ���Ŀ���ʦǧ�����ŵ����ӡ���ĸ��һ���������Ҳû�л���(������ľ˷ï֮��)��ǧ������Ϊ�˼���Ы��ʹ����������������Ыȴ�����Լ����ո�ĸ���������Ŀ�������˱��䣬ʹ���Ы�����ߣ���ʼɱ¾֮·������ܵ�ǿ���Ƴ��˿��ܣ����а���������ǿ��������Ӱ����������Ы�Լ�����ΪЫ��Ϊ��������޳���ֻ�п��ܲ��������������");
		Xxie.setName("Ы");
		Xxie.setSex("��");
		Xxie.setSkill1(new ImageIcon("Image\\��ɰ֮Ы\\Ыskill1.jpg"));
		Xxie.setSkill2(new ImageIcon("Image\\��ɰ֮Ы\\Ыskill2.jpg"));
		Xxie.setMaxskill(new ImageIcon("Image\\��ɰ֮Ы\\Ыmaxskill.jpg"));
		
		
		P�Ƕ�.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xjiaodu, xiaobefore);

			}
			@Override
			public void mousePressed(MouseEvent e) {
				// TODO Auto-generated method stub
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xjiaodu, xiaobefore);

			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P�Ƕ�.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P�Ƕ�.setVisible(true);
			}
		});
		
		P�ɶ�.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xfeiduan, xiaobefore);

			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xfeiduan, xiaobefore);

			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P�ɶ�.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P�ɶ�.setVisible(true);
			}
		});
		
		P������.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xdashewan, xiaobefore);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xdashewan, xiaobefore);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P������.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P������.setVisible(true);
			}
		});
		
		P��������.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xganshiguijiao, xiaobefore);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xganshiguijiao, xiaobefore);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P��������.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P��������.setVisible(true);
			}
		});
		
		P���ǲ���.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xyuzhiboyou, xiaobefore);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xyuzhiboyou, xiaobefore);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P���ǲ���.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P���ǲ���.setVisible(true);
			}
		});
		
		P����.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xafei, xiaobefore);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xafei, xiaobefore);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P����.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P����.setVisible(true);
			}
		});
		
		P��.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xjue, xiaobefore);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xjue, xiaobefore);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P��.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P��.setVisible(true);
			}
		});
		
		PС��.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xxiaonan, xiaobefore);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xxiaonan, xiaobefore);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				PС��.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				PС��.setVisible(true);
			}
		});
		
		P���.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xpeien, xiaobefore);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xpeien, xiaobefore);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P���.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P���.setVisible(true);
			}
		});
		
		P�ϴ���.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xdidala, xiaobefore);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xdidala, xiaobefore);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P�ϴ���.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P�ϴ���.setVisible(true);
			}
		});
		
		P��ɰ֮Ы.addMouseListener(new MouseListener() {
			@Override
			public void mouseClicked(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xxie, xiaobefore);
			}
			@Override
			public void mousePressed(MouseEvent e) {
				setVisible(false);
				MT1.stop();
        		new MemInfo(framename, Xxie, xiaobefore);
			}
			@Override
			public void mouseReleased(MouseEvent e) {
				// TODO Auto-generated method stub
				
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				// TODO Auto-generated method stub
				P��ɰ֮Ы.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P��ɰ֮Ы.setVisible(true);
			}
		});
		
		jpBg.add(P�Ƕ�);
		jpBg.add(P�ɶ�);
		jpBg.add(P������);
		jpBg.add(P��������);
		jpBg.add(P���ǲ���);
		jpBg.add(P����);
		jpBg.add(P��);
		jpBg.add(PС��);
		jpBg.add(P���);
		jpBg.add(P�ϴ���);
		jpBg.add(P��ɰ֮Ы);
		
		
		this.addKeyListener(new KeyListener() {
			@Override
		    public void keyPressed(KeyEvent e) {
		        // ��ȡ��ֵ���� KeyEvent.VK_XXXX �����Ƚ�ȷ�������µİ���
		        int keyCode = e.getKeyCode();
		        System.out.println("����: " + e.getKeyCode());
		        if(keyCode==8) {
		        	setVisible(false);
		        	MT1.stop();
		        	new OpenFrame("��������-----by LarryHawkingYoung");
		        }
		        else if(keyCode==10) {
		        	System.out.println("xxx");
		        }
		        if(P�Ƕ�.isVisible()==false) {
		        	if(keyCode==39) {
		        		P�Ƕ�.setVisible(true);
		        		P�ɶ�.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P�Ƕ�.setVisible(true);
		        		P��ɰ֮Ы.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xjiaodu, xiaobefore);
		        	}
		        }
		        else if(P�ɶ�.isVisible()==false) {
		        	if(keyCode==39) {
		        		P�ɶ�.setVisible(true);
		        		P������.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P�ɶ�.setVisible(true);
		        		P�Ƕ�.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xfeiduan, xiaobefore);
		        	}
		        }
		        else if(P������.isVisible()==false) {
		        	if(keyCode==39) {
		        		P������.setVisible(true);
		        		P��������.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P������.setVisible(true);
		        		P�ɶ�.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xdashewan, xiaobefore);
		        	}
		        }
		        else if(P��������.isVisible()==false) {
		        	if(keyCode==39) {
		        		P��������.setVisible(true);
		        		P���ǲ���.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P��������.setVisible(true);
		        		P������.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xganshiguijiao, xiaobefore);
		        	}
		        }
		        else if(P���ǲ���.isVisible()==false) {
		        	if(keyCode==39) {
		        		P���ǲ���.setVisible(true);
		        		P����.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P���ǲ���.setVisible(true);
		        		P��������.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xyuzhiboyou, xiaobefore);
		        	}
		        }
		        else if(P����.isVisible()==false) {
		        	if(keyCode==39) {
		        		P����.setVisible(true);
		        		P��.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P����.setVisible(true);
		        		P���ǲ���.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xafei, xiaobefore);
		        	}
		        }
		        else if(P��.isVisible()==false) {
		        	if(keyCode==39) {
		        		P��.setVisible(true);
		        		PС��.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P��.setVisible(true);
		        		P����.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xjue, xiaobefore);
		        	}
		        }
		        else if(PС��.isVisible()==false) {
		        	if(keyCode==39) {
		        		PС��.setVisible(true);
		        		P���.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		PС��.setVisible(true);
		        		P��.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xxiaonan, xiaobefore);
		        	}
		        }
		        else if(P���.isVisible()==false) {
		        	if(keyCode==39) {
		        		P���.setVisible(true);
		        		P�ϴ���.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P���.setVisible(true);
		        		PС��.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xpeien, xiaobefore);
		        	}
		        }
		        else if(P�ϴ���.isVisible()==false) {
		        	if(keyCode==39) {
		        		P�ϴ���.setVisible(true);
		        		P��ɰ֮Ы.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P�ϴ���.setVisible(true);
		        		P���.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xdidala, xiaobefore);
		        	}
		        }
		        else if(P��ɰ֮Ы.isVisible()==false) {
		        	if(keyCode==39) {
		        		P��ɰ֮Ы.setVisible(true);
		        		P�Ƕ�.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P��ɰ֮Ы.setVisible(true);
		        		P�ϴ���.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xxie, xiaobefore);
		        	}
		        }
		        else{
		        	if(keyCode==39||keyCode==37) {
		        		P�Ƕ�.setVisible(false);
		        	}
		        }
		    }
		    
		    @Override
		    public void keyTyped(KeyEvent e) {
		        // e.getKeyChar() ��ȡ������ַ�
		        System.out.println("����: " + e.getKeyChar());
		    }
		    
		    @Override
		    public void keyReleased(KeyEvent e) {
		        System.out.println("�ͷ�: " + e.getKeyCode());
		    }
		});
		
		this.setVisible(true);
	}

}
