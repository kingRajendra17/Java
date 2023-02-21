import java.util.Scanner;

public class SwitchCase {
    public static void main (String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter Subject Marks : ");
        int x = scan.nextInt();

        if (x >= 65) {
            System.out.println("Very Good");
        }
        else if (x <= 35)  {
            System.out.println("FAIL");
        }
        else {
            System.out.println("GOOD");
        }
    }
}


