import java.util.Scanner;

public class SimpleIntrest03 {
    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.print("Enter Principle P : ");
        int principle = inp.nextInt();
        System.out.print("Enter Interest R : ");
        int rate = inp.nextInt();
        System.out.print("Enter Year N : ");
        int year = inp.nextInt();

        System.out.println("Simple interest : " + principle*rate*year);
        
    }
}
