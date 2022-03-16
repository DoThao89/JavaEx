package accountpkg;

import bankpkg.Bank;
import bankpkg.ITransaction;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
public final class SavingAccount extends Account implements ITransaction{
    private double dailyinterest;
    private  int dayOfyear;

    public SavingAccount(String accountNumber,String accountHolderName,String accountType,double balance,int dayOfyear) {
        super(accountNumber,accountHolderName,accountType,balance);
        this.dayOfyear=dayOfyear;
    }
    public double calculateInterest(){
        dailyinterest=(super.getBalance() * Bank.interestRate/100)
                /dayOfyear;
        //return the two digit precision value by using instance of nested
        //class and its decimalsFormat() method
        return new Formatter().decimalFormat(dailyinterest);
    }
    /**
     * Dislays all datails of cuctomer
     * Overridden method
     * @return void
     */
    @Override
    public void displayDetails() {
        //invoke super class method
        super.displayDetails();
        //invoke clsulateinterest() method
        System.out.println("daily Interest is $" + calculateInterest());
        System.out.println("-----------------------------------------");
    }

    @Override
    public void checkBalance(String accountNumber){
        System.out.println("----------------------------");
        System.out.println("Available balance :$" + super.getBalance());
        System.out.println("-----------------------------");
    }

    @Override
    public void depositCash() {

    }

    @Override
    public void depositCash(String accountNumber, double amount) {
        //add the value of amount to the existing balance
        super.setBalance(super.getBalance() + amount);

        //
        // invoke nested class method formatfaet() uding the class instance
        System.out.println("Date-time" + new Formatter().formatDate());
        System.out.println("Amunt depositded:$" + amount);
        System.out.println("balnce affter deposit: $" + super.getBalance());
        System.out.println("-------------------------------------------");
    }

    @Override
    public void withdrawCash(String accountNumber, double amount) {
        //deduct the value of amount form the existing balance
        super.setBalance(super.getBalance()-amount);
        System.out.println("------------------------------");

        System.out.println("Date-tine:" + new Formatter().formatDate());
        System.out.println("Amount withdraw:$" + amount);
        System.out.println("Balance after withdrawal:$" + super.getBalance());
        System.out.println("------------------------------------------------");
    }
    /**
     * Nested class
     */
    class Formatter{
        /**
         * Formats the date
         * @return string
         *
         */
        public String formatDate(){
            //create calander calss instance
            Calendar objNow=Calendar.getInstance();
            //craete Simpledateformat class instace tpo set the date format
            SimpleDateFormat objFormat=new SimpleDateFormat("dd/MM/yyyy HH:mm:ss");
            //return the formated date using the format() method
            return objFormat.format(objNow.getTime());
        }
        /**
         * converts a double value tp two precision format
         * @return string
         */
        public double decimalFormat(double value){
            //instance class DecimalFormat to get two digit precision
            DecimalFormat twoFrom=new DecimalFormat("#0.0");
            //return the value digit precision value
            return Double.valueOf(twoFrom.format(value));
        }
    }
}
