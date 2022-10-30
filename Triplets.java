package Day5FunctionalProblems;
import java.util.Scanner;
public class Sum_Zero {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the Number you want to consider");
        int N = scanner.nextInt();
        int count = 0;

        int[] A = new int[N];
        System.out.println("Enter the Numbers");

        for(int i = 0; i<N; i++){
            System.out.println("Enter next number");
            A[i] = scanner.nextInt();}


        for(int i = 0; i < N-2; i++){
            for(int j = (i+1); j < N-1; j++){
                for(int k = (j+1); k < N; k++){
                    if((A[i]+A[j]+A[k]) == 0){
                        count++;
                        System.out.print("("+(i+1) +"," +(j+1) +"," +(k+1) +") =");
                        System.out.println(A[i] +" + " +A[j] +" + " +A[k]);
                    }
                }
            }
        }
        System.out.println("the number of distinct triplets is = " +count);
    }
}
