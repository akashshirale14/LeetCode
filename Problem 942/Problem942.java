import java.util.*;
public class Problem942{
	public static void main(String[] args){
		Problem942 p=new Problem942();
		int[]a=p.diStringMatch("DDI");
		for (int i=0;i<a.length;i++){
			System.out.println(a[i]+" ");
		}
	}



	public int[] diStringMatch(String S) {
        int p1=0;
        int p2=S.length();
        int[] ans=new int[S.length() +1];
        for(int i=0;i<S.length();i++){
        	char curr=S.charAt(i);
        	if(curr=='I'){
        		System.out.println("Here "+p1);
        		ans[i]=p1;
        		p1++;
        	}else{
        		ans[i]=p2;
        		p2--;
        	}
        }

        for (int i=S.length();i<ans.length;i++) {
        	if(ans[i]==0){
        		ans[i]=p1;
        		p1++;
        	}
        }

        return ans;

    }
}