public class CharComparisonsRuntime {
    static void unsignedComparisonLiteralsPrinter(char c, byte b) {
        boolean res = c > b;
        System.out.println(res);
        res = c >= b;
        System.out.println(res);
        res = c < b;
        System.out.println(res);
        res = c == b;
        System.out.println(res);
    }

    static void unsignedComparisonLiterals() {
        // Negative byte b and char c such that 0 <= c <= 65.
        char c = 0;
        byte b = -1;
        unsignedComparisonLiteralsPrinter(c, b);

        // Negative byte b and char c such that 65 < c.
        c = 67;
        b = -1;
        unsignedComparisonLiteralsPrinter(c, b);

        // Positive byte b and char c such that 65 < c.
        c = 67;
        b = 1;
        unsignedComparisonLiteralsPrinter(c, b);

        // Positive byte b and char c such that 0 <= c <= 65.
        c = 0;
        b = 1;
        unsignedComparisonLiteralsPrinter(c, b);
    }

    public static void main(String[] args) {
        unsignedComparisonLiterals();
    }
}
