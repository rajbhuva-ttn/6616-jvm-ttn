public class BOI extends Bank{
    public BOI(String name, acType accountType, double balance) {
        super(name, accountType, balance);
    }


    @Override
    public void getDetails() {
        this.rateOfInterest = 10.10;
        System.out.println("Rate of Interest in BOI = "+this.rateOfInterest);
    }

    @Override
    public void printDetails() {

        System.out.println(this.name+" has "+this.accountType+" account in BOI bank.");
    }
}
