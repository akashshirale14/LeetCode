import java.util.*;
public class Problem121{
	public static void main(String[] args) {
		Problem121 p=new Problem121();
		int[] prices={7,7,7,7,7};
		int ans=p.maxProfit(prices);	
		System.out.println(ans);
	}
	public int maxProfit(int[] prices) {
		int diff=0;
        for(int i=0;i<prices.length;i++){
        	for(int j=i+1;j<prices.length;j++){
        		if(prices[i]>=prices[j]){continue;
        		}else{
        			int temp=prices[j]-prices[i];
        			if(temp>diff){
        				diff=temp;
        			}
        		}
        	}
        }
       return diff; 
    }
}