import javax.net.ssl.SNIHostName;

public class BankingSystem {
    public static void main(String[] args) throws InsufficientAmountException {
        Bank b1 = new ICICI("Raj Bhuva", Bank.acType.SAVING,5000);
        b1.getDetails();
        b1.printDetails();
        b1.withdrawn(6000);

        Bank b2 = new SBI("Ayush",Bank.acType.CURRENT,2000);
        b2.getDetails();
        b2.printDetails();
        b2.withdrawn(1000);

        Bank b4 = new SBI("Aman", Bank.acType.SAVING, 5000);
        b4.getDetails();
        b4.printDetails();
        b4.withdrawn(1000);

        Bank b3 = new BOI("Rahul", Bank.acType.SAVING, 6000);
        b3.getDetails();
        b3.printDetails();
        b3.withdrawn(6000);
    }
}
