import java.util.*;
public class Problem1002{
	public static void main(String[] args){
		Problem1002 p=new Problem1002();
		String[] A={"aaaa","label","roller"};
		List<String>ll=p.commonChars(A);
		System.out.println(ll);
	}
	public List<String> commonChars(String[] A) {
		Map<String,Integer>first=new HashMap<>();
		List<String>ll=new ArrayList<>();
		for(int i=0;i<A.length;i++){
			String present=A[i];
			Map<String,Integer>other=new HashMap<>();
		for(int j=0;j<present.length();j++){
			String curr=String.valueOf(present.charAt(j));
			if(i==0){
				if(first.get(curr)!=null){
					int ans=first.get(curr);
					first.put(curr,ans+1);
				}else{
					first.put(curr,1);
				}
			}else{
				if(other.get(curr)!=null){
					int ans=other.get(curr);
					other.put(curr,ans+1);
				}else{
					other.put(curr,1);
				}
			}
		}
		if(i!=0){
		Map<String,Integer>temp=new HashMap<>();
		for(String k:first.keySet()){
			//System.out.println(k+" :"+);
				if(other.get(k)!=null){
					int o=other.get(k);
					int f=first.get(k);
					if(f>o) temp.put(k,o);
				}else{
					temp.put(k,0);
				}
			}
		for(String a:temp.keySet()){
			int rr=temp.get(a);
			//System.out.println(a+" :"+rr);
			if(rr>0){first.put(a,rr);}

			else{first.remove(a);}
		}	
		}
	}
		for(String p:first.keySet()){
			int count=first.get(p);
			//System.out.println(p+" :"+count);
			while(count!=0){
				ll.add(p);
				count--;
			}
		}

		return ll;


    }
}