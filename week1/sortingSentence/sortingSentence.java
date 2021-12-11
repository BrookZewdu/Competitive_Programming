class Solution {
    public String sortSentence(String s) {
        
        if(s == null || s.isEmpty()){ 
            return s; 
        } 
        String[] words = s.split("\\s+"); 
        String temp;
        for(int i = 0; i < words.length - 1; i++){
            for(int j = 0; j < words.length-1-i; j++){
                if(Character.getNumericValue(words[j].charAt(words[j].length() - 1)) > Character.getNumericValue(words[j+1].charAt(words[j+1].length()- 1))){
                    temp = words[j];
                    words[j] = words[j+1];
                    words[j+1] = temp;
                }
        }
        }
        for(int i = 0; i < words.length; i++){
            words[i] = words[i].replaceAll("[0-9]","");
        }
    return String.join(" ", words);
    }
}
