/*
// Definition for Employee.
class Employee {
    public int id;
    public int importance;
    public List<Integer> subordinates;
};
*/

class Solution {
    Map<Integer, Employee> map = new HashMap<>();
    // int sum = 0;
    public int getImportance(List<Employee> employees, int id) {
        for(Employee emp : employees) map.put(emp.id, emp);
        return helper(id);
    }
    private int helper(int id){
        Employee e = map.get(id);
        int sum = e.importance;
        if(e.subordinates == null) return 0;
        for(Integer i : e.subordinates)sum += helper(i);
        return sum;
    }
}