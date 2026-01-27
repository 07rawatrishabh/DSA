import java.util.*;
class Solution {
    public int sumSubMins(int[] arr) {
        // code here

        int ans=0;
        Stack<Integer>st=new Stack<>();
        int ls[]=new int[arr.length];
        int rs[]=new int[arr.length];

        for(int i=0;i<arr.length;i++){
             while(!st.isEmpty()&&arr[st.peek()]>arr[i]){ 
                st.pop();
             }
             if(st.isEmpty()){
                ls[i]=-1;
             }
             else{
                ls[i]=st.peek();
             }
             st.push(i);
        }
        st=new Stack<>();
        for(int i=arr.length-1;i>=0;i--){
             while(!st.isEmpty()&&arr[st.peek()]>arr[i]){ 
                st.pop();
             }
             if(st.isEmpty()){
                rs[i]=arr.length;
             }
             else{
                rs[i]=st.peek();
             }
             st.push(i);
        }
      
        for(int i=0;i<arr.length;i++){
            ans+=(rs[i]-i)*(i-ls[i])*arr[i];
        }
        return ans;
    }
}
       