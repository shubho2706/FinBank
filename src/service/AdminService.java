package service;

import dao.LoginDao;

import javax.swing.*;

public class AdminService {

    private LoginDao loginDao=null;
    {
        loginDao = new LoginDao();
    }

    public boolean adminValidate(String userName, String password) {

        System.out.println("Inside Admin Validate");
        System.out.println(userName);
        System.out.println(password);

        if(loginDao.findAdminByUserName(userName))
        {
            System.out.println("Inside Valid UserName");
            if(loginDao.findAdmin(userName,password))
            {
                return true;
            }
            else
            {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "Invalid Password", "Alert", JOptionPane.WARNING_MESSAGE);
            }
        }
        else
        {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Invalid User Name", "Alert", JOptionPane.WARNING_MESSAGE);
        }

     return false;
    }
}
