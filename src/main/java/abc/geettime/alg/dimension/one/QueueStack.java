package abc.geettime.alg.dimension.one;

import java.util.Queue;
import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.LinkedBlockingDeque;

/**
 * @Description
 * @auther cong zhang
 * @email zc.bjut@gmail.com
 * @create 2020-04-12 10:11
 */
public class QueueStack {

    private Queue<Integer> q1 ;

    private Queue<Integer> q2 ;

    public static void main(String[] args) {
       QueueStack obj = new QueueStack();
       obj.push(1);
       obj.push(2);
       int param_2 = obj.pop();
       int param_3 = obj.top();
       int param_5 = obj.pop();
       boolean param_4 = obj.empty();
       System.out.println(param_2 + " " + param_3 + " " + param_5 +  " " + param_4);
    }


    /** Initialize your data structure here. */
    public QueueStack() {
        q1 = new LinkedBlockingDeque();
        q2 = new LinkedBlockingDeque();
    }

    /** Push element x onto stack. */
    public void push(int x) {
        if(q2.isEmpty()){
            q1.add(x);
        }else{
            q2.add(x);
        }
    }

    /** Removes the element on top of the stack and returns that element. */
    public int pop() {
        if( q1.isEmpty() && q2.isEmpty()){
            return -1 ;
        }

        if( q1.isEmpty()){
            int size = q2.size() ;
            int i = 0 ;
            while( i< q2.size() -1 ){
                q1.add(q2.poll());
            }
            return q2.poll();
        }else{
            int size = q1.size() ;
            int i = 0 ;
            while( i< q1.size() -1 ){
                q2.add(q1.poll());
            }
            return q1.poll();
        }
    }

    /** Get the top element. */
    public int top() {
        if( q1.isEmpty() && q2.isEmpty()){
            return -1 ;
        }
        int top = -1;
        if( q1.isEmpty()){
            int size = q2.size() ;
            int i = 0 ;
            while( i< q2.size() -1 ){
                q1.add(q2.poll());
            }
            top = q2.peek();
            q1.add(q2.poll());
        }else{
            int size = q1.size() ;
            int i = 0 ;
            while( i< q1.size() -1 ){
                q2.add(q1.poll());
            }
            top = q1.peek();
            q2.add(q1.poll());
        }
        return  top;
    }

    /** Returns whether the stack is empty. */
    public boolean empty() {
        return q1.isEmpty() && q2.isEmpty() ;
    }
}
