import java.util.Map;
import java.util.HashMap;
class Solution {
    public boolean isValid(String s) {
       /*List<String> arr = new ArrayList<>();
       String a[] = s.split("");
        for(String x: a){
            arr.add(x);
        }
        for(int i = 0; i < a.length; i++){
            if(a[i].equals("}") && arr.contains("{")){
                arr.remove("}");
                arr.remove("{");
            }else if(a[i].equals(")") && arr.contains("(")){
                arr.remove("(");
                arr.remove(")");
                
            }else if(a[i].equals("]") && arr.contains("[")){
                arr.remove("]");
                arr.remove("[");
            }
        }
        
        if(arr.isEmpty()){
            return true;
        }else{
            return false;
        }*/
        //the above one works for any parenthesis order as long as they are paired like [([)]
        Stack<String> stk = new Stack<>();
        String a[] = s.split("");
        stk.push(a[0]);
        for(int i = 1; i < a.length; i++){
            
        if(stk.empty()){
            stk.push(a[i]);
        }else{
            if(stk.peek().equals("(") && a[i].equals(")")){
                stk.pop();
                
            }else if(stk.peek().equals("[") && a[i].equals("]")){
                stk.pop();
                
                
            }else if(stk.peek().equals("{") && a[i].equals("}")){
                stk.pop();
                
                
            }else{
                stk.push(a[i]);
            }
        }
       
        
    }
         if(stk.empty()){
            return true;
        }else{
            return false;
        }
}
}