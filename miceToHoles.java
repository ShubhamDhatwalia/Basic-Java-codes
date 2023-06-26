// Given, N Mice and N holes are placed in a straight line. Each hole can accommodate only 1 mouse. A mouse can stay at his position, move one step right from x to x + 1, or move one step left from x to x -1. Any of these moves consumes 1 minute.

// Your task is return the time such that when the last mouse gets inside the hole is minimized.

// Note

// Given 2 arrays M and H representing the positions of N mice and holes respectively.

// Input Format
// The fist line of input contains a single integer N.

// The second line of input contains N space separated integers, position of mice.

// The third line of input contains N space separated integers, position of holes.

// Output Format
// Return the time such that when the last mouse gets inside the hole is minimized.

// Example 1
// Input

// 3
// 4 -4 2
// 4 0 5
// Output

// 4
// Explanation

// If we assign mouse at 1st index to the hole at 1st, mouse at 2nd index to the hole at 2nd and the third to the hole at third. Then, the maximum time taken will be by the 2nd mouse, i.e. 4-0 = 4 minutes.

// Example 2
// Input

// 2
// 4 2
// 1 7
// Output

// 3
// Explanation

// If we assign mouse at 1st index to the hole at 2nd, and mouse at 2nd index to the hole at 1st, the maximum time taken will be by the 2nd mouse,i.e. 7-4 = 3 minutes.

// Constraints
// 1 <= n <= 5*103

// -105 <= M[i],H[i] <= 105




import java.io.*;
import java.util.*;

class Main {
    public static void main(String args[]) throws IOException {
        BufferedReader read =
            new BufferedReader(new InputStreamReader(System.in));
        
        int N = Integer.parseInt(read.readLine());
        String S[] = read.readLine().split(" ");
        String st[] = read.readLine().split(" ");
        
        int[] M = new int[N];
        int[] H = new int[N];
        
        for(int i=0 ; i<N ; i++)
            M[i] = Integer.parseInt(S[i]);
            
        for(int i=0 ; i<N ; i++)
            H[i] = Integer.parseInt(st[i]);

        Solution ob = new Solution();
        System.out.println(ob.assignMiceHoles(N,M,H));
    
    }
}

class Solution {
    static int assignMiceHoles(int N , int[] M , int[] H) {
        // code here
        Arrays.sort(M);
		Arrays.sort(H);

		int maxi =0;

		for(int i=0; i<N; i++){
			maxi = Math.max(maxi, Math.abs(H[i]-M[i]));
		}
		return maxi;
    }
}