import java.util.*;
public class Problem896Another{
	
	public static void main(String[] args){
	Problem896Another p=new Problem896Another();
	int[]A={1,1,0};
	boolean ans=p.isMonotonic(A);
	System.out.println(ans);
	}

	public boolean isMonotonic(int[] A) {
		boolean increase=false;
		boolean decrease=false;

		for(int i=1;i<A.length;i++){
			if(A[i]-A[i-1]>0) increase=true;
			if(A[i]-A[i-1]<0) decrease=true;
		}

		return increase && decrease?false:true;
	}

	}