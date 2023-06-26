import java.util.Scanner;
public class power{

    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        double x = sc.nextDouble();
        double n = sc.nextDouble();

        printPower(x, n);        
    }
    public static double printPower(double x, double n){

        double result;
        result = Math.pow(x, n);
        System.out.print(result);
        return result;
    }
}