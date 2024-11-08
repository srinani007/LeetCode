package Graphs;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.PriorityQueue;

public class DijkstraGraph {
    private Map<Integer, List<Edge>> adjList = new HashMap<>();

    class Edge {
        int destination, weight;

        Edge(int destination, int weight) {
            this.destination = destination;
            this.weight = weight;
        }
    }

    public void addEdge(int source, int destination, int weight) {
        adjList.computeIfAbsent(source, k -> new ArrayList<>()).add(new Edge(destination, weight));
    }

    public void dijkstra(int start) {
        Map<Integer, Integer> distances = new HashMap<>();
        PriorityQueue<int[]> pq = new PriorityQueue<>(Comparator.comparingInt(a -> a[1])); // Min-heap priority queue
        pq.offer(new int[]{start, 0}); // Start from the initial vertex with distance 0
        distances.put(start, 0); // Distance to the start vertex is 0

        while (!pq.isEmpty()) {
            int[] current = pq.poll(); // Get the vertex with the smallest distance
            int currentVertex = current[0];
            int currentDistance = current[1];

            // If the current distance is greater than the recorded distance, skip processing
            if (currentDistance > distances.getOrDefault(currentVertex, Integer.MAX_VALUE)) continue;

            for (Edge edge : adjList.getOrDefault(currentVertex, new ArrayList<>())) {
                int newDist = currentDistance + edge.weight; // Calculate the new distance
                // If the new distance is smaller, update the distance and add to the priority queue
                if (newDist < distances.getOrDefault(edge.destination, Integer.MAX_VALUE)) {
                    distances.put(edge.destination, newDist);
                    pq.offer(new int[]{edge.destination, newDist});
                }
            }
        }

        // Print the shortest distances from the start vertex to all other vertices
        for (Map.Entry<Integer, Integer> entry : distances.entrySet()) {
            String distance = entry.getValue() == Integer.MAX_VALUE ? "Infinity" : String.valueOf(entry.getValue());
            System.out.println("Shortest distance from " + start + " to " + entry.getKey() + ": " + distance);
        }
    }

    public static void main(String[] args) {
        DijkstraGraph graph = new DijkstraGraph();
        graph.addEdge(0, 1, 4);
        graph.addEdge(0, 2, 1);
        graph.addEdge(1, 3, 1);
        graph.addEdge(2, 1, 2);
        graph.addEdge(2, 3, 5);
        graph.addEdge(3, 4, 3);
        graph.dijkstra(0);
        // Output:
        // Shortest distance from 0 to 1: 3
        // Shortest distance from 0 to 2: 1
        // Shortest distance from 0 to 3: 2
        // Shortest distance from 0 to 4: 5
    }

}