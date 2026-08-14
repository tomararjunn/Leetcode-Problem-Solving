import java.util.Arrays;
class Solution {
    public boolean checkInclusion(String s1, String s2) {
        if(s1.length()>s2.length()){
            return false;
        }

        //find freq of s1
        int[] freq1=new int[26];
        for(int i=0;i<s1.length();i++){
            freq1[s1.charAt(i)-'a']++; 
        //gives freq like a comes 1 times b comes 1 times
        }

        int windowlength=s1.length();

        //find freq of s2
        int[] freq2=new int[26];
        for(int k=0;k<windowlength;k++){
            freq2[s2.charAt(k)-'a']++;
        }

        //compare s1=s2 (freq of ab s1)=(freq of ab in s2)
        if(Arrays.equals(freq1,freq2)){
            return true;
        }

        //Add right
        // Remove left
        // Compare
        // Move right
        
        //increase window
        for(int right=windowlength;right<s2.length();right++){
            freq2[s2.charAt(right)-'a']++;
            int left=right-windowlength;
            freq2[s2.charAt(left)-'a']--;

            if(Arrays.equals(freq1,freq2)){
                return true;
            }
        }
        return false;
    }
}