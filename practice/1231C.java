import java.util.*;
public class Sol{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int m = sc.nextInt();

        int arr[][] = new int[n][m];

        for(int i=0;i<n;i++){
            for(int j=0;j<m;j++){
                arr[i][j] = sc.nextInt();
            }
        }

        System.out.println(fun(arr,n,m));
    }

    public static int fun(int arr[][], int n, int m){
        int sum = 0;

        for(int i=n-1;i>=0;i--){
            for(int j=m-1 ;j>=0 ;j--){
                if(arr[i][j] == 0){
                    arr[i][j] = Math.min(arr[i][j+1]-1,arr[i+1][j]-1);
                }
                if(i<n-1 && arr[i][j] >= arr[i+1][j]) return -1;
                if(j<m-1 && arr[i][j] >= arr[i][j+1]) return -1;
                sum+=arr[i][j];
            }
        }
        return sum;
    }
}
    
