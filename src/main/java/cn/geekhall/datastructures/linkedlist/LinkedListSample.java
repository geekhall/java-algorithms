package cn.geekhall.datastructures.linkedlist;

public class LinkedListSample {
    public static class Node {
        public int value;
        public Node next;
        public Node(int v) {
            this.value = v;
        }
    }

    /**
     * 快慢指针获取链表中点。
     * @param head  链表头结点
     * @return 链表元素个数为奇数个时返回中点元素；链表元素个数为偶数个时返回两个中点中的上一个元素。
     */
    public static Node getMidOrUpNode(Node head) {
        if (head == null || head.next == null || head.next.next == null) {
            return head;
        }

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
     * @return 链表元素个数为奇数个时返回中点元素；链表元素个数为偶数个时返回两个中点中的下一个元素。
     */
    public static Node getMidOrDownNode(Node head) {
        if (head == null || head.next == null) {
            return head;
        }

    }

    /**
     * 快慢指针获取链表中点。
     * @param head  链表头结点
     * @return 链表元素个数为奇数个时返回中点元素；链表元素个数为偶数个时返回两个中点中的下一个元素。
     */
    public static Node getMidOrPreUpNode(Node head) {

    }

    public static Node getMidOrPreDownNode(Node head) {

    }
}
