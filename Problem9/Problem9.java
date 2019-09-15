import java.util.*;
public class Problem9{
	public static void main(String[] args) {
	Problem9 p=new Problem9();
	boolean ans=p.isPalindrome(9);
	System.out.println(ans);

	}
	public boolean isPalindrome(int x) {
        String curr=String.valueOf(x);
        String now="";
        for(int i=curr.length()-1;i>=0;i--){
        	now+=String.valueOf(curr.charAt(i));
        }
        if(now.compareTo(curr)==0) return true;
        return false;
    }
}