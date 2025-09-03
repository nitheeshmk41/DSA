import java.util.Scanner;

public class Fibanocci07 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        int n = inp.nextInt();

        int num1 = 0;
        int num2 = 1;
        System.out.print("0 1 ");
        for(int i = 0; i < n ;i++){
            int temp = num2;
            num2 = num2 + num1;
            num1 = temp;
            System.out.print(num2 + " ");
        }
        System.out.println("");
    }
}
