class Solution {
    public boolean isPalindrome(int x) {
        int rev=0;
        int num=x;
        if(x<0){
            return false;
        }
        while(num!=0){
            //Extract last digit:
            rev=rev*10+num%10;
            //Remove last digit
            num=num/10;
        }
        return rev==x;
    }
}