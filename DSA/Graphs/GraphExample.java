package Graphs;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

class Graph {
    private Map<Integer, List<Integer>> map = new HashMap<>();
    
    public void addVertex(int vertex) {
       map.putIfAbsent(vertex, new ArrayList<>());
    }
    public void addEdge(int source, int destination) {
        map.get(source).add(destination);
    }
    public List<Integer> getAdjVertices(int vertex) {
        return map.get(vertex);
    }

    public void printGraph() {
        for (int vertex : map.keySet()) {
            System.out.print(vertex + " -> ");
            for (int edge : map.get(vertex)) {
                System.out.println(edge + " ");
            }
            System.out.println();
        }
    }

    
}

public class GraphExample {
    public static void main(String[] args) {
        Graph graph = new Graph();
        graph.addVertex(0);
        graph.addVertex(1);
        graph.addVertex(2);
        graph.addEdge(0, 1);
        graph.addEdge(1, 2);
        graph.addEdge(2, 0);
        graph.printGraph();
    }
}
