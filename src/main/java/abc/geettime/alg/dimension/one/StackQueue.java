package abc.geettime.alg.dimension.one;

import java.util.Stack;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-12 10:00
 */
public class StackQueue {

    private Stack<Integer> inputStack ;
    private Stack<Integer> outputStack ;

    public static void main(String[] args) {
        StackQueue queue = new StackQueue();

        queue.push(1);
        queue.push(2);
        System.out.println(queue.peek());;  // 返回 1
        System.out.println(queue.pop());;   // 返回 1
        System.out.println(queue.empty());;  // 返回 false
    }

    /** Initialize your data structure here. */
    public StackQueue() {
        inputStack = new Stack();
        outputStack = new Stack();
    }

    /** Push element x to the back of queue. */
    public void push(int x) {
        inputStack.push(x);
    }

    /** Removes the element from in front of queue and returns that element. */
    public int pop() {
        if( outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
        if( !outputStack.isEmpty()){
            return outputStack.pop();
        }
        return -1;
    }

    /** Get the front element. */
    public int peek() {
        if( outputStack.isEmpty()){
            while(!inputStack.isEmpty()){
                outputStack.push(inputStack.pop());
            }
        }
        if( !outputStack.isEmpty()){
            return outputStack.peek();
        }
        return -1;
    }

    /** Returns whether the queue is empty. */
    public boolean empty() {
        return inputStack.isEmpty() && outputStack.isEmpty();
    }
}
