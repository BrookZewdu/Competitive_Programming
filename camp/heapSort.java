class Solution
{
    //Function to build a Heap from array.
    void buildHeap(int arr[], int n)
    {
        // Your code here
        for(int i = 0; i < n; i++){
            heapUp(arr, n, i);
        }
    }
 
    //Heapify function to maintain heap property.
    void heapify(int arr[], int n, int i)
    {
        // Your code here
        heapUp(arr, n, i);
        heapDown(arr, n, i);
    }
    void heapUp(int[] arr, int n, int i){
        if(i == 0) return;
        int parent = parent(i);
        if(arr[i] < arr[parent]){
            swap(arr, i, parent);
        }
        heapUp(arr, n, parent);
        
    }
    void heapDown(int[] arr, int n, int i){
        if(leftChild(i) >= n) return;
        int midPos = leftChild(i);
        if(rightChild(i) < n){
            if(arr[rightChild(i)] < arr[midPos]){
                midPos = rightChild(i);
            }
        }
        if(arr[i] > arr[midPos]){
            swap(arr, i, midPos);
            heapDown(arr, n, midPos);
        }
    }
    
    //Function to sort an array using Heap Sort.
    public void heapSort(int arr[], int n)
    {
        //code here
        buildHeap(arr, n);
        for(int i = 0; i < n; i++){
            // arr[n + i] = getMin(arr);
            remove(0, arr, n - i);
   
        }
        reverse(arr, n);
        
    }
    public void reverse(int arr[], int n){
        int p1 = 0, p2 = n - 1;
        while(p1 < p2){
            swap(arr, p1, p2);
            p1++;
            p2--;
        }
    }
    
    public int getMin(int arr[]){
        return arr[0];
    }
    
    public void insert(int[] arr, int element, int n){
        arr[n] = element;
        heapUp(arr, n - 1, n);
    }
    public void remove(int index, int[] arr, int n){
        swap(arr, index, n - 1);
        heapify(arr, n - 1, index);
    }
    public void update(int index, int[] arr, int n, int val){
        arr[index] = val;
        heapify(arr, n, index);
    }
    //HELPER FUNCTIONS ---------------------------------------------------
            public int leftChild(int index){
                return 2 * index + 1;
            }
            public int rightChild(int index){
                return 2 * index + 2;
            }
            public int parent(int index){
                if(index == 0) return 0;
                return (index - 1) / 2;
            }
            public void swap(int[] arr, int first, int second){
                int temp = arr[first];
                arr[first] = arr[second];
                arr[second] = temp;
                
            }
    //-------------------------------------------------------------------
 }
 
 
