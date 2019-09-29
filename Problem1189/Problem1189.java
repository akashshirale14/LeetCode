import java.util.*;
public class Problem1189{
	public static void main(String[] args) {
		Problem1189 p=new Problem1189();
		int ans=p.maxNumberOfBalloons("krhizmmgmcrecekgyljqkldocicziihtgpqwbticmvuyznragqoyrukzopfmjhjjxemsxmrsxuqmnkrzhgvtgdgtykhcglurvppvcwhrhrjoislonvvglhdciilduvuiebmffaagxerjeewmtcwmhmtwlxtvlbocczlrppmpjbpnifqtlninyzjtmazxdbzwxthpvrfulvrspycqcghuopjirzoeuqhetnbrcdakilzmklxwudxxhwilasbjjhhfgghogqoofsufysmcqeilaivtmfziumjloewbkjvaahsaaggteppqyuoylgpbdwqubaalfwcqrjeycjbbpifjbpigjdnnswocusuprydgrtxuaojeriigwumlovafxnpibjopjfqzrwemoinmptxddgcszmfprdrichjeqcvikynzigleaajcysusqasqadjemgnyvmzmbcfrttrzonwafrnedglhpudovigwvpimttiketopkvqw");
		System.out.println(ans);
	}


	public int maxNumberOfBalloons(String text) {
		if(text.length()<7) return 0;
		Map<String,Integer>hm=new HashMap<>();
        for(int i=0;i<text.length();i++){
        	String x=String.valueOf(text.charAt(i));
        	if(hm.get(x)==null){
        		hm.put(x,1);
        	}else{
        		int ans=hm.get(x);
        		hm.put(x,ans+1);
        	}
        }
        String b="balloon";
        int min=Integer.MAX_VALUE;
        for(int i=0;i<b.length();i++){
        	String x=String.valueOf(b.charAt(i));
        	if(hm.get(x)==null){
        		return 0;
        	}else{
        		int ans=hm.get(x);
        		if(x.compareTo("l")==0 || x.compareTo("o")==0){
        			ans/=2;
        		}

        		if(ans<min){
        			min=ans;
        		}
        	}
        }

        return min;
    }

}
