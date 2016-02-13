package skewll.ch13.snoipets;

public class SubStringer {

	public static void subs(String gloop) {
		int i = gloop.length() - (gloop.length() - 1);
		for (char f : gloop.toCharArray()) {
			System.out.println(gloop.substring(0, i));
			i++;
		}

		for (char f : gloop.toCharArray()) {
			System.out.println(gloop.substring(0, i));
			i++;
		}

	}

	public static void main(String[] args) {
		// System.out.println(subs("rum"));
		subs("rum");
	}

}
