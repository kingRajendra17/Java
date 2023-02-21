
import java.util.Scanner;
public class ScanInput {

    public static void main (String[] args) {
        Scanner integer = new Scanner(System.in);
        System.out.print("Enter Integer Value: ");
        int input1 = integer.nextInt();
        System.out.println("Integer Number is : " + input1);

        Scanner dou = new Scanner(System.in);
        System.out.print("Enter Double Value: ");
        double input2 = dou.nextDouble();
        System.out.println("Double Number is : " + input2);

        Scanner str = new Scanner(System.in);
        System.out.print("Enter String Value: ");
        String input3 = str.nextLine();
        System.out.print("String is : " + input3);
    }
}
