package bubblesort;

public class bubblesort {

	public static void main(String[] args) {
		// TODO Auto-generated method stu

		
		
    float arr[] = new float[1000];
    int num = 3;
    
    arr[0] = 5;
    arr[1] = 3;
    arr[2] = 7;
    arr[3] = 2;
   
    float arrtemp = 0;
    
    
    for ( int x1 = 
    		0; x1 < num; x1++ )
    {	
      for ( int x2 = 0; x2 < num; x2++ )
      {
      
      if (arr[x2] > arr[x2 + 1])
    		  {
    	      arrtemp = arr[x2+1];
    	      arr[x2 + 1] = arr[x2];
    	      arr[x2] = arrtemp;
    	  
    		  }
    	
      }
	
    }
		
		
    
    for ( int x = 0; x < num +1; x++)
    {
    	System.out.println("num:" + x + " : value: " + arr[x] );
    }
    
	}

}
