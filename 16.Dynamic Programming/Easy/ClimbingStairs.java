import java.util.*;



//Climbing Stairs - Leetcode 70

class ClimbingStairs{



static int climbStairsRecursiveSolution(int n){

	if( n <= 1)
		return 1;

	return climbStairsRecursiveSolution(n-1) + climbStairsRecursiveSolution(n-2);


	// Time Complexity - O(2^n)


}

	
// using Memoisation 
     static int climbStairs(int n , int[] dp){

          //base case
     	if( n <=1 )
     		return 1;

     	if(dp[n] != -1)
     		return dp[n];

     	return dp[n] = climbStairs(n-1 , dp ) + climbStairs(n-2,dp);

     }


   //Using Tabulation Techinique
   static int climbStairsTabulationSolution(int n){

      int[] dp = new int[n+1] ;
       
      Arrays.fill(dp,-1);

       dp[0]  = 1;

       dp[1] = 1;

      for(int i  = 2 ;i<= n ; i++){
          dp[i]  = dp[i-1] + dp[i-2] ;

      }

      return dp[n];
   }


   // Using Space Optimized Solution 

   static int climbStairsSpaceOptimizedSolution(int n){

     int prev1 = 1;

     int prev2 = 1;

     
      for(int i = 2 ;i<= n ;i++){
        int  current = prev1+prev2;
         prev2 = prev1;
         prev1 = current; 
       
     }

     return prev1 ;

   }

	public static void main(String[] arg){

     int n = 5;
     int[] dp = new int[n+1];

     Arrays.fill(dp,-1);

     System.out.println(climbStairs(n,dp));

     System.out.println("Recursive Solution " + climbStairsRecursiveSolution(n));
	
	 System.out.println("Tabulation Solution " + climbStairsTabulationSolution(n));

	 System.out.println("Space Optimized Solution " + climbStairsSpaceOptimizedSolution(n));
	
	}

   }
