 public static void countSwaps(List<Integer> a) {
    // Write your code here
        int temp, numswaps=0;
        for(int i = 0; i < a.size() - 1; i++){
            for(int j = 0; j < a.size() - i - 1; j++ ){
                if(a.get(j) > a.get(j+1)){
                    temp = a.get(j);
                    a.set(j, a.get(j+1));
                    a.set(j+1, temp);
                    numswaps++;
                }
            }   
        }
        System.out.println("Array is sorted in " + numswaps + " swaps.");
        System.out.println("First Element: " + a.get(0));
        int n = 0;
        for(int i = 0; i < a.size(); i++){
         n++;   
        }
        System.out.println("Last Element: " + a.get(n-1));

    }