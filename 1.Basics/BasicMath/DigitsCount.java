
 class DigitsCount{
 
   static int countDigits(int n){
   
      int count = 0;
	  
	  int x = n;
	  
	   while( x != 0 ){
		    x = x/10;
			count+1;
	   }
	   
	   return count ;
   }
   
   
   public static void main(String[] arg){
	   
	   int n = 32024;
	   
	   System.out.println( "No. of digits in the given input " + countDigits(n));
	   
   }
 
 }