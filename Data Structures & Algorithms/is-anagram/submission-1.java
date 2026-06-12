class Solution {
    public boolean isAnagram(String s, String t) {
        // Step 1: If lengths are different, they cannot be anagrams
        if (s.length() != t.length()) {
            return false;
        }
        
        // Step 2: Create two frequency arrays to count occurrences
        int[] sCounts = new int[26];
        int[] tCounts = new int[26];
        
        // Step 3: Count the repetition of characters in string 's'
        for (int i = 0; i < s.length(); i++) {
            int index = s.charAt(i) - 'a'; // converts 'a'->0, 'b'->1, etc.
            sCounts[index]++;
        }
        
        // Step 4: Count the repetition of characters in string 't'
        for (int i = 0; i < t.length(); i++) {
            int index = t.charAt(i) - 'a';
            tCounts[index]++;
        }
        
        // Step 5: Compare the repetitions
        for (int i = 0; i < 26; i++) {
            // If any character repeats a different number of times, return false
            if (sCounts[i] != tCounts[i]) {
                return false;
            }
        }
        
        // If all character counts match perfectly
        return true;
    }
}