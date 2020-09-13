import org.checkerframework.checker.signedness.qual.Unsigned;

public class CharComparisonsRuntime {
    static @Unsigned byte b;
    static char c;

    static void unsignedComparisonLiteralsPrinter(char c, byte b) {
        boolean res = c > b;
        System.out.println(res);
        res = c >= b;
        System.out.println(res);
        res = c < b;
        System.out.println(res);
        res = c <= b;
        System.out.println(res);
        res = c == b;
        System.out.println(res);
    }

    static void unsignedComparisonLiterals() {
        // Negative byte b and char c such that 0 <= c <= 65.
        c = 0; // unsigned: 0
        b = -1; // unsigned: 255, signed: -1
        unsignedComparisonLiteralsPrinter(c, b);

        // Negative byte b and char c such that 65 < c.
        c = 67; // unsigned: 67
        b = -1; // unsigned: 255, signed: -1
        unsignedComparisonLiteralsPrinter(c, b);

        // Positive byte b and char c such that 65 < c.
        c = 67; // unsigned: 67
        b = 1; // unsigned: 1, signed: 1
        unsignedComparisonLiteralsPrinter(c, b);

        // Positive byte b and char c such that 0 <= c <= 65.
        c = 0; // unsigned: 0
        b = 1; // unsigned: 1, signed: 1
        unsignedComparisonLiteralsPrinter(c, b);
    }

    public static void main(String[] args) {
        unsignedComparisonLiterals();
    }
}
