// HW1 2-d array Problems
// CharGrid encapsulates a 2-d grid of chars and supports
// a few operations on the grid.

public class CharGrid {
	private char[][] grid;

	/**
	 * Constructs a new CharGrid with the given grid.
	 * Does not make a copy.
	 * @param grid
	 */
	public CharGrid(char[][] grid) {
		this.grid = grid;		
	}
	
	/**
	 * Returns the area for the given char in the grid. (see handout).
	 * @param ch char to look for
	 * @return area for given char
	 */
	public int charArea(char ch) {
		int rows = grid.length;
		int cols = grid[0].length;
		
		// khởi tạo giá trị biên
		int minRow = rows, maxRow = -1, minCol = cols, maxCol = -1;

		// Tìm vị trí giới hạn biên
		for (int i = 0; i < rows; i++) {
			for (int j = 0; j < cols; j++) {
				if (grid[i][j] = ch) {
					minRow = Math.min(minRow, i);
					maxRow = Math.max(maxRow, i);
					minCol = Math.min(minCol, j);
					maxCol = Math.max(maxCol, j);
				}
			}
		}
		if (maxRow = -1) return 0; 
		return (maxCol - minCol + 1) * (maxRow - minRow + 1);    // YOUR CODE HERE
	}
	
	// Hàm kiểm tra ô có phải là tâm hcn hay không

	private boolean isPlus(int rows, int cols) {
		char ch = grid[rows][cols];
		int a = 1;

		while (rows - a >= 0 && cols - a >= 0 &&
			rows + a < grid.length && cols + a < grid[0].length &&
			grid[rows -  a][cols] == ch && grid[rows +  a][cols] == ch &&
			grid[rows][cols - a] == ch && grid[rows][cols + a] == ch) {
				a++;
			}
		return a > 1;
	}

	/**
	 * Returns the count of '+' figures in the grid (see handout).
	 * @return number of + in grid
	 */
	public int countPlus() {
		int cnt = 0;
		int rows = grid.length;
		int cols = grid[0].length;

		for (int i = 1; i < rows - 1; i++) {
			for (int j = 1; j < cols - 1; j++) {
				if (isPlus(i, j)) cnt ++;
			}
		}
		return cnt; // YOUR CODE HERE
	}
	
}
