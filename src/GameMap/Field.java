package GameMap;

public class Field {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int m[][] = new int[5][3];
		m[0][0] = 12;
		m[0][1] = 13;
		m[0][2] = 57;
		m[1][0] = 85;
		m[1][1] = 52;
		m[1][2] = 56;
		m[2][0] = 75;
		m[2][1] = 25;
		m[2][2] = 89;
		m[3][0] = 94;
		m[3][1] = 96;
		m[3][2] = 62;
		m[4][0] = 86;
		m[4][1] = 54;
		m[4][2] = 88;
		for (int j = 0; j <= 4; j++) {
			for (int i = 0; i <= 2; i++) {
				int a = (m[j][0] + m[j][1] + m[j][2]) / 3;
				if (i < 2) {
					System.out.print(m[j][i] + " ");
				} else {
					System.out.println(m[j][i] + " " + a);

				}

			}
		}

	}

}
