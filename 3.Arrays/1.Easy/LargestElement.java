class LargestElement{

//Largest element in array 
    static int printLargestElement(int[] arr , int n ) {
	
	  int max = arr[0];
	  
	  for(int i = 1 ;i<n ;i++){
		  
		  if( arr[i] > max){
			  max = arr[i];
		  }
		  
		 
		  
	  }
	   return max ;
	}
		  


   public static void main(String[] arg){
   
   int[] arr = {2,0,10,30,55,23};
   
   int n = arr.length;
   
   System.out.println("LargestElement in array is " + printLargestElement(arr,n));
   
   }
   
   }