import java.util.Scanner;
import java.lang.*;
class Diagonalsum
{  
    public static int diagonalSum(int[][] mat) 
    {
        int n=mat.length;
        
        int sum=0;
        int i=0,j=0;
        
        while(i<n)
        {
            sum+=mat[i][j];
            i++;
            j++;
        }
        
        i=0;
        j=n-1;
        
        while(i<n)
        {
          if(i!=j)   sum+=mat[i][j];
            
            i++;
            j--;
        }
        
        return sum;
        
    }
    
    public static void main(String args[])
    {
       Scanner sc = new Scanner(System.in);
       int n=  sc.nextInt();
       int mat[][]= new int[n][n];
       for(int i=0; i<n; i++){
        for(int j=0; j<n; j++){
          mat[i][j] = sc.nextInt();
        }
       }
    
       System.out.println(diagonalSum(mat));
   
    }
}