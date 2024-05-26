
public class Problem_NO_9 {
    // 1 approach
    //function defintion
    public static boolean pallindrome(int x){
        String str= Integer.toString(x);
        StringBuilder z = new StringBuilder();
        int i = str.length()-1;
         while(i>=0){
             z.append(str.charAt(i));
             i--;
        }
        if (str.equals(z.toString())){
            return true;
        }
        else{
            return false;
        }
    }
    // 2nd approach with a optimised version
    static boolean pallindrome2(int x){
        int y = x;
        int reverse = 0;
        while(x>0){
            int digit = x%10;
            reverse = reverse *10 + digit;
            x = x/10;
        }
        return y == reverse;

    }

    public static void main(String[] args) {
        int x = 121;
        boolean result =pallindrome2(x);
        if (!result){
            System.out.println("Yes It is not a pallindrome");
        }
        else{
            System.out.println("It is a pallindrome");
        }


    }
}
