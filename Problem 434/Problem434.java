import java.util.*;

public class Problem434{
	public static void main(String[] args){
		Problem434 p=new Problem434();
		int a=p.countSegments("a");
		System.out.println(a);
	}
	public int countSegments(String s) {
		if(s.length()!=0 && s.indexOf(' ')==-1) return 1;
		int count=0;
		for(int i=0;i<s.length()-1;i++){
			int j=i+1;
			if(j==s.length()-1 && s.charAt(j)!=' '){
				count++;
				break;
			}
			if(s.charAt(i)!=' ' && s.charAt(j)==' '){
				count++;
			}
		}
		return count;
    }
}