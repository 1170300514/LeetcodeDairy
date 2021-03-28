package top.xyzhang.offer;

import java.util.Deque;
import java.util.LinkedList;
import java.util.Queue;

public class Solution59II {
    public static void main(String[] args) {
    }
}
class MaxQueue {

    Queue<Integer> queue;
    Deque<Integer> deque;

    public MaxQueue() {
        queue = new LinkedList();
        deque = new LinkedList();
    }

    public int max_value() {
        if (queue.isEmpty()) return -1;
        Boolean a;
        return deque.peek();
    }

    public void push_back(int value) {
        queue.offer(value);
        while (!deque.isEmpty() && deque.getLast() < value) {
            deque.removeLast();
        }
        deque.offerLast(value);
    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
        // !!!大坑 自动拆箱问题 两个都是Integer 如果用==比较的是地址 equals比较的才是数值
        if (deque.peek().equals(queue.peek())) {
            deque.poll();
        }
        return queue.poll();
    }
}

/**
 * Your MaxQueue object will be instantiated and called as such:
 * MaxQueue obj = new MaxQueue();
 * int param_1 = obj.max_value();
 * obj.push_back(value);
 * int param_3 = obj.pop_front();
 */
