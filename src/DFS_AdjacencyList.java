import java.util.LinkedList;
import java.util.List;

public class DFS_AdjacencyList {
    public static void main(String[] args) {
        List<Integer>[] map = new List[6];
        map[0] = new LinkedList<>();
        map[0].add(1);
        map[0].add(2);

        map[1] = new LinkedList<>();
        map[1].add(3);
        map[1].add(4);

        map[2] = new LinkedList<>();

        map[3] = new LinkedList<>();
        map[3].add(5);

        map[4] = new LinkedList<>();
        map[4].add(1);

        map[5] = new LinkedList<>();

        boolean[] visit = new boolean[6];
        DFS(0, map, visit);

    }

    public static void DFS(int v, List<Integer>[] map, boolean[] visit) {
        visit[v] = true;
        System.out.print(v+" ");

        List<Integer> list = map[v];;
        for (int i = 0; i < list.size(); i++) {
            v = list.get(i);
            if(!visit[v]){
                visit[v] = true;
                DFS(v, map, visit);
            }
        }
    }
}
