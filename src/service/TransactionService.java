package service;

import dao.TransactionDao;
import entity.Transaction;
import util.Constants;

import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class TransactionService {
    SavingsAccountService savingsAccountService = null;

    private TransactionDao transactionDao = null;
    private FixedDepositService fixedDepositService = null;

    {
        transactionDao = new TransactionDao();
        savingsAccountService = new SavingsAccountService();
        fixedDepositService = new FixedDepositService();
    }

    public boolean executeTransaction(Transaction transaction) {
        transaction.setTransactionId(getId());
        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date));
        transaction.setTransactionDate(dateFormat.format(date));
        if(transaction.getFromAccountNumber() != null && transaction.getToAccountNumber() != null)
            transaction.setTransactionMedium(Constants.TRANSACTION_MEDIUM_TRANSFER);
        else
            transaction.setTransactionMedium(Constants.TRANSACTION_MEDIUM_CASH);

        boolean transactionStatus = false;
        transactionDao.createTransaction(transaction);
        //deduct balance from the a/c &   add balance to the a/c


        /*

        FROM

         */


        if (transaction.getFromAccountNumber() != null && transaction.getFromAccountType() == Constants.SAVINGS_ACCOUNT_TYPE) {
            double currentBal = savingsAccountService.getCurrentAccountBalance(transaction.getFromAccountNumber());
            if (currentBal - transaction.getTransactionAmount() < Constants.MINIMUM_ACCOUNT_BALANCE) {

                transactionDao.failTransaction(transaction);
                return false;

            } else {

                transactionStatus = savingsAccountService.debit(transaction.getFromAccountNumber(), currentBal, transaction.getTransactionAmount());

            }
        } else if (transaction.getFromAccountNumber() != null && transaction.getFromAccountType() == Constants.FIXED_DEPOSIT_TYPE) {
            //last time when the FD is broken


            fixedDepositService.closeAccount(transaction.getFromAccountNumber());
            // Close the Fixed account and deposit to savings or cash

        }
/*
        TO*/


        if (transaction.getToAccountNumber() != null && transaction.getToAccountType() == Constants.SAVINGS_ACCOUNT_TYPE) {
            transactionStatus = savingsAccountService.credit(transaction.getToAccountNumber(), transaction.getTransactionAmount());


        } else if (transaction.getToAccountNumber() != null && transaction.getToAccountType() == Constants.FIXED_DEPOSIT_TYPE) {
            //first time when the FD is created
            transactionDao.commitTransaction(transaction);

            //TODO creating a fixed account from savings money and transferring to fixed deposit
        }
        if (transactionStatus) {
            transactionDao.commitTransaction(transaction);
            return true;
        }

        return false;
    }


    public boolean isPresent(String id) {
        return transactionDao.isPresent(id);
    }


    private String getId() {

        String id;
        do {
            Random random = new Random();
            id = String.format("%07d", random.nextInt(10000000));
            System.out.println("ID ::" + id);

        } while (isPresent(id));
        return id;
    }

    public String[][] getCreditMat(String accountNumber) {

        List<Transaction> list = transactionDao.getCreditList(accountNumber);
        int len = list.size();
        String[][] creditMat = new String[len][6];
        for (int i = 0; i < len; ++i) {
            Transaction trans = list.get(i);
            creditMat[i][0] = trans.getTransactionId();
            creditMat[i][1] = trans.getTransactionDate();
            creditMat[i][2] = trans.getTransactionMedium();
            creditMat[i][3] = String.valueOf(trans.getTransactionAmount());
            creditMat[i][4] = trans.getTransactionStatus();
            creditMat[i][5] = trans.getFromAccountNumber();

        }
        return creditMat;
    }

    public String[][] getDebitMat(String accountNumber) {

        List<Transaction> list = transactionDao.getDebitList(accountNumber);
        int len = list.size();
        String[][] debitMat = new String[len][6];
        for (int i = 0; i < len; ++i) {
            Transaction trans = list.get(i);
            debitMat[i][0] = trans.getTransactionId();
            debitMat[i][1] = trans.getTransactionDate();
            debitMat[i][2] = trans.getTransactionMedium();
            debitMat[i][3] = String.valueOf(trans.getTransactionAmount());
            debitMat[i][4] = trans.getTransactionStatus();
            debitMat[i][5] = trans.getToAccountNumber();

        }
        return debitMat;
    }
}
