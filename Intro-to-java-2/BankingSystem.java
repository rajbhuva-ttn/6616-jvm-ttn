
public class BankingSystem {
    public static void main(String[] args) {
        Bank b1 = new ICICI("Raj Bhuva", Bank.acType.SAVING,5000);
        b1.getDetails();
        b1.printDetails();
        b1.withdrawn(5000);

        Bank b2 = new SBI("Ayush",Bank.acType.CURRENT,2000);
        b2.getDetails();
        b2.printDetails();
        b2.withdrawn(1000);
        b2.withdrawn(100);

        Bank b3 = new BOI("Rahul", Bank.acType.SAVING, 6000);
        b3.getDetails();
        b3.printDetails();
        b3.withdrawn(6000);
    }
}
