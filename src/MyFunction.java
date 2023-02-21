public class MyFunction {

    public static void main (String args[]) {       // Main Function

        System.out.println(myString("Rajendra"));

        int sum = Add(1,2,3);
        System.out.println("Addition is " +sum);         // System.out.println(Add(1,2,3));
    }
    public static String myString (String name) {     // First Sub Function
        return "Hello " +name;
    }
    public static int Add (int a,int b, int c) {      // Second Sub Function
        return (a + b + c);
    }
}
