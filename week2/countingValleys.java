public static int countingValleys(int steps, String path) {
    // Write your code here
        String arr[] = path.split("");
        int count = 0;
        int vals = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("U")){
                count--;
                if(count == 0){
                    vals++;
                }
            }else{
                count++;       
            }
        }
        int D = 0,U = 0;
        for(int i = 0; i < arr.length; i++){
            if(arr[i].equals("D")){
                D++;
            }else{
                U++;
            }
        }
        if(D > U){
            vals = vals+1;
        }
        
        return vals;
    }

}