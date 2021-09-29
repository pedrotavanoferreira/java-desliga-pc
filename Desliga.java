import java.io.*;
public class Desliga {  
    public static void main(String args[]) throws IOException {
        Runtime runtime = Runtime.getRuntime();
        System.out.print("Em 3 segundos o pc ira Desligar...");
        Process proc = runtime.exec("shutdown -s -t 3");
        System.exit(0);
    }
}