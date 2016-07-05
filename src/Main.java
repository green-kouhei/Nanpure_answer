
public class Main {

	public static void main(String[] args) {
		Anaume1 a1 = new Anaume1();
		boolean flg = true;
		int cnt = 1;
		int map[][] = {
				//難しい
				// {7,9,3,5,8,6,0,0,0},
				// {0,1,0,0,0,4,0,7,0},
				// {0,6,0,1,0,0,0,0,0},
				// {0,2,0,7,0,0,3,6,0},
				// {0,7,1,0,6,0,5,0,0},
				// {0,8,6,0,0,9,0,0,0},
				// {0,3,0,0,0,5,0,0,0},
				// {0,4,0,2,0,0,0,0,0},
				// {0,5,0,6,3,0,2,1,4}
				//簡単
				{ 0, 1, 4, 6, 0, 8, 2, 7, 0 }, { 7, 0, 2, 4, 0, 9, 1, 0, 8 }, { 6, 8, 0, 2, 0, 1, 0, 3, 5 },
				{ 9, 5, 3, 0, 0, 0, 7, 4, 2 }, { 0, 0, 0, 0, 0, 0, 0, 0, 0 }, { 1, 2, 8, 0, 0, 0, 6, 5, 3 },
				{ 8, 7, 0, 9, 0, 2, 0, 1, 6 }, { 2, 0, 1, 5, 0, 3, 9, 0, 7 }, { 0, 9, 6, 1, 0, 7, 5, 2, 0 } };
		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 9; x++) {
				System.out.print(map[y][x]);
				if (x == 2 || x == 5) {
					System.out.print("|");
				} else if (x != 8) {
					System.out.print("!");
				}
			}
			System.out.println();
			if (y == 2 || y == 5) {
				for (int i = 0; i < 17; i++) {
					System.out.print("'");
				}
				System.out.println();
			}
		}
		for (; flg != false;) {
			flg = false;
			map = a1.AN1(map);
			System.out.println();
			System.out.println(cnt+"周目");
			for (int y = 0; y < 9; y++) {
				for (int x = 0; x < 9; x++) {
					System.out.print(map[y][x]);
					if (x == 2 || x == 5) {
						System.out.print("|");
					} else if (x != 8) {
						System.out.print("!");
					}
					if (map[y][x] == 0) {
						flg = true;
					}
				}
				System.out.println();
			}
			cnt++;
		}
	}
}
