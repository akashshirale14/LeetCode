import java.util.*;
public class Problem628{
	public static void main(String[] args) {
		Problem628 p=new Problem628();
		int[] nums={-4,-3,-2,50,60};
		int ans=p.maximumProduct(nums);
		System.out.println(ans);
	}
	public int maximumProduct(int[] nums) {
        int product;
        Arrays.sort(nums);
        if(nums[0]>=0){
         product=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];
    }else{
    	int p1=nums[0]*nums[1]*nums[nums.length-1];
    	int p2=nums[nums.length-1]*nums[nums.length-2]*nums[nums.length-3];

    	product=p1>p2?p1:p2;
        
    }
    return product;
    }
}