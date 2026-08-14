class Solution {
    public String removeOccurrences(String s, String part) {
        //Check if part exists in s
        while(s.contains(part)){
            //Remove the first occurrence
            s=s.replaceFirst(part,"");
        }
        return s;
    }
}