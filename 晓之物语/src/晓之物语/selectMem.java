package 晓之物语;

import java.awt.*;
import java.awt.event.*;
import javax.swing.*;

import 晓之物语.MusicThread.MusicRun;


public class selectMem extends JFrame {
	public selectMem(String framename, AllXiaos xiaobefore) {
		super(framename);
		
		MusicRun MR1 = new MusicRun();
		MR1.setMusic(1);
		Thread MT1 = new Thread(MR1);
		MT1.start();
		
		ImageIcon selectBg = new ImageIcon("Image\\窗口背景\\selectBg.jpg");
		
		this.setBounds(0,0,selectBg.getIconWidth(), selectBg.getIconHeight());//设置窗口大小
		this.setLocationRelativeTo(null);//设置窗口位置在屏幕中心
		this.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		this.setResizable(false);
		
		JPanel jpBg = new JPanel() {
            public void paintComponent(Graphics g) {
                super.paintComponent(g);
                g.drawImage(new ImageIcon("Image\\角都\\角都name.jpg").getImage(), 0, 0, new ImageIcon("Image\\角都\\角都name.jpg").getIconWidth(), new ImageIcon("Image\\角都\\角都name.jpg").getIconHeight(), new ImageIcon("Image\\角都\\角都name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\飞段\\飞段name.jpg").getImage(), 119, 0, new ImageIcon("Image\\飞段\\飞段name.jpg").getIconWidth(), new ImageIcon("Image\\飞段\\飞段name.jpg").getIconHeight(), new ImageIcon("Image\\飞段\\飞段name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\大蛇丸\\大蛇丸name.jpg").getImage(), 237, 0, new ImageIcon("Image\\大蛇丸\\大蛇丸name.jpg").getIconWidth(), new ImageIcon("Image\\大蛇丸\\大蛇丸name.jpg").getIconHeight(), new ImageIcon("Image\\大蛇丸\\大蛇丸name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛name.jpg").getImage(), 357, 0, new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛name.jpg").getIconWidth(), new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛name.jpg").getIconHeight(), new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\宇智波鼬\\宇智波鼬name.jpg").getImage(), 475, 0, new ImageIcon("Image\\宇智波鼬\\宇智波鼬name.jpg").getIconWidth(), new ImageIcon("Image\\宇智波鼬\\宇智波鼬name.jpg").getIconHeight(), new ImageIcon("Image\\宇智波鼬\\宇智波鼬name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\阿飞\\阿飞name.jpg").getImage(), 593, 0, new ImageIcon("Image\\阿飞\\阿飞name.jpg").getIconWidth(), new ImageIcon("Image\\阿飞\\阿飞name.jpg").getIconHeight(), new ImageIcon("Image\\阿飞\\阿飞name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\绝\\绝name.jpg").getImage(), 761, 0, new ImageIcon("Image\\绝\\绝name.jpg").getIconWidth(), new ImageIcon("Image\\绝\\绝name.jpg").getIconHeight(), new ImageIcon("Image\\绝\\绝name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\小南\\小南name.jpg").getImage(), 876, 0, new ImageIcon("Image\\小南\\小南name.jpg").getIconWidth(), new ImageIcon("Image\\小南\\小南name.jpg").getIconHeight(), new ImageIcon("Image\\小南\\小南name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\佩恩\\佩恩name.jpg").getImage(), 995, 0, new ImageIcon("Image\\佩恩\\佩恩name.jpg").getIconWidth(), new ImageIcon("Image\\佩恩\\佩恩name.jpg").getIconHeight(), new ImageIcon("Image\\佩恩\\佩恩name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\迪达拉\\迪达拉name.jpg").getImage(), 1112, 0, new ImageIcon("Image\\迪达拉\\迪达拉name.jpg").getIconWidth(), new ImageIcon("Image\\迪达拉\\迪达拉name.jpg").getIconHeight(), new ImageIcon("Image\\迪达拉\\迪达拉name.jpg").getImageObserver());
                g.drawImage(new ImageIcon("Image\\赤砂之蝎\\蝎name.jpg").getImage(), 1232, 0, new ImageIcon("Image\\赤砂之蝎\\蝎name.jpg").getIconWidth(), new ImageIcon("Image\\赤砂之蝎\\蝎name.jpg").getIconHeight(), new ImageIcon("Image\\赤砂之蝎\\蝎name.jpg").getImageObserver());
            }
		};
		
		this.setContentPane(jpBg);
		jpBg.setLayout(null);
		
		Container ct = this.getContentPane();
		
		ImageIcon I角都 = new ImageIcon("Image\\角都\\角都.jpg");
		ImageIcon I飞段 = new ImageIcon("Image\\飞段\\飞段.jpg");
		ImageIcon I大蛇丸 = new ImageIcon("Image\\大蛇丸\\大蛇丸.jpg");
		ImageIcon I干柿鬼鲛 = new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛.jpg");
		ImageIcon I宇智波鼬 = new ImageIcon("Image\\宇智波鼬\\宇智波鼬.jpg");
		ImageIcon I阿飞 = new ImageIcon("Image\\阿飞\\阿飞.jpg");
		ImageIcon I绝 = new ImageIcon("Image\\绝\\绝.jpg");
		ImageIcon I小南 = new ImageIcon("Image\\小南\\小南.jpg");
		ImageIcon I佩恩 = new ImageIcon("Image\\佩恩\\佩恩.jpg");
		ImageIcon I迪达拉 = new ImageIcon("Image\\迪达拉\\迪达拉.jpg");
		ImageIcon I赤砂之蝎 = new ImageIcon("Image\\赤砂之蝎\\赤砂之蝎.jpg");
		
		JPanel P角都 = new JPanel() {
			public void paint(Graphics g) {
				g.drawImage(I角都.getImage(), 0, 0, 118, 768, I角都.getImageObserver());
			}
		};
		JPanel P飞段 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I飞段.getImage(), 0, 0, 117, 768, I飞段.getImageObserver());
			}
		};
		JPanel P大蛇丸 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I大蛇丸.getImage(), 0, 0, 119, 768, this);
			}
		};
		JPanel P干柿鬼鲛 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I干柿鬼鲛.getImage(), 0, 0, 117, 768, this);
			}
		};
		JPanel P宇智波鼬 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I宇智波鼬.getImage(), 0, 0, 117, 768, this);
			}
		};
		JPanel P阿飞 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I阿飞.getImage(), 0, 0, 167, 768, this);
			}
		};
		JPanel P绝 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I绝.getImage(), 0, 0, 114, 768, this);
			}
		};
		JPanel P小南 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I小南.getImage(), 0, 0, 118, 768, this);
			}
		};
		JPanel P佩恩 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I佩恩.getImage(), 0, 0, 116, 768, this);
			}
		};
		JPanel P迪达拉 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I迪达拉.getImage(), 0, 0, 119, 768, this);
			}
		};
		JPanel P赤砂之蝎 = new JPanel(){
			public void paint(Graphics g) {
				g.drawImage(I赤砂之蝎.getImage(), 0, 0, 116, 768, this);
			}
		};
		
		P角都.setBounds(0, 0, 118, 768);
		P飞段.setBounds(119, 0, 117, 768);
		P大蛇丸.setBounds(237, 0, 119, 768);
		P干柿鬼鲛.setBounds(357, 0, 117, 768);
		P宇智波鼬.setBounds(475, 0, 117, 768);
		P阿飞.setBounds(593, 0, 167, 768);
		P绝.setBounds(761, 0, 114, 768);
		P小南.setBounds(876, 0, 118, 768);
		P佩恩.setBounds(995, 0, 116, 768);
		P迪达拉.setBounds(1112, 0, 119, 768);
		P赤砂之蝎.setBounds(1232, 0, 116, 768);
		
		AllXiaos Xjiaodu = new AllXiaos();
		Xjiaodu.setMemImage(new ImageIcon("Image\\角都\\角都info.jpg"));
		Xjiaodu.setBack(new ImageIcon("Image\\角都\\角都back.png"));
		Xjiaodu.setBriefInfo("晓之“北斗”，对钱财有着强烈的渴望，负责管理晓的财务。曾被指派刺杀初代火影，失败后得到村子的重罚，之后带着憎恨和禁术叛逃，并夺走了村中上忍的心脏。拥有多个心脏的角都成为少数长寿不死的忍者之一，强大的禁术以及经年累积的战斗经验，使其成为恐怖的存在。");
		Xjiaodu.setName("角都");
		Xjiaodu.setSex("男");
		Xjiaodu.setSkill1(new ImageIcon("Image\\角都\\角都skill1.jpg"));
		Xjiaodu.setSkill2(new ImageIcon("Image\\角都\\角都skill2.jpg"));
		Xjiaodu.setMaxskill(new ImageIcon("Image\\角都\\角都maxskill.jpg"));
		
		AllXiaos Xfeiduan = new AllXiaos();
		Xfeiduan.setMemImage(new ImageIcon("Image\\飞段\\飞段info.jpg"));
		Xfeiduan.setBack(new ImageIcon("Image\\飞段\\飞段back.png"));
		Xfeiduan.setBriefInfo("在永恒的时光中品尝痛苦，无止尽的杀戮，拥有不死之身并非一种祝福，而是一种诅咒。但是作为首例成功的实验体，好战的飞段对战争充满了渴望，任何对邪神不敬的人都将受到飞段的死亡诅咒，即便是猿飞阿斯玛也难逃一劫。持有死神象征的三忍镰刀，只需沾到祭品的血样即可将其生命献给邪神的飞段，是忍者世界中绝对恐怖的存在。");
		Xfeiduan.setName("飞段");
		Xfeiduan.setSex("男");
		Xfeiduan.setSkill1(new ImageIcon("Image\\飞段\\飞段skill1.jpg"));
		Xfeiduan.setSkill2(new ImageIcon("Image\\飞段\\飞段skill2.jpg"));
		Xfeiduan.setMaxskill(new ImageIcon("Image\\飞段\\飞段maxskill.jpg"));
		
		AllXiaos Xdashewan = new AllXiaos();
		Xdashewan.setMemImage(new ImageIcon("Image\\大蛇丸\\大蛇丸info.jpg"));
		Xdashewan.setBack(new ImageIcon("Image\\大蛇丸\\大蛇丸back.png"));
		Xdashewan.setBriefInfo("传说中的木叶三忍之一，其才华连三代火影也连连称赞。然而在父母被杀后却走上了歧途，追求不老不死的力量并妄图掌握世界上所有的忍术。而通过禁术的研究和大量试验品的牺牲，大蛇丸也确实有用了邪恶的转生能力和惊人的再生能力。然而在转生前最虚弱的时候被佐助偷袭并压制，直至被宇智波鼬用十拳剑封印在游离的幻术中永收煎熬。");
		Xdashewan.setName("大蛇丸");
		Xdashewan.setSex("男");
		Xdashewan.setSkill1(new ImageIcon("Image\\大蛇丸\\大蛇丸skill1.jpg"));
		Xdashewan.setSkill2(new ImageIcon("Image\\大蛇丸\\大蛇丸skill2.jpg"));
		Xdashewan.setMaxskill(new ImageIcon("Image\\大蛇丸\\大蛇丸maxskill.jpg"));
		
		AllXiaos Xganshiguijiao = new AllXiaos();
		Xganshiguijiao.setMemImage(new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛info.jpg"));
		Xganshiguijiao.setBack(new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛back.png"));
		Xganshiguijiao.setBriefInfo("干柿鬼鲛，因其惊人的查克拉量被称作“无尾尾兽” ，原为雾忍“忍刀七人众”之一，拥有可吸取敌人查克拉转为己用的大刀鲛肌。人如其名，鬼鲛长着一张鱼脸……哦不，是鲨鱼脸，牙也不错，锋利的锯齿形。所以胃口通常也很好，被鲛肌咬住的人很快查克拉便会枯竭。鬼鲛深谙水性及水遁之术，且可以和鲛肌融为一体，一旦身陷鬼鲛制造的水域之中，就如鲨鱼嘴边的猎物，时刻都有玩完的危险。");
		Xganshiguijiao.setName("干柿鬼鲛");
		Xganshiguijiao.setSex("男");
		Xganshiguijiao.setSkill1(new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛skill1.jpg"));
		Xganshiguijiao.setSkill2(new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛skill2.jpg"));
		Xganshiguijiao.setMaxskill(new ImageIcon("Image\\干柿鬼鲛\\干柿鬼鲛maxskill.jpg"));
		Xganshiguijiao.setSTAR(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoSTAR.png"));
		Xganshiguijiao.setSTAL(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoSTAL.png"));
		Xganshiguijiao.setRUNR(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoRUNR.gif"));
		Xganshiguijiao.setRUNL(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoRUNL.gif"));
		Xganshiguijiao.setSkill1Right(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoSkill1R.gif"));
		Xganshiguijiao.setSkill1Left(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoSkill1L.gif"));
		Xganshiguijiao.setSkill2Right(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoSkill2R.gif"));
		Xganshiguijiao.setSkill2Left(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoSkill2L.gif"));
		Xganshiguijiao.setMaxskillRight(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoMaxSkillR.gif"));
		Xganshiguijiao.setMaxskillLeft(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoMaxSkillL.gif"));
		Xganshiguijiao.setSkill1DistX(400);
		Xganshiguijiao.setSkill1DistY(10);
		Xganshiguijiao.setSkill2DistX(400);
		Xganshiguijiao.setSkill2DistY(10);
		Xganshiguijiao.setMaxskillDistX(500);
		Xganshiguijiao.setMaxskillDistY(15);
		Xganshiguijiao.setWin(new ImageIcon("Image\\干柿鬼鲛\\ganshiguijiaoAOYI.gif"));
		Xganshiguijiao.setWinMusic(7);
		
		AllXiaos Xyuzhiboyou = new AllXiaos();
		Xyuzhiboyou.setMemImage(new ImageIcon("Image\\宇智波鼬\\宇智波鼬info.jpg"));
		Xyuzhiboyou.setBack(new ImageIcon("Image\\宇智波鼬\\宇智波鼬back.png"));
		Xyuzhiboyou.setBriefInfo("以红色的双眼看穿三界，将宿愿藏于心中，编织出虚实—— 八岁时就开眼的“写轮眼”，居然让他经历无数的悲剧。除了利用“写轮眼”的瞳术与幻术之外，体术与忍术的能力也非常高超。鼬的生死观来自于他所经历过的严苛的人生…… “每个人都会仰赖自己的知识与想法，并且被这些东西束缚着，还称呼这些事情为现实！”");
		Xyuzhiboyou.setName("宇智波鼬");
		Xyuzhiboyou.setSex("男");
		Xyuzhiboyou.setSkill1(new ImageIcon("Image\\宇智波鼬\\宇智波鼬skill1.jpg"));
		Xyuzhiboyou.setSkill2(new ImageIcon("Image\\宇智波鼬\\宇智波鼬skill2.jpg"));
		Xyuzhiboyou.setMaxskill(new ImageIcon("Image\\宇智波鼬\\宇智波鼬maxskill.jpg"));
		Xyuzhiboyou.setSTAR(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouSTAR.png"));
		Xyuzhiboyou.setSTAL(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouSTAL.png"));
		Xyuzhiboyou.setRUNR(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouRUNR.gif"));
		Xyuzhiboyou.setRUNL(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouRUNL.gif"));
		Xyuzhiboyou.setSkill1Right(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouSkill1R.gif"));
		Xyuzhiboyou.setSkill1Left(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouSkill1L.gif"));
		Xyuzhiboyou.setSkill2Right(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouSkill2R.gif"));
		Xyuzhiboyou.setSkill2Left(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouSkill2L.gif"));
		Xyuzhiboyou.setMaxskillRight(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouMaxSkillR.gif"));
		Xyuzhiboyou.setMaxskillLeft(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouMaxSkillL.gif"));
		Xyuzhiboyou.setSkill1DistX(550);
		Xyuzhiboyou.setSkill1DistY(10);
		Xyuzhiboyou.setSkill2DistX(450);
		Xyuzhiboyou.setSkill2DistY(10);
		Xyuzhiboyou.setMaxskillDistX(500);
		Xyuzhiboyou.setMaxskillDistY(15);
		Xyuzhiboyou.setWin(new ImageIcon("Image\\宇智波鼬\\yuzhiboyouAOYI.gif"));
		Xyuzhiboyou.setWinMusic(6);
		
		AllXiaos Xafei = new AllXiaos();
		Xafei.setMemImage(new ImageIcon("Image\\阿飞\\阿飞info.jpg"));
		Xafei.setBack(new ImageIcon("Image\\阿飞\\阿飞back.png"));
		Xafei.setBriefInfo("曾用名“阿飞”“宇智波斑”，“晓”的幕后老大，为实现“月之眼”计划，与药师兜联合发动第四次忍界大战。虽然面具男曾自称“宇智波斑”，但他的性格阴沉多谋，和狂傲不驯的宇智波斑截然相反，而且自称很尊敬千手柱间。他曾在干柿鬼鲛、佐助等极少人面前摘下过面具，其真实身份至今仍然是个谜。");
		Xafei.setName("阿飞");
		Xafei.setSex("男");
		Xafei.setSkill1(new ImageIcon("Image\\阿飞\\阿飞skill1.jpg"));
		Xafei.setSkill2(new ImageIcon("Image\\阿飞\\阿飞skill2.jpg"));
		Xafei.setMaxskill(new ImageIcon("Image\\阿飞\\阿飞maxskill.jpg"));
		
		AllXiaos Xjue = new AllXiaos();
		Xjue.setMemImage(new ImageIcon("Image\\绝\\绝info.jpg"));
		Xjue.setBack(new ImageIcon("Image\\绝\\绝back.png"));
		Xjue.setBriefInfo("如同食虫植物的外壳，黑白各半的脑袋有着相异的思维，可以对话的双重人格。在“晓”中也是令人毛骨悚然的存在，忍界的重要战役在他的眼中都有烙印。与“晓”的幕后黑手宇智波斑相遇之后，负责记录战斗和侦查敌情。在斑的身旁打探着他的真意的同时，也奔赴战场，只是单纯因好奇心而完成工作吗?还是……");
		Xjue.setName("绝");
		Xjue.setSex("男");
		Xjue.setSkill1(new ImageIcon("Image\\绝\\绝skill1.jpg"));
		Xjue.setSkill2(new ImageIcon("Image\\绝\\绝skill2.jpg"));
		Xjue.setMaxskill(new ImageIcon("Image\\绝\\绝maxskill.jpg"));
		
		AllXiaos Xpeien = new AllXiaos();
		Xpeien.setMemImage(new ImageIcon("Image\\佩恩\\佩恩info.jpg"));
		Xpeien.setBack(new ImageIcon("Image\\佩恩\\佩恩back.png"));
		Xpeien.setBriefInfo("佩恩，名字来自于英文“Pain(痛苦)”。“我只是想要守护他们两个”。保受战争之苦、善良而懦弱的长门，在伙伴的生命受到威胁时，开启了传说中的最强瞳术——轮回眼。但和山椒鱼半藏一战中，当弥彦为了拯救小南而自己撞上长门的苦无时，整个世界都失去了色彩，只有幕天席地的冰雨在灰度的空间弥漫……悲伤麻醉了善良，痛苦封印了懦弱，曾经的那个少年，以佩恩之名向世界宣布神的降临……");
		Xpeien.setName("佩恩");
		Xpeien.setSex("男");
		Xpeien.setSkill1(new ImageIcon("Image\\佩恩\\佩恩skill1.jpg"));
		Xpeien.setSkill2(new ImageIcon("Image\\佩恩\\佩恩skill2.jpg"));
		Xpeien.setMaxskill(new ImageIcon("Image\\佩恩\\佩恩maxskill.jpg"));
		
		AllXiaos Xxiaonan = new AllXiaos();
		Xxiaonan.setMemImage(new ImageIcon("Image\\小南\\小南info.jpg"));
		Xxiaonan.setBack(new ImageIcon("Image\\小南\\小南back.png"));
		Xxiaonan.setBriefInfo("“晓”中唯一的女性成员，曾经和弥彦、长门一起在困苦的环境中生长，渴望和平。接受过自来也的忍术指导，擅长和折纸相关的忍术，在长门死后脱离了“晓”组织，并为保护长门的遗体与斑展开对决，终因不敌而被杀，只留下漫天的纸片似雪纷飞……");
		Xxiaonan.setName("小南");
		Xxiaonan.setSex("女");
		Xxiaonan.setSkill1(new ImageIcon("Image\\小南\\小南skill1.jpg"));
		Xxiaonan.setSkill2(new ImageIcon("Image\\小南\\小南skill2.jpg"));
		Xxiaonan.setMaxskill(new ImageIcon("Image\\小南\\小南maxskill.jpg"));
		
		AllXiaos Xdidala = new AllXiaos();
		Xdidala.setMemImage(new ImageIcon("Image\\迪达拉\\迪达拉info.jpg"));
		Xdidala.setBack(new ImageIcon("Image\\迪达拉\\迪达拉back.png"));
		Xdidala.setBriefInfo("迪达拉，曾经是岩忍村的天才造型师，在触碰到家乡的禁术之后，在“起爆粘土”的爆炸中发现了自己所追求的“艺术”。后被邀请加入“晓”组织，与另一位艺术家赤砂之蝎一组活动。不同于蝎的永恒之艺术，迪达拉认为艺术就是瞬间的绚烂，但其艺术方面的自尊心在遇到鼬和佐助时被彻底侮辱，于是一直想要击败写轮眼。而在战斗中，能够冷静的分析战况，并根据敌人的特点制造粘土，为了证明自己的艺术，甚至不惜以生命为代价。");
		Xdidala.setName("迪达拉");
		Xdidala.setSex("男");
		Xdidala.setSkill1(new ImageIcon("Image\\迪达拉\\迪达拉skill1.jpg"));
		Xdidala.setSkill2(new ImageIcon("Image\\迪达拉\\迪达拉skill2.jpg"));
		Xdidala.setMaxskill(new ImageIcon("Image\\迪达拉\\迪达拉maxskill.jpg"));
		
		AllXiaos Xxie = new AllXiaos();
		Xxie.setMemImage(new ImageIcon("Image\\赤砂之蝎\\蝎info.jpg"));
		Xxie.setBack(new ImageIcon("Image\\赤砂之蝎\\蝎back.png"));
		Xxie.setBriefInfo("原本有着幸福家庭的蝎，生于傀儡师世家，是砂忍村原长老、超一流的傀儡师千代婆婆的孙子。父母在一次外出后再也没有回来(死于旗木朔茂之手)，千代婆婆为了减轻蝎的痛苦教其傀儡秘术。但蝎却发现自己依照父母形象制作的傀儡是如此冰冷，痛苦的蝎离村出走，开始杀戮之路并将打败的强者制成人傀儡，其中包括历代最强的三代风影，甚至包括蝎自己，因为蝎认为生命如此无常，只有傀儡才是永恒的艺术。");
		Xxie.setName("蝎");
		Xxie.setSex("男");
		Xxie.setSkill1(new ImageIcon("Image\\赤砂之蝎\\蝎skill1.jpg"));
		Xxie.setSkill2(new ImageIcon("Image\\赤砂之蝎\\蝎skill2.jpg"));
		Xxie.setMaxskill(new ImageIcon("Image\\赤砂之蝎\\蝎maxskill.jpg"));
		
		
		P角都.addMouseListener(new MouseListener() {
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
				P角都.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P角都.setVisible(true);
			}
		});
		
		P飞段.addMouseListener(new MouseListener() {
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
				P飞段.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P飞段.setVisible(true);
			}
		});
		
		P大蛇丸.addMouseListener(new MouseListener() {
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
				P大蛇丸.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P大蛇丸.setVisible(true);
			}
		});
		
		P干柿鬼鲛.addMouseListener(new MouseListener() {
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
				P干柿鬼鲛.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P干柿鬼鲛.setVisible(true);
			}
		});
		
		P宇智波鼬.addMouseListener(new MouseListener() {
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
				P宇智波鼬.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P宇智波鼬.setVisible(true);
			}
		});
		
		P阿飞.addMouseListener(new MouseListener() {
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
				P阿飞.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P阿飞.setVisible(true);
			}
		});
		
		P绝.addMouseListener(new MouseListener() {
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
				P绝.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P绝.setVisible(true);
			}
		});
		
		P小南.addMouseListener(new MouseListener() {
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
				P小南.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P小南.setVisible(true);
			}
		});
		
		P佩恩.addMouseListener(new MouseListener() {
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
				P佩恩.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P佩恩.setVisible(true);
			}
		});
		
		P迪达拉.addMouseListener(new MouseListener() {
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
				P迪达拉.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P迪达拉.setVisible(true);
			}
		});
		
		P赤砂之蝎.addMouseListener(new MouseListener() {
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
				P赤砂之蝎.setVisible(false);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				// TODO Auto-generated method stub
				P赤砂之蝎.setVisible(true);
			}
		});
		
		jpBg.add(P角都);
		jpBg.add(P飞段);
		jpBg.add(P大蛇丸);
		jpBg.add(P干柿鬼鲛);
		jpBg.add(P宇智波鼬);
		jpBg.add(P阿飞);
		jpBg.add(P绝);
		jpBg.add(P小南);
		jpBg.add(P佩恩);
		jpBg.add(P迪达拉);
		jpBg.add(P赤砂之蝎);
		
		
		this.addKeyListener(new KeyListener() {
			@Override
		    public void keyPressed(KeyEvent e) {
		        // 获取键值，和 KeyEvent.VK_XXXX 常量比较确定所按下的按键
		        int keyCode = e.getKeyCode();
		        System.out.println("按下: " + e.getKeyCode());
		        if(keyCode==8) {
		        	setVisible(false);
		        	MT1.stop();
		        	new OpenFrame("晓の物语-----by LarryHawkingYoung");
		        }
		        else if(keyCode==10) {
		        	System.out.println("xxx");
		        }
		        if(P角都.isVisible()==false) {
		        	if(keyCode==39) {
		        		P角都.setVisible(true);
		        		P飞段.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P角都.setVisible(true);
		        		P赤砂之蝎.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xjiaodu, xiaobefore);
		        	}
		        }
		        else if(P飞段.isVisible()==false) {
		        	if(keyCode==39) {
		        		P飞段.setVisible(true);
		        		P大蛇丸.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P飞段.setVisible(true);
		        		P角都.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xfeiduan, xiaobefore);
		        	}
		        }
		        else if(P大蛇丸.isVisible()==false) {
		        	if(keyCode==39) {
		        		P大蛇丸.setVisible(true);
		        		P干柿鬼鲛.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P大蛇丸.setVisible(true);
		        		P飞段.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xdashewan, xiaobefore);
		        	}
		        }
		        else if(P干柿鬼鲛.isVisible()==false) {
		        	if(keyCode==39) {
		        		P干柿鬼鲛.setVisible(true);
		        		P宇智波鼬.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P干柿鬼鲛.setVisible(true);
		        		P大蛇丸.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xganshiguijiao, xiaobefore);
		        	}
		        }
		        else if(P宇智波鼬.isVisible()==false) {
		        	if(keyCode==39) {
		        		P宇智波鼬.setVisible(true);
		        		P阿飞.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P宇智波鼬.setVisible(true);
		        		P干柿鬼鲛.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xyuzhiboyou, xiaobefore);
		        	}
		        }
		        else if(P阿飞.isVisible()==false) {
		        	if(keyCode==39) {
		        		P阿飞.setVisible(true);
		        		P绝.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P阿飞.setVisible(true);
		        		P宇智波鼬.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xafei, xiaobefore);
		        	}
		        }
		        else if(P绝.isVisible()==false) {
		        	if(keyCode==39) {
		        		P绝.setVisible(true);
		        		P小南.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P绝.setVisible(true);
		        		P阿飞.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xjue, xiaobefore);
		        	}
		        }
		        else if(P小南.isVisible()==false) {
		        	if(keyCode==39) {
		        		P小南.setVisible(true);
		        		P佩恩.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P小南.setVisible(true);
		        		P绝.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xxiaonan, xiaobefore);
		        	}
		        }
		        else if(P佩恩.isVisible()==false) {
		        	if(keyCode==39) {
		        		P佩恩.setVisible(true);
		        		P迪达拉.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P佩恩.setVisible(true);
		        		P小南.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xpeien, xiaobefore);
		        	}
		        }
		        else if(P迪达拉.isVisible()==false) {
		        	if(keyCode==39) {
		        		P迪达拉.setVisible(true);
		        		P赤砂之蝎.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P迪达拉.setVisible(true);
		        		P佩恩.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xdidala, xiaobefore);
		        	}
		        }
		        else if(P赤砂之蝎.isVisible()==false) {
		        	if(keyCode==39) {
		        		P赤砂之蝎.setVisible(true);
		        		P角都.setVisible(false);
		        	}
		        	else if(keyCode==37) {
		        		P赤砂之蝎.setVisible(true);
		        		P迪达拉.setVisible(false);
		        	}
		        	else if(keyCode==10) {
		        		setVisible(false);
		        		MT1.stop();
		        		new MemInfo(framename, Xxie, xiaobefore);
		        	}
		        }
		        else{
		        	if(keyCode==39||keyCode==37) {
		        		P角都.setVisible(false);
		        	}
		        }
		    }
		    
		    @Override
		    public void keyTyped(KeyEvent e) {
		        // e.getKeyChar() 获取键入的字符
		        System.out.println("键入: " + e.getKeyChar());
		    }
		    
		    @Override
		    public void keyReleased(KeyEvent e) {
		        System.out.println("释放: " + e.getKeyCode());
		    }
		});
		
		this.setVisible(true);
	}

}
