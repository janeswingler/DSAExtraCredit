package org.example;
// LEETCODE DESCRIPTION: 1791. Find Center of Star Graph
// There is an undirected star graph consisting of n nodes labeled from 1 to n.
// A star graph is a graph where there is one center node and exactly n - 1 edges that connect the center node with every other node.
// You are given a 2D integer array edges where each edges[i] = [ui, vi] indicates that there is an edge between the nodes ui and vi.
// Return the center of the given star graph.

import java.util.Arrays;

public class FindCenterOfStarGraph {
    public int findCenter(int[][] edges) {
        // Since in a star graph, the center node is the only node that is connected to all other nodes,
        // this means the center node will appear in every edge
        // So the center can be determined by the first two edges. No need to iterate :)

        // first pair's nodes
        int potentialA = edges[0][0];
        int potentialB = edges[0][1];

        // compare with the second pair's nodes
        int checkA = edges[1][0];
        int checkB = edges[1][1];

        // If potentialA is the center, it must appear in the second edge
        if (potentialA == checkA || potentialA == checkB) {
            return potentialA;
        } else {
            // Otherwise, potentialB is the center
            return potentialB;
        }

    }

    // Main to demo
    public static void main(String[] args) {
        int[][] edges1 = {{1, 2}, {2, 3}, {4, 2}}; // 2 is the center
        int[][] edges2 = {{1, 2}, {5, 1}, {1, 3}, {1, 4}}; // 1 is the center

        FindCenterOfStarGraph graph = new FindCenterOfStarGraph();
        System.out.println("Center of star graph with edges1: " + graph.findCenter(edges1)); // Expected 2
        System.out.println("Center of star graph with edges2: " + graph.findCenter(edges2)); // Expected 1
    }
}
