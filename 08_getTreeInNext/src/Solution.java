/*
 * 在二叉树中序遍历中找出节点的下一节点
 */
public class Solution {
	public class TreeNode{
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode father;
		TreeNode(int x){
			this.val=x;
		}
	}
	public TreeNode getNext(TreeNode node){
		TreeNode next=null;
		if(node.right!=null){
			next=node.right;
			while(next.left!=null){
				next=next.left;
			}
		}
		else if(node.father!=null&&node==node.father.left){
			next=node.father;
		}
		else if(node.father!=null&&node==node.father.right){
			next=node.father;
			while(next.father!=null&&next==next.father.right){
				next=next.father;
			}
		}
		
		return next;
	}
}
