import java.lang.*;
import java.util.*;

class Name{
    public static void main(String args[])
    {
        Scanner s=new Scanner(System.in);
        String name;
        System.out.println("What is your name? ");
        name = s.nextLine();
        System.out.println("Hello there, Mr/Miss "+ name);
    }
}