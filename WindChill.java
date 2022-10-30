package Day5FunctionalProblems;
import java.util.Scanner;
public class WindChill {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of t");
        double t = scanner.nextDouble();

        System.out.println("Enter the value of v");
        double v = scanner.nextDouble();

        double w = 35.74 + 0.6215*t + (0.4275*t -35.75)*Math.pow(v, 0.16);
        System.out.println("The walue ofwind chill is = " +w);
    }
}
