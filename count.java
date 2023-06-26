import java.util.Scanner;
public class count{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
       
        printCount(n);
    }
    public static void printCount(int n){
        int countp =0;
        int countn =0;
        int countz =0;
        Scanner sc = new Scanner(System.in);
        int arr[] = new int[n];
        for(int i=0; i<n; i++){
            arr[i] = sc.nextInt();
        }
        for(int i=0; i<n; i++){
            if(arr[i]>0){
                countp++;
            }
            else if(arr[i]==0){
                countz++;
            }
            else if(arr[i]<0){
                countn++;
            }
        }
        System.out.println("Total no. of P : "+countp);
        System.out.println("Total no. of n : "+countn);
        System.out.println("Total no. of z : "+countz);
    }
}
