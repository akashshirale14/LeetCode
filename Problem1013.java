import java.util.*;

public class Problem1013{
	public static void main(String[] args){
		Problem1013 p=new Problem1013();
		int[] A={0,2,1,-6,6,-7,9,1,2,0,1};
		boolean ans=p.canThreePartsEqualSum(A);
		System.out.println(ans);
	}
	public boolean canThreePartsEqualSum(int[] A) {
        int len=A.length();
        int div=length/3;
        Stack<Integer>front=new Stack<>();
        List<Integer>ll=new ArrayList<>();
        Stack<Integer>back=new Stack<>();
        for(int i=0;i<=div;i++){
        	front.push(A[i]);
        	sum1+=A[i];
        }
        for(int i=length-1;j<=length-1-div;j--){
        	back.push(A[i]);
        	sum3+=A[i];
        }
        for(int i=div+1;i<length-1-div;i++){
        	ll.add(A[i]);
        	sum2+=A[i];
        }

        while()

        if(sum1==sum2 && sum2)
    }
}