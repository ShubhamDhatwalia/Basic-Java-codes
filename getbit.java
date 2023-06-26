public class getbit {
    
    public static void main(String args[]){
        int n = 5;
        int pos = 3;

        int bitmask = 1<<3;
        if((bitmask&n) == 0){
            System.out.println("Bit is zero");
        }
        else{
            System.out.println("Bit is one");
        }
    }
}
