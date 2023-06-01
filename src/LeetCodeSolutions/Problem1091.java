package LeetCodeSolutions;

import java.util.LinkedList;
import java.util.Queue;

public class Problem1091 {
    public static void main(String[] args) {
        int[][] grid = {{0,1},{1,0}};
        int path = shortestPathBinaryMatrix(grid);
        System.out.println(path);

    }
    static class Node{
        int x;
        int y;
        int dist;
        Node(int x, int y, int dist){
            this.x = x;
            this.y = y;
            this.dist = dist;
        }
    }

    public static int shortestPathBinaryMatrix(int[][] grid) {
        int row = grid.length;
        int col = grid[0].length;

        if(grid[0][0] == 1 || grid[row-1][col-1] == 1){
            return -1;
        }

        int[][] dir = {{0, 1}, {1, 0}, {-1, 0}, {0, -1}, {1, 1}, {1, -1}, {-1, 1}, {-1, -1}};
        Queue<Node> q = new LinkedList<>();
        q.add(new Node(0, 0, 1));
        grid[0][0] = 1;

        while(!q.isEmpty()){
            int size = q.size();

            for(int i = 0; i < size; i++){
                Node temp = q.poll();
                int X = temp.x;
                int Y = temp.y;
                int dist = temp.dist;

                if(X == row-1 && Y == col-1){
                    return dist;
                }

                for(int[] d : dir){
                    int nextX = X + d[0];
                    int nextY = Y + d[1];

                    if(nextX >= 0 && nextY >= 0 && nextX < row && nextY < col && grid[nextX][nextY] == 0){
                        q.add(new Node(nextX, nextY, dist + 1));
                        grid[nextX][nextY] = 1;
                    }
                }
            }
        }
        return -1;
    }
}
