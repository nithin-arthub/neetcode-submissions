class Solution {
    public boolean isPalindrome(String s) {
        int right=s.length()-1;
        int left =0;
        while(left < right)
        {
            while(left < right && !Character.isLetterOrDigit(s.charAt(left)))
            {
                left ++;
            }
            while(left < right && !Character.isLetterOrDigit(s.charAt(right)))
            {
                right --;
            }
            char leftch = Character.toLowerCase(s.charAt(left));
            char rightch= Character.toLowerCase(s.charAt(right));
            if(leftch!=rightch)
            {
                return false;
            }
        left ++;
        right --;    
        }
        return true;
    }
}
