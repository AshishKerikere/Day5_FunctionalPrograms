package Day5FunctionalPrograms;
import java.util.Scanner;
public class Quadratic {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of a");
        int a = scanner.nextInt();
        System.out.println("Enter the value of b");
        int b = scanner.nextInt();
        System.out.println("Enter the value of c");
        int c = scanner.nextInt();

        double delta = Math.pow(b, 2) - 4.0*a*c;
        if (delta >= 0){
            double r1 = Root_1(delta, b, a);
            double r2 = Root_2(delta, b, a);
            System.out.println("the roots are " +r1 +"," +r2);
        }
        else{
            System.out.println("Real roots are not possible");
        }
    }
    static double Root_1(double Delta, int B, int A){
        double result = (-B + Math.pow(Delta, 0.5))/(2*A);
        return result;
    }

    static double Root_2(double Delta, int B, int A){
        double result = (-B - Math.pow(Delta, 0.5))/(2*A);
        return result;
    }
}
