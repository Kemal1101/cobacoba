import java.util.Scanner;
public class iseng {
    public static void main(String[] args) {
        int result = sudin(5, 10);
        System.out.println(result);
    }

    public static int sudin(int c, int d) {
        if (c < d) {
            return c + sudin(c + 1, d);
        } else {
            return c;
        }
    }
}
