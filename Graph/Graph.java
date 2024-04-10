package Graph;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

public class Graph {

    public static void createGraph(ArrayList<Edge> graph[]) {
        for(int i = 0; i < graph.length; i++) {
            graph[i] = new ArrayList<>(); // empty arrayList, now we can add value
        }

        graph[0].add(new Edge(0, 1));
        graph[0].add(new Edge(0, 2));


        graph[1].add(new Edge(1, 0));
        graph[1].add(new Edge(1, 3));

        graph[2].add(new Edge(2, 0));
        graph[2].add(new Edge(2, 4));

        graph[3].add(new Edge(3, 1));
        graph[3].add(new Edge(3, 4));
        graph[3].add(new Edge(3, 5));

        graph[4].add(new Edge(4, 2));
        graph[4].add(new Edge(4, 3));
        graph[4].add(new Edge(4, 5));

        graph[5].add(new Edge(5, 3));
        graph[5].add(new Edge(5, 4));
        graph[5].add(new Edge(5, 6));

        graph[6].add(new Edge(6, 5));
    }

    public static void printGraph(ArrayList<Edge> graph[]) {
        for (int i = 0; i < graph.length; i++) {
            System.out.print("Vertex " + i + ": ");
            for (Edge edge : graph[i]) {
                System.out.print(edge + " ");
            }
            System.out.println();
        }
    }

    public static void bfs(ArrayList<Edge>[] graph, int totalNode) {
        Queue<Integer> queue = new LinkedList<>();  // FIFO fashion
        boolean[] visited = new boolean[totalNode];
        queue.add(0);

        while (!queue.isEmpty()) {
            int curr = queue.remove();

            if(!visited[curr]) {
                System.out.println(curr + " ");
                visited[curr] = true;

                for(int i = 0; i < graph[curr].size(); i++) {
                    Edge edge = graph[curr].get(i);
                    queue.add(edge.destination);
                }
            }
        }
    }

    public static void main(String[] args) {
        int vertices = 7;
        ArrayList<Edge> graph[] = new ArrayList[vertices]; // null arrayList
        createGraph(graph);
        System.out.println(Arrays.toString(graph));
        printGraph(graph);
        bfs(graph, vertices);
    }
}
