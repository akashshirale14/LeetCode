import java.util.*;
public class Problem746{
	public static void main(String[] args) {
		Problem746 p=new Problem746();
		int[] cost={0,1,2,2};
		int ans=p.minCostClimbingStairs(cost);	
		System.out.println(ans);
	}
	public int minCostClimbingStairs(int[] cost) {
        int index=0;
        int totalSum=0;
        if(cost.length==3){
        	if(cost[0]+cost[2] > cost[1]){
        		return cost[1];
        	}else{
        		return cost[0]+cost[2];
        	}
        }
        if(cost[0]<cost[1]){
        	index=0;
        	
        }else{
        	index=1;
        }
        totalSum+=cost[index];
        System.out.println(totalSum);
        if(cost.length==2) return totalSum;
        while(index<cost.length-1){
        	if(index==cost.length-2){
        		index+=2;
        	}
        	else if(cost[index+1]>=cost[index+2]){
        		index+=2;
        		totalSum+=cost[index];
        	}else{
        		index+=1;
        		totalSum+=cost[index];
        	}
        	
        }
        return totalSum;
    }
}