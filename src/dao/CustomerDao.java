package dao;

import conn.MysqlCon;
import entity.Customer;
import util.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class CustomerDao {


    public boolean addCustomer(Customer customer) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);

        try {
            String query = " insert into  " + Constants.CUSTOMER_TABLE + "  values (?, ?, ?, ?, ?, ?, ?, ?, ?)";

            // create the mysql insert preparedstatement
            PreparedStatement preparedStmt = con.prepareStatement(query);
            preparedStmt.setString(1, customer.getCustomerId());
            preparedStmt.setString(2, customer.getFirstName());
            preparedStmt.setString(3, customer.getLastName());
            preparedStmt.setString(4, customer.getPhoneNumber());
            preparedStmt.setString(5, customer.getAddress());
            preparedStmt.setString(6, customer.getGender());
            preparedStmt.setString(7, customer.getProfession());
            preparedStmt.setString(8, customer.getDoB());
            preparedStmt.setDouble(9, customer.getYearlySalary());

            // execute the preparedstatement
            preparedStmt.execute();

            return true;

        } catch (Exception e) {
            System.out.println("CUSTOMER-DAO :: " + e);
            return false;

        }

    }

    public boolean isPresent(String id) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        // int rowsAffected;
        try {

            String query = " Select customer_id from " + Constants.CUSTOMER_TABLE + " c where c.customer_id = " + id;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;

        } catch (Exception e) {
            System.out.println("CUSTOMER-DAO :: " + e);
            return false;

        }
    }

    public List<Integer> getCustomerIdList() {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        List<Integer> idList = new ArrayList();

        try {

            String query = "Select customer_id from " + Constants.CUSTOMER_TABLE + ";";
            Statement statement = con.createStatement();

            // execute the preparedstatement
            ResultSet rs = statement.executeQuery(query);

            while (rs.next()) {
                int id = rs.getInt("customer_id");
                System.out.println("CUSTOMER DAO ::" + id);
                idList.add(id);

            }

            return idList;
        } catch (Exception e) {
            System.out.println("CUSTOMER-DAO :: " + e);
            return null;

        }

    }

    public Customer getCustomer(String customerId) {
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        // int rowsAffected;
        try {

            String query = " Select * from " + Constants.CUSTOMER_TABLE + " c where c.customer_id = " + customerId;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {


                Customer customer = new Customer();
                customer.setFirstName(rs.getString("first_name"));
                customer.setLastName(rs.getString("last_name"));
                customer.setPhoneNumber(rs.getString("phone_number"));
                customer.setDoB(rs.getString("dob"));
                customer.setGender(rs.getString("gender"));
                return customer;
            }
            return null;

        } catch (Exception e) {
            System.out.println("CUSTOMER-DAO :: " + e);
            return null;

        }
    }

    public boolean checkPhoneNumber(String phNumber) {


        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        // int rowsAffected;
        try {

            String query = "Select customer_id from " + Constants.CUSTOMER_TABLE + " c where c.phone_number = " + phNumber;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            if (rs.next()) {
                return true;
            }
            return false;

        } catch (Exception e) {
            System.out.println("CUSTOMER-DAO :: " + e);
            return false;

        }

    }
    public boolean deleteCustomer(String customerId){
        Connection con = MysqlCon.getConnection();
        System.out.println(con);
        // int rowsAffected;
        try {

            String query = "DELETE from " + Constants.CUSTOMER_TABLE + " c where c.customer_id = " + customerId;
            PreparedStatement preparedStmt = con.prepareStatement(query);

            // execute the preparedstatement
            preparedStmt.executeUpdate();
            con.close();
           // con.commit();

            return true;

        } catch (Exception e) {
            System.out.println("CUSTOMER-DAO :: " + e);
            return false;

        }

    }
}
