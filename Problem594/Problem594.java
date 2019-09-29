import java.util.*;
public class Problem594{
	public static void main(String[] args) {
		Problem594 p=new Problem594();
		int[] nums={1,3,2,2,5,5,5,5,5,5,2,3,7};
		int ans=p.findLHS(nums);
		System.out.println(ans);

	}
	public int findLHS(int[] nums) {
        Map<Integer,Integer>hm=new HashMap<>();
        for(int i=0;i<nums.length;i++){
        	hm.put(n)

        	/*if(hm.get(nums[i])==null){
        		hm.put(nums[i],1);

        	}else{
        		int curr=hm.get(nums[i]);
        		hm.put(nums[i],curr+1);
        	}*/
        }
        
        int max=0;
        for(int curr:hm.keySet()){
        	if(hm.get(curr+1)!=null){
        		int newlength=hm.get(curr)+hm.get(curr+1);
        		if(max<newlength) max=newlength;
        	}
        }

        return max;
    }
}