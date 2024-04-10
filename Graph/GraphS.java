package Graph;

import java.util.LinkedList;

public class GraphS {
    final int vertices; // Number of vertices
    private final LinkedList<Integer>[] adjList; // Adjacency list representation

    // Constructor
    GraphS(int vertices) {
        this.vertices = vertices;
        adjList = new LinkedList[vertices];
        for (int i = 0; i < vertices; ++i)
            adjList[i] = new LinkedList<>();
    }

    // Function to add an edge to the graph
    void addEdge(int v, int w) {
        adjList[v].add(w);
    }

    // Getter for the adjacency list of a vertex
    LinkedList<Integer> getAdjList(int v) {
        return adjList[v];
    }

    public static void main(String[] args) {
        int v = 4;
        GraphS graphS = new GraphS(v);
        graphS.addEdge(0, 1);
        graphS.addEdge(0, 2);
        graphS.addEdge(1, 4);
        graphS.addEdge(1, 2);

        graphS.getAdjList(v);
    }
}
