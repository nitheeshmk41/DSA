import java.util.Scanner;

public class OddEven01 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the number : ");
        int num = input.nextInt();

        if(num % 2 ==0){
            System.out.println("Its even");
        }
        else{
            System.out.println("Its ODD");
        }

    }
}