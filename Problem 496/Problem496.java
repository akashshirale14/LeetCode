import java.util.*;
public class Problem496{
	public static void main(String[] args){
		Problem496 p=new Problem496();
		int[] nums1={2,4};
		int[] nums2={1,2,3,4};
		int[] ans=p.nextGreaterElement(nums1,nums2);
		for(int i=0;i<ans.length;i++){
			System.out.print(ans[i]);
		}
	}

	 public int[] nextGreaterElement(int[] nums1, int[] nums2) {
     	int[] ans=new int[nums1.length];
     	Stack<Integer>st=new Stack<>();
     	for(int i=0;i<nums1.length;i++){
     		st.push(nums1[i]);
     	}
     	int i=nums1.length-1;
     	while(!st.isEmpty()){
     		int searchNum=st.pop();
     		int index=-1;
     		int flag=0;
     		for(int j=0;j<nums2.length;j++){
     			if(nums2[j]==searchNum && flag==0){
     				flag=1;
     				continue;
     			}
     			if(nums2[j]>searchNum && flag==1){
     				flag=2;
     				ans[i]=nums2[j];
     				i--;
     				break;
     			}
     		}	
     	 if(flag==1) {
     	 	ans[i]=-1;
     	 	i--;
     	}
}
     	return ans;
    }
}