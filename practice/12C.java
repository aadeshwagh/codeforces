import java.util.*;
public class Sol{
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        ArrayList<Integer> prices = new ArrayList<>();
        while(n-->0){
            prices.add(sc.nextInt());
        }
        sc.nextLine();
        HashMap<String,Integer> fruits = new HashMap<>();
        while(m-->0){
            String fruit = sc.nextLine();
            fruits.put(fruit,fruits.getOrDefault(fruit,0)+1);
        }
        List<Integer> values = new ArrayList<>(fruits.values());
        values.sort(Comparator.reverseOrder());
        Collections.sort(prices);

        int min=0;int max=0;

        for(int i=0;i<values.size();i++){
            min+=values.get(i)*prices.get(i);
            max+=values.get(i)*prices.get(prices.size()-i-1);
        }
        System.out.println(min+" "+max);
    }
}
