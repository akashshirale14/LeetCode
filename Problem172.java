import java.util.*;


public class Problem172{
	public static void main(String[] args){
		Problem172 p=new Problem172();
		int ans=p.trailingZeroes(1500);
		System.out.println(ans);
    }
	
	public int trailingZeroes(int n) {
    	int z=0;
    	while(n!=0){
    		z+=n/5;
    		n=n/5;
    	}
    	return z;
    } 

}