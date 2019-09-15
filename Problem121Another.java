import java.util.*;
public class Problem121Another{
	public static void main(String[] args) {
		Problem121Another p=new Problem121Another();
		int[] prices={7,1,5,3,6,4};
		int ans=p.maxProfit(prices);	
		System.out.println(ans);
	}
	public int maxProfit(int[] prices) {
		if(prices.length==0){
			return 0;
		}
		int sofarMin=prices[0];
		int diff=0;
		for(int i=0;i<prices.length;i++){
			if(prices[i] < sofarMin){
				sofarMin=prices[i];
			}else{
				diff=Math.max(diff,prices[i]-sofarMin);

			}
		}
		return diff;
	}
}