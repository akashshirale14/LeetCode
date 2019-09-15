import java.util.*;
public class Problem841{
	public static void main(String[] args){
		Problem841 p=new Problem841();
		List<List<Integer>> rooms=;
		boolean ans=p.canVisitAllRooms(rooms);
		System.out.println(ans);
	}
	
        public boolean canVisitAllRooms(List<List<Integer>> rooms) {
      List<Integer>ans=new ArrayList<>();
        ans.add(0);
        for(int i=0;i<rooms.size();i++){
            List<Integer>currRoom=rooms.get(i);
        	if(currRoom.size()==0){
        		continue;
        	}
        	if(ans.indexOf(i)!=-1){
        	
        	for(int j=0;j<currRoom.size();j++){
        	    ans.add(currRoom.get(j));
        	}
        }else{
        	return false;
        }
        }
        return true;  
    }
}