import java.util.*;
public class Problem849{
	public static void main(String[] args) {
		Problem849 p=new Problem849();
		int[] seats={1,0,0,0,0,0,1,1};
		System.out.println(p.maxDistToClosest(seats));	
	}
	public int maxDistToClosest(int[] seats) {
        List<Integer>ll=new ArrayList<>();
        int currdiff=0;
        int first=0;
        int first1=0;
        if (seats.length ==2)return 1;
        for(int i=0;i<seats.length;i++){
        	if(seats[i]==1 && ll.size()==0){
        		first1=i;
        		ll.add(i);
        		first=i; 
        	}else if(seats[i]==1 && ll.size()<2){
        		ll.add(i);
        		first=i;
        		currdiff=ll.get(1)-ll.get(0);
        	}else{
        		if(seats[i]==1){
        			int newdiff=i-first;
        			if(currdiff<newdiff){
        				currdiff=newdiff;
        				ll=new ArrayList<>();
        				ll.add(first);
        				ll.add(i);
        				
        			}
        			first=i;  
        		}
        	}	
        }
        int last1=seats.length-1-first;
        if(ll.size()==1){        	
        	if(ll.get(0)<=(seats.length/2)){ 				
				return (seats.length-1)-ll.get(0);
        	}else{
        		
        		return ll.get(0)-0;
        	}

        }
        int ans=first1>last1?first1:last1;
        if(ans>(ll.get(1)-ll.get(0))/2) return ans;

        return (ll.get(1)-ll.get(0))/2;
    }
}