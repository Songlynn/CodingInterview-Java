public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	/*
	 * 递归思想，每次将左右两颗子树当成新的子树进行处理，
	 * 中序的左右子树索引很好找，前序的开始结束索引通过计算中序中左右子树的大小来计算，
	 * 然后递归求解，直到startPre>endPre||startIn>endIn说明子树整理完
	 */
	public TreeNode childTree(int[] pre, int preStart, int preEnd, int[] in,int inStart, int inEnd){
		if(preStart>preEnd||inStart>inEnd){
			return null;
		}
		TreeNode root = new TreeNode(pre[preStart]);
		for(int i=inStart;i<=inEnd;i++){
			if(in[i]==pre[preStart]){
				root.left=childTree(pre,preStart+1,preStart+i-inStart,in,inStart,i-1);
				root.right=childTree(pre,preStart+i-inStart+1,preEnd,in,i+1,inEnd);
				break;
			}
		}
		return root;
		
	}
    public TreeNode reConstructBinaryTree(int [] pre,int [] in) {
        TreeNode root = childTree(pre,0,pre.length-1,in,0,in.length-1);
        return root;
    }
}