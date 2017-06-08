/*
 * 从后往前，先计算需要多少空间，然后从后往前移动，则每个字符只为移动一次
 */
public class Solution {
	public String replaceSpace(StringBuffer str) {
    	int spaceNum = 0;
    	for(int i=0;i<str.length();i++){
    		if(str.charAt(i)==' '){
    			spaceNum++;
    		}
    	}
    	int oldLen = str.length();
    	int newLen = oldLen + spaceNum * 2;
    	str.setLength(newLen);
    	int indexNew = newLen-1;
    	int indexOld = oldLen-1;
    	while(indexOld>=0&&indexNew>indexOld){
    		if(str.charAt(indexOld)==' '){
    			str.setCharAt(indexNew--, '0');
    			str.setCharAt(indexNew--, '2');
    			str.setCharAt(indexNew--, '%');
    		}
    		else{
    			str.setCharAt(indexNew--, str.charAt(indexOld));
    		}
    		indexOld--;
    	}
    	return str.toString();
    }
}
