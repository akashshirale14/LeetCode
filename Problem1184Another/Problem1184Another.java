import java.util.*;
public class Problem1184Another{
	public static void main(String[] args) {
		Problem1184Another p=new Problem1184Another();
		int[] distance={1,2,3,4};//14,13,4,7,10,17,8,3,2,13.     2 9
		int start=0;
		int destination=3;
		int ans=p.distanceBetweenBusStops(distance,start,destination);
		System.out.println(ans);
	}

	public int distanceBetweenBusStops(int[] distance, int start, int destination) {
        int minDistance;
        int sum1=0;
        int sum2=0;
        if(start>destination){
        	int temp=start;
        	start=destination;
        	destination=temp;
        }
        for(int j=0;j<distance.length;j++){
        	if(j>=start && j<destination){
        		sum1+=distance[j];
        	}
        	sum2+=distance[j];
        }

        minDistance=sum1>sum2-sum1?sum2-sum1:sum1;
        return minDistance;
    }
}