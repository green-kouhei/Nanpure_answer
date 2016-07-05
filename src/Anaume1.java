public class Anaume1 {
	public int[][] AN1(int[][] map) {
		boolean flg = true;
		boolean[] fc;
		int cnt = 0;
		int math = 0;
		
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
				cnt = 0;
				math = 0;
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
				for (int i = 0; i < fc.length; i++) {
					if (fc[i] == true) {
						cnt++;
						math = i + 1;
					}
				}
				if (cnt == 1) {
					map[y][x] = math;
				}
			}
		}
		
		flg = false;
		for (int y = 0; y < 9; y++) {
			for (int x = 0; x < 9; x++) {
				if(smap[y][x] != map[y][x]){
					flg=true;
				}
			}
		}
		if(!flg){
			System.exit(0);
		}
		
		return map;
	}
}
