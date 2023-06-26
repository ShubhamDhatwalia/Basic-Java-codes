import java.util.*;
public class even {
    
    public static void printEven(int n){
        if(n%2==0){
            System.out.print(n+" is even");
            return;
        }
        else{
            System.out.print(n+" is not even");
        }
    }
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        printEven(n);
    }
}
