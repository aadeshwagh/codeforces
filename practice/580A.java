import java.util.*;
public class Sol{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        for(int i=0;i<n;i++){
            arr[i] = sc.nextInt();
        }
        if(arr.length == 1){
            System.out.println(1);
            return;
        }
        int maxCount=1,count=1;
        for(int i=0;i<n-1;i++){
            if(arr[i+1]>=arr[i]){
                count++;
                maxCount=Math.max(maxCount,count);
            }else{
                count=1;
            }
        }
        System.out.println(maxCount);
}
}
