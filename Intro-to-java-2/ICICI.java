public class ICICI extends Bank{
    public ICICI(String name, acType accountType, double balance) {
        super(name, accountType, balance);
    }


    @Override
    public void getDetails() {
        this.rateOfInterest = 11.10;
        System.out.println("Rate of Interest in ICICI = "+this.rateOfInterest);
    }

    @Override
    public void printDetails() {
        System.out.println(this.name+" has "+this.accountType+" account in ICICI bank.");
    }
}
