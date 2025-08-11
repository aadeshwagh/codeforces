import java.util.*;
public class Sol{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            long n = sc.nextLong();
            long k = sc.nextLong();
            long sum=0;
            ArrayList<Long> arr =  new ArrayList<>();
            for(int i=0;i<n;i++){
               arr.add(sc.nextLong());
               sum+=arr.get(i);
            } 
            long totalSum = n*(n+1)/2;
            long mex = totalSum-sum;
            arr.add(mex);
            k = k%(n+1);
            
            for(int i=0;i<n;i++){
                System.out.print(arr.get((int)((i-k+n+1)%(n+1)))+" ");
            }
            System.out.println();
        }
    }
}
