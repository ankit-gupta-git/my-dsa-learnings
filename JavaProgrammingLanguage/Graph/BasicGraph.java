// package JavaProgrammingLanguage.Graph;

//write a prog to traverse a graph using preatth first search 
public class BasicGraph {
    public static void main(String[] args) {
        // Example graph represented as an adjacency list
        int[][] graph = {
            {1, 2},    // Node 0 is connected to nodes 1 and 2
            {0, 3, 4}, // Node 1 is connected to nodes 0, 3, and 4
            {0},       // Node 2 is connected to node 0
            {1},       // Node 3 is connected to node 1
            {1}        // Node 4 is connected to node 1
        };

        boolean[] visited = new boolean[graph.length];
        System.out.println("Depth First Search starting from node 0:");
        dfs(graph, visited, 0);
    }

    public static void dfs(int[][] graph, boolean[] visited, int node) {
        visited[node] = true;
        System.out.print(node + " ");

        for (int neighbor : graph[node]) {
            if (!visited[neighbor]) {
                dfs(graph, visited, neighbor);
            }
        }
    }  
}
