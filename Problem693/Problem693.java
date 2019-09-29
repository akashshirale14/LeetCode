import java.util.*;
public class Problem693{
	public static void main(String[] args) {
		Problem693 p=new Problem693();
		boolean a=p.hasAlternatingBits(5);
		//System.out.println(a);	
	}
	public boolean hasAlternatingBits(int n) {
        int i=1;
        while(true){
        int num=1>>i;
        int ans=n&num;
        if(ans==1){
        	break;
        }
        i++;	
        }
        System.out.println(i);
        return true;
    }
}