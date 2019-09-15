import java.util.*;
public class Problem859{
	public static void main(String[] args){
		Problem859 p=new Problem859();
		boolean ans=p.buddyStrings("ab","ab");
		System.out.println(ans);
	}

	 public boolean buddyStrings(String A, String B) {
	 	Map<Character,Integer>hm=new HashMap<>();
        if(A.length()!=B.length() || (A.length()==0 && B.length()==0)) return false;
        StringBuilder sb=new StringBuilder();
        char preva='*';
        char prevb='-';
        sb.append(A);
        sb=sb.reverse();
        if(sb.toString().compareTo(B)==0) return true;
        int count=0;
        int same=1;
        int finalCount=0;
        for(int i=0;i<A.length();i++){
        	char a=A.charAt(i);
        	if(hm.get(a)==null){
        		hm.put(a,1);
        	}else{
        		int ak=hm.get(a);
        		hm.put(a,ak+1);
        	}
        	char b=B.charAt(i);
        	if(a!=b) 
        	{
        	  if(preva=='*')
        	  { 
        	  	preva=a;
        	  	prevb=b;

        	}else{
        	 	if(preva!=b || prevb!=a) return false;
        	}
        	count++;
        	}
        	finalCount=hm.get(a);
        }
        int flag=0;
        if(finalCount!=1){
        for(Character x:hm.keySet()){
        	if(finalCount==hm.get(x)){
        		flag=1;
        	}else{
        		flag=0;
        		break;
        	}
        }
    }
        if(flag==1) return true;

        if(count==2){
        return true;
    	}
    	return false;
    }

}