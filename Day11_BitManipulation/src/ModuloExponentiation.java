// Modulo Exponentiation
public class ModuloExponentiation {
    public static long modExp(long base, long exponent, long mod) {
        long ans = 1;
        base = base % mod;
        while (exponent > 0) {
            // If current bit is 1
            if ((exponent & 1) != 0) {
                ans = (ans * base) % mod;
            }
            // Square the base
            base = (base * base) % mod;
            // exponent / 2
            exponent = exponent >> 1;
        }
        return ans;
    }
    public static void main(String[] args) {
        System.out.println(modExp(2, 10, 7));
    }
}