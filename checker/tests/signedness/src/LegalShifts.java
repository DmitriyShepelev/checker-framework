// @skip-test

import org.checkerframework.checker.signedness.qual.Unsigned;

// The output of this program is:

// signed: 2147483647 => 127
// unsigned: 2147483647 => 127
// signed: -2147483648 => -128
// unsigned: 2147483648 => 4294967168
// signed: 0 => 0
// unsigned: 0 => 0
// signed: 1 => 0
// unsigned: 1 => 0
// signed: -1 => -1
// unsigned: 4294967295 => 4294967295
// signed: 100 => 0
// unsigned: 100 => 0
//
// signed: 2147483647 => 127
// unsigned: 2147483647 => 127
// signed: -2147483648 => -128
// unsigned: 2147483648 => 4294967168
// signed: 0 => 0
// unsigned: 0 => 0
// signed: 1 => 0
// unsigned: 1 => 0
// signed: -1 => -1
// unsigned: 4294967295 => 4294967295
// signed: 100 => 0
// unsigned: 100 => 0
//
// signed: 2147483647 => -16777216
// unsigned: 2147483647 => 4278190080
// signed: -2147483648 => 0
// unsigned: 2147483648 => 0
// signed: 0 => 0
// unsigned: 0 => 0
// signed: 1 => 16777216
// unsigned: 1 => 16777216
// signed: -1 => -16777216
// unsigned: 4294967295 => 4278190080
// signed: 100 => 1677721600
// unsigned: 100 => 1677721600

public class LegalShifts {
    static void unsignedRightShift(@Unsigned int input) {
        byte output = (@Unsigned byte) (input >>> 24);
        printResults(input, output);
    }

    static void printResults(@Unsigned int input, @Unsigned int output) {
        System.out.println("signed: " + input + " => " + output);
        System.out.println("unsigned: " + intUnsigned(input) + " => " + intUnsigned(output));
    }

    static void signedRightShift(@Unsigned int input) {
        byte output = (@Unsigned byte) (input >> 24);
        printResults(input, output);
    }

    static void signedLeftShift(@Unsigned int input) {
        int output = input << 24;
        printResults(input, output);
    }

    static @Unsigned long intUnsigned(@Unsigned int i) {
        return i & 0xFFFFFFFFL;
    }

    public static void main(String[] args) {
        int[] testInputs = new int[] {Integer.MAX_VALUE, Integer.MIN_VALUE, 0, 1, -1, 100};
        for (int testInput : testInputs) {
            unsignedRightShift(testInput);
        }
        System.out.println();
        for (int testInput : testInputs) {
            signedRightShift(testInput);
        }
        System.out.println();
        for (int testInput : testInputs) {
            signedLeftShift(testInput);
        }
    }
}
