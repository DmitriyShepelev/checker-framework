public class CompoundAssignmentOperators {
    void addition(char c, int i1) {
        i1 += c;
        i1 = (int) (i1 + c);
    }

    void subtraction(char c, int i1) {
        i1 -= c;
        i1 = (int) (i1 - c);
    }

    void multiplication(char c, int i1) {
        i1 *= c;
        i1 = (int) (i1 * c);
    }

    void division(char c, int i1) {
        i1 /= c;
        i1 = (int) (i1 / c);
    }

    void modulus(char c, int i1) {
        i1 %= c;
        i1 = (int) (i1 % c);
    }
}
