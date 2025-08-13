import java.util.*;
public class Sol{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        
        while(t-->0){
            long l = sc.nextLong();
            long r = sc.nextLong();
            int good210 = noOfGood(1,210);
            long ans=0;
            if(r<=210){
                ans = noOfGood(1,r) - noOfGood(1,l-1);
            }else{
                long ques = r/210;
                int rem = (int)  (r%210);
                long goodL=0;
                long goodR = ques*good210 + noOfGood(r-rem+1,r);
                if((l-1)<210){
                    goodL = noOfGood(1,l-1);
                }else{
                    goodL = ((l-1)/210)*good210 + noOfGood((l-1)-((l-1)%210)+1,(l-1));
                }
                ans = goodR - goodL;
            }
            System.out.println(ans);
            
        }
    }
    static boolean isGood(long n){
        if(n%2==0||n%3==0||n%5==0||n%7==0) return false;
        return true;
    }
    static int noOfGood(long p, long q){
        int good=0;
        for(long i=p;i<=q;i++){
            if(isGood(i)) good++;
        }
        return good;
    }
}
