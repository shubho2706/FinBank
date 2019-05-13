package service;

import dao.SavingsAccountDao;
import entity.SavingsAccount;
import util.Constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class SavingsAccountService {

    SavingsAccountDao savingsAccountDao = null;

    {
        savingsAccountDao = new SavingsAccountDao();
    }


    public String addAccount(SavingsAccount account) {
        account.setAccountNumber(getAccountNumber());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
        account.setDateCreated(dateFormat.format(date));
        if( savingsAccountDao.addAccount(account))
            return account.getAccountNumber();
        return null;

    }

    private String getAccountNumber() {


        //TODO :  to follow to specific bank a/c no pattern
        String accountNumber;
        do {
            Random random = new Random();
            accountNumber = Constants.BANK_CODE_SAVINGS + (random.nextInt(1000));
            System.out.println("ID ::" + accountNumber);

        } while (isPresent(accountNumber));
        return accountNumber;
    }


    public boolean isPresent(String accountNumber) {
        return savingsAccountDao.isPresent(accountNumber);
    }

    public String[] getAccountNumberList(String customerId) {

        List<String> list = savingsAccountDao.getAccountNumberList(customerId);
        return list.toArray(new String[list.size()]);
    }

    public boolean debit(String fromAccountNumber, double currentBal, double transactionAmount) {

        return savingsAccountDao.debit(fromAccountNumber, currentBal, transactionAmount);

    }

    public double getCurrentAccountBalance(String fromAccountNumber) {
        return savingsAccountDao.getCurrentAccountBalance(fromAccountNumber);
    }

    public boolean credit(String accountNumber, double transactionAmount) {
        return savingsAccountDao.credit(accountNumber, transactionAmount);
    }

    public SavingsAccount closeAccount(String accountNumber){
        SavingsAccount savingsAccount= savingsAccountDao.closeAccount(accountNumber);
        return savingsAccount;
    }
}
