class Solution {
    public int mostWordsFound(String[] sentences) {
        int count=0;
        for(String sentence:sentences){
            String[] word=sentence.split(" ");
            if(word.length>count){
                count=word.length;
            }
        }
        return count;
    }
}