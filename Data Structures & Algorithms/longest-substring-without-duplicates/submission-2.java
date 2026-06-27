class Solution {
    public int lengthOfLongestSubstring(String s) {
       int n = s.length();
        int maxlen = 0;

        // Outer loop sets the starting point 'i'
        for (int i = 0; i < n; i++) {
            // Re-initialize the hash/visited array to 0 for every new starting point
            // size 256 covers all standard ASCII characters
            int[] hash = new int[256]; 

            // Inner loop moves the ending point 'j' forward
            for (int j = i; j < n; j++) {
                char currentChar = s.charAt(j);

                // If hash[currentChar] == 1, it means we have seen this character in the current window
                if (hash[currentChar] == 1) {
                    break; // Duplicate found! Break out of the inner loop
                }

                // Calculate the length of the current unique substring
                int len = j - i + 1;
                maxlen = Math.max(len, maxlen);

                // Mark this character as seen
                hash[currentChar] = 1;
            }
        }
        return maxlen;
    
    }
}
