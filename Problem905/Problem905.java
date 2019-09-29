import java.util.*;

public class Problem905{

	public static void main(String[] args){

		Problem905 p=new Problem905();
		int[]A={};
		int[]ans=p.sortArrayByParity(A);
		for(int i=0;i<ans.length;i++){
			System.out.println(ans[i]);
		}
	}


	public int[] sortArrayByParity(int[] A) {
        int[]ans=new int[A.length];
        int start=0;
        int end=A.length-1;
        for(int i=0;i<A.length;i++){
        	if(A[i]%2==0){
        		ans[start]=A[i];
        		start++;
        	}else{
        		ans[end]=A[i];
        		end--;
        	}
        }
        return ans;
    }
}