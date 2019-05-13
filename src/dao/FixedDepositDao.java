package dao;

import conn.MysqlCon;
import entity.Customer;
import entity.FixedDeposit;
import util.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

public class FixedDepositDao {
    public boolean isPresent(String accountNumber) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        // int rowsAffected;
        try {

            String query = " Select account_number from " + Constants.FIXED_DEPOSIT_TABLE + " f where f.account_number = " + accountNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;

        } catch (Exception e) {
            System.out.println("fixed deposit-DAO :: " + e);
            return false;

        }

    }

    public List<String> getAccountNumberList(String customerId) {

        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        List<String> acNumberList = new ArrayList();

        try {

            String query = " Select account_number from " + Constants.FIXED_DEPOSIT_TABLE + " f where f.customer_id = " + customerId;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            while (rs.next()) {

                acNumberList.add(rs.getString("account_number"));

            }


        } catch (Exception e) {
            System.out.println("fixed deposit-DAO :: " + e);

        }
        return  acNumberList;
    }

    public boolean addAccount(FixedDeposit fixedDeposit) {


        Connection con = MysqlCon.getConnection();
        System.out.println(con);





        try {
            String query = "Insert into "+ Constants.FIXED_DEPOSIT_TABLE +" values (?, ?, ?, ?, ?,?,?,?)";
            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, fixedDeposit.getAccountNumber());
            preparedStmt.setString(2, fixedDeposit.getCustomer().getCustomerId());
            preparedStmt.setString(3, fixedDeposit.getAccountCreationDate());
            preparedStmt.setInt(4, fixedDeposit.getDurationInMonths());
            preparedStmt.setString(5, fixedDeposit.getMaturityDate());
            preparedStmt.setDouble(6, fixedDeposit.getInterestRate());
            preparedStmt.setDouble(7, fixedDeposit.getDepositBalance());
            preparedStmt.setDouble(8, fixedDeposit.getMaturityAmount());


            // execute the preparedstatement
            preparedStmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("fixed deposit-DAO :: " + e);
            return false;

        }

    }

    public FixedDeposit deleteAccount(String accountNumber) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);

        FixedDeposit fixedDeposit = getAccount(accountNumber);
        //int rowsAffected;
        try {

            String query = " DELETE from " + Constants.FIXED_DEPOSIT_TABLE + " f where f.account_number = " + accountNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
           // con.commit();
            /*if (rs.next()) {
                return true;
            }
            return false;
*/
        } catch (Exception e) {
            System.out.println("fixed deposit-DAO :: " + e);
//            return false;

        }
        return fixedDeposit;
    }

    private FixedDeposit getAccount(String accountNumber) {


        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        FixedDeposit fixedDeposit = new FixedDeposit();
        // int rowsAffected;
        try {

            String query = " Select * from " + Constants.FIXED_DEPOSIT_TABLE + " a where a.account_number = " + accountNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the prepared statement
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                fixedDeposit.setAccountNumber(rs.getString("account_number"));
                Customer customer = new Customer();
                customer.setCustomerId(rs.getString("customer_id"));
                fixedDeposit.setCustomer(customer);
                fixedDeposit.setAccountCreationDate(rs.getString("date_created"));
                fixedDeposit.setDurationInMonths(rs.getInt("duration_in_months"));
                fixedDeposit.setMaturityDate(rs.getString("maturity_date"));
                fixedDeposit.setInterestRate(rs.getDouble("interest_rate"));
                fixedDeposit.setDepositBalance(rs.getDouble("initial_balance"));
                fixedDeposit.setMaturityAmount(rs.getDouble("maturity_amount"));
                return fixedDeposit;
            }


        } catch (Exception e) {
            System.out.println("SAVINGS-DAO :: " + e);

        }

        return null;

    }
}
