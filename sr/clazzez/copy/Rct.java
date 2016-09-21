package clazzez.copy;

import java.awt.Rectangle;

public class Rct {
	public static void main(String[] args) {
		Rectangle one = new Rectangle(5, 5, 5, 5);
		System.out.println(one);
		Rectangle two = one;
		one.setBounds(4, 4, 4, 4);
		System.out.println(two);
	}
}
