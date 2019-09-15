import java.util.*;
public class Problem415{
	public static void main(String[] args) {
		Problem415 p=new Problem415();
		String ans=p.addStrings("99","1");
		System.out.println(ans);	
	}
	public String addStrings(String num1, String num2) {
        char[] n1=num1.toCharArray();
        char[] n2=num2.toCharArray();
        StringBuilder sb=new StringBuilder();

        int j=n1.length-1;
        int i=n2.length-1;
        while(j>=0 && i>=0){
        	int temp= n1[j]+n2[i];
        	while(temp>=10){
        		char last=(char)temp%10;
        		System.out.println(last);
        		sb.append(0,last);
        		temp=temp/10;
        	}
        }


    }
}