import java.util.*;
public class Problem896{
	
	public static void main(String[] args){
	Problem896 p=new Problem896();
	int[]A={1,3,2};
	boolean ans=p.isMonotonic(A);
	System.out.println(ans);
	}

	public boolean isMonotonic(int[] A) {
        int[] copy=new int[A.length];
        int flag=0;
        int temp=0;
        int index=0;
        if(A.length==1){
            return true;
        }
        for(int i=0;i<A.length-1;i++){
        	copy[i]=A[i+1]-A[i];
        }
        //find first non-zero in copy
        for(int i=0;i<copy.length;i++){
        	if(copy[i]!=0){
        		index=i;
        		temp=copy[i];
        		break;
        	}
        }
        flag=(temp>0)?1:-1;
        temp=flag;
        for(int j=index+1;j<copy.length;j++){
        	if(copy[j]==0){
        		continue;
        	}else if(copy[j]>0 && flag==-1){
        		return false;
        	}else if(copy[j]<0 && flag==1){
        		return false;
        	}else{
        		continue;
        	}
        }

        return true;
        
    }


}