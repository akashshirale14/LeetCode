import java.util.*;

public class Problem946{
	public static void main(String[] args){
		Problem946 p=new Problem946();
		int[] pushed={1,0};
		int[] popped={1,0};
		boolean ans=p.validateStackSequences(pushed,popped);
		System.out.println(ans);

	}
	public boolean validateStackSequences(int[] pushed, int[] popped) {
       Stack<Integer>curr=new Stack<>();
       int a=0;
       int prev=-1;
       if(pushed.length!=popped.length){
       	return false;
       }
       for(int i=0;i<popped.length;i++){
       	if(curr.isEmpty()){curr.push(popped[i]);}
       		if(i==0){
       			a=Arrays.binarySearch(pushed,popped[i]);
       			if(a==-1){
       				return false;
       			}else{
       				int k=0;
       				while(k<=a){
       					curr.push(pushed[k]);
       					k++;
       				}
       				curr.pop();
       			}
       		}else{
       			if(curr.peek()==popped[i]){
       				curr.pop();
       			}else{
       				int index=Arrays.binarySearch(pushed,popped[i]);
       				int prevIndex=Arrays.binarySearch(pushed,prev);
       				if(index!=-1){
       				if(prevIndex>index){
       					return false;}
       				else{
       					int k=prevIndex+1;
       				while(k<=index){
       					curr.push(pushed[k]);
       					k++;
       				}
       				curr.pop();
       			}
       		}

       		}
       	}
       		prev=popped[i];
       }

       if(curr.isEmpty()){
       	return true;
       }
       return false;
    }
}