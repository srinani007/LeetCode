package Graphs;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.HashMap;
import java.util.ArrayList;
import java.util.HashSet;

public class GraphGrap {
    private Map<Integer, List<Integer>> map = new HashMap<>();
    public void addEdge(int source, int destination) {
        map.putIfAbsent(source, new ArrayList<>());
        map.putIfAbsent(destination, new ArrayList<>());
        map.get(source).add(destination);
        map.get(destination).add(source);
    }
    public void DFS(int vertex, Set<Integer> visited){
        visited.add(vertex);
        System.out.println(vertex+ "  ");
        for (int neighbor : map.get(vertex)) {
            if (!visited.contains(neighbor)) {
                DFS(neighbor, visited);
            }
        }
    }
    public static void main(String[] args) {
        GraphMap graph = new GraphMap();
        graph.addEdge(0, 1);
        graph.addEdge(0, 4);
        graph.addEdge(1, 2);
        graph.addEdge(1, 3);
        graph.addEdge(2, 5);
        graph.addEdge(3, 4);
        graph.addEdge(4, 5);    
        Set<Integer> visited = new HashSet<>();
        System.out.println("Depth First Traversal starting from vertex 0:");
        graph.DFS(0, visited);
    }
}
    

