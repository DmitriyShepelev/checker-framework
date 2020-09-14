public class CastType {
    static void testUnsignedCastType(int length) {
        byte b1 = (byte) (length >>> 24);
        System.out.println(b1);
    }

    public static void main(String[] args) {
        testUnsignedCastType(Integer.MAX_VALUE); // unsigned: 2^32 - 1, signed: -1, shifted
        // signed: -1, shifted unsigned: 255
        testUnsignedCastType(Integer.MIN_VALUE); // unsigned: 2^31, signed: -2^31, shifted
        // signed: -128, shifted unsigned: 128
        testUnsignedCastType(0); // unsigned: 0, signed: 0
        testUnsignedCastType(1); // unsigned: 1, signed: 1
        testUnsignedCastType(-1); // unsigned: 2^32 - 1, signed: -1, shifted signed: -1,
        // shifted unsigned: 255
        testUnsignedCastType(100); // unsigned: 100, signed: 100, shifted unsigned: 0, shifted
        // unsigned: 0
    }
}
