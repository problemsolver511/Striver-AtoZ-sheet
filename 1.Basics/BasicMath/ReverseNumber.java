class ReverseNumber{

 public static int reverseNumber(int n){
	 
	 
	 int reverse = 0 ;
	
	  int remainder ;
	
	 while( n != 0){
		 
		 remainder  = n %10 ;
		 reverse    = reverse * 10 + remainder;
		 n          = n /10;
	 }
	 
	 return reverse;
 } 
      		 public static void main(String[] arg){
			 
			 int num = 12345;
			 
			 System.out.println("Reversed number is " + reverseNumber(num));
			 
			 
		 }
 }