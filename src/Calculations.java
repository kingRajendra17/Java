 class Cal {

    double a = 20;

    double b = 30;

    public void sum() {
        System.out.println("the sum of the two numbers is:" + (a+b));
    }
    public void sub() {
        System.out.println("the substraction of two numbers is:" + (a-b) );
    }
    public void mul() {
        System.out.println("the multiplication of two numbers is:" +(a*b));
    }
    public void div() {
        System.out.println("the div of the two numbers is:" +(a/b));
    }
}



public class Calculations {
    public static void main(String[] args) {
        Cal c = new Cal();
        c.sum();
        c.sub();
        c.mul();
        c.div();
    }
}