package cn.geekhall.datastructures.binarytree;

import java.util.Stack;

public class NoRecursiveTraversalBT {
    public static class Node {
        public int value;
        public Node left;
        public Node right;
        public Node(int value) {
            this.value = value;
        }
    }

    /**
     * 非递归先序遍历二叉树
     * 1）弹出时打印
     * 2）如果有右孩子，压入右孩子
     * 3）如果有左孩子，压入左孩子
     * @param head
     */
    public static void pre(Node head) {
        System.out.println("pre-order:");
        if (head != null) {
            Stack<Node> stack = new Stack<Node>();
            stack.add(head);
            while (!stack.isEmpty()){
                head = stack.pop();
                System.out.println(head.value + " ");
                if (head.right!=null) {
                    stack.push(head.right);
                }
                if (head.left != null) {
                    stack.push(head.left);
                }
            }
        }
        System.out.println();
    }
}
