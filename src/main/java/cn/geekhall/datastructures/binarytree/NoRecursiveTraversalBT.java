package cn.geekhall.datastructures.binarytree;

import java.util.LinkedList;
import java.util.Queue;
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
        System.out.print("pre-order: ");
        if (head != null) {
            Stack<Node> stack = new Stack<Node>();
            stack.add(head);
            while (!stack.isEmpty()){
                head = stack.pop();
                System.out.print(head.value + " ");
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

    /**
     * 非递归后序遍历二叉树
     * @param head
     */
    public static void pos(Node head){
        System.out.print("pos-order: ");
        if (head != null) {
            Stack<Node> s1 = new Stack<>();
            Stack<Node> s2 = new Stack<>();
            s1.push(head);
            while (!s1.isEmpty()) {
                head = s1.pop();
                s2.push(head);
                if (head.left != null) {
                    s1.push(head.left);
                }
                if (head.right != null) {
                    s1.push(head.right);
                }
            }
            while (!s2.isEmpty()) {
                System.out.print(s2.pop().value + " ");
            }
        }
        System.out.println();
    }

    /**
     * 非递归中序遍历二叉树。
     * @param head
     */
    public static void in(Node head) {
        System.out.print("in-order: ");
        if (head != null) {
            Stack<Node> stack = new Stack<>();
            while (!stack.isEmpty() || head != null) {
                if (head != null) {
                    stack.push(head);
                    head = head.left;
                } else {
                    head = stack.pop();
                    System.out.print(head.value + " ");
                    head = head.right;
                }
            }
        }
        System.out.println();
    }

    /**
     * 非递归后续遍历二叉树（只使用一个stack）。
     * @param head
     */
    public static void pos1(Node head) {
        System.out.print("pos-order: ");
        Node lastPrint = head;
        if (lastPrint != null) {
            Stack<Node> stack = new Stack<>();
            stack.push(lastPrint);
            Node c; // 当前节点
            while (!stack.isEmpty()) {
                c = stack.peek();
                if (c.left != null && lastPrint != c.left && lastPrint != c.right) { // 左子树没处理完
                    stack.push(c.left);
                } else if (c.right!= null && lastPrint != c.right) { // 右子树没处理完
                    stack.push(c.right);
                } else {
                    System.out.print( stack.pop().value + " "); // 弹出并打印
                    lastPrint = c;
                }
            }
        }
        System.out.println();
    }

    /**
     * 二叉树的广度优先遍历。
     * @param head
     */
    public static void bfs(Node head) {
        System.out.print("bfs: ");
        if (head == null) {
            return;
        }
        Queue<Node> queue = new LinkedList<>();
        queue.add(head);
        while (!queue.isEmpty()) {
            Node cur = queue.poll();
            System.out.print(cur.value + " ");
            if (cur.left != null) {
                queue.add(cur.left);
            }
            if (cur.right != null) {
                queue.add(cur.right);
            }
        }
    }

    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        Node n5 = new Node(5);
        Node n6 = new Node(6);
        Node n7 = new Node(7);
        n1.left = n2;
        n1.right = n3;
        n2.left = n4;
        n2.right = n5;
        n3.left = n6;
        n3.right = n7;
        pre(n1);
        System.out.println("=========");
        pos(n1);
        System.out.println("=========");
        pos1(n1);
        System.out.println("=========");
        in(n1);
        System.out.println("=========");
        bfs(n1);
    }
}
