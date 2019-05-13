package entity;

public class FixedDeposit  {

    private  String accountNumber;//
    private Customer customer;
    private double interestRate;//
    private double depositBalance;
    private String accountCreationDate;//
    private int durationInMonths;
    private double maturityAmount;
    private String maturityDate;

    public FixedDeposit() {
    }

    public FixedDeposit(String accountNumber, double interestRate, double depositBalance, String accountCreationDate) {
        this.accountNumber = accountNumber;
        this.interestRate = interestRate;
        this.depositBalance = depositBalance;
        this.accountCreationDate = accountCreationDate;
    }

    public String getMaturityDate() {
        return maturityDate;
    }

    public void setMaturityDate(String maturityDate) {
        this.maturityDate = maturityDate;
    }

    public int getDurationInMonths() {
        return durationInMonths;
    }

    public void setDurationInMonths(int durationInMonths) {
        this.durationInMonths = durationInMonths;
    }

    public double getMaturityAmount() {
        return maturityAmount;
    }

    public void setMaturityAmount(double maturityAmount) {
        this.maturityAmount = maturityAmount;
    }

    public double getDepositBalance() {
        return depositBalance;
    }

    public void setDepositBalance(double depositBalance) {
        this.depositBalance = depositBalance;
    }

    public String getAccountCreationDate() {
        return accountCreationDate;
    }

    public void setAccountCreationDate(String accountCreationDate) {
        this.accountCreationDate = accountCreationDate;
    }

    public String getAccountNumber() {
        return accountNumber;
    }

    public void setAccountNumber(String accountNumber) {
        this.accountNumber = accountNumber;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    public double getInterestRate() {
        return interestRate;
    }

    public void setInterestRate(double interestRate) {
        this.interestRate = interestRate;
    }


}
