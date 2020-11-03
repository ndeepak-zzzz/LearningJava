import java.util.*;

class Name {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        String name;
        System.out.println("What is your name? ");
        name = sc.nextLine();
        System.out.println("Hello there, Mr/Miss " + name);
        sc.close();
    }
}