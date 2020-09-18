// Test case for issue 3668:
// https://github.com/typetools/checker-framework/issues/3668

// @skip-test until the issue is fixed

public class ObjectCasts {
    void castObjectToBoxedVariants() {
        byte b1 = 1;
        short s1 = 1;
        int i1 = 1;
        long l1 = 1;
        Object[] obj = new Object[] {b1, s1, i1, l1};
        byteParameter((Byte) obj[0]);
        shortParameter((Short) obj[1]);
        integralParameter((Integer) obj[2]);
        longParameter((Long) obj[3]);
    }

    void byteParameter(byte b) {}

    void shortParameter(short s) {}

    void integralParameter(int i) {}

    void longParameter(long l) {}
}
