import java.util.*;

public class Upcast {
    List<Byte> storageList = new ArrayList<>();

    short readByte() {
        ListIterator<Byte> itr = storageList.listIterator();
        return (short) itr.next(); // upcast from byte to short
    }

    void integralParameter(int x) {}

    void forEachLoop() {
        for (Byte b : storageList) {
            this.integralParameter(b); // upcast from byte to int
        }
    }
}
