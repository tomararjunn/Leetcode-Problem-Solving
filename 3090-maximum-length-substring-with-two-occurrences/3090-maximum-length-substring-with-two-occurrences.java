class Solution {
    public int maximumLengthSubstring(String s) {
        //sliding window
        int[] freq=new int[50];
        int left=0;
        int max=0;
        for(int right=0;right<s.length();right++){
            // Add current character

            char ch=s.charAt(right);
            freq[ch-'a']++;

            // If Window is invalid

            while(freq[ch-'a']>2){
                freq[s.charAt(left) - 'a']--;
                left++;
            }
            // Window is valid

            max=Math.max(max,right-left+1);
        }
        return max;
    }
    
}
