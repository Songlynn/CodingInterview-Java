public class Solution {
    public int JumpFloor(int target) {
    	int fn=0;
    	if(target==1)
    		fn=1;
    	else if(target==2)
    		fn=2;
    	else{
    		int f1=1,f2=2;
    		for(int i=3;i<=target;i++){
    			int t=f2;
    			f2=f1+f2;
    			f1=t;
    		}
    		fn=f2;
    	}
    	return fn;
    }
}