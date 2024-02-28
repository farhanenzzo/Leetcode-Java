public class PathWithMaximumGoldLeetCode {

    int row = 0;
    int column = 0;
    int max = 0;

    public int getMaximumGold(int[][] grid) {
        row = grid.length;
        column = grid[0].length;

        for (int i = 0; i < row; i++) {
            for (int j = 0; j < column; j++) {
                if (grid[i][j] != 0) {
                    dfs(grid, i, j, 0);
                }
            }
        }
        return max;
    }

    public void dfs(int[][] grid, int i, int j, int cur) {
        if (i < 0 || i >= row || j < 0 || j >= column || grid[i][j] == 0) {
            max = Math.max(max, cur);
            return;
        }
        int val = grid[i][j];
        grid[i][j] = 0;

        dfs(grid, i, j - 1, cur + val); // left
        dfs(grid, i, j + 1, cur + val);  //right
        dfs(grid, i - 1, j, cur + val); // up
        dfs(grid, i + 1, j, cur + val); // down

        grid[i][j] = val;
    }

    public static void main(String[] args) {
        int[][] goldMine = {{0, 6, 0}, {5, 8, 7}, {0, 9, 0}};
        PathWithMaximumGoldLeetCode pathWithMaximumGoldLeetCode = new PathWithMaximumGoldLeetCode();
        System.out.println(pathWithMaximumGoldLeetCode.getMaximumGold(goldMine));

    }
}
