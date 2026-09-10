public class StringBuilder3 {

    public static void main(String[] args) {
        StringBuilder sbr = new StringBuilder("Java");
        sbr.ensureCapacity(100);
        System.out.println(sbr.capacity());
        System.out.println(sbr);
        System.out.println("Program");
        System.out.println(sbr);
        sbr.insert(0, "Python ");
        System.out.println(sbr);
        sbr.delete(0, 7);
        System.out.println(sbr);
        sbr.reverse();
        System.out.println(sbr);
    }
}