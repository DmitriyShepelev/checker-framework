import org.checkerframework.checker.signedness.qual.*;

public class UnsignedRightShiftTestShort {
    void unsignedRightShiftWithParameter(int length) {
        byte b1 = (byte) (length >>> 24);
        byte b2 = (@Unsigned byte) (length >>> 24);
        byte b3 = (@Signed byte) (length >>> 24);
    }
}
