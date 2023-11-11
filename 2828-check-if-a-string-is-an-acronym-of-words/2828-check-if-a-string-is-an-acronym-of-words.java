class Solution {
    public boolean isAcronym(List<String> words, String s) {
        boolean isTrue = true;
        if(s.length() > words.size())
            isTrue = false;
        for (int i = 0; i < words.size(); i++){
            if (words.get(i).length() > 0 && s.length() > i){
                if (words.get(i).charAt(0) != s.charAt(i)){
                isTrue = false;
                break;
              }
            }
            else {
                    isTrue = false;
                    break;
            }
        }
        return isTrue;
    }
}