package top.xyzhang.list;

public class Solution25 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(3);
        Solution25 solution25 = new Solution25();
        solution25.reverseListNode(listNode);
    }
    // 普通翻转链表
    public ListNode reverseListNode(ListNode head) {
        if (head == null || head.next == null) {
            return head;
        }
        ListNode pre, cur = head, nex = head.next;
        while (nex != null) {
            pre = cur;
            cur = nex;
            nex = nex.next;
            cur.next = pre;
        }
        head.next = null;
        return cur;
    }
    // 此处的翻转链表方法更好！
    // 反转区间[a,b)之间的元素
    public ListNode reverseBetweenAB(ListNode a, ListNode b) {
        ListNode pre = null, cur = a, nex = a;
        while (cur != b) {
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
    // k个一组翻转链表
    public ListNode reverseKGroup(ListNode head, int k) {
        ListNode a = head, b = head;
        // k个一组 不到k个直接返回不进行翻转
        for (int i = 0; i < k; i++) {
            if (b == null) return head;
            b = b.next;
        }
        // 翻转a，b的元素
        ListNode newHead = reverseBetweenAB(a, b);
        a.next = reverseKGroup(b,k);
        return newHead;
    }

}
