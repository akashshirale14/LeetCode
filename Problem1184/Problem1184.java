import java.util.*;
public class Problem1184{
	public static void main(String[] args) {
		Problem1184 p=new Problem1184();
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
        if(start<destination){
        	for(int i=start;i<destination;i++) sum1+=distance[i];
        	System.out.println(sum1);
            int s=start-1;	
        	while(s>=0 && start!=0){
        		sum2+=distance[s];
        		s--;
        	}
            System.out.println("sum2 "+sum2);
        	int i=distance.length-1;
        	//System.out.println(i);
        	while(i>=destination){
        		sum2+=distance[i];
        		i--;
        	}	
            System.out.println("sum2 "+sum2);
        	minDistance=sum1>sum2?sum2:sum1;

        }else{
        	for(int i=start-1;i>=destination;i--) sum1+=distance[i];
                System.out.println("S "+sum1);
        	while(start<distance.length){
        		sum2+=distance[start];
        		start++;
        	}
        	int j=0;
        	while(j<destination){
        		sum2+=distance[j];
        		j++;
        	}

        	minDistance=sum1>sum2?sum2:sum1;

        }
        return minDistance;
    }
}