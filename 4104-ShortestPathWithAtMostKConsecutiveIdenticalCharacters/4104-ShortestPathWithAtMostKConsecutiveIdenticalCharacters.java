// Last updated: 11/08/2026, 21:01:26
import java.util.*;

class Solution {
    public int shortestPath(int n, int[][] edges, String labels, int k) {
        ArrayList<int[]>[] graph = new ArrayList[n];

        for (int i = 0; i < n; i++) {
            graph[i] = new ArrayList<>();
        }

        // directed graph
        for (int[] e : edges) {
            graph[e[0]].add(new int[]{e[1], e[2]});
        }

        long[][] dist = new long[n][k + 1];

        for (int i = 0; i < n; i++) {
            Arrays.fill(dist[i], Long.MAX_VALUE);
        }

        PriorityQueue<long[]> pq = new PriorityQueue<>(
            (a, b) -> Long.compare(a[0], b[0])
        );

        dist[0][1] = 0;
        pq.add(new long[]{0, 0, 1}); 
        // cost, node, consecutive count

        while (!pq.isEmpty()) {
            long[] cur = pq.poll();

            long cost = cur[0];
            int node = (int) cur[1];
            int count = (int) cur[2];

            if (node == n - 1) {
                return (int) cost;
            }

            if (cost != dist[node][count]) {
                continue;
            }

            for (int[] next : graph[node]) {
                int nei = next[0];
                int weight = next[1];

                int newCount;

                if (labels.charAt(nei) == labels.charAt(node)) {
                    newCount = count + 1;
                } else {
                    newCount = 1;
                }

                if (newCount > k) {
                    continue;
                }

                long newCost = cost + weight;

                if (newCost < dist[nei][newCount]) {
                    dist[nei][newCount] = newCost;
                    pq.add(new long[]{newCost, nei, newCount});
                }
            }
        }

        return -1;
    }
}