package dao;

import conn.MysqlCon;
import entity.Customer;
import entity.SavingsAccount;
import util.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class SavingsAccountDao {

    public boolean isPresent(String accountNumber) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        // int rowsAffected;
        try {

            String query = " Select account_number from " + Constants.SAVINGS_ACCOUNT_TABLE + " a where a.account_number = " + accountNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;

        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);
            return false;

        }
    }

    public boolean addAccount(SavingsAccount account) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);

        try {
            String query = "Insert into "+ Constants.SAVINGS_ACCOUNT_TABLE +" values (?, ?, ?, ?, ?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, account.getAccountNumber());
            preparedStmt.setString(2, account.getCustomer().getCustomerId());
            preparedStmt.setString(3, account.getDateCreated());
            preparedStmt.setDouble(4, account.getInterestRate());
            preparedStmt.setDouble(5, account.getCurrentBalance());


            // execute the preparedstatement
            preparedStmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);
            return false;

        }

    }

    public List<String> getAccountNumberList(String customerId) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        List<String> acNumberList = new ArrayList();

        try {

            String query = " Select account_number from " + Constants.SAVINGS_ACCOUNT_TABLE + " a where a.customer_id = " + customerId;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {

                acNumberList.add(rs.getString("account_number"));

            }


        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);

        }
            return  acNumberList;
    }

    public boolean debit(String fromAccountNumber, double currentBal, double transactionAmount) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);

        try {
            String query = "UPDATE " + Constants.SAVINGS_ACCOUNT_TABLE + " s SET s.current_balance=?"
                    + " WHERE s.account_number=?";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setDouble(1, (currentBal - transactionAmount));
            preparedStmt.setString(2, fromAccountNumber);
            preparedStmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);
            return false;

        }
    }

    public double getCurrentAccountBalance(String fromAccountNumber){
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        // int rowsAffected;
        try {

            String query = " Select current_balance from " + Constants.SAVINGS_ACCOUNT_TABLE + " a where a.account_number = " + fromAccountNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                double currentBal = rs.getDouble("current_balance");
                return currentBal;
            }


        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);
            return -1;

        }
        return -1;
    }

    public boolean credit(String accountNumber, double transactionAmount) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        double currentBalance = getCurrentAccountBalance(accountNumber);

        try {
            String query = "UPDATE " + Constants.SAVINGS_ACCOUNT_TABLE + " s SET s.current_balance=?"
                    + " WHERE s.account_number=?";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setDouble(1, ( currentBalance +transactionAmount));
            preparedStmt.setString(2, accountNumber);
            preparedStmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);
            return false;

        }
    }

    public SavingsAccount closeAccount(String accountNumber) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);

        SavingsAccount savingsAccount = getAccount(accountNumber);
        //int rowsAffected;
        try {

            String query = " DELETE from " + Constants.SAVINGS_ACCOUNT_TABLE + " a where a.account_number = " + accountNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            /*if (rs.next()) {
                return true;
            }
            return false;
*/
        } catch (Exception e) {
            System.out.println("fixed deposit-DAO :: " + e);
//            return false;

        }
        return savingsAccount;
    }

    private SavingsAccount getAccount(String accountNumber) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        SavingsAccount savingsAccount = new SavingsAccount();
        // int rowsAffected;
        try {

            String query = " Select * from " + Constants.SAVINGS_ACCOUNT_TABLE + " a where a.account_number = " + accountNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                savingsAccount.setAccountNumber(rs.getString("account_number"));
                Customer customer = new Customer();
                customer.setCustomerId(rs.getString("customer_id"));

                savingsAccount.setCustomer(customer);

                savingsAccount.setDateCreated(rs.getString("date_created"));

                savingsAccount.setInterestRate(rs.getDouble("interest_rate"));
                savingsAccount.setCurrentBalance(rs.getDouble("current_balance"));

                return savingsAccount;
            }


        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);

        }

        return null;

    }
}
