
public class NestedPgm1 {

    public static void main(String[] args) {
        for (int i = 1; i <= 3; i++) {
            for (int j = 1; j <= 2; j++) {
                if (j == 2) {
                    break;
                }
                System.err.println("i: " + i + " j: " + j);
            }
        }
    }
}
