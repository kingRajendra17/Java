import java.io.*;
import java.util.Scanner;

class GFG {
    public static void main (String[] args) {

        String str= "Word", rev="";
        char ch;

        System.out.print("Original word: ");
        System.out.println("Word");

        for (int i=0; i<str.length(); i++)
        {
            ch= str.charAt(i);
            rev = ch+rev;
        }
        System.out.println("Reversed word: "+ rev);
    }
}