
import java.util.Arrays;
public class Eleven {
    public static void main(String[] args) {
        String a = "listen";
        String b = "silent";
        char[] aa = a.toCharArray();
        char[] bb = b.toCharArray();
        Arrays.sort(aa);
        Arrays.sort(bb);
        if (Arrays.equals(aa, bb)) {
            System.out.println("yes");
        } else {
            System.out.println("no");
        }
    }
}