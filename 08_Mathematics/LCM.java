public class LCM {
    public static int getLCM(int a, int b) {
        return (a * b) / GCD.getGCD(a, b);
    }
    public class GCD {
    static int getGCD(int a, int b) {
        if (b == 0) return a;
        return getGCD(b, a % b);
    }
}
}