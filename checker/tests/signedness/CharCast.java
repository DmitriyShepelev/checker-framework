// @skip-test

public class CharCast {
    int i;

    void clientReturnedCastedShort(int x) {
        char c = (char) x;
    }

    void clientReturnedCastedShort(int x) {
        String s = Character.toString((char) x);
    }

    void clientReturnedCastedShort() {
        int x = returnCastedShort();
        String s = Character.toString((char) x);
    }

    short returnCastedShort() {
        return (short) i;
    }

    void clientCastShort() {
        int x = (short) i; //
        // Subsequent line incorrectly emits argument.type.incompatible error.
        String s = Character.toString((char) x);
    }

    void clientReturnedCastedShortLiteral() {
        int x = returnCastedShortLiteral();
        // Subsequent line incorrectly emits argument.type.incompatible error.
        String s = Character.toString((char) x);
    }

    short returnCastedShortLiteral() {
        return (short) 1;
    }

    void clientCastShortLiteral() {
        int x = (short) 1;
        String s = Character.toString((char) x);
    }

    void clientShortUpcast() {
        short x = 1;
        int y = x;
        String s = Character.toString((char) y);
    }

    void clientReturnedShortUpcast() {
        int y = returnShort();
        // Subsequent line incorrectly emits argument.type.incompatible error.
        String s = Character.toString((char) y);
    }

    short returnShort() {
        short x = 1;
        return x;
    }
}
