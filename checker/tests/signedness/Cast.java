import org.checkerframework.checker.signedness.qual.*;

public class Cast {

    static final Object object = 1;

    void objectiveParameter(Object object) {
        integralParameter((Integer) object); // emits argument.type.incompatible error
    }

    // This passes when object is initialized within objectiveArgument().
    void objectiveArgument() {
        Object object = -3;
        integralParameter((Integer) object);
    }

    void integralParameter(int x) {}
}
