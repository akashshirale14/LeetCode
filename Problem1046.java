import java.util.*;

public class Problem1046{
	public static void main(String[] args){
		Problem1046 p=new Problem1046();
		int[] stones={2,7,4,1,8,1};
		int ans=p.lastStoneWeight(stones);
		//System.out.println();
		//System.out.println(ans);
	}
	public int lastStoneWeight(int[] stones) {
        Arrays.sort(stones);
        int ans=-1;
        if(stones.length==1){return stones[0];}
        while(true){
        	if(stones[(stones.length-1)-1]==-1){
        		ans=stones[stones.length-1];
        		break;
        	}else{
        		int diff=stones[stones.length-1]-stones[(stones.length-1)-1];
        		stones[(stones.length-1)-1]=diff;
        		stones[stones.length-1]=-1;
        		Arrays.sort(stones);
        	}
        }
        return ans;
    }
}