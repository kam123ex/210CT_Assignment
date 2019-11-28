package Week8_Basic;

import java.io.*;
import java.util.*;

public class Graph {

	private int numVertex; // Number of vertices
	private LinkedList<Integer> adjList[]; // List of the vertices

	public Graph(int v) {
		numVertex = v;
		// Create List of the vertices
		adjList = new LinkedList[numVertex];
		for (int i = 0; i < v; ++i) {
			adjList[i] = new LinkedList();
		}
	}

	// Add an edge in to the graph
	public void addEdge(int v, int link) {
		adjList[v].add(link);

	}

	// DFS traversal
	public void DFS(int v) {
		boolean visited[] = new boolean[numVertex];
		DFSRec(v, visited);
	}

	public void DFSRec(int v, boolean visited[]) {
		// Print the marked vertex
		visited[v] = true;
		System.out.print(v + " ");
		// Get vertexs neigbor
		Iterator<Integer> vNeighbors = adjList[v].listIterator();
		// Neigbor has not been visited, mark it.
		// else it has visited, enqueue it;
		while (vNeighbors.hasNext()) {
			int Neighbor = vNeighbors.next();
			if (!visited[Neighbor]) {
				DFSRec(Neighbor, visited);
			}
		}
	}

	// BFS traversal
	public void BFS(int v) {
		boolean visited[] = new boolean[numVertex];
		LinkedList<Integer> queue = new LinkedList<Integer>();

		visited[v] = true;
		queue.add(v);

		while (queue.size() != 0) {
			v = queue.remove();
			System.out.print(v + " ");
			// Get vertexs neigbor
			Iterator<Integer> vNeighbours = adjList[v].listIterator();
			// Neigbor has not been visited, mark it.
			// else it has visited, enqueue it;
			while (vNeighbours.hasNext()) {
				int n = vNeighbours.next();
				if (!visited[n]) {
					queue.add(n);
					visited[n] = true;
				}
			}
		}
	}



}
