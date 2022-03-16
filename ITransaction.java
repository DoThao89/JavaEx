package bankpkg;

public interface ITransaction {
    void checkBalance(String accountNumber);

    void depositCash();

    void depositCash(String accountNumber, double amount);

    void withdrawCash(String accountNumber, double amount);

    /**
     * @author vincent
     */
    public interface iTransaction {
        public void checkBalance(String accountNumber);
        public void depositCash(String accountNumber,double amount);
        public void withdrawCash(String accountNumber,double amount);
    }
}

