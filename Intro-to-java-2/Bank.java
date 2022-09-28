import javax.swing.plaf.TreeUI;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

public abstract class Bank {
    enum acType{
        SAVING("Saving"),
        CURRENT("Current");

        String name;

        acType(String name){
            this.name =name;
        }
    }
    private double balance;
    private double amount;
    protected String name;
    protected double rateOfInterest;
    protected acType accountType;


    public Bank(String name, acType accountType, double balance) {
        this.balance = balance;
        this.name = name;
        this.accountType = accountType;
    }

    abstract void getDetails();

    abstract void printDetails();
    protected boolean failure;
    public void withdrawn(double amount) throws InsufficientAmountException{


        if (amount>balance) {
                failure = true;
                Bank.saveData("Transaction failed");
                throw new InsufficientAmountException("Inefficient Balance!!!");
        }
        balance = balance - amount;

        System.out.println(balance);
    }
    public static void saveData(String filePath, String text) {
//        Path path = Paths.get("./saveData.txt");
//        try {
//            Files.writeString(path, data, StandardCharsets.UTF_8);
//            a
//        } catch (IOException e) {
//            System.out.println("INVALID PATH");
//        }
        File file = new File("append.txt");
        FileWriter fr = new FileWriter(file, true);
        fr.write("data");
        fr.close();
        try {
            // to append to file, you need to initialize FileWriter using below constructor
            fr = new FileWriter(file, true);
            br = new BufferedWriter(fr);
            pr = new PrintWriter(br);
            pr.println(text);
        } catch (IOException e) {
            e.printStackTrace();

    }
}
class InsufficientAmountException extends RuntimeException {
    String s;
    public InsufficientAmountException(String s) {
        this.s = s;
    }
}


