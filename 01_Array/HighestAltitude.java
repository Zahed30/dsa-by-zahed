/**
 * Problem: 1732. Find the Highest Altitude
 * Link: https://leetcode.com/problems/find-the-highest-altitude/
 * Time Complexity: O(n)
 * Space Complexity: O(1)
 */
class HighestAltitude {
    public int largestAltitude(int[] gain) {
        int currentAltitude = 0;
        int maxAltitude = 0;

        for (int i = 0; i < gain.length; i++) {
            currentAltitude += gain[i]; 
            if (currentAltitude > maxAltitude) {
                maxAltitude = currentAltitude;
            }
        }

        return maxAltitude;
    }
}