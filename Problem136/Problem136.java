import java.util.*;
public class Problem136{
	public static void main(String[] args) {
		Problem136 p=new Problem136();
		int[] nums={4,1,2,1,2};
		int a=p.singleNumber(nums);
		System.out.println(a);	
	}
	public int singleNumber(int[] nums) {
       if(nums.length==1) return nums[0];
       int ans=nums[0];
       for(int i=1;i<nums.length;i++){
       	ans^=nums[i];
       }
       return ans;
    }
}