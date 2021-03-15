package top.xyzhang.list;

// 判断回文
public class Solution234 {
    public static void main(String[] args) {
        ListNode listNode = new ListNode(1);
        listNode.next = new ListNode(2);
        listNode.next.next = new ListNode(2);
        listNode.next.next.next = new ListNode(1);
        listNode.next.next.next.next = new ListNode(1);
        Solution234 solution234 = new Solution234();
        System.out.println(solution234.isPalindrome(listNode));
    }
    public boolean isPalindrome(ListNode head) {
        ListNode fast = head, slow = head;
        // 慢指针指向后半段的开始节点
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        ListNode newHead = reverseList(slow);
        while (newHead != null) {
            if (newHead.val == head.val) {
                newHead = newHead.next;
                head = head.next;
            } else {
                return false;
            }
        }
        return true;
    }
    public ListNode reverseList(ListNode head) {
        ListNode pre = null, cur = head, nex = cur;
        while (cur != null) {
            nex = cur.next;
            cur.next = pre;
            pre = cur;
            cur = nex;
        }
        return pre;
    }
}
