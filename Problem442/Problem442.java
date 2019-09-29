import java.util.*;

public class Problem442{
	public static void main(String[] args) {
		Problem442 p=new Problem442();
		int[] nums={4,3,2,7,8,2,3,1};
		List<Integer>ll=p.findDuplicates(nums);	
		System.out.println(ll);
	}
	public List<Integer> findDuplicates(int[] nums) {
		List<Integer>ll=new ArrayList<>();
        Arrays.sort(nums);
        for(int i=0;i<nums.length-1;i++){
        	int ans=nums[i]^nums[i+1];
        	if(ans==0){
        		ll.add(nums[i]);
        	}
        }
		return ll;
    }
}