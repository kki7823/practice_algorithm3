import java.util.Arrays;
import java.util.Stack;

public class DFS_Array {
    public static void main(String[] args) {
        int[][] map = {
                {0, 1, 1, 0, 0, 0},
                {1, 0, 0, 1, 1, 0},
                {1, 0, 0, 0, 0, 0},
                {0, 1, 0, 0, 0, 1},
                {0, 1, 0, 0, 0, 0},
                {0, 0, 0, 1, 0, 0}};

        boolean[] visit = new boolean[6];
        Arrays.fill(visit, false);

        System.out.println("DFS_Array Stack :");
        DFS_Stack(0, map, visit);

        System.out.println("");
        System.out.println("");

        Arrays.fill(visit, false);
        System.out.println("DFS_Array Recussion :");
        DFS_Recurrsion(0, map, visit);
    }

    public static void DFS_Stack(int v, int[][] map, boolean[] visit) {
        Stack<Integer> stack = new Stack<>();
        stack.push(v);
        visit[v] = true;
        System.out.print(v+" ");

        while (!stack.isEmpty()) {
            int i = stack.peek();
            boolean flag = false;
            for (int j = 0; j < map[i].length; j++) {
                if (map[i][j] != 0 && !visit[j]) {
                    stack.push(j);
                    visit[j] = true;
                    flag = true;
                    System.out.print(j+" ");
                    break;
                }
            }

            if (!flag) stack.pop();
        }
    }

    public static void DFS_Recurrsion(int v, int[][] map, boolean[] visit){
        visit[v] = true;
        System.out.print(v+ " ");

        for(int i = 0; i < map.length; i++){
            if(map[v][i] != 0 && !visit[i]){
                visit[i] = true;
                DFS_Recurrsion(i, map, visit);
            }
        }
    }

}
