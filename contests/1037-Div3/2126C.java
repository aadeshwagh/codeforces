 import java.util.*;
 
public class Sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt()-1;
            int arr[] = new int[n];
            int sorted[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
                sorted[i] = arr[i];
            }
            Arrays.sort(sorted);    

            System.out.println(ans(arr,sorted,k));
        }
    }

    public static String ans(int arr[], int sorted[],int k){
        if(arr.length==1) return "YES";

        int index=0;
        for(int i=0;i<arr.length;i++){
            if(sorted[i] == arr[k]) {
                index = i;
                
            }
        }
        int waterLevel=0;
        for(int i=index;i<arr.length-1;i++){
            waterLevel+=sorted[i+1]-sorted[i];
            if(sorted[i] < waterLevel){
                return "NO";
            }
          
        }

        return "YES";
    }
}

