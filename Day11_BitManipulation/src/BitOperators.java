// Bit manipulation  Operators 1. -> AND (&) 2. -> OR (|) 3. -> XOR  (^) 4. -> Binary 1's Complement (~)
// 5. -> Binary Right shift (>>) 6. -> Binary left shift (<<)

public class BitOperators {
    public static void main(String[] args) {
        // AND
        System.out.println(5 & 6);
        //OR
        System.out.println(5 | 6);
        // XOR
        System.out.println(5 ^ 6);
        // Binary 1's Complement
        System.out.println(~5);
        //Binary Right shift  a >> b = a/2pow(b)
        System.out.println(5 >> 1);
        //Binary Left shift a << b = a * 2pow(b)
        System.out.println(5 << 2);
    }
}
