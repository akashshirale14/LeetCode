import java.util.*;

public class Problem696{
public static void main(String[] args) {
		Problem696 p=new Problem696();	
		int ans=p.countBinarySubstrings("01");
		//System.out.println(ans);

	}
		public int countBinarySubstrings(String s) {
        	if(s.length()==1) return 0;
        	int flag=0;
        	int count=0;
        	for(int i=0;i<s.length()-1;i++){
        		String first=String.valueOf(s.charAt(i));
        		String second=String.valueOf(s.charAt(i+1));
        		String x= first+second;
        		if(x.compareTo("01")==0){
        			flag=1;
        		}
        		if(x.compareTo("10")==0){
        			flag=2;
        		}
        		if(flag==1 || flag==2){
        			int tempCount=1;
        			int j=i-1;
        			int k=i+2;
        			while(j>=0 && k<=s.length()-1){
        				String jString=String.valueOf(s.charAt(j));
        				String kString=String.valueOf(s.charAt(k));
        				String curr=jString+kString;
        				if(curr.compareTo(x)==0){
        					tempCount++;
        				}else{
        					break;
        				}
        				j--;
        				k++;
        			}
        			count+=tempCount;
        			flag=0;
        		}
        	}
        //System.out.println(count);
        return count;

    }
}