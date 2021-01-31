package 晓之物语;

import java.awt.Graphics;
import java.awt.Image;

public class PlayerB extends Thread implements GameConfig {
	public String name;
	public static Image staLeft;
	public static Image staRight;
	public static Image runLeft;
	public static Image runRight;
	
	public static Image skill1Right;
	public static Image skill1Left;
	public static Image skill2Right;
	public static Image skill2Left;
	public static Image maxskillRight;
	public static Image maxskillLeft;
	public static int staWidth;
	public static int staHeight;
	public static int runWidth;
	public static int runHeight;
	public static int skill1DistX;
	public static int skill1DistY;
	public static int skill2DistX;
	public static int skill2DistY;
	public static int maxskillDistX;
	public static int maxskillDistY;
	
	public static Image blood;
	
	static boolean left = false;
	static boolean right = false;
	static boolean up = false;
	static boolean down = false;
	static boolean skill1 = false;
	static boolean skill2 = false;
	static boolean maxskill = false;
	static int towards = 1;
	static int py_x = 1500;
	static int py_y = 600;
	static int bloodleft = 100;
	
	@Override
	public void run() {
		while (true) {
			moveLR();
			try {
				Thread.sleep(20);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
		}
	}
	public void moveLR() {
		if (left) {
			towards = 1;
			if (py_x > staWidth ) {
				py_x -= 10;
			}
		} else if (right) {
			towards = 2;
			if (py_x < 1500) {
				py_x += 10;
			}
		}else if(up) {
			if(py_y>600) {
				py_y -=5;
			}
		}
		else if(down) {
			if(py_y<800) {
				py_y +=5;
			}
		}
	}
	public static void hurted1() {
		if(bloodleft>0) bloodleft -= 5;
	}
	public static void hurted2() {
		if(bloodleft>0) bloodleft -= 10;
	}
	
	public static void draw(Graphics g) {
		g.drawImage(bloodbar[bloodleft/5], py_x-staWidth, py_y-staHeight-bloodbar[bloodleft/5].getHeight(null)*2/3, bloodbar[bloodleft/5].getWidth(null), bloodbar[bloodleft/5].getHeight(null), null);
		
		if(skill1) {
			if(towards == 1) {
				g.drawImage(skill1Left, (int)(py_x-staWidth-0.5*(float)skill1Left.getWidth(null)), (int)(py_y-staHeight-0.33*(float)skill1Left.getHeight(null)), skill1Left.getWidth(null), skill1Left.getHeight(null), null);
			}
			else {
				g.drawImage(skill1Right, (int)(py_x-staWidth-0.33*(float)skill1Right.getWidth(null)), (int)(py_y-staHeight-0.33*(float)skill1Right.getHeight(null)), skill1Right.getWidth(null), skill1Right.getHeight(null), null);
			}
		}
		else if(skill2) {
			if(towards == 1) {
				g.drawImage(skill2Left, (int)(py_x-staWidth-0.5*(float)skill2Left.getWidth(null)), (int)(py_y-staHeight-0.33*(float)skill2Left.getHeight(null)), skill2Left.getWidth(null), skill2Left.getHeight(null), null);
			}
			else {
				g.drawImage(skill2Right, (int)(py_x-staWidth-0.33*(float)skill2Right.getWidth(null)), (int)(py_y-staHeight-0.33*(float)skill2Right.getHeight(null)), skill2Right.getWidth(null), skill2Right.getHeight(null), null);
			}
		}
		else if(maxskill) {
			if(towards == 1) {
				g.drawImage(maxskillLeft, (int)(py_x-staWidth-0.5*(float)maxskillLeft.getWidth(null)), (int)(py_y-staHeight-0.33*(float)maxskillLeft.getHeight(null)), maxskillLeft.getWidth(null), maxskillLeft.getHeight(null), null);
			}
			else {
				g.drawImage(maxskillRight, (int)(py_x-staWidth-0.33*(float)maxskillRight.getWidth(null)), (int)(py_y-staHeight-0.33*(float)maxskillRight.getHeight(null)), maxskillRight.getWidth(null), maxskillRight.getHeight(null), null);
			}
		}
		// 如果角色不在移动中
		else if (!left && !right && !up && !down) {
			if (towards == 1) {// 最后移动朝向左
				g.drawImage(staLeft,py_x-staWidth,py_y-staHeight,staWidth,staHeight,null);
			} else if (towards == 2) {// 最后移动朝向右
				g.drawImage(staRight,py_x-staWidth,py_y-staHeight,staWidth,staHeight,null);
			}
		} 
		else {// 如果角色在移动中
			if (left) {
				g.drawImage(runLeft,py_x-runWidth,py_y-runHeight,runWidth,runHeight,null);
				towards = 1;
			} else if (right) {
				g.drawImage(runRight,py_x-runWidth,py_y-runHeight,runWidth,runHeight,null);
				towards = 2;
			}else if (up) {
				if(towards==2) {
					g.drawImage(runRight,py_x-runWidth,py_y-runHeight,runWidth,runHeight,null);
				}
				else {
					g.drawImage(runLeft,py_x-runWidth,py_y-runHeight,runWidth,runHeight,null);
				}
			}else if (down) {
				if(towards==2) {
					g.drawImage(runRight,py_x-runWidth,py_y-runHeight,runWidth,runHeight,null);
				}
				else {
					g.drawImage(runLeft,py_x-runWidth,py_y-runHeight,runWidth,runHeight,null);
				}
			}
		}
	}
	
	public PlayerB() {}	
	public PlayerB(AllXiaos xiao) {
		name = xiao.getName();
		
		towards = 1;
		py_x = 1500;
		py_y = 600;
		bloodleft = 100;
		
		staRight = xiao.getSTAR().getImage();
		staLeft = xiao.getSTAL().getImage();
		runRight = xiao.getRUNR().getImage();
		runLeft = xiao.getRUNL().getImage();
		staWidth = staRight.getWidth(null);
		staHeight = staRight.getHeight(null);
		runWidth = runRight.getWidth(null);
		runHeight = runRight.getHeight(null);
		
		skill1Right = xiao.getSkill1Right().getImage();
		skill1Left = xiao.getSkill1Left().getImage();
		skill2Right = xiao.getSkill2Right().getImage();
		skill2Left = xiao.getSkill2Left().getImage();
		maxskillRight = xiao.getMaxskillRight().getImage();
		maxskillLeft = xiao.getMaxskillLeft().getImage();
		
		skill1DistX = xiao.getSkill1DistX();
		skill1DistY = xiao.getSkill1DistY();
		skill2DistX = xiao.getSkill2DistX();
		skill2DistY = xiao.getSkill2DistY();
		maxskillDistX = xiao.getMaxskillDistX();
		maxskillDistY = xiao.getMaxskillDistY();
	}
}
