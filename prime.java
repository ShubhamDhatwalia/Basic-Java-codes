import java.util.*;
public class prime {
    
    public static void printPrime(int n){
        int count=0;
        for(int i=1; i<=n; i++){

            if(n%i==0){
                count = ++count;
            }
        }
        
        if(count==2){
            System.out.print("Number is prime");
            
        }
        
        else{
            System.out.print(n+" is not prime number");
        }
    }
    public static void main(String args[]){

        Scanner sc = new Scanner(System.in);
        int n=sc.nextInt();
        printPrime(n);
    }
}
