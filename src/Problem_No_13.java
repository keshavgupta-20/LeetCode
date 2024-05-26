import java.util.HashMap;
import java.util.Scanner;

public class Problem_No_13 {
    public static void main(String[] args) {
        HashMap<String, Integer> map = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        String s = sc.next();
        map.put("I", 1);
        map.put("V", 5);
        map.put("X", 10);
        map.put("L", 50);
        map.put("C", 100);
        map.put("D", 500);
        map.put("M", 1000);
        int sum = 0;
        for (int i = 0; i < s.length(); i++) {
            String currentSymbol = String.valueOf(s.charAt(i));
            if (i > 0 && map.get(String.valueOf(s.charAt(i - 1))) < map.get(currentSymbol)) {
                sum -= 2 * map.get(String.valueOf(s.charAt(i - 1))); // Subtract twice the previous value
            }
            sum += map.get(currentSymbol);
        }
        System.out.println(sum);
    }
}