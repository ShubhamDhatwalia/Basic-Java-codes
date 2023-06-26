public class setbit {
    
    public static void main(String args[]){
        int n = 5;
        int pos = 1;
        int bitmask = 1<<1;

        int newnumber = bitmask|n;
        System.out.println(newnumber);
    }
}
