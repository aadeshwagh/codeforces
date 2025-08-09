import java.util.*;

public class Sol{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        int max=0,sum=0;
        for(int i=0;i<n;i++){
            int a = sc.nextInt();
            if(a>max) max=a;
            sum+=a;
        }
        System.out.println(Math.max(max, (int)Math.ceil((2.0*sum+1)/n)));
    }
}
