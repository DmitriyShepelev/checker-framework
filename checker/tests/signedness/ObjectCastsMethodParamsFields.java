import org.checkerframework.checker.signedness.qual.Signed;
import org.checkerframework.checker.signedness.qual.Unsigned;

public class ObjectCastsMethodParamsFields {
    Object o1;
    @Signed Object o5;
    @Unsigned Object o6;

    void castObject(Object o2) {
        // :: error: (argument.type.incompatible)
        signedByteParameter((Byte) o1);
        // :: error: (argument.type.incompatible)
        signedByteParameter((Byte) o2);
        // :: error: (argument.type.incompatible)
        signedShortParameter((Short) o1);
        // :: error: (argument.type.incompatible)
        signedShortParameter((Short) o2);
        // :: error: (argument.type.incompatible)
        signedIntegralParameter((Integer) o1);
        // :: error: (argument.type.incompatible)
        signedIntegralParameter((Integer) o2);
        // :: error: (argument.type.incompatible)
        signedLongParameter((Long) o1);
        // :: error: (argument.type.incompatible)
        signedLongParameter((Long) o2);
    }

    void castObjectWithSignednessAnnotation(@Signed Object o3, @Unsigned Object o4) {
        signedByteParameter((Byte) o3);
        signedByteParameter((Byte) o5);

        unsignedByteParameter((Byte) o4);
        unsignedByteParameter((Byte) o6);

        signedShortParameter((Short) o3);
        signedShortParameter((Short) o5);

        unsignedShortParameter((Short) o4);
        unsignedShortParameter((Short) o6);

        signedIntegralParameter((Integer) o3);
        signedIntegralParameter((Integer) o5);

        unsignedIntegralParameter((Integer) o4);
        unsignedIntegralParameter((Integer) o6);

        signedLongParameter((Long) o3);
        signedLongParameter((Long) o5);

        unsignedLongParameter((Long) o4);
        unsignedLongParameter((Long) o6);
    }

    void signedByteParameter(byte b) {}

    void unsignedByteParameter(@Unsigned byte b) {}

    void signedShortParameter(short s) {}

    void unsignedShortParameter(@Unsigned short s) {}

    void signedIntegralParameter(int i) {}

    void unsignedIntegralParameter(@Unsigned int i) {}

    void signedLongParameter(long l) {}

    void unsignedLongParameter(@Unsigned long l) {}
}
