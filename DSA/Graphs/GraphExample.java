package Graphs;

import java.util.List;
import java.util.Map;
import java.util.ArrayList;
import java.util.HashMap;

class Graph {
    private Map<Integer, List<Integer>> adjacencyList = new HashMap<>();

    /**
     * Adds a vertex to the graph.
     * 
     * @param vertex the vertex to be added
     */
    public void addVertex(int vertex) {
        if (!adjacencyList.containsKey(vertex)) {
            adjacencyList.put(vertex, new ArrayList<>());
            System.out.println("Vertex " + vertex + " added successfully.");
        } else {
            System.out.println("Vertex " + vertex + " already exists in the graph.");
        }
    }

    /**
     * Adds an edge between two vertices in the graph.
     * 
     * @param source      the source vertex
     * @param destination the destination vertex
     */
    public void addEdge(int source, int destination) {
        if (adjacencyList.containsKey(source) && adjacencyList.containsKey(destination)) {
            adjacencyList.get(source).add(destination);
            System.out.println("Edge from " + source + " to " + destination + " added successfully.");
        } else {
            System.out.println("One or both vertices do not exist in the graph.");
        }
    }

    /**
     * Retrieves the adjacent vertices of a given vertex.
     * 
     * @param vertex the vertex for which to retrieve adjacent vertices
     * @return a list of adjacent vertices
     */
    public List<Integer> getAdjVertices(int vertex) {
        if (adjacencyList.containsKey(vertex)) {
            System.out.println("Adjacent vertices of " + vertex + ": " + adjacencyList.get(vertex));
            return adjacencyList.get(vertex);
        } else {
            System.out.println("Vertex " + vertex + " does not exist in the graph.");
            return null;
        }
    }

    /**
     * Prints the adjacency list representation of the graph.
     */
    public void printGraph() {
        System.out.println("Graph:");
        for (int vertex : adjacencyList.keySet()) {
            System.out.print(vertex + " -> ");
            for (int edge : adjacencyList.get(vertex)) {
                System.out.print(edge + " ");
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
        graph.getAdjVertices(0);
        graph.printGraph();
    }
}