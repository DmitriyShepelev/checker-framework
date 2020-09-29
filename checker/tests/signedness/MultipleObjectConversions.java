public class MultipleObjectConversions {
    void castObjectToBoxedType(Object o) {
        floatParameter((Byte) o);
        floatParameter((Short) o);
        floatParameter((Integer) o);
        floatParameter((Long) o);
        floatParameter((Character) o);

        doubleParameter((Byte) o);
        doubleParameter((Short) o);
        doubleParameter((Integer) o);
        doubleParameter((Long) o);
        doubleParameter((Character) o);
    }

    void floatParameter(float f) {}

    void doubleParameter(double d) {}
}
