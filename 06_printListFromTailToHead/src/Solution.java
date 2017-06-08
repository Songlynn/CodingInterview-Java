
import java.util.*;
public class Solution {
	public class ListNode {
        int val;
        ListNode next = null;

        ListNode(int val) {
            this.val = val;
        }
    }
    public ArrayList<Integer> printListFromTailToHead(ListNode listNode) {
    	ArrayList<Integer> list = new ArrayList<Integer>();
    	if(listNode==null||listNode.next==null){
        	return list;
        }
    	Stack<Integer> s = new Stack<Integer>();
    	ListNode p = listNode;
    	while(p!=null){
    		s.push(p.val);
    		p=p.next;
    	}
    	while(!s.isEmpty()){
    		list.add(s.pop());
    	}
    	return list;
    }
}