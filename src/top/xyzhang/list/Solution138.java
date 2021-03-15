package top.xyzhang.list;

import java.util.HashMap;

public class Solution138 {
    // 使用Hash表进行深拷贝
    public Node copyRandomList(Node head) {
        Node cur = head;
        HashMap<Node, Node> map = new HashMap<>();
        while (cur != null) {
            map.put(cur, new Node(cur.val));
            cur = cur.next;
        }
        cur = head;
        Node dummyNode = new Node(0);
        Node newCur = dummyNode;
        while (cur != null) {
            newCur.next = map.get(cur);
            newCur.next.val = cur.val;
            newCur.next.random = map.get(cur.random);
            newCur = newCur.next;
            cur = cur.next;
        }
        return dummyNode.next;
    }
}
