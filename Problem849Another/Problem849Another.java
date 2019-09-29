import java.util.*;
public class Problem849Another{
	public static void main(String[] args) {
		Problem849Another p=new Problem849Another();
		int[] seats={0,1,1,1,0,0,1,0,0};
		System.out.println(p.maxDistToClosest(seats));	
	}
	public int maxDistToClosest(int[] seats){
		int j=-1;
		int maxDist=-1;
		int oldCounter=-1;
		for(int i=0;i<seats.length;i++){
			if(seats[i]==1){
				int dist=i-(j);
				if(dist > maxDist){
				 maxDist=dist;
				}
				if(oldCounter==-1){	
				oldCounter=i;	
				}
				j=i;
			}
		}
		//System.out.println("Last "+((seats.length-1)-j));
		//System.out.println("First "+(oldCounter));
		int ans=((seats.length-1)-j)>oldCounter?(seats.length-1)-j:oldCounter;
		if(ans>=maxDist/2) return ans*100;
		
		return maxDist/2;
	}
}