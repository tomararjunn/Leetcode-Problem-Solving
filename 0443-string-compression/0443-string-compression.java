class Solution {
    public int compress(char[] chars) {
        StringBuilder ans=new StringBuilder();
        int i=0;
        int res=0;
        int len=chars.length;
        while(i<len){
            int count=0;
            char current=chars[i];
            //count of same char
            while(i<len && chars[i]==current){
                count++;
                i++;
            }
            //Add chars[i] to the answer
            chars[res++]=current;
            //convert char to array(char to string toarray)
            if(count>1){
                String str=String.valueOf(count);
                for(char digits:str.toCharArray()){
                    //insert into result
                    chars[res++]=digits;
                }
            }
        }
        return res;
    }
}