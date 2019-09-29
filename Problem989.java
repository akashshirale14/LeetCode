import java.util.*;

public class Problem989{
	public static void main(String[] args) {
		Problem989 p=new Problem989();
		int[] A={9};
		int K=99;
		List<Integer>ans=p.addToArrayForm(A,K);
		System.out.println(ans);
	}
	public List<Integer> addToArrayForm(int[] A, int K) {
       List<Integer>l1=new ArrayList<>();
       int carry=0;
       for(int i=A.length-1;i>=0;i--){
       	int ans=A[i]+K%10 +carry;
       	if(ans>=10){
       		carry=1;
       		l1.add(0,ans%10);
       	}else{
       		l1.add(0,ans);
       		carry=0;
       	}
       	K=K/10;
       }
       if(K!=0){
       	while(K!=0){
       		int hu=K%10+carry;
       		if(hu<10){
       			l1.add(0,hu);
       			carry=0;
       		}else{
       		l1.add(0,hu%10);
       		carry=hu/10;
       		}
       		K=K/10;
       	}
       }
       if(carry==1){
       	l1.add(0,1);
       }
       return l1;
    }
}