import java.util.*;
public class Sol{
    public static void main(String args[]){
        Scanner sc  = new Scanner(System.in);
        long n = sc.nextLong();
        long k = sc.nextLong();

        long odd = n/2 + (n%2);
        if(k>odd) System.out.println(2*(k-odd));
        else System.out.println(1+2*(k-1));
    }
}
