import java.util.Scanner;
public class searchx{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int arr[][] = new int[3][5];

        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                arr[i][j] = sc.nextInt();
            }
        }
        int x = sc.nextInt();
        int flag =0;
        for(int i=0; i<3; i++){
            for(int j=0; j<5; j++){
                if(arr[i][j] == x){
                    System.out.print("x found at : " + i + j);
                    flag =1;
                }    
            }
        }
        if(flag==0){
            System.out.print("x is not found");
        }
    }
}