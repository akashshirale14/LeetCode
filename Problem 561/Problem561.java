import java.util.*;

public class Problem561{
	public static void main(String[] args){
		Problem561 p=new Problem561();
		int[]nums={1,4,3,2};
		int ans=p.arrayPairSum(nums);
		System.out.println(ans);
	}

	 public int arrayPairSum(int[] nums) {
        Arrays.sort(nums);
        int sum=0;
        for(int i=0;i<nums.length;i=i+2){
        	sum+=nums[i];
        }
        return sum;
    }
}