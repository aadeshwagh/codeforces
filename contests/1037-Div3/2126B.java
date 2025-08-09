import java.util.*;

public class Sol{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int t =  sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int k = sc.nextInt();
            int hikes = k;
            int totalHikes=0;
            int arr[] = new int[n];
            for(int i=0;i<n;i++){
                arr[i] = sc.nextInt();
            }
            int i=0;
            while(i<n){
                int ai = arr[i];
                if(ai == 0){
                    hikes--;
                    if(hikes == 0){
                        totalHikes++;
                        i++;
                        hikes=k;
                    }
                }else{
                    hikes = k;
                }
                i++;
            }
            System.out.println(totalHikes);
        }
    }
}
