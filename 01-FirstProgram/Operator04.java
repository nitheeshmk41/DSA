import java.util.Scanner;

public class Operator04 {
    public static void main(String[] args) {

        Scanner inp = new Scanner(System.in);

        System.out.print("Enter num1 : ");
        int num1 = inp.nextInt();
        System.out.print("Enter Operator (+,-,*,/): ");
        String op = inp.next();
        System.out.println(op);
        System.out.print("Enter num2 : ");
        int num2 = inp.nextInt();

        if(op.equals("+")){
            System.out.println("Sum is "+ (num1 + num2));
        }
        else if(op.equals("-")){
            System.out.println("Diffrence is " + (num1-num2));
        }
        else if(op.equals("*")){
            System.out.println("Product is " + num1*num2);
        }
        else if(op.equals("/")){
            System.out.println("Division is : " +  num1/num2);
        }
        else{
            System.out.println("Wrong inuput !!");
        }
    }
}
