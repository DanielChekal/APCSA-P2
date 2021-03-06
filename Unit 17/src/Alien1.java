//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.awt.Graphics;
import java.awt.Image;
import java.io.File;

import javax.imageio.ImageIO;

public class Alien1 extends MovingThing {
	private int speed;
	private Image image;

	public Alien1() {
		this(0, 0, 0);
	}

	public Alien1(int x, int y) {
		this(x, y, 0);
	}

	public Alien1(int x, int y, int s) {
		super(x, y);
		speed = s;
		try {
			image = ImageIO.read(new File("C:/Users/chekald3384/Desktop/APCSA-P2/Unit 17/src/alien.JPG"));
		} catch (Exception e) {
			System.out.println("Alien broke go fix it!!!!!");
			// feel free to do something here
		}
	}

	public void setSpeed(int s) {
		// add code
		speed = s;
	}
	
	public int getSpeed() {
		return speed;
	}

	public void draw(Graphics window) {
		window.drawImage(image, getX(), getY(), 80, 80, null);
	}

	public String toString() {
		return "";
	}
}