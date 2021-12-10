public static void insertionSort1(int n, List<Integer> arr) {
    // Write your code here
        int minVal = arr.get(n-1);
        for(int i = n - 2; i >= 0; i--){
            if (arr.get(i) > minVal){
                arr.set(i + 1,arr.get(i));
                for(int j = 0; j < arr.size(); j++){
                    System.out.printf("%d ", arr.get(j));                        
                    }
                    System.out.printf("\n");
                }else{
                    arr.set(i+1, minVal);
                    for(int j = 0; j < arr.size(); j++){
                        System.out.printf("%d ", arr.get(j));                
                    }
                     break;
                }
                if(i==0){
                    if(arr.get(i) < minVal){
                        arr.set(i+1, minVal);
                        for(int j = 0; j < arr.size(); j++){
                            System.out.printf("%d ", arr.get(j));            
                        }
                    }else{
                        arr.set(i, minVal);
                        for(int j = 0; j < arr.size(); j++){
                            System.out.printf("%d ", arr.get(j));
                        }
                    }
            }
        }
    }
