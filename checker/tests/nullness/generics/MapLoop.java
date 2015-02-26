import org.checkerframework.checker.nullness.qual.*;

import java.util.Map;

class MapLoop {
    void test1(Map<String, String> map) {
        for (Map.Entry<String, String> entry : map.entrySet()) {
        }
    }
    void test2(Map<String, String> map) {
        for (Map.Entry<? extends String, ? extends String> entry : map.entrySet()) {
        }
    }
    void test3(Map<String, @Nullable Object> map) {
        for (Map.Entry<? extends String, @Nullable Object> entry : map.entrySet()) {
        }
        for (Object val : map.values()) {
        }
    }
}
