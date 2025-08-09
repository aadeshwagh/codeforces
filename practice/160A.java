import java.util.*;
public class Sol{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        ArrayList<Integer> coins = new ArrayList<>();
        int totalSum = 0;
        while(n-->0){
            int co = sc.nextInt();
            totalSum+=co;
            coins.add(co);
        }
        Collections.sort(coins,Collections.reverseOrder());
        int count=0, localSum=0;
        for(int i : coins){
            localSum+=i;
            count++;
            if(localSum>totalSum-localSum) break;
        }
        System.out.println(count);
    }
}
