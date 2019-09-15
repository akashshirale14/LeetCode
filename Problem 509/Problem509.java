import java.util.*;

public class Problem509{
	public static void main(String[] args) {
	Problem509 p=new Problem509();
	int ans=p.fib(3);
	System.out.println(ans);

	}
	public int fib(int N) {
		int ans=0;
    	if(N==0){ return 0;}
    	else if(N==1){ return 1;}
    	else{
    		ans=fib(N-1)+fib(N-2);
    	}
    	return ans;
    }
}

/*public int fib(int N) {
		int ans=0;
    	if(N==0){ return 0;}
    	else if(N==1){ return 1;}
    	else{
    		ans=fib(N-1)+fib(N-2);
    	}
    	return ans;
    }*/