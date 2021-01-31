package 晓之物语;

import java.awt.*;
import javax.swing.*;

public interface GameConfig {
	int length = 1500;
	int width = 800;
	
	Image GameBG = new ImageIcon("Image\\窗口背景\\场景.jpg").getImage();

	Image bloodbar[] = {
			new ImageIcon("血条/0.png").getImage(),
			new ImageIcon("血条/1.png").getImage(),
			new ImageIcon("血条/2.png").getImage(),
			new ImageIcon("血条/3.png").getImage(),
			new ImageIcon("血条/4.png").getImage(),
			new ImageIcon("血条/5.png").getImage(),
			new ImageIcon("血条/6.png").getImage(),
			new ImageIcon("血条/7.png").getImage(),
			new ImageIcon("血条/8.png").getImage(),
			new ImageIcon("血条/9.png").getImage(),
			new ImageIcon("血条/10.png").getImage(),
			new ImageIcon("血条/11.png").getImage(),
			new ImageIcon("血条/12.png").getImage(),
			new ImageIcon("血条/13.png").getImage(),
			new ImageIcon("血条/14.png").getImage(),
			new ImageIcon("血条/15.png").getImage(),
			new ImageIcon("血条/16.png").getImage(),
			new ImageIcon("血条/17.png").getImage(),
			new ImageIcon("血条/18.png").getImage(),
			new ImageIcon("血条/19.png").getImage(),
			new ImageIcon("血条/20.png").getImage()	
	};
}
