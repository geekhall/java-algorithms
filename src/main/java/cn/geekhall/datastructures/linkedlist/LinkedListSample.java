package cn.geekhall.datastructures.linkedlist;

import java.util.ArrayList;

public class LinkedListSample {
    public static class Node {
        public int value;
        public Node next;
        public Node(int v) {
            this.value = v;
        }

        @Override
        public String toString() {
            return "Node{" +
                    "value=" + value +
                    '}';
        }
    }

    /**
     * 快慢指针获取链表中点。
     * @param head  链表头结点
     * @return 链表元素个数为奇数个时返回中点元素；链表元素个数为偶数个时返回上中点。
     */
    public static Node getMidNode1(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

        // 链表有三个点或以上元素
        Node slow = head.next;
        Node fast = head.next.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 快慢指针获取链表中点。
     * @param head  链表头结点
     * @return 链表元素个数为奇数个时返回中点元素；链表元素个数为偶数个时返回下中点。
     */
    public static Node getMidNode2(Node head) {
        if (head == null || head.next == null) {
            return head;
        }
        Node slow = head.next;
        Node fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 快慢指针获取链表中点。
     * @param head  链表头结点
     * @return 链表元素个数为奇数个时返回中点的前一个元素；链表元素个数为偶数个时返回上中点的前一个元素。
     */
    public static Node getMidNode3(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return null;
        }
        Node slow = head;
        Node fast = head.next.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    /**
     * 快慢指针获取链表中点。
     * @param head  链表头结点
     * @return 链表元素个数为奇数个时返回中点的前一个元素；链表元素个数为偶数个时返回下中点的前一个元素。
     */
    public static Node getMidNode4(Node head) {
        if (head == null || head.next == null) {
            return null;
        }
        if (head.next.next == null) {
            return head;
        }

        Node slow = head;
        Node fast = head.next;
        while (fast.next != null && fast.next.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        return slow;
    }

    public static Node right1(Node node) {
        if (node == null) {
            return null;
        }
        Node cur = node;
        ArrayList<Node> arr = new ArrayList<>();
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }

        return arr.get((arr.size() - 1) / 2);
    }
    public static Node right2(Node node) {
        if (node == null) {
            return null;
        }
        Node cur = node;
        ArrayList<Node> arr = new ArrayList<>();
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }

        return arr.get(arr.size() / 2);
    }

    public static Node right3(Node node) {
        if (node == null || node.next == null || node.next.next == null) {
            return null;
        }
        Node cur = node;
        ArrayList<Node> arr = new ArrayList<>();
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }

        return arr.get((arr.size() - 1) / 2 - 1);
    }
    public static Node right4(Node node) {
        if (node == null || node.next == null || node.next.next == null) {
            return null;
        }
        Node cur = node;
        ArrayList<Node> arr = new ArrayList<>();
        while (cur != null) {
            arr.add(cur);
            cur = cur.next;
        }

        return arr.get(arr.size() / 2 - 1);
    }
    public static void main(String[] args) {
        Node n1 = new Node(1);
        Node n2 = new Node(2);
        Node n3 = new Node(3);
        Node n4 = new Node(4);
        n1.next = n2;
        n2.next = n3;
        n3.next = n4;
        n4.next = null;
        System.out.println(getMidNode1(n1));
        System.out.println(right1(n1));
        System.out.println(getMidNode2(n1));
        System.out.println(right2(n1));
        System.out.println(getMidNode3(n1));
        System.out.println(right3(n1));
        System.out.println(getMidNode4(n1));
        System.out.println(right4(n1));
    }
}
