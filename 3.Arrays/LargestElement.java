class LargestElement{


   static int printLargest(int[] arr, int n){
	   
	   int max = arr[0];
	   
	   for(int i = 1;i<n;i++){
		   if(arr[i] > max){
			   max = arr[i];
		   }
	   }
	   
	   return max ;
	   
   }

 public static void main(String[] arg){
 
      int[] arr = {5,2,10,20,4,9};
	  
	  int n = arr.length ;
	  System.out.println("Largest element in array is " + printLargest(arr , n) );
	  
 }
 
}
   