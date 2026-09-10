
import java.util.Scanner;

public class RevString {

    public static void main(String[] args) {
        try (Scanner scanner = new Scanner(System.in)) {
            System.out.println("Enter String: ");
            String str = scanner.next();
            char arr[] = str.toCharArray();
            char newArr[] = new char[arr.length];
            int j = newArr.length - 1;
            for (int i = 0; i <= arr.length - 1; i++) {
                newArr[j] = arr[i];
                j--;
            }
            String revStr = new String(newArr);
            System.out.println("Original String is: " + str);
            System.out.println("Reversed String is: " + revStr);
        }
    }
}
