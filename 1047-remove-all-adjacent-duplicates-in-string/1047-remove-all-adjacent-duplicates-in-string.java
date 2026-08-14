class Solution {
    public String removeDuplicates(String s) {
        StringBuilder ans=new StringBuilder();


        for(int i=0;i<s.length();i++){
            char ch=s.charAt(i);
            int last=ans.length()-1;

            if(last>=0 && ans.charAt(last)==ch){
                ans.deleteCharAt(last);
            }
            else{
                ans.append(ch);
            }
        }
        return ans.toString();
    }
}