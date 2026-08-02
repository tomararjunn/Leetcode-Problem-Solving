class Solution {
    public boolean isPalindrome(String s) {
        String clean = s.replaceAll("[^a-zA-Z0-9]", "").toLowerCase();
        StringBuilder sb=new StringBuilder(clean);
        String str2=sb.reverse().toString();
        return clean.equals(str2);
    }
}
        