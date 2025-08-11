import java.util.*;
public class Sol{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            long minCost = Long.MAX_VALUE;
            long cost1=0;
            long arr[] = new long[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextLong();
            }
            boolean flag =false;
            for(int i=0;i<n-1;i++){
                if(arr[i] == arr[i+1]){
                    if(flag){
                        continue;
                    }else{
                        cost1 =(long) (arr[i]*(i));
                        flag = true;
                    }
                }
                else{
                    if(flag){
                        long cost2 = (long) (arr[i]*(n-(i+1)));
                        minCost = Math.min(minCost,cost1+cost2);
                        flag=false;
                    }else{
                        minCost = Math.min(arr[i]*(n-1),minCost);
                    }
                }
            }
            if(flag){
                minCost = Math.min(cost1,minCost);
            }else{
                minCost = Math.min(minCost,arr[n-1]*(n-1));
            }
            System.out.println(minCost);
        }
    }
    
}
