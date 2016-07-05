
public class Anaume2 {
	public int[][] AN2(int[][] map){
		boolean flg = true;
		boolean[] fc;
		boolean[][][] mfc = new boolean[9][9][9];
		
		int[][] smap = new int[9][9];
		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 9; x++) {
				smap[y][x] = map[y][x];
			}
		}

		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 9; x++) {
				if (map[y][x] != 0) {
					continue;
				}
				fc = new boolean[9];
				for (int i = 1; i < 10; i++) {
					for (int c = 0; c < 9; c++) {
						if (map[y][c] == i) {
							flg = false;
							break;
						}
						if (map[c][x] == i) {
							flg = false;
							break;
						}
					}
					fc[i - 1] = flg;
					flg = true;
				}
				mfc[y][x] = fc;
			}
		}
		
		return map;
	}
}
