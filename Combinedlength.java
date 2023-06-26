import java.util.Scanner;
public class Combinedlength {
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String arr[] = new String[n];
        int length =0;

        for(int i=0; i<n; i++){
            arr[i]= sc.next();
            length += arr[i].length();
        }
        System.out.println(length);
    }
    
}
