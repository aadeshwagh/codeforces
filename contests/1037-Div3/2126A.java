import java.util.*;
public class Sol{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            int small = n%10;
            while(n>0){
                if(n%10 < small) small = n%10;
                n=n/10;
            }
            System.out.println(small);
        }
    }
}
