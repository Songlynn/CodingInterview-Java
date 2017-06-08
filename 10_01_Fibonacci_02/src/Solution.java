public class Solution {
    public int Fibonacci(int n) {
    	int fn=0;
    	if(n<=0)
    		fn=0;
    	else if(n==1)
    		fn=1;
    	else{
    		int f1=0,f2=1;
    		for(int i=2;i<=n;i++){
    			int t=f2;
    			f2=f1+f2;
    			f1=t;
    		}
    		fn=f2;
    	}
    	return fn;
    }
}