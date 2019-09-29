import java.util.*;
public class Problem476{
	public static void main(String[] args) {
		Problem476 p=new Problem476();
		int a=p.findComplement(5);	
	}
	 public int findComplement(int num) {
	 	if(num==0) return 0;
	 	int rightcount=0;
	 	int ans=num;
	 	while(num>0){
	 		num=num>>1;
	 		rightcount++;
	 	}
	 	System.out.println(rightcount);
	 	inversenum
	 	int y=0;
	 	while(rightcount>0){
	 		int x=1<<rightcount-1;
	 		System.out.println(x);
	 		 y=y+(~ans&x)*(int)Math.pow(2,rightcount-1);
	 		 System.out.println(" intermediate : "+y);
	 		 rightcount--;
	 	}
	 	//System.out.println(y);


	 	return y;

    }
}