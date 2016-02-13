package skewll.ch13.snoipets;

public class SubStringer {

	public static void subs(String gloop) {
		char[] boot = gloop.toCharArray();
		int i = gloop.length() - (gloop.length() - 1);
		for (char f : boot) {
			System.out.println(gloop.substring(0, i));
			i++;
		}
		i = gloop.length() - (gloop.length() - 1);
		for (char f : boot) {
			System.out.println(gloop.substring(1, i));
			i++;
		}

	}

	public static void main(String[] args) {
		// System.out.println(subs("rum"));
		subs("rum");
	}

}
