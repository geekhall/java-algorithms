package cn.geekhall.datastructures.binarytree;

import java.util.ArrayList;
import java.util.HashMap;

/**
 * 给定一棵二叉树的头结点head，
 * 任何两个节点之间都存在距离，返回整棵二叉树的最大距离
 */
public class BTSample1 {
    /**
     * 给定一棵二叉树的头结点head，任何两个节点之间都存在距离，返回整棵二叉树的最大距离。
     * @param head 二叉树的头结点
     * @return  整棵二叉树的最大距离
     */
    public static int getMaxDistance(Node head) {
        if (head == null) {
            return 0;
        }
        ArrayList<Node> arr = getPreList(head);
        HashMap<Node, Node> parentMap = getParentMap(head);
        int max = 0;
        for (int i = 0; i < arr.size(); i++) {
            for (int j = 0; j < arr.size(); j++) {
                max = Math.max(max, distance(parentMap, arr.get(i), arr.get(j)));
            }
        }
        return max;
    }

    /**
     *
     * @param head
     * @return
     */
    public static ArrayList<Node> getPreList(Node head) {
        ArrayList<Node> arr = new ArrayList<>();
        fillPreList(head, arr);
        return arr;
    }

    /**
     *
     * @param head
     * @param arr
     */
    public static void fillPreList(Node head, ArrayList<Node> arr) {
        if (head == null) {
            return;
        }
        arr.add(head);
        fillPreList(head.left, arr);
        fillPreList(head.right, arr);
    }

    /**
     *
     * @param head
     * @return
     */
    public static HashMap<Node, Node> getParentMap(Node head) {
        HashMap<Node, Node> map = new HashMap<>();
        map.put(head, null);
        fillParentMap(head, map);
        return map;
    }

    /**
     *
     * @param head
     * @param parentMap
     */
    public static void fillParentMap(Node head, HashMap<Node, Node> parentMap) {
        if (head.left != null) {
            parentMap.put(head.left, head);
            fillParentMap(head.left, parentMap);
        }

        if (head.right != null) {
            parentMap.put(head.right, head);
            fillParentMap(head.right, parentMap);
        }
    }

    /**
     *
     * @param parentMap
     * @param i
     * @param j
     * @return
     */
    public static int distance(HashMap<Node, Node> parentMap, Node i, Node j) {
        return 0;
    }
}
