public class Palindrome {

    public static void main(String[] args) {
        String s1 = "A man, a plan, a canal: Panama";
        String s2 = "race a car";

        System.out.println("Input: " + s1);
        System.out.println("Is Palindrome? " + isPalindrome(s1)); // true

        System.out.println("Input: " + s2);
        System.out.println("Is Palindrome? " + isPalindrome(s2)); // false
        
    }

    public static boolean isPalindrome(String s) {
        
        s = s.toLowerCase();

        // Remove all non-alphanumeric characters
        s = s.replaceAll("[^a-z0-9]", "");

        int left = 0;
        int right = s.length() - 1;

        // Two pointers approach
        while (left < right) {
            if (s.charAt(left) != s.charAt(right)) {
                return false; // mismatch found
            }
            left++;
            right--;
        }
        return true;  
    }
}

