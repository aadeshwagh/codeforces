import java.util.*;
public class Sol{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int no = sc.nextInt();
        if(no==0){
            System.out.println("O-|-OOOO");
        }
        while(no>0){
         int n = no%10;
         if(n>5){
            System.out.print("-O|");
            printer(n-5);
            System.out.println();
        }else if(n==5){
            System.out.println("-O|-OOOO");
        }else{
            System.out.print("O-|");
            printer(n);
            System.out.println();
        }
        no=no/10;
        

    }
    }

    public static void printer(int n){
        for(int i=1;i<=4;i++){
            if(i==n+1){
                System.out.print("-O");
            }else{
                System.out.print("O");
            }
            
            
        }
        if(n==4){
            System.out.print("-");
        }
    }
}
