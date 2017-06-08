public class Solution {
	public class TreeNode {
		int val;
		TreeNode left;
		TreeNode right;
		TreeNode(int x) { val = x; }
	}
	/*
	 * �ݹ�˼�룬ÿ�ν������������������µ��������д���
	 * ������������������ܺ��ң�ǰ��Ŀ�ʼ��������ͨ���������������������Ĵ�С�����㣬
	 * Ȼ��ݹ���⣬ֱ��startPre>endPre||startIn>endIn˵������������
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