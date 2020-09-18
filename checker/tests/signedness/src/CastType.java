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

public class CastType {
    static void testUnsignedCastType(@Unsigned int input) {
        byte output = (@Unsigned byte) (input >>> 24);
        System.out.println("signed: " + input + " => " + output);
        System.out.println("unsigned: " + intUnsigned(input) + " => " + intUnsigned(output));
    }

    static long intUnsigned(int i) {
        return i & 0xFFFFFFFFL;
    }

    public static void main(String[] args) {
        testUnsignedCastType(Integer.MAX_VALUE);
        testUnsignedCastType(Integer.MIN_VALUE);
        testUnsignedCastType(0);
        testUnsignedCastType(1);
        testUnsignedCastType(-1);
        testUnsignedCastType(100);
    }
}
