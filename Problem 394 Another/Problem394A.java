import java.util.*;
public class Problem394A{
	public static void main(String[] args){
		Problem394A p=new Problem394A();
		String ans=p.decodeString("3[ak2[coo]]");
		System.out.println(ans);
	}

	public String decodeString(String s) {
		StringBuilder xx=new StringBuilder();
		for(int i=0;i<s.length();i++){
			char n=s.charAt(i);
			if(n=='[' || n==']'){ 
				continue;
			}else{
				xx.append(n);
			}
		}
		String curr=xx.toString();
		char[] abc=curr.toCharArray();
		//3ak2coo
		String ans="";
		int flag=0;
		int len=abc.length;
		System.out.println(len);
		char now;
		int i=0;
		while(i<len){
        	StringBuilder cu=new StringBuilder();
        	 now=abc[i];
        	while(now>=48 && now<=57){
        		cu.append(now);
        		i++;
        		now=abc[i];
        	}
        	if(i!=0){
        	String gg=cu.toString();
        	int num=Integer.parseInt(gg);
        	}	
        	now=abc[i];
        	StringBuilder xuxu=new StringBuilder();
        	while(!(now>=48 && now<=57)){
        		xuxu.append(now);
        		i++;
        		if(i>=len) break;
        		now=abc[i];
        	}
        	String ll=xuxu.toString();
        	for(int k=0;k<num;k++){
        		ans+=ll;
        	}
        	
        }
        return ans;
	}
}