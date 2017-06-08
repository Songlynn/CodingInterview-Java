public class Solution {
    public boolean Find(int target, int [][] array) {
    	boolean found=false;
    	if(array==null||(array.length==1&&array[0]==null))
    		found=false;
    	else{
    		int row=array.length;
        	int col=array[0].length;
        	int i=0,j=col-1;
        	while(i<row&&j>=0){
        		int k=array[i][j];
        		if(k>target){
        			j--;
        		}
        		else if(k<target){
        			i++;
        		}
        		else{
        			found=true;
        			break;
        		}
        	}
    	}
    	return found;
    }
}
