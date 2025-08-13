import java.util.*;
public class Sol {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int arr[] = new int[n];
            for(int i=0;i<n;i++) arr[i] = sc.nextInt();
            int minLength=n,sum=0;

            for(int i=0;i<n;i++){
                int localSum=0,localMax=i+1,length=0;
                boolean isPossible = true;
                sum+=arr[i];
            
                for(int j=i+1;j<n;j++){
                    localSum+=arr[j];
                    length++;
                    if(localSum==sum){
                        localSum=0;
                        localMax=Math.max(length,localMax);
                        length=0;
                    }
                    else if(localSum>sum){
                        localMax=1;
                        isPossible=false;
                        break;
                    }
                    
                }
                if(isPossible && localSum==0 && i<n-1)
                    minLength = Math.min(localMax,minLength);
            }
            System.out.println(minLength);

        }
    }
}
