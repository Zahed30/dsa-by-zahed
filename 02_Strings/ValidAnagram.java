/**
 * Problem: 242. Valid Anagram
 * Link: https://leetcode.com/problems/valid-anagram/
 * Time Complexity: O(n)
 * Space Complexity: O(1) (Fixed size array)
 */
class ValidAnagram {
    public boolean isAnagram(String s, String t) {
        if (s.length() != t.length()) return false;
        int[] freq = new int[26];
        for (int i = 0; i < s.length(); i++) {
            freq[s.charAt(i) - 'a']++;
            freq[t.charAt(i) - 'a']--;
        }
        for (int val : freq) {
            if (val != 0) return false;
        }
        return true;
    }
}