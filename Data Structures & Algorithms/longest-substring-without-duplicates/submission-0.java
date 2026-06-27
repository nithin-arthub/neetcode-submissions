class Solution {
    public int lengthOfLongestSubstring(String s) {
       if (s == null || s.isEmpty()) {
            return 0;
        }

        int maxLength = 0;
        int originalLength = s.length();

        // 1. Generate all possible substrings (subarrays of characters)
        for (int i = 0; i < originalLength; i++) {
            for (int j = i + 1; j <= originalLength; j++) {
                String sub = s.substring(i, j);
                
                // 2. Put characters of the current substring into a Set to check uniqueness
                Set<Character> uniqueChars = new HashSet<>();
                for (char c : sub.toCharArray()) {
                    uniqueChars.add(c);
                }
                
                // 3. If the unique characters equal the substring's length, it's valid
                if (uniqueChars.size() == sub.length()) {
                    // Update maxLength if this one is bigger
                    maxLength = Math.max(maxLength, sub.length());
                }
            }
        }

        return maxLength;
    }
}
