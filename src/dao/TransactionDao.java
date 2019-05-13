package dao;

import conn.MysqlCon;
import entity.Transaction;
import util.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class TransactionDao {


    public boolean createTransaction(Transaction transaction) {

        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        String query = "";

        try {
            if (transaction.getFromAccountNumber() != null && transaction.getToAccountNumber() != null)
                query = "Insert into " + Constants.TRANSACTION_TABLE + " values (?, ?, ?, ?, ?, ?, ?, ?, ?)";
            else {
                query = "Insert into " + Constants.TRANSACTION_TABLE + " values (?, ?, ?, ?, ?, ?, ?)";
            }
            // create the mysql insert prepared statement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, transaction.getTransactionId());
            preparedStmt.setString(2, transaction.getTransactionDate());
            preparedStmt.setString(3, transaction.getTransactionMedium());
            preparedStmt.setDouble(4, transaction.getTransactionAmount());
            preparedStmt.setString(5, Constants.TRANSACTION_STATUS_CREATED);

            if (transaction.getFromAccountNumber() != null) {
                preparedStmt.setString(6, transaction.getFromAccountNumber());
                preparedStmt.setString(8, transaction.getFromAccountType());
            }
            if (transaction.getToAccountNumber() != null) {
                preparedStmt.setString(7, transaction.getToAccountNumber());
                preparedStmt.setString(9, transaction.getToAccountType());
            }


            // execute the prepared statement
            preparedStmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);
            return false;

        }
    }

    public boolean commitTransaction(Transaction transaction) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);

        try {
            String query = "UPDATE " + Constants.TRANSACTION_TABLE + " t SET t.transaction_commited=" + Constants.TRANSACTION_STATUS_COMMITTED
                    + " WHERE t.transaction_id=?";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, transaction.getTransactionId());
            preparedStmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);
            return false;

        }
    }

    public boolean failTransaction(Transaction transaction) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);

        try {
            String query = "UPDATE " + Constants.TRANSACTION_TABLE + " t SET t.transaction_commited=" + Constants.TRANSACTION_STATUS_FAILED
                    + " WHERE t.transaction_id=?";

            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, transaction.getTransactionId());
            preparedStmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);
            return false;

        }
    }

    public boolean isPresent(String id) {

        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        // int rowsAffected;
        try {

            String query = " Select transaction_id from " + Constants.TRANSACTION_TABLE + " t where t.transaction_id = " + id;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;

        } catch (Exception e) {
            System.out.println("Transaction-DAO :: " + e);
            return false;

        }
    }

    public List<Transaction> getCreditList(String accountNumber) {

        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        List<Transaction> list = new ArrayList();

        try {

            String query = " Select * from " + Constants.TRANSACTION_TABLE + " f where f.to_account_number = " + accountNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {

                Transaction transaction = new Transaction();
                transaction.setTransactionId(rs.getString("transaction_id"));
                transaction.setTransactionDate(rs.getString("transaction_date"));
                transaction.setTransactionMedium(rs.getString("transaction_medium"));
                transaction.setTransactionAmount(rs.getDouble("transaction_amount"));
                transaction.setTransactionStatus(rs.getString("transaction_status"));
                transaction.setFromAccountNumber(rs.getString("from_account_number"));

                list.add(transaction);
            }


        } catch (Exception e) {
            System.out.println("fixed deposit-DAO :: " + e);

        }
        return  list;


    }

    public List<Transaction> getDebitList(String accountNumber) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        List<Transaction> list = new ArrayList();

        try {

            String query = " Select * from " + Constants.TRANSACTION_TABLE + " f where f.from_account_number = " + accountNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {

                Transaction transaction = new Transaction();
                transaction.setTransactionId(rs.getString("transaction_id"));
                transaction.setTransactionDate(rs.getString("transaction_date"));
                transaction.setTransactionMedium(rs.getString("transaction_medium"));
                transaction.setTransactionAmount(rs.getDouble("transaction_amount"));
                transaction.setTransactionStatus(rs.getString("transaction_status"));
                transaction.setToAccountNumber(rs.getString("to_account_number"));

                list.add(transaction);
            }


        } catch (Exception e) {
            System.out.println("TRANSACTION-DAO :: " + e);

        }
        return  list;

    }
}
