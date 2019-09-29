import java.util.*;
public class Problem643{
  public static void main(String[] args){
    Problem643 p=new Problem643();
    int[] nums={1,12,-5,-6};
    int k=4;
    double ans=p.findMaxAverage(nums,k);
    System.out.println(ans);
  }
  public double findMaxAverage(int[] nums, int k) {
        double sumTillK=0;
        int arrayLength=k;
        for(int i=0;i<k;i++){
          sumTillK+=nums[i];
        }
        double maxAvg=sumTillK/arrayLength;
        for(int i=1;i<nums.length && k<nums.length;i++){
            sumTillK-=nums[i-1];
            sumTillK+=nums[k];
            k++;
            double newAvg=sumTillK/arrayLength;
            if(maxAvg<newAvg) maxAvg=newAvg;
        }
        return maxAvg;
    }
}
