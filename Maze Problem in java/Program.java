public class MazeProblem {

    static int N = 4;

    static boolean solveMaze(int[][] maze, int x, int y) {

        // Boundary check
        if (x < 0 || y < 0 || x >= N || y >= N)
            return false;

        // If destination found (9)
        if (maze[x][y] == 9) {
            maze[x][y] = 8; // mark destination
            return true;
        }

        // If path is valid (1)
        if (maze[x][y] == 1) {

            maze[x][y] = 8; // mark visited

            // Move Down
            if (solveMaze(maze, x + 1, y))
                return true;

            // Move Right
            if (solveMaze(maze, x, y + 1))
                return true;

            // Backtracking (undo)
            maze[x][y] = 1;
            return false;
        }

        return false;
    }

    static void printMaze(int[][] maze) {
        for (int i = 0; i < N; i++) {
            for (int j = 0; j < N; j++) {
                System.out.print(maze[i][j] + " ");
            }
            System.out.println();
        }
    }

    public static void main(String[] args) {

        int[][] maze = {
                { 1, 0, 0, 0 },
                { 1, 1, 0, 1 },
                { 0, 1, 0, 0 },
                { 1, 1, 1, 9 } // destination = 9
        };

        if (solveMaze(maze, 0, 0)) {
            System.out.println("Path Found:");
            printMaze(maze);
        } else {
            System.out.println("No Path Found");
        }
    }
}
