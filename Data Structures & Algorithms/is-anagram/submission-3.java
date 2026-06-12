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
            int countt = 0;
            for (int j = 0; j < t.length(); j++) {
                if (targetChar == t.charAt(j)) {
                    visitedT[j] = true;
                    countt++;
                }
            } 
            if (counts != countt) {
                return false;
            }
        }
        return true;
    }
}