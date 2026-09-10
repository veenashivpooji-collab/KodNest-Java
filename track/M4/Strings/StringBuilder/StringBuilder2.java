
public class StringBuilder2 {

    public static void main(String[] args) {
        StringBuilder sbr = new StringBuilder();
        sbr.ensureCapacity(100);
        System.out.println(sbr.capacity());
        System.out.println(sbr);
        System.out.println("Program");
        System.out.println(sbr);
    }
}
