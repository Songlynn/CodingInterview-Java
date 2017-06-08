import java.util.LinkedList;
import java.util.Queue;

public class Solution {
	Queue<Integer> queue1 = new LinkedList<Integer>();
	Queue<Integer> queue2 = new LinkedList<Integer>();
	
	public void push(int node){
		if(queue1.isEmpty()&&queue2.isEmpty()){
			queue1.offer(node);
		}
		else if(!queue1.isEmpty()){
			queue1.offer(node);
		}
		else{
			queue2.offer(node);
		}
	}
	
	public int pop(){
		int node;
		if(!queue1.isEmpty()){
			while(queue1.size()>1){
				queue2.offer(queue1.poll());
			}
			node=queue1.poll();
		}
		else{
			while(queue2.size()>1){
				queue1.offer(queue2.poll());
			}
			node=queue2.poll();
		}
		return node;
	}
}
