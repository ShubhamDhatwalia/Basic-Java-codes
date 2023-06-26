import java.util.Scanner;

public class greater {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        int b = sc.nextInt();
        printGreater(a, b);
    }
    public static void printGreater(int a, int b){
        if(a>b){
            System.out.print(a);
        }
        else if(a==b){
            System.out.print("Equal");
        }
        else if(a<b){
            System.out.print(b);
        }
    }
}
