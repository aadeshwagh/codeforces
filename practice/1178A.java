import java.util.*;
public class Sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int a1 = sc.nextInt();
        int csum = a1;
        int tsum = a1;
        ArrayList<Integer> indices = new ArrayList<>();
        indices.add(1);
        if(n==1){
            System.out.println(1);
            System.out.println(1);
        }
        for(int i=2;i<=n;i++){
            int ai = sc.nextInt();
            if(ai <= a1/2){
                indices.add(i);
                csum+=ai;
            }
            tsum+=ai;
        }

        if(csum >= tsum/2 + 1){
            System.out.println(indices.size());
            for(int  i : indices){
                System.out.print(i+" ");
            }
        }else{
            System.out.println(0);
        }
    }
}
