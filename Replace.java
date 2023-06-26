import java.util.Scanner;
public class Replace {
    
    public static void main(String args[]){
        Scanner sc = new Scanner(System.in);
        String s1 = sc.next();
        String s = "";

        for(int i=0; i<s1.length(); i++){
            if(s1.charAt(i)=='e'){
                s += 'i';
            }
            else{
                s += s1.charAt(i);
            }
        }
        System.out.println(s);
    }
}
