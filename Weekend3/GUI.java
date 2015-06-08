import java.awt.Color;
import java.awt.Font;
import java.awt.Graphics;
import java.awt.image.BufferedImage;

public class GUI {

	public static void main(String[] args) {
		DrawWindow w = new DrawWindow();
		draw(w);
	}

	public static void draw(DrawWindow w) {
		BufferedImage img = new BufferedImage(1200, 800,
				BufferedImage.TYPE_INT_ARGB);
		Graphics g = img.getGraphics();
		g.setColor(Color.white);
		g.fillRect(0, 0, 550, 350);
		g.setColor(Color.black);
		g.drawRect(0, 0, 550, 350);

		g.setColor(Color.BLACK);
		g.fillRect(69, 29, 154, 304);
		g.setColor(Color.WHITE);
		g.fillRect(70, 30, 150, 300);

		g.setColor(Color.BLACK);
		g.fillRect(99, 79, 114, 109);
		g.setColor(Color.WHITE);
		g.fillRect(100, 80, 110, 105);

		g.setColor(Color.BLACK);
		g.fillRect(109, 109, 99, 34);
		g.fillRect(109, 146, 99, 34);
		g.setColor(Color.WHITE);
		g.fillRect(110, 110, 95, 30);
		g.fillRect(110, 147, 95, 30);

		g.setColor(Color.BLACK);
		g.fillRect(99, 199, 114, 54);
		g.fillRect(99, 269, 114, 54);
		g.setColor(Color.WHITE);
		g.fillRect(100, 200, 110, 50);
		g.fillRect(100, 270, 110, 50);

		g.setColor(Color.BLACK);
		g.fillRect(249, 29, 154, 304);
		g.setColor(Color.WHITE);
		g.fillRect(250, 30, 150, 300);

		g.setColor(Color.BLACK);
		g.fillRect(279, 79, 114, 109);
		g.setColor(Color.WHITE);
		g.fillRect(280, 80, 110, 105);

		g.setColor(Color.BLACK);
		g.fillRect(289, 109, 99, 34);
		g.fillRect(289, 146, 99, 34);
		g.setColor(Color.WHITE);
		g.fillRect(290, 110, 95, 30);
		g.fillRect(290, 147, 95, 30);

		g.setColor(Color.BLACK);
		g.fillRect(279, 199, 114, 54);
		g.fillRect(279, 269, 114, 54);
		g.setColor(Color.WHITE);
		g.fillRect(280, 200, 110, 50);
		g.fillRect(280, 270, 110, 50);

		g.setColor(Color.BLACK);
		g.fillRect(429, 29, 104, 304);
		g.setColor(Color.WHITE);
		g.fillRect(430, 30, 100, 300);

		g.setFont(new Font("calibri", Font.BOLD, 18));
		g.setColor(Color.blue);
		g.drawString("java", 20, 20);

		g.drawString("lang", 75, 50);
		g.drawString("awt", 255, 50);
		g.drawString("util", 435, 50);

		g.setColor(Color.GREEN);
		g.drawString("Math", 110, 100);
		g.drawString("Graphics", 290, 100);

		g.drawString("String", 110, 220);
		g.drawString("Integer", 110, 290);
		g.drawString("Color", 290, 220);
		g.drawString("Font", 290, 290);

		g.setFont(new Font("calibri", Font.BOLD, 12));
		g.setColor(Color.red);
		g.drawString("sqrt()", 135, 130);
		g.drawString("random()", 125, 168);
		g.drawString("drawRect()", 300, 128);
		g.drawString("setColor()", 300, 170);

		w.setImage(img);
	}

}
