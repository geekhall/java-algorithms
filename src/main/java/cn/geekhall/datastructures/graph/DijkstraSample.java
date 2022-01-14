package cn.geekhall.datastructures.graph;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

/**
 * Dijkstra算法
 */
public class DijkstraSample {
    /**
     * Dijkstra 算法
     * @param from 源点
     * @return 源点from到其他每个点的最小距离。
     */
    public static HashMap<Node, Integer> dijkstra(Node from) {

        // 存储from点到其余每个点的最小距离
        HashMap<Node, Integer> distanceMap = new HashMap<>();
        distanceMap.put(from, 0);

        // 已经选择过的点
        HashSet<Node> selectedNodes = new HashSet<>();

        Node minNode = getMinDistanceAndUnselectedNode(distanceMap, selectedNodes);
        while (minNode != null) {
            int distance = distanceMap.get(minNode);
            for (Edge edge : minNode.edges) {
                Node toNode = edge.to;
                if (!distanceMap.containsKey(toNode)) {
                    distanceMap.put(toNode, distance + edge.weight);
                } else {
                    distanceMap.put(edge.to, Math.min(distanceMap.get(toNode), distance));
                }
            }
            selectedNodes.add(minNode);
            minNode = getMinDistanceAndUnselectedNode(distanceMap, selectedNodes);
        }
        return distanceMap;
    }

    private static Node getMinDistanceAndUnselectedNode(HashMap<Node, Integer> distanceMap, HashSet<Node> touchedNodes) {
        Node minNode = null;
        int minDistance = Integer.MAX_VALUE;
        for (Map.Entry<Node, Integer> entry : distanceMap.entrySet()) {
            Node node = entry.getKey();
            int distance = entry.getValue();
            if (!touchedNodes.contains(node) && distance < minDistance) {
                minNode = node;
                minDistance = distance;
            }
        }
        return minNode;
    }
}
