// Test case for issue 3667:
// https://github.com/typetools/checker-framework/issues/3667

// @skip-test until the issue is fixed

import org.checkerframework.checker.signedness.qual.Signed;
import org.checkerframework.checker.signedness.qual.Unsigned;

public class UnsignedRightShiftTestShort {
    void unsignedRightShiftWithParameter(int length) {
        byte b1 = (byte) (length >>> 24);
        byte b2 = (@Unsigned byte) (length >>> 24);
        byte b3 = (@Signed byte) (length >>> 24);
    }
}
