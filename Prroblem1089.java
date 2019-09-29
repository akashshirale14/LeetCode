import java.util.*;
public class Problem1089{
	public static void main(String[] args) {
		Problem1089 p= new Problem1089();
		int[] arr={1,0,2,3,0,4,5,0};
		p.duplicateZeros(arr);	
	}
	public void duplicateZeros(int[] arr) {
        int len=arr.length;
        for(int i=0;i<len;){
        	if(arr[i]!=0){
        		continue;
        		i++;
        	}else{
        		int end=len-1;
        		int start=i;
        		while(end-start>1){
        			int temp=arr[end-1];
        			arr[end]=temp;
        			end--;
        		}
        		arr[end]=0;
        		i+=2;
        	}
        }

        for(int j=0;j<len;j++){
        	System.out.println(arr[j]);
        }

    }
}

