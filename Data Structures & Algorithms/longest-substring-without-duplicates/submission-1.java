class Solution {
    public int lengthOfLongestSubstring(String s) {
       if (s == null || s.isEmpty()) {
            return 0;
        }
        int maxLength = 0;
        int originalLength = s.length();
        for (int i = 0; i < originalLength; i++) {
            for (int j = i + 1; j <= originalLength; j++) {
                String sub = s.substring(i, j);
                
                Set<Character> uniqueChars = new HashSet<>();
                for (char c : sub.toCharArray()) {
                    uniqueChars.add(c);
                }
                if (uniqueChars.size() == sub.length()) {
                    maxLength = Math.max(maxLength, sub.length());
                }
            }
        }
        return maxLength;
    }
}
