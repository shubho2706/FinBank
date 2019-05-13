/*
 * Created by JFormDesigner on Sun May 12 16:36:53 IST 2019
 */

package controller.frames;

import service.AdminService;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.beans.PropertyChangeEvent;
import java.beans.PropertyChangeListener;


/**
 * @author Sunandan Bhakat
 */
public class AdminLoginForm extends JFrame {

    AdminService adminService = null;
    {
        adminService = new AdminService();
    }
    public AdminLoginForm() {
        initComponents();
    }

    private void button1MousePressed(MouseEvent e) {
        // TODO add your code here
    }

    private void signUpMousePressed(MouseEvent e) {
        // TODO add your code here

        // TODO add your code here
        String uName = userName.getText().trim();
        String pass = passwordField.getText().trim();
        if(validateAdmin(uName, pass)){
            //TODO go into home page
            AdminPanel adminPanel = new AdminPanel();
            //adminPanel.setCurrentUserName(uName);
            //frame.dispatchEvent(new WindowEvent(frame, WindowEvent.WINDOW_CLOSING));
            adminPanel.init();
        }
    }



    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Shubham
        background = new JPanel();
        leftpane = new JPanel();
        label2 = new JLabel();
        label6 = new JLabel();
        label7 = new JLabel();
        label8 = new JLabel();
        rightpane = new JPanel();
        label1 = new JLabel();
        label3 = new JLabel();
        userName = new JTextField();
        label4 = new JLabel();
        label5 = new JLabel();
        passwordField = new JPasswordField();
        signUp = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== background ========
        {
            background.setBackground(new Color(224, 224, 224));

            // JFormDesigner evaluation mark
            background.setBorder(new CompoundBorder(
                new TitledBorder(new EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", TitledBorder.CENTER,
                    TitledBorder.BOTTOM, new Font("Dialog", Font.BOLD, 12),
                    Color.red), background.getBorder())); background.addPropertyChangeListener(new PropertyChangeListener(){public void propertyChange(PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //======== leftpane ========
            {
                leftpane.setBackground(new Color(224, 224, 224));
                leftpane.setForeground(new Color(238, 238, 238));

                //---- label2 ----
                label2.setText("Banking Management System");
                label2.setFont(new Font("Segoe UI", Font.BOLD, 18));
                label2.setBackground(Color.black);
                label2.setForeground(Color.red);
                label2.setBorder(new LineBorder(Color.magenta, 2));
                label2.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label6 ----
                label6.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\bank2.png"));
                label6.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label7 ----
                label7.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\money.png"));
                label7.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label8 ----
                label8.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\people.png"));
                label8.setHorizontalAlignment(SwingConstants.CENTER);

                GroupLayout leftpaneLayout = new GroupLayout(leftpane);
                leftpane.setLayout(leftpaneLayout);
                leftpaneLayout.setHorizontalGroup(
                    leftpaneLayout.createParallelGroup()
                        .addGroup(leftpaneLayout.createSequentialGroup()
                            .addComponent(label7, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 44, Short.MAX_VALUE)
                            .addComponent(label8, GroupLayout.PREFERRED_SIZE, 185, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap())
                        .addGroup(GroupLayout.Alignment.TRAILING, leftpaneLayout.createSequentialGroup()
                            .addContainerGap(81, Short.MAX_VALUE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 281, GroupLayout.PREFERRED_SIZE)
                            .addGap(58, 58, 58))
                        .addGroup(leftpaneLayout.createSequentialGroup()
                            .addGap(98, 98, 98)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 215, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(107, Short.MAX_VALUE))
                );
                leftpaneLayout.setVerticalGroup(
                    leftpaneLayout.createParallelGroup()
                        .addGroup(leftpaneLayout.createSequentialGroup()
                            .addGap(22, 22, 22)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addGap(53, 53, 53)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 158, GroupLayout.PREFERRED_SIZE)
                            .addGap(43, 43, 43)
                            .addGroup(leftpaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(label7)
                                .addComponent(label8))
                            .addContainerGap(140, Short.MAX_VALUE))
                );
            }

            //======== rightpane ========
            {
                rightpane.setBackground(new Color(170, 0, 255));
                rightpane.setBorder(LineBorder.createBlackLineBorder());

                //---- label1 ----
                label1.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\admin.png"));
                label1.setHorizontalAlignment(SwingConstants.CENTER);

                //---- label3 ----
                label3.setText("Hi,There!");
                label3.setHorizontalAlignment(SwingConstants.CENTER);
                label3.setFont(new Font("Segoe UI", Font.BOLD, 20));
                label3.setForeground(Color.white);

                //---- userName ----
                userName.setForeground(Color.white);
                userName.setBackground(new Color(170, 0, 255));
                userName.setFont(new Font("Tahoma", Font.BOLD, 16));
                userName.setHorizontalAlignment(SwingConstants.LEFT);
                userName.setBorder(new MatteBorder(2, 2, 2, 2, new Color(255, 235, 59)));

                //---- label4 ----
                label4.setText("Enter Your User Name");
                label4.setHorizontalAlignment(SwingConstants.LEFT);
                label4.setFont(new Font("Verdana", Font.BOLD, 16));
                label4.setForeground(Color.white);

                //---- label5 ----
                label5.setText("Enter Password");
                label5.setHorizontalAlignment(SwingConstants.LEFT);
                label5.setFont(new Font("Verdana", Font.BOLD, 16));
                label5.setForeground(Color.white);

                //---- passwordField ----
                passwordField.setForeground(Color.white);
                passwordField.setBackground(new Color(170, 0, 255));
                passwordField.setFont(new Font("Tahoma", Font.BOLD, 16));
                passwordField.setBorder(new MatteBorder(2, 2, 2, 2, new Color(255, 235, 59)));

                //---- signUp ----
                signUp.setText("Sign In!");
                signUp.setBackground(new Color(57, 137, 186));
                signUp.setFocusPainted(false);
                signUp.setContentAreaFilled(false);
                signUp.setForeground(Color.white);
                signUp.setFont(new Font("Tahoma", Font.BOLD, 14));
                signUp.setBorder(new LineBorder(Color.white, 4, true));
                signUp.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        button1MousePressed(e);
                        signUpMousePressed(e);
                    }
                });

                GroupLayout rightpaneLayout = new GroupLayout(rightpane);
                rightpane.setLayout(rightpaneLayout);
                rightpaneLayout.setHorizontalGroup(
                    rightpaneLayout.createParallelGroup()
                        .addGroup(rightpaneLayout.createSequentialGroup()
                            .addGroup(rightpaneLayout.createParallelGroup()
                                .addGroup(rightpaneLayout.createSequentialGroup()
                                    .addGap(77, 77, 77)
                                    .addGroup(rightpaneLayout.createParallelGroup()
                                        .addComponent(label3, GroupLayout.PREFERRED_SIZE, 292, GroupLayout.PREFERRED_SIZE)
                                        .addGroup(rightpaneLayout.createSequentialGroup()
                                            .addGap(10, 10, 10)
                                            .addGroup(rightpaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 269, GroupLayout.PREFERRED_SIZE)
                                                .addGroup(rightpaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                                    .addComponent(label4, GroupLayout.DEFAULT_SIZE, 275, Short.MAX_VALUE)
                                                    .addComponent(userName))
                                                .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)
                                                .addComponent(signUp, GroupLayout.PREFERRED_SIZE, 275, GroupLayout.PREFERRED_SIZE)))))
                                .addGroup(rightpaneLayout.createSequentialGroup()
                                    .addGap(167, 167, 167)
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 96, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(71, Short.MAX_VALUE))
                );
                rightpaneLayout.setVerticalGroup(
                    rightpaneLayout.createParallelGroup()
                        .addGroup(rightpaneLayout.createSequentialGroup()
                            .addGap(37, 37, 37)
                            .addComponent(label1, GroupLayout.PREFERRED_SIZE, 80, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label3, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addGap(19, 19, 19)
                            .addComponent(label4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userName, GroupLayout.PREFERRED_SIZE, 39, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(label5, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(passwordField, GroupLayout.PREFERRED_SIZE, 40, GroupLayout.PREFERRED_SIZE)
                            .addGap(71, 71, 71)
                            .addComponent(signUp, GroupLayout.PREFERRED_SIZE, 49, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout backgroundLayout = new GroupLayout(background);
            background.setLayout(backgroundLayout);
            backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addComponent(leftpane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(rightpane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
            backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup()
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup()
                            .addComponent(leftpane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(rightpane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGap(0, 0, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Shubham
    private JPanel background;
    private JPanel leftpane;
    private JLabel label2;
    private JLabel label6;
    private JLabel label7;
    private JLabel label8;
    private JPanel rightpane;
    private JLabel label1;
    private JLabel label3;
    private JTextField userName;
    private JLabel label4;
    private JLabel label5;
    private JPasswordField passwordField;
    private JButton signUp;
    // JFormDesigner - End of variables declaration  //GEN-END:variables



    public void init() {

        JFrame frame = new JFrame("Admin Login");
        frame.setContentPane(new AdminLoginForm().background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*Code for Setting window size*/
        frame.setSize(880, 580);
        frame.setMaximumSize(new Dimension(880, 580));
        frame.setMinimumSize(new Dimension(880, 580));
        /*Code for Setting window size*/
        frame.pack();
        frame.setVisible(true);
    }

    private boolean validateAdminFields(String userName, String password) {
        if (userName.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide your User Name", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (password.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide your Password", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }



    private boolean validateAdmin(String userName, String password){
        boolean validAdmin = false;

        System.out.println("Inside Admin Login");
        System.out.println(userName);
        System.out.println(password);

        if (validateAdminFields(userName, password)) {
            if (adminService == null)
                adminService = new AdminService();
            System.out.println("Admin Validate Field is True");
            validAdmin = adminService.adminValidate(userName, password);
            System.out.println(validAdmin);
        }

        if (validAdmin) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Login Successful", "Alert", JOptionPane.WARNING_MESSAGE);
        }

        return validAdmin;

    }
}
