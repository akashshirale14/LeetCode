import java.util.*;
public class BinarySearch{
	public static void main(String[] args){
		BinarySearch bs=new BinarySearch();
		int key=4;
		int[]A={0,1,2,6,18,32,44,56,75,98,114,675};
		boolean ans=bs.binarySearch(key,A,0,A.length-1);
		System.out.println(ans);	
	}

	public boolean binarySearch(int key,int[]A,int start,int end){
		boolean ans;
		if(start>end){
			return false;
		}else{
			int midpoint=(start+end)/2;
			if(A[midpoint]==key) return true;
			else if(A[midpoint]> key){
				ans=binarySearch(key,A,start,midpoint-1);
			}else{
				ans=binarySearch(key,A,midpoint+1,end);
			}
		}
		return ans;
	}
}