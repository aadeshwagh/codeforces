import java.util.*;
public class Sol{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int count=0;
        for(int i=0;i<s.length()-1;i++){
            if(s.charAt(i) == s.charAt(i+1)) count++;
            else count=0;

            if(count==6){
                System.out.println("YES");
                return;
            }
        }
        if(count==6){
            System.out.println("YES");
        }else{
            System.out.println("NO");
        }

    }
}
