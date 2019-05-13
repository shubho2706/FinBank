package entity;

import util.Constants;

public class SavingsAccount   {
    private  String accountNumber;
    private Customer customer;
    private double interestRate;
    private String dateCreated;
    private double currentBalance;

    public SavingsAccount() {

        interestRate = Constants.SAVINGS_INTEREST_RATE;


    }
    public SavingsAccount(double currentBalance) {
        this.currentBalance = currentBalance;
    }

    public double getCurrentBalance() {
        return currentBalance;
    }

    public void setCurrentBalance(double currentBalance) {
        this.currentBalance = currentBalance;
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

    public String getDateCreated() {
        return dateCreated;
    }

    public void setDateCreated(String dateCreated) {
        this.dateCreated = dateCreated;
    }
}
