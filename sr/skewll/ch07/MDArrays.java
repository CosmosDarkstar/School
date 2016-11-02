package skewll.ch07;

public class MDArrays {

	public static void main(String[] args) {
		int paf = 6;
		int duk = 4;
		int blu = 2;
		int kraken = 1;
		int aeb = 3;

		int i = 0;
		int j = 0;
		int k = 0;
		int l = 0;

		int[][] bleh = new int[paf][duk];

		for (i = 0; i < paf; i++) {
			for (j = 0; j < duk; j++) {
				bleh[i][j] = (int) Math.random() * 100;
			}
		}
		float[][][] pie = new float[duk][blu][aeb];

		for (i = 0; i < duk; i++) {
			for (j = 0; j < blu; j++) {
				for (k = 0; k < aeb; k++) {
					pie[i][j][k] = (float) Math.random() * 100;
				}

			}
		}

		double[][][][] tooMuchMath = new double[kraken][aeb][duk][blu];

		for (i = 0; i < kraken; i++) {
			for (j = 0; j < aeb; j++) {
				for (k = 0; k < duk; k++) {
					for (l = 0; l < blu; l++) {
						tooMuchMath[i][j][k][l] = Math.random() * 100;
					}
				}

			}
		}
	}

}
