class Result {

    /*
     * Complete the 'gradingStudents' function below.
     *
     * The function is expected to return an INTEGER_ARRAY.
     * The function accepts INTEGER_ARRAY grades as parameter.
     */

    public static List<Integer> gradingStudents(List<Integer> grades) {
    // Write your code here
        List<Integer> roundedGrades = new ArrayList<Integer>();
           for(int i = 0; i < grades.size(); i++){

               if(grades.get(i) >= 38){
                   if(grades.get(i)%5 >=3){
                       roundedGrades.add(grades.get(i)/5*5+5);
                   }else{
                       roundedGrades.add(grades.get(i));
                   }
               }else{
                   roundedGrades.add(grades.get(i));
               }
           }
           return roundedGrades;
    }
    

}
