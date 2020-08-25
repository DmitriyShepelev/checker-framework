import org.checkerframework.checker.signedness.qual.*;

public class CharComparisons {
    char c;
    @Unsigned byte b;

    void unsignedComparison(char c, @Unsigned byte b) {
        boolean res = c > b;
        res = c >= b;
        res = c < b;
        res = c <= b;
        res = c == b;
    }

    void unsignedComparisonFields() {
        boolean res = this.c > this.b;
        res = this.c >= this.b;
        res = this.c < this.b;
        res = this.c <= this.b;
        res = this.c == this.b;
    }

    void unsignedComparisonLiterals(char c, @Unsigned byte b) {
        // Negative byte b and char c such that 0 <= c <= 65.
        c = 0;
        b = -1;
        boolean res = c > b;
        res = c >= b;
        res = c < b;
        res = c <= b;
        res = c == b;

        // Negative byte b and char c such that 66 < c.
        c = 67;
        res = c > b;
        res = c >= b;
        res = c < b;
        res = c <= b;
        res = c == b;

        // Positive byte b and char c such that 66 < c.
        b = 1;
        res = c > b;
        res = c >= b;
        res = c < b;
        res = c <= b;
        res = c == b;

        // Positive byte b and char c such that 0 <= c <= 65.
        c = 0;
        res = c > b;
        res = c >= b;
        res = c < b;
        res = c <= b;
        res = c == b;
    }
}
