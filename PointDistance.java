package Day5FunctionalProblems;
import java.util.Scanner;
public class point_Distance {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the value of x");
        double x = scanner.nextDouble();

        System.out.println("Enter the value of y");
        double y = scanner.nextDouble();

        double distance = Origin_Distance(x,y);
        System.out.println("The Distance of point from from origin is " +distance);
    }

    static double Origin_Distance(double X, double Y){
        double dist = Math.pow((Math.pow(X, 2) + Math.pow(Y, 2)), 0.5);
        return dist;
    }
