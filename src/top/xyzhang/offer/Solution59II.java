package top.xyzhang.offer;

import java.util.*;

public class Solution59II {

}

/**
 * 使用两个队列 一个普通队列一个用于存储元素入队时最大值
 * 出队时两队同时出队 入队时与最大值相比较
 * 每次只需要记住当前的最大值
 * PS：此题与最大栈思路相同
 */
class MaxQueue {

    Queue<Integer> queue;
    Deque<Integer> maxQueue;
    public MaxQueue() {
        queue = new LinkedList<>();
        maxQueue = new LinkedList<>();
    }

    public int max_value() {
        if (queue.isEmpty()) return -1;

        return maxQueue.getLast();
    }

    public void push_back(int value) {
        queue.offer(value);
//        if (stack.isEmpty()) {
//            stack.push(value);
//        } else if (stack.peek() <= value) {
//            stack.push(value);
//        }
//        if (!maxQueue.isEmpty() && maxQueue.peek() > value) {
//            maxQueue.offer(maxQueue.peek());
//        } else {
//            maxQueue.offer(value);
//        }
    }

    public int pop_front() {
        if (queue.isEmpty()) return -1;
//        if (stack.peek() == queue.peek()) {
//            stack.pop();
//        }
        return queue.poll();
    }
}