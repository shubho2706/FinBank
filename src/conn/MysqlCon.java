package conn;

import util.Constants;

import java.sql.*;


//TODO : Connection pooling


public  class MysqlCon {

    //static Connection con = null;


    public static Connection getConnection() {

        Connection con = null;
        if (con == null) {
            try {
                Class.forName("com.mysql.jdbc.Driver");

                 con = DriverManager.getConnection("jdbc:mysql://localhost:3306/" + Constants.DATABASE_NAME, Constants.DB_USER_NAME, Constants.DB_PASSWORD);

                //System.out.printf(con.toString());
            } catch (Exception e) {
                System.out.println(e);
            }
        }

        return con;

    }

}
