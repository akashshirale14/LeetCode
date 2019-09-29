import java.util.*;
public class Problem27{
	public static void main(String[] args) {
		Problem27 p=new Problem27();
		int[]nums={6,3,3,3};
		int val=3;
		int a=p.removeElement(nums,val);
		System.out.println(a);	
	}
	public int removeElement(int[] nums, int val) {
        if(nums.length==0){
        	return 0;
        }
        int count=0;
       	int start=0;
       	int end=nums.length-1;
       	while(start<nums.length && end >=0){
       		while(start<nums.length && nums[start]!=val){
       			start++;
       		}
       		if(start==nums.length){
       			break;
       		}   		
       		while(end>0 && nums[end]==val){
       			count++;
       			end--;
       		}
       		if(end==0){
       			count++;
       			break;
       		}
       		int temp=nums[start];
       		nums[start]=nums[end];
       		nums[end]=nums[start];
       		count++;
       		start++;
       		end--;
       	}
       	return nums.length-count;
    }
}