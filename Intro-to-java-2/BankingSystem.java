
public class BankingSystem {
    public static void main(String[] args) {
        Bank b1 = new ICICI("Raj Bhuva", Bank.acType.SAVING,5000);
        b1.getDetails();
        b1.printDetails();
        b1.withdrawn(4000);
    }
}
