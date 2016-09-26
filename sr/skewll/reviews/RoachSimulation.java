package skewll.reviews;

import java.awt.BasicStroke;
import java.awt.Color;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.Point;
import java.util.Random;

import javax.swing.JComponent;
import javax.swing.JFrame;

public class RoachSimulation {

	public static void main(String[] args) {

		try {
			RoachPopulation roaches = new RoachPopulation(10);
			JFrame frame = new JFrame();
			int numRoaches = 0;
			frame.setSize(500, 400);
			frame.setTitle("Roaches");
			frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			// frame.setVisible(true);
			myComponent comp = new myComponent();
			for (int i = 0; i < 10; i++) {
				frame.setVisible(false);
				roaches.breed();
				numRoaches = roaches.getRoaches();
				comp.setRoaches(numRoaches);
				frame.add(comp);
				frame.setVisible(true);
				Thread.sleep(500);
				frame.setVisible(false);
				roaches.spray(10);
				numRoaches = roaches.getRoaches();
				comp.setRoaches(numRoaches);
				frame.add(comp);

				frame.setVisible(true);
				Thread.sleep(500);
			}
		} catch (InterruptedException e) {
			System.out.println("got interrupted!");
		}
	}

	public static class myComponent extends JComponent {
		private int countRoaches;

		public void setRoaches(int numberToPrint) {
			countRoaches = numberToPrint;
			System.out.println(countRoaches);
		}

		public void paintComponent(Graphics g) {
			Point[] roachesArray = new Point[countRoaches];
			Graphics2D g2 = (Graphics2D) g;
			Random rand = new Random();
			Color roachBrown = new Color(156, 93, 82);
			g2.setStroke(new BasicStroke(5));
			g2.setColor(roachBrown);
			for (int i = 0; i < countRoaches; i++) {
				int w = 500;
				int h = 400;
				int x = Math.abs(rand.nextInt()) % w;
				int y = Math.abs(rand.nextInt()) % h;
				g2.drawLine(x, y, x, y);
			}
		}
	}
}
