import sun.jvm.hotspot.gc.parallel.PSYoungGen;
import java.io.Console;

import java.util.Scanner;

public class App<option> {
    Console myConsole = System.console();
    Cipher newCipher = new Cipher();
    System.out.println("Enter (1) for encryption or (2) for decryption");
    int option = sc.nextInt();

     if (option == 1) {
        System.out.println("Enter plaintext to be encrypted: ");
        String plaintext = sc.next();
        System.out.println("Enter encryption key: ");
        int key = sc.nextInt();
        System.out.println("Your Encrtypted text is: "+newCipher.encrypt(plaintext, key));
    }
        else if (option == 2) {
        System.out.println("Enter encrypted text for decryption: ");
        String plaintext = sc.next();
        System.out.println("Enter the decryption key: ");
        int key = sc.nextInt();
        System.out.println("Your decrypted text is: "+newCipher.encrypt(plaintext, 26-key));
    }
