import java.util.*;
public class Problem657{
	public static void main(String[] args){
		Problem657 p=new Problem657();
		boolean ans=p.judgeCircle("UDDUURLRLLRRUDUDLLRLURLRLRLUUDLULRULRLDDDUDDDDLRRDDRDRLRLURRLLRUDURULULRDRDLURLUDRRLRLDDLUUULUDUUUUL");
		System.out.println(ans);
	}
	 public boolean judgeCircle(String moves) {
        HashMap<String,Integer>hm=new HashMap<>();
        hm.put("U",10);
        hm.put("D",-10);
        hm.put("L",-200);
        hm.put("R",200);
        int sum=0;
        for(int i=0;i<moves.length();i++){
        	String curr=String.valueOf(moves.charAt(i));
        	if(hm.get(curr)==null){
        		return false;
        	}else{
        		sum+=hm.get(curr);        		
        	}
        }
        if(sum!=0) return false;
        return true;
    }
}