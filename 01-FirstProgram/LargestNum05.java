import java.util.Scanner;

public class LargestNum05 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Ente num1 and num2 :");
        int num1 = inp.nextInt();
        int num2 = inp.nextInt();

        if(num1 > num2){
            System.out.println(num1 + "NUM01 is greater!!");
        }
        else{
            System.out.println( num2 + "NUM02 is greater!!");
        }
    }
}
