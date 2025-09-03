import java.util.Scanner;

public class Palindrome08 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);

        String s = inp.next();
        s.toLowerCase();

        String rev = "";
        for(int i = s.length() - 1; i >= 0; i--){
            rev += s.charAt(i);
        }

        boolean res = s.equals(rev);

        System.out.println(res);
    }
}
