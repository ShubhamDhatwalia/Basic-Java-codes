import java.util.Scanner;
public class circumference{

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int r = sc.nextInt();
        printCircum(r);

    }
    public static void printCircum(int r){
        double circum;
        double pi = 3.14;
        circum = 2*pi*r;
        System.out.print(circum);
    }
}