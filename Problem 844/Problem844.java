import java.util.*;

public class Problem844{
	public static void main(String[] args){
		Problem844 p=new Problem844();
		boolean ans=p.backspaceCompare("#c","#c");
		System.out.println(ans);
	}
	public boolean backspaceCompare(String S, String T){
        Stack<Character>st=new Stack<>();
        Stack<Character>tt=new Stack<>();
        StringBuilder s=new StringBuilder();
        StringBuilder t=new StringBuilder();
        Stack<Character>present=st;
        int size=S.length();
        int flag=0;
        String curr=S;
        int i=0;
        while(i<size){
        	Character c=curr.charAt(i);
        	if(c=='#' && present.isEmpty()){
        		i++;
        		continue;
        	}else if(c=='#' && !present.isEmpty()){
        		present.pop();
        	}else{
        		present.push(c);
        	}
        	i++;
        	if(i==size && flag==0){
        		size=T.length();
        		present=tt;
        		flag=1;
        		curr=T;
        		i=0;
        	}
        	
        }
        while(!st.isEmpty()){
        	s.append(st.pop());
        }
        System.out.println(s);
        while(!tt.isEmpty()){
        	t.append(tt.pop());
        }
        System.out.println(t);
         return s.toString().equals(t.toString());
    }
}