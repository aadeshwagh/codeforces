import java.util.*;
import java.io.*;
public class Sol{
    public static void main(String[] args) throws IOException{
        System.setIn(new FileInputStream("input.txt"));

        System.setOut(new PrintStream(new FileOutputStream("output.txt")));
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        int rem=0;
        while(n-->0){
            int ai = sc.nextInt();
            if(ai<k) rem+=ai;
            else{
                if(ai/k > 3) rem+=ai - 3*k;
                else rem+=ai%k;
            }
        }
        System.out.println(rem);
    }
}
