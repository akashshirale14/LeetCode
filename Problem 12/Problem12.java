import java.util.*;
public class Problem12{
	public static void main(String[] args){
		Problem12 p=new Problem12();
		String ans=p.intToRoman(1994);
		System.out.println(ans);
	}
	public String intToRoman(int num) {
        int[] value={1,5,10,50,100,500,1000};
        String[] roman={"I","V","X","L","C","D","M"};
        String ans="";
        while(num!=0){
        if(num==4){
        	num=num-4;
        	ans=ans+"IV";
        }else if(num==9){
        	num=num-9;
        	ans=ans+"IX";
        }else if(num>=40 && num<=49){
        	num=num-40;
        	ans=ans+"XL";
        }else if(num>=90 && num<=99){
        	num=num-90;
        	ans=ans+"XC";
        }else if(num>=400 && num<=499){
        	num=num-400;
        	ans=ans+"CD";
        }else if(num>=900 && num<=999){
        	num=num-900;
        	ans=ans+"CM";
        }else{
        	for(int i=value.length-1;i>=0;i--){
        		if(value[i]<=num){
        			num=num-value[i];
        			ans=ans+roman[i];
        			break;
        		}
        	}
        }
    }

    return ans;

    }



}