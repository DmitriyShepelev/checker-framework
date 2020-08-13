import org.checkerframework.checker.signedness.qual.*;

public class UnsignedRightShiftTest {
    void unsignedRightShift() {
        int length = return12();
        byte[] byteArray = new byte[4];
        byteArray[0] = (byte) (length >>> 24);
        byteArray[1] = (byte) (length >>> 16);
        byteArray[2] = (byte) (length >>> 8);
        byteArray[3] = (byte) length;
    }

    void testWrite64(long x) {
        write32((int) (x >>> 32));
    }

    int return12() {
        return 12;
    }

    void write32(int x) {}
}
