//Palindrome Number Solution.

class Solution {
    public boolean isPalindrome(int x) {
        int n = x;
        int r;
        int s = 0;

        while(n>0){
            r = n % 10;
            n = n / 10;
            s = s*10+r;
        }
        return (s == x);
        
    }
}
