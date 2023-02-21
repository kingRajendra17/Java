
import java.util.Scanner;
public class Average {
    public static void main(String[] args){
        Scanner sc = new Scanner (System.in);
        System.out.println("student marks based on below rules ");
        int marks = sc.nextInt();
            if(marks>=90 && marks<=100) {
                System.out.println("print grade as 'A'");

            }
            else if (marks>=80 && marks<=90) {
                System.out.println("print grade as 'b' ");
            }
                else if (marks>=70 && marks<=80) {
                System.out.println("print grade as 'c'");
            }
                    else if (marks>50 && marks<=60) {
                System.out.println("print grade as 'd'");
            }
                        else{
                            System.out.println("print as a failure");
                    }
                }
            }


