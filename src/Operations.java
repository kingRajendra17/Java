import java.util.Scanner;

public class Operations {
    public static void main (String [] args) {
        Scanner scan = new Scanner(System.in);
        System.out.print("Enter x value : ");
        int x = scan.nextInt();
        System.out.print("Enter y value : ");
        int y = scan.nextInt();

        int Add = x + y;
        System.out.println("Addition : " + Add);

        int Sub = x - y;
        System.out.println("Subtraction : " + Sub);

        int Mul = x * y;
        System.out.println("Multiply : " + Mul);

        int Div = x / y;
        System.out.println("Division : " + Div);
    }
}
