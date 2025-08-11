import java.util.*;

public class Sol{
    public static void main(String [] args){
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
        while(t-->0){
            int n = sc.nextInt();
            
            fun(n,sc);
      
      }
    }

    public static void fun(int n, Scanner sc){

        if(n==2){
                if(sc.next().charAt(0) == 'A')System.out.println("Alice");
                else System.out.println("Bob");
                return;
        }
        sc.nextLine();
        String cards = sc.nextLine();
         char one='a',nth='a',nminus1='a';
         int A=0,B=0;

         for(int i=0;i<n;i++){
             char c = cards.charAt(i);
             if(i==0) one=c;
             else if(i==n-2) nminus1=c;
             else if(i==n-1) nth=c;

             if(c == 'A') A++;
             else B++;
         }
         if(one=='A' && nth=='A'){
             System.out.println("Alice");
             return;
         }else if(one=='B' && nth=='B'){
             System.out.println("Bob");
             return;
         }else{
             if(one=='A'){
                 if(B==1) {
                     System.out.println("Alice");
                     return;
                 }else{
                     System.out.println("Bob");
                     return;
                 }
             }else{
                 if(A==1){
                     System.out.println("Bob");
                     return;
                 }else{
                     if(nminus1=='A'){
                         System.out.println("Alice");
                         return;
                     }else{
                         System.out.println("Bob");
                         return;
                     }
                 }
             }
        
    }
    }
}

        
