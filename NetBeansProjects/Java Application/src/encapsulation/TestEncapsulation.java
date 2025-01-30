package encapsulation;
import java.util.Scanner;

public class TestEncapsulation {
    public static void main(String[] args){
        Scanner scan = new Scanner (System.in);
        
        /*System.out.print("Enter account number: ");
        String accountNumber = scan.nextLine();
        
        System.out.print("Enter account name: ");
        String accountName = scan.nextLine();
        
        System.out.print("Enter BVN: ");
        String bvn = scan.nextLine();
        
        System.out.print("Enter balance: ");
        double balance = scan.nextDouble();
        scan.nextLine();
        
        System.out.print("Enter account type: ");
        String accountType = scan.nextLine();*/
        
        System.out.println("===================================");
                
                
        EncapsulationPractice acct1 = new EncapsulationPractice("7087128008","Kim Mark");
        acct1.display();
        System.out.println("");
        
        EncapsulationPractice acct2 = new EncapsulationPractice("7087356008","Dan Ikechukwu");
        acct2.display();
        System.out.println("");
        
        EncapsulationPractice acct3 = new EncapsulationPractice("9187128008","Meg Mark");
        acct3.display();
    }
}