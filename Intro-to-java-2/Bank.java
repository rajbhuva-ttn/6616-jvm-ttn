
import java.io.FileOutputStream;
import java.io.IOException;
import java.nio.charset.StandardCharsets;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.time.LocalDateTime;

import java.util.*;

import static java.nio.file.StandardOpenOption.*;

public abstract class Bank {
    enum acType {
        SAVING("Saving"),
        CURRENT("Current");
        String name;
        acType(String name) {
            this.name = name;
        }
    }

    private double balance;
//    private double amount;
    protected String name;
    protected double rateOfInterest;
    protected acType accountType;
    protected long acNumber;
    protected static int count = 1000;
    Random random = new Random();
    protected static String path;
    public Bank(String name, acType accountType, double balance) {
        this.balance = balance;
        this.name = name;
        this.accountType = accountType;
        this.acNumber = count;
        count++;
        path = "./"+this.getClass().getName()+".txt";

    }

    abstract void getDetails();

    abstract void printDetails();

//    protected boolean failure;

    public void withdrawn(double amount) {

        LocalDateTime now = LocalDateTime.now();
        if (amount > balance) {

            try{
                Bank.saveData("Bank Name : "+this.getClass().getName()+"\nAcNumber : "+this.acNumber+"\nName :"+name+"\nTime ="+now+"\namount withdrawn:"+amount+"\nBalance :"+balance+"T\nTransaction Failed\nReason : Insufficient Balance\n\n");

                throw new InsufficientAmountException("Inefficient Balance!!!\n");

            }
            catch(InsufficientAmountException e) {
                System.out.println(e.getMessage());
            }
        }
        else {


            Bank.saveData("Bank Name : " + this.getClass().getName() + "\nAcNumber : " + this.acNumber+"\nName :"+name+"\nTime =" + now + "\nBalance before deduction: " + balance + "\nAmount withdrawn :" + amount + "\nCurrent Balance:" + (balance - amount) + "\nTransaction Successful\n\n");
            balance = balance - amount;

            System.out.println("Withdrawn Successful\n");
        }
    }

    public static void saveData(String data) {
        Path pathToSave = Paths.get(path);
        try {
            Files.writeString(pathToSave, data, CREATE,APPEND);

        } catch (IOException e) {
            System.out.println("INVALID PATH");
        }

    }
}
class InsufficientAmountException extends Exception {
    String s;
    public InsufficientAmountException(String s) {
        super(s);
    }
}


