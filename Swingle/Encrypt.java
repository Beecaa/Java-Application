import java.util.Scanner;

public class Encrypt { // Corrected class declaration

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter a four-digit integer: ");
        int number = input.nextInt();

        // Encrypt the number
        int encryptedNumber = 0;
        for (int i = 0; i < 4; i++) {
            int digit = (number / (int) Math.pow(10, 3 - i)) % 10;
            digit = (digit + 7) % 10;
            encryptedNumber = encryptedNumber * 10 + digit;
        }

        // Swap the first and third digits, and the second and fourth digits
        encryptedNumber = (encryptedNumber / 1000) * 1000 + (encryptedNumber % 10) * 1000 +
                          (encryptedNumber / 100) % 10 * 10 + (encryptedNumber / 10) % 10;

        System.out.println("Encrypted number: " + encryptedNumber);

        input.close();
    }
}

 

 import java.util.Scanner;

public class Decrypt {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter an encrypted four-digit integer: ");
        int encryptedNumber = input.nextInt();

        // Swap the first and third digits, and the second and fourth digits
        encryptedNumber = (encryptedNumber / 1000) * 1000 + (encryptedNumber % 10) * 1000 +
                          (encryptedNumber / 100) % 10 * 10 + (encryptedNumber / 10) % 10;

        // Decrypt the number
        int decryptedNumber = 0;
        for (int i = 0; i < 4; i++) {
            int digit = (encryptedNumber / (int) Math.pow(10, 3 - i)) % 10;
            digit = (digit + 3) % 10; // Subtract 7 mod 10 is equivalent to adding 3 mod 10
            decryptedNumber = decryptedNumber * 10 + digit;
        }

        System.out.println("Decrypted number: " + decryptedNumber);

        input.close();
    }
}