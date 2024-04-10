package VJudge;

import java.util.*;

public class BlackOps {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();
        int m = scanner.nextInt();

        int[] nodeValues = new int[n + 1];
        for (int i = 1; i <= n; i++) {
            nodeValues[i] = scanner.nextInt();
        }

        List<Edge> edges = new ArrayList<>();
        for (int i = 0; i < m; i++) {
            int u = scanner.nextInt();
            int v = scanner.nextInt();
            int weight = scanner.nextInt();
            edges.add(new Edge(u, v, weight));
        }

        // Find the connected component with maximum density
        double maxDensity = dfs(1, new HashSet<>(), nodeValues, edges);

        System.out.printf("%.10f\n", maxDensity);
    }

    private static double dfs(int node, Set<Integer> visited, int[] nodeValues, List<Edge> edges) {
        visited.add(node);
        long nodeSum = nodeValues[node];
        long edgeSum = 0;

        for (Edge edge : edges) {
            int other = edge.u == node ? edge.v : edge.u;
            if (!visited.contains(other)) {
                edgeSum += dfs(other, visited, nodeValues, edges) * edge.weight;
            }
        }

        return (double) (nodeSum + edgeSum) / maxPossibleEdges(visited.size());
    }

    private static int maxPossibleEdges(int numNodes) {
        return numNodes * (numNodes - 1) / 2;
    }

    static class Edge {
        int u;
        int v;
        int weight;

        public Edge(int u, int v, int weight) {
            this.u = u;
            this.v = v;
            this.weight = weight;
        }
    }
}
