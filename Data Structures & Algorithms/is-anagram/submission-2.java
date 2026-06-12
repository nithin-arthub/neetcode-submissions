class Solution {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) {
            return false;
        }
        boolean[] visitedS = new boolean[s.length()];
        boolean[] visitedT = new boolean[t.length()];
        for (int i = 0; i < s.length(); i++) {
            if (visitedS[i]) {
                continue;
            }
            char targetChar = s.charAt(i);
            int counts = 1;
            for (int j = i + 1; j < s.length(); j++) {
                if (s.charAt(i) == s.charAt(j)) {
                    visitedS[j] = true; 
                    counts++;
                }
            }
            // 2. Look for the exact same character in string t and count its repetitions
            int countt = 0;
            for (int j = 0; j < t.length(); j++) {
                if (targetChar == t.charAt(j)) {
                    visitedT[j] = true;
                    countt++;
                }
            } 
            // 3. If the repetitions don't match, they aren't anagrams!
            if (counts != countt) {
                return false;
            }
        }
        // If we checked all characters and their counts matched perfectly
        return true;
    }
}