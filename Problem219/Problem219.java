import java.util.*;
public class Problem219{
	public static void main(String[] args) {
		Problem219 p=new Problem219();
		int[] nums={1,2,3,1};
		int k=3;
		System.out.println(p.containsNearbyDuplicate(nums,k)); 
		
	}
	public boolean containsNearbyDuplicate(int[] nums, int k) {
		Map<Integer,Integer>hm=new HashMap<>();
		for(int i=0;i<nums.length;i++){
			if(hm.get(nums[i])==null){ 
				hm.put(nums[i],i);
			}else{
				int currentIndex=hm.get(nums[i]);
				if((i-currentIndex)<=k) return true;
				hm.put(nums[i],i);
			}			
		}
		return false;
	}

//1 4 3 5 3 7 k=2                     //3,5
	public boolean containsNearbyDuplicate(int[] nums, int k) {
       Map<Integer>hs=new HashSet<>();
       for(int i=0;i<nums.length;i++){
       		if(i>k)remove(nums[i-k-1]);
       		if(!hs.add(nums[i])) return true;	
       }
       return false;
 	}

	//Solution 1
	/*public boolean containsNearbyDuplicate(int[] nums, int k) {
        for(int i=0;i<nums.length;i++){
        	int kBoundary=i+k;
        	if(kBoundary>=nums.length) kBoundary=nums.length-1;
        	while(kBoundary!=i){
        		if(nums[kBoundary]==nums[i]) return true;
        		kBoundary--;
        	}
        }
        return false;
    }*/
}