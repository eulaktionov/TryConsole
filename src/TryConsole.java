import  java.io.*;

public class TryConsole {
    public static void main(String[] args){
        System.out.println("Hey!");
        Console cons = System.console();
        char[] passwd;
        if (cons != null &&
            (passwd = cons.readPassword("[%s]", "Password:")) != null) {
            System.out.println();
            String s = new String(passwd);
            System.out.println(s);
            java.util.Arrays.fill(passwd, ' ');
        }
    }
}
