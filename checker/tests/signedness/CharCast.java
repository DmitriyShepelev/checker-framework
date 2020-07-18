// @skip-test
public class CharCast {
    int i;

    void clientReturnedCastedShort() {
        int x = returnCastedShort();
        // Subsequent line incorrectly emits argument.type.incompatible error.
        String s = Character.toString((char) x);
    }

    short returnCastedShort() {
        return (short) i;
    }

    void clientCastShort() {
        int x = (short) i;
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
        Character.toString((char) y);
    }

    void ClientReturnedShortUpcast() {
        int y = returnShort();
        // Subsequent line incorrectly emits argument.type.incompatible error.
        Character.toString((char) y);
    }

    short returnShort() {
        short x = 1;
        return x;
    }
}
