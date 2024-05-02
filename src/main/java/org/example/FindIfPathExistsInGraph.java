package org.example;
//LEETCODE DESCRIPTION: 1971. Find if Path Exists in Graph
//There is a bi-directional graph with n vertices, where each vertex is labeled from 0 to n - 1 (inclusive).
// The edges in the graph are represented as a 2D integer array edges, where each edges[i] = [ui, vi] denotes a bi-directional edge between vertex ui and vertex vi.
// Every vertex pair is connected by at most one edge, and no vertex has an edge to itself.
//You want to determine if there is a valid path that exists from vertex source to vertex destination.
//Given edges and the integers n, source, and destination, return true if there is a valid path from source to destination, or false otherwise.

import java.util.*;

public class FindIfPathExistsInGraph {
    public boolean validPath(int n, int[][] edges, int source, int destination) {
            Map<Integer, List<Integer>> graph = new HashMap<>();
            for (int[] edge : edges) {
                int a = edge[0], b = edge[1];
                graph.computeIfAbsent(a, k -> new ArrayList<>()).add(b);
                graph.computeIfAbsent(b, k -> new ArrayList<>()).add(a);
            }

            boolean[] visited = new boolean[n];
            visited[source] = true;
            Stack<Integer> stack = new Stack<>();
            stack.push(source);

            while (!stack.isEmpty()) {
                int currentNode = stack.pop();
                if (currentNode == destination) {
                    return true;
                }

                for (int nextNode : graph.getOrDefault(currentNode, new ArrayList<>())) {
                    if (!visited[nextNode]) {
                        visited[nextNode] = true;
                        stack.push(nextNode);
                    }
                }
            }

            return false;
        }

        // Demo
        public static void main(String[] args) {
            FindIfPathExistsInGraph finder = new FindIfPathExistsInGraph();
            int n = 5;
            int[][] edges = {{0, 1}, {1, 2}, {2, 3}, {3, 4}};
            int source = 0;
            int destination = 4;

            boolean result = finder.validPath(n, edges, source, destination);
            System.out.println("Path exists: " + result);
        }
}
