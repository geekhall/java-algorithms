package cn.geekhall.datastructures.graph;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;

/**
 * GraphUtils.java
 *
 * @author yiny
 */
public class GraphUtils {
    /**
     * 宽度有限遍历（BFS）
     * @param node
     */
    public static void bfs(Node node) {
        if (node == null) return;
        Queue<Node> queue = new LinkedList<>();
        // 由于图可能存在环，所以需要set来排除重复节点
        HashSet<Node> set = new HashSet<>();
        queue.add(node);
        set.add(node);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.println(cur.value);
            for (Node next : cur.nexts) {
                if (!set.contains(next)) { // 排除重复节点
                    set.add(next);
                    queue.add(next);
                }
            }
        }
    }

    /**
     * 深度优先遍历（DFS）
     * @param node
     */
    public static void dfs(Node node) {

    }

    /**
     * 生成随机图
     * @param n  图的节点数
     * @return
     */
    public Graph generateRandomGraph(int n) {
        return null;
    }
}
