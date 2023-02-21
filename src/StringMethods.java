import java.util.Scanner;
public class StringMethods {

    public static void main (String args[]) {

        System.out.print("Enter String : ");

        Scanner scan = new Scanner(System.in);

        String str = scan.nextLine();

        int len = str.length();
        System.out.println("Length of string : " + len);

        System.out.println("Lowercase of string : " +str.toLowerCase());
        System.out.println("Uppercase of string : " + str.toUpperCase());
        System.out.println("Replace of 'a' to 'e' : " + str.replace('a','e'));
        System.out.println("Index of 'a' (first occurrence) : " + str.indexOf("a"));

    }
}
