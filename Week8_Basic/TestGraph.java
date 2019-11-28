package Week8_Basic;

public class TestGraph {
	public static void main(String args[]) {
		Graph g = new Graph(6);

		g.addEdge(4, 1);
		g.addEdge(4, 2);
		g.addEdge(1, 3);
		g.addEdge(2, 1);
		g.addEdge(2, 3);
		g.addEdge(3, 5);

		System.out.println("Depth First Traversal " + "(starting from vertex 4)");
		g.DFS(4);
		System.out.println();
		System.out.println("Breadth First Traversal " + "(starting from vertex 4)");
		g.BFS(4);
	}
}
