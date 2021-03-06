import java.util.Stack;

public class Solution {
    Stack<Integer> stack1 = new Stack<Integer>();
    Stack<Integer> stack2 = new Stack<Integer>();
    
    public void push(int node) {
        stack1.push(node);
    }
    /*
     * stack2的栈顶始终是最早的
     */
    public int pop() {
    	int node;
    	if(stack2.empty()){
    		while(!stack1.empty()){
        		stack2.push(stack1.pop());
        	}
    	}
    	node=stack2.pop();
    	return node;
    }
}