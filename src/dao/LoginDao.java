package dao;


import conn.MysqlCon;
import util.Constants;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    public boolean findAdminByUserName(String userName) {

        Connection conn= MysqlCon.getConnection();
        System.out.println(conn);


            try {

                String query = " Select admin_id from "+ Constants.ADMIN_TABLE +" a where a.admin_id=? ";

                PreparedStatement preparedStmt = conn.prepareStatement(query);
                preparedStmt.setString(1,userName);

                // execute the preparedstatement
                ResultSet rs = preparedStmt.executeQuery();
                if(rs.next()){
                    return true;
                }
                return false;

            } catch (Exception e) {
                System.out.println("Login DAO :: " + e);
                return false;

            }


    }

    public boolean findAdmin(String userName, String password) {

        Connection conn= MysqlCon.getConnection();
        System.out.println(conn);


        try {

            String query = " Select admin_id,password from "+ Constants.ADMIN_TABLE +" a where a.admin_id=? and a.password=?";

            PreparedStatement preparedStmt = conn.prepareStatement(query);
            preparedStmt.setString(1,userName);
            preparedStmt.setString(2,password);

            // execute the preparedstatement
            ResultSet rs = preparedStmt.executeQuery();
            if(rs.next()){
                return true;
            }
            return false;

        } catch (Exception e) {
            System.out.println("Admin DAO :: " + e);
            return false;

        }



    }
}
