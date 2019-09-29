import java.util.*;
public class Problem628Another{
	public static void main(String[] args) {
		Problem628Another p=new Problem628Another();
		int[] nums={-4,-3,-2,50,60};
		int ans=p.maximumProduct(nums);
		System.out.println(ans);
	}
	 public int maximumProduct(int[] nums){
	 	int max1=Integer.MIN_VALUE;
	 	int max2=Integer.MIN_VALUE;
	 	int max3=Integer.MIN_VALUE;
	 	int min1=Integer.MAX_VALUE;
	 	int min2=Integer.MAX_VALUE;

	 	for(int n:nums){
	 		if(n>max1){
	 			max3=max2;
	 			max2=max1;
	 			max1=n;
	 		}else if(n>max2){
	 			max3=max2;
	 			max2=n;

	 		}else if(n>max3){
	 			max3=n;
	 		}


	 		if(n<min1){
	 			min2=min1;
	 			min1=n;
	 		}else if(n<min2){
	 			min2=n;
	 		}
	 	}

	 	return Math.max(max1*max2*max3,max1*min1*min2);
	 }
}