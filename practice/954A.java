import java.util.*;
public class Sol{
    public static void main(String []args){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        sc.nextLine();
        String src = sc.nextLine();
        int index = 0,count=0;
        char current = src.charAt(index);
        while(index < n){
            if(index+1 < n && current == src.charAt(index+1)){
                index++;
            }else{
                index+=2;
                
            }
            if(index<n) current=src.charAt(index);
            count++;
            
        }
        System.out.println(count);
    }
}
