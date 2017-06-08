public class Solution {
    public int JumpFloorII(int target) {
    	/*
    	 * fn=f1+f2+f3+...+(fn-3)+(fn-2)+(fn-1)
    	 * fn-1=f1+f2+f3+...+(fn-3)+(fn-2)
    	 * fn=2*(fn-1)
    	 */
        if(target==0||target==1){
        	return 1;
        }
        else{
        	return 2*JumpFloorII(target-1);
        }
    }
}