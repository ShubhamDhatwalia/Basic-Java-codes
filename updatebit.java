import java.util.Scanner;
public class updatebit {

    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        int n= 5;
        int pos = 2;
        int oper = sc.nextInt();
        int bitmask = 1<<pos;
        
        if(oper == 1){
           int newnumber = bitmask|n;
           System.out.println(newnumber); 
        }
        else{
            int notbitmask = ~(bitmask);
            int newnumber = notbitmask&n;
            System.out.println(newnumber);
        }
    }
    
}
