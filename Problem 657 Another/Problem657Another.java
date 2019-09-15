import java.util.*;
public class Problem657Another{
	public static void main(String[] args){
		Problem657Another p=new Problem657Another();
		boolean ans=p.judgeCircle("UDDUURLRLLRRUDUDLLRLURLRLRLUUDLULRULRLDDDUDDDDLRRDDRDRLRLURRLLRUDURULULRDRDLURLUDRRLRLDDLUUULUDUUUUL");
		System.out.println(ans);
	}
	public boolean judgeCircle(String moves) {
		int ucount=0;
		int lcount=0;
		for(int i=0;i<moves.length();i++){
			String curr=String.valueOf(moves.charAt(i));
			if(curr.compareTo("U")==0){
				ucount++;
			}else if(curr.compareTo("D")==0){
				ucount--;
			}else if(curr.compareTo("L")==0){
				lcount++;
			}else if(curr.compareTo("R")==0){
				lcount--;
			}else{
				return false;
			}	
		}
		if(lcount==0 && ucount==0) return true;

		return false;
	}

}