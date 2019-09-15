import java.util.*;

public class Problem1{
	public static void main(String[] args){
		Problem1 p=new Problem1();
		int[] nums={3,2,4};
		int target=6;
		int []ans=p.twoSum(nums,target);
		for(int i=0;i<ans.length;i++){
			System.out.println(" "+ans[i]);
		}
	}

	public int[] twoSum(int[] nums, int target) {
		int[]ans=new int[2];
		int flag=0;
        for(int i=0;i<nums.length-1;i++){
        	int sum=target;
        	sum-=nums[i];
           for(int j=i+1;j<nums.length;j++){
           		int eqzero=sum-nums[j];
   				if(eqzero==0){
   					ans[0]=i;
   					ans[1]=j;
   					flag=1;
   					break;
   				}			   		
           }
           if(flag==1) break;
    	}

    	return ans;
}
}