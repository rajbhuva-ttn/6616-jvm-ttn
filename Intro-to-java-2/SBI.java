
public class SBI extends Bank{
    public SBI(String name, acType accountType, double balance) {
        super(name, accountType, balance);
    }

    @Override
    public void getDetails() {
        this.rateOfInterest = 9.10;
        System.out.println("Rate of Interest in SBI = "+this.rateOfInterest);
    }

    @Override
    public void printDetails() {

        System.out.println(this.name+" has "+this.accountType+" account in SBI bank.");
    }
}
