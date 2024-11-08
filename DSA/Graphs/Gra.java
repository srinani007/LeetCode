package Graphs;

/* public void DFS(int vertex, Set<Integer> visited) {
    visited.add(vertex);
    System.out.print(vertex + " ");
    for (int neighbor : adjList.get(vertex)) {
        if (!visited.contains(neighbor)) {
            DFS(neighbor, visited);
        }
    }
} */

/* public void BFS(int startVertex) {
    Set<Integer> visited = new HashSet<>();
    Queue<Integer> queue = new LinkedList<>();
    queue.add(startVertex);
    visited.add(startVertex);

    while (!queue.isEmpty()){
        int vertex = queue.poll();
        System.out.println(vertex + " ");
        for (int neighbor : adjList.get(vertex)){
            if(!visited.contains(neighbor)){
                visited.add(neighbor);
                queue.add(neighbor); 
            }
        }
    }
} */

