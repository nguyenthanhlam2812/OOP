//
// TetrisGrid encapsulates a tetris board and has
// a clearRows() capability.

public class TetrisGrid {

	/**
	 * Constructs a new instance with the given grid.
	 * Does not make a copy.
	 * 
	 * @param grid
	 */
	public TetrisGrid(boolean[][] grid) {
		this.grid = grid;
	}

	/**
	 * Does row-clearing on the grid (see handout).
	 */
	public void clearRows() {
		int width = grid.length;
		int height = grid[0].length;
		boolean[][] newGrid = new boolean[width][height];
		
		int newRow = 0;

		for (int j = 0; j < height; j++) {
			if (!isFullRow(j)) {
				for (int i = 0; i < width; i++) {
					newGrid[i][newRow] = grid[i][j];
				}
				newRow++;
			}
		}
		for (int i = 0; i < width; i++) {
			for (int j = 0; j < height; j++) {
				grid[i][j] = newGrid[i][j]
			}
		}

	}

	private boolean isFullRow(int j) {
		for (int i = 0; i < grid.length; i++) {
			if (!grid[i][j])
				return false;
		}
		return true;
	}

	/**
	 * Returns the internal 2d grid array.
	 * 
	 * @return 2d grid array
	 */
	boolean[][] getGrid() {
		return grid; // YOUR CODE HERE
	}
}
