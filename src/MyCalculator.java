import java.util.Scanner;

public class MyCalculator {
    public static void main(String arg[]){
        Scanner sc = new Scanner(System.in);
        System.out.println("enter first number");
        int num1 = sc.nextInt();
        System.out.println("enter second number ");
        int num2 = sc.nextInt();
        int add = num1+num2;
        int sub = num1-num2;
        System.out.println("addition of two numbers"+add);
        System.out.println("subtraction of two numbers"+sub);

    }
}
