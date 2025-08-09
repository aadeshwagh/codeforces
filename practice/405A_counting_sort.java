import java.util.*;
public class Sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[] = new int[n];
        int countArr[] =  new int[101];
        for(int i=0;i<n;i++) {
            arr[i] =  sc.nextInt();
            countArr[arr[i]]++;
        }
        for(int i=1;i<101;i++){
            countArr[i] = countArr[i]+countArr[i-1];
        }
        int out[] = new int[n];

        for(int i=0;i<n;i++){
            out[countArr[arr[i]]-1]=arr[i];
            countArr[arr[i]]--;
            
        }
        for(int i=0;i<n;i++){
            System.out.print(out[i]+" ");
        }



    }
}
