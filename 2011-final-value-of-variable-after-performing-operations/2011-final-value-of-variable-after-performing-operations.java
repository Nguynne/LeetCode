class Solution {
    public int finalValueAfterOperations(String[] operations) {
        int count = 0;
        int i = 0;
        for(String o : operations){
            if(operations[i].contains("--X") || operations[i].contains("X--"))
                count -= 1;
            if(operations[i].contains("++X") || operations[i].contains("X++"))
                count+=1;
            i++;
        }
        return count;
    }
}