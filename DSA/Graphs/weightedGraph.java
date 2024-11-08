package Graphs;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.util.List;


public class weightedGraph {
    private Map<Integer, List<Edge>> map = new HashMap<>();
    class Edge {
        int destination, weight;
        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }
    public void addEdge(int source, int destination, int weight) {
        map.get(source).add(new Edge(destination, weight));
    }
    public void addVertex(int vertex) {
        map.putIfAbsent(vertex, new ArrayList<>());
    }
    public List<Edge> getAdjVertices(int vertex){
        return map.get(vertex);
    }

    public static void main(String[] args) {
        weightedGraph graph = new weightedGraph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(0, 1, 5);
        graph.addEdge(1, 2, 3);
        graph.addEdge(0, 2, 1);
        List<Edge> edges = graph.getAdjVertices(1);
        System.out.println("Edges from vertex 1:");
        for (weightedGraph.Edge edge : edges) {
            System.out.println("To Vertex : " + edge.destination + " Weight :"+edge.weight);
        }
    }     
}
