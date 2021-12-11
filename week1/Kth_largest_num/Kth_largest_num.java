class Solution {
    public int[][] kClosest(int[][] points, int k) {
        int temp,temp2;
        for(int i = 0; i < points.length - 1; i++){
            for(int j = 0; j < points.length - i -1; j++){
                if((points[j][0]*points[j][0] + points[j][1]*points[j][1]) > (points[j+1][0]*points[j+1][0] + points[j+1][1]*points[j+1][1])){
                    temp = points[j][0];
                    points[j][0] = points[j+1][0];
                    points[j+1][0] = temp;
                    temp2 = points[j][1];
                    points[j][1] = points[j+1][1];
                    points[j+1][1] = temp2;
                   
                }
            }
            }
        int[][] sorted = new int[k][2];
        for(int i = 0; i < k; i++){
            for(int j = 0; j < 2; j++){
                sorted[i][j] = points[i][j];
            }
            
        } 
            return sorted;
        }
    }
    
