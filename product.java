import java.util.Scanner;


public class product {
    
    public static int CalculateProduct(int a, int b){
        return(a*b);
    }

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter value of a ");       
        int a = sc.nextInt();
        System.out.print("Enter value of b "); 
        int b = sc.nextInt();

        System.out.println("Product of two numbers "+ CalculateProduct(a, b));
    }
}
