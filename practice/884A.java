import java.util.*;
public class Sol {
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int t = sc.nextInt();
        int count=1;
        while(n-->0){
            int ai = sc.nextInt();
            int tr = (86400-ai);
            t = t-tr;
            if(t<=0) break;
            count++;
        }

        System.out.println(count);
    }
}
