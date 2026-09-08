
class Mobile {

    void unlock(int number) {
        System.out.println("unlocking mobile using number");
    }

    void unlock(String text) {
        System.out.println("unlocking mobile using text");
    }

    void unlock(Pattern p) {
        System.out.println("unlocking mobile using pattern");
    }

    void unlock(Face f) {
        System.out.println("unlocking mobile using face");
    }

    void unlock(Fingerprint fp) {
        System.out.println("unlocking mobile using fingerprint");
    }
}

class Pattern {
}

class Face {
}

class Fingerprint {
}

public class Phone {

    public static void main(String[] args) {
        Mobile m = new Mobile();
        m.unlock(1234);
        m.unlock("1234");
        m.unlock(new Pattern());
        m.unlock(new Face());
        m.unlock(new Fingerprint());

    }
}
