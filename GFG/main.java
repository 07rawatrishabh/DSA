class Solution {
    public int maxCircularSum(int arr[]) {
        // code here
        int sol1= f(arr);
        int sum=0;
        int max=Integer.MIN_VALUE;
        for(int i=0;i<arr.length;i++){
            sum+=arr[i];
            arr[i]=-arr[i];
            max=Math.max(max,arr[i]);
        }

        int sol2=sum+f(arr);
        return Math.max(Math.max(sol1,sol2),max);
        
    }

public static int f(int a[]){
    int max=0;
    int sum=0;
    for(int i:a){
        sum+=i;
        max=Math.max(max,sum);
        if(sum<0){
            sum=0;
        }
    }
    return max;
}


}
