package BinaryQS;

public class Smallest {

    public static void main(String[] args) {
        char[] letters = {'c','f','j'}; // char[] not int[]
        char target = 'a';
        char result = nextGreatestLetter(letters, target); // pass array
        System.out.println(result); // will print 'c'
    }

    static char nextGreatestLetter(char[] letters, char target) {
        int start = 0;
        int end = letters.length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        // Wrap around using modulo
        return letters[start % letters.length];
    }
}
