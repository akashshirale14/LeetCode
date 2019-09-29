import java.util.*;
public class Problem1200{
	public static void main(String[] args) {
		Problem1200 p=new Problem1200();
		int[] arr={3,8,-10,23,19,-4,-14,27};//{-14,-10,-4,3,8,19,23,27}
		List<List<Integer>>ans=p.minimumAbsDifference(arr);
		System.out.println(ans);	
	}
	public List<List<Integer>> minimumAbsDifference(int[] arr) {
        Arrays.sort(arr);     
        List<List<Integer>> finalList = new ArrayList<List<Integer>>();
        int minDistance=Integer.MAX_VALUE;
        //List<Integer> storeIndex=new ArrayList<>();
        for(int i=0;i<arr.length-1;i++){
        	int distance=Math.abs(arr[i+1]-arr[i]);
        	//System.out.println("distance: "+distance);

        	if(distance==minDistance){
        		//storeIndex.add(i);
        		finalList.add(Arrays.asList(arr[i],arr[i+1]));
        	}else{
        		if(distance>minDistance){
        			continue;
        		}else{
        			finalList = new ArrayList<List<Integer>>();
        			minDistance=distance;
        			//storeIndex=new ArrayList<>();
        			/*while(!storeIndex.isEmpty()){
        				storeIndex.remove(0);
        			}*/
        			//System.out.println("i : "+i);
        			finalList.add(Arrays.asList(arr[i],arr[i+1]));
        			//storeIndex.add(i);
        		}
        	}
        }

        /*for(int i=0;i<storeIndex.size();i++){
        	int index=storeIndex.get(i);
        	List<Integer>curr=new ArrayList<>();
        	curr.add(arr[index]);
        	curr.add(arr[index+1]);
        	finalList.add(curr);
        }*/

        return finalList;
    }
}