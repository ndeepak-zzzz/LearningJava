import java.util.*;

class Bin2Dec {
    public static void main(String argos[]) {
        Scanner s = new Scanner(System.in);
        s.useRadix(2);
        int x = s.nextInt();
        System.out.println(x);
        s.close();
    }
}