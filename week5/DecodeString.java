class Solution {
    
    public static boolean isInteger(String s) {
        try { 
            Integer.parseInt(s); 
        } catch(NumberFormatException e) { 
            return false; }
        // } catch(NullPointerException e) {
        //     return false;
        // }
        // only got here if we didn't return false
        return true;
    }
    public static String recursive(int mul, String dup){
        String res = "";
        if(mul == 1){
            return dup;
        }else{
            return dup + recursive(mul - 1, dup);
        }
    }
    public String decodeString(String s) {
        Stack<String> stk = new Stack<>();
        Stack<String> stk2 = new Stack<>();
        Stack<String> stk3 = new Stack<>();
        
        String multiplier = "";
        String be_duplicated = "";
        
     
        String arr[] = s.split("");
       
        for(int i = 0; i < arr.length; i++){
            
            if(arr[i].equals("]")){
                while(!stk.peek().equals("[")){
                    stk2.push(stk.pop());
                }
               
                stk.pop();

                while(!stk2.isEmpty()){
                    be_duplicated = be_duplicated + stk2.pop();
                }
                
                while(!stk.isEmpty() && isInteger(stk.peek()) == true){
                    stk3.push(stk.pop());
                }
                
                while(!stk3.isEmpty()){
                    multiplier = multiplier + stk3.pop();
                }
                
                
                int mul = multiplier.equals("")? 1 : Integer.parseInt(multiplier);
                multiplier = "";

                String last = recursive(mul, be_duplicated);
                String arr2[] = last.split("");
                int n = arr2.length;
                for(int j = 0; j < n; j++){
                    stk.push(arr2[j]);
                }
                be_duplicated = "";
                continue;
             }
                stk.push(arr[i]);
            }
        
        String str = stk.toString();
        str = str.replaceAll("\\[", "").replaceAll("\\]","").replaceAll(",","").replaceAll(" ","");
        return str;
        }
        
    }


