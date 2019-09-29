import java.util.*;
public class Problem9Another{
	public static void main(String[] args) {
	Problem9Another p=new Problem9Another();
	boolean ans=p.isPalindrome(-121);
	System.out.println(ans);
	}
	public boolean isPalindrome(int x) {
		String curr=String.valueOf(x);
		int start=0;
		int end=curr.length()-1;
		int flag=0;
		while(start<=end){
			if(curr.charAt(start)==curr.charAt(end)){
				start++;
				end--;
			}else{
				flag=1;
				break;
			}
		}
		if(flag==0) return true;
		return false;
	}
}
