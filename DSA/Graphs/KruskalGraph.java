package Graphs;

import java.util.*;

public class KruskalGraph {
    class Edge implements Comparable<Edge> {
        int src, dest, weight;

        Edge(int src, int dest, int weight) {
            this.src = src;
            this.dest = dest;
            this.weight = weight;
        }

        @Override
        public int compareTo(Edge edge) {
            return this.weight - edge.weight;
        }   
    }
    private int vertices;
    private List<Edge> edges = new ArrayList<>();

    KruskalGraph(int vertices){
        this.vertices = vertices;
    }
    public void addEdge(int src, int dest, int weight) {
        edges.add(new Edge(src, dest, weight));
    }
    public int find(int[] parent, int i) {
        if (parent[i] == -1) return i;
        return find(parent, parent[i]);
    }
    public void union(int[] parent, int x, int y) {
        int xset = find(parent, x);
        int yset = find(parent, y);
        if (xset != yset) parent[xset] = yset;
    }
    public void kruskalMST() {
        Collections.sort(edges);
        int[] parent = new int[vertices];
        Arrays.fill(parent, -1);
        List<Edge> mst = new ArrayList<>();

        for (Edge edge : edges) {
            int x = find(parent, edge.src);
            int y = find(parent, edge.dest);
            if (x != y) {
                mst.add(edge);
                union(parent, x, y);
            }
        }
        for (Edge edge : mst) {
            System.out.println(edge.src + " - " + edge.dest + " : " + edge.weight);
        }
    }
    public static void main(String[] args) {
        KruskalGraph graph = new KruskalGraph(5);
        graph.addEdge(0, 1, 10);
        graph.addEdge(0, 2, 6);
        graph.addEdge(0, 3, 5);
        graph.addEdge(1, 3, 15);
        graph.addEdge(2, 3, 4);
        graph.kruskalMST();
    }
    
}
