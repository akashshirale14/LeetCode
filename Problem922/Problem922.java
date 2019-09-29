import java.util.*;
public class Problem922{
	public static void main(String[] args) {
	Problem922 p=new Problem922();
	int[] A={7};
	int[] ans=p.sortArrayByParityII(A);
	for(int i=0;i<ans.length;i++){
		System.out.println(ans[i]);
	}
}
	 public int[] sortArrayByParityII(int[] A {
	 	if(A.length==0 || A.length==1) return A;
	 	int evenpointer=0;
	 	int oddpointer=1;
	 	int evenlimit=0;
	 	int oddlimit=0;
	 	if(A.length%2==0){
	 		evenlimit=A.length-2;
	 		oddlimit=A.length-1;
	 	}else{
	 		evenlimit=A.length-1;
	 		oddlimit=A.length-2;
	 	}
        while(evenpointer<=evenlimit && oddpointer<=oddlimit){
        	if(A[evenpointer]%2==0){
        		evenpointer+=2;
        		continue;
        	}else{
        		while(A[oddpointer]%2!=0){
        			oddpointer+=2;
        		}
        		int temp=A[oddpointer];
        		A[oddpointer]=A[evenpointer];
        		A[evenpointer]=temp;
        	}
        }
        return A;
    }
}
