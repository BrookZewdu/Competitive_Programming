class Solution
{
	int  select(int arr[], int i)
	{
        // code here such that selectionSort() sorts arr[]
        int minIndex = i;
            for(int j = i; j < arr.length; j++)
            {
                if(arr[j] < arr[minIndex]){
                    minIndex = j;
                }
            }
            return minIndex;
	}
	
	void selectionSort(int arr[], int n)
	{
	    //code here
	  int temp, index;
	  
	   for(int i = 0; i < arr.length; i++){
	       index = select(arr,i);
	       if(arr[index] < arr[i]){
	           temp = arr[i];
    	       arr[i] = arr[index];
    	       arr[index] = temp; 
	       }
	   }
	   
	}
}
