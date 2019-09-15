import java.util.*;
public class Problem485{
	public static void main(String[] args){
		Problem485 p=new Problem485();
		int[] nums={0,0};
		int ans=p.findMaxConsecutiveOnes(nums);
		System.out.println(ans);
	}

	public int findMaxConsecutiveOnes(int[] nums) {
		String ans="";
        for(int i=0;i<nums.length;i++){
        	ans=ans+String.valueOf(nums[i]);
        }
        String[] seperate=ans.split("0");
        int maxlen=0;
        for(String k:seperate){
        	if(k.length()>maxlen) maxlen=k.length();
        }

        return maxlen;
    }
}