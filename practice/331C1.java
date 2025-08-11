import java.util.*;

public class Sol{
    public static void main(String args []){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();

        int count = 0;
        while(n>0){
            int p = n;
            int maxDigit = p%10;
            while(p>0){
                maxDigit = Math.max(p%10,maxDigit);
                p=p/10;
            }
            n = n-maxDigit;
            count++;
        }
        System.out.println(count);
    }
}
