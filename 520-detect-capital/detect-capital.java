class Solution {
    public boolean detectCapitalUse(String word) {
        if(Caps(word)|| Lower(word) || firstCap(word)){
            return true;
        }
        return false;
    }
        private boolean Caps(String word){
            int count=0;
            for(int i=0; i<word.length(); i++){
                char ch=word.charAt(i);
                if(Character.isUpperCase(ch)){
                    count++;
                }
            }
            if(word.length()==count){
                return true;
            }
            return false;
        }

        private boolean Lower(String word){
            int count=0;
            for(int i=0; i<word.length(); i++){
                char ch=word.charAt(i);
                if(Character.isLowerCase(ch)){
                    count++;
                }
            }
            if(word.length()==count){
                return true;
            }
            return false;
        }

        private boolean firstCap(String word){
            char ch= word.charAt(0);
            String sub_str=word.substring(1);
            if(Character.isUpperCase(ch) && Lower(sub_str)){
                return true;
            }
            return false; 
        } 

}
