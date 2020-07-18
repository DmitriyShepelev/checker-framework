public class CharCast {
    int i;
    void cast() {
        int x = returnShort();
        String s = Character.toString((char) x);
    }

    short returnShort() {
        return (short) i;
    }
}
