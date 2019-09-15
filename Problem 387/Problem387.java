import java.util.*;
public class Problem387{
	public static void main(String[] args){
		Problem387 p=new Problem387();
		int ans=p.firstUniqChar("");
		System.out.println(ans);
	}

	public int firstUniqChar(String s) {
		int index=-1;
		Map<Character,Integer>hm=new HashMap<>();
        for(int i=0;i<s.length();i++){
        	if(hm.get(s.charAt(i))==null){
        	hm.put(s.charAt(i),1);
        }else{
        	int ans=hm.get(s.charAt(i));
        	hm.put(s.charAt(i),ans+1);
        }
        }

        for(int i=0;i<s.length();i++){
        	if(hm.get(s.charAt(i))==1){
        		index=i;
        		break;
        	}
        }
        return index;
    }
}