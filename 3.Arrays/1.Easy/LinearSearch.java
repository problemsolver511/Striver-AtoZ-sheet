class LinearSearch {

       
	   static int linearSearch(int[] arr , int n , int x){
		
		    int i ;
			
			
			for(i = 0 ;i < n ;i++){
				
				if(arr[i] == x )
					return i;
				
			}
			
			return -1;
	    }
	   
	   
	   public static void main(String[] args){
		   
		 int[] arr = {2, 5,6,8,9 ,10};
            int x = 9;
			int n = arr.length;

			System.out.println(" Element is found at index "+linearSearch(arr,n , x));
			
           
      

       }
}