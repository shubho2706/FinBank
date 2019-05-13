/*
 * Created by JFormDesigner on Sun May 12 01:11:38 IST 2019
 */

package controller.frames;

import entity.Customer;
import service.CustomerService;
import util.Constants;
import util.Instances;

import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Sunandan Bhakat
 */
public class CreateUser extends JFrame {

    CustomerService customerService = null;

    {
        customerService = new CustomerService();
    }
    public CreateUser() {

        initComponents();
    }

    private void createUserMousePressed(MouseEvent e) {
        // TODO add your code here
    }




    private void initComponents() {
        // JFormDesigner - Component initialization - DO NOT MODIFY  //GEN-BEGIN:initComponents
        // Generated using JFormDesigner Evaluation license - Shubham
        background = new JPanel();
        sidepane = new JPanel();
        homeAction = new JPanel();
        label1 = new JLabel();
        home = new JLabel();
        createUserAction = new JPanel();
        label3 = new JLabel();
        createUser = new JLabel();
        createAccountAction = new JPanel();
        label5 = new JLabel();
        createAccount = new JLabel();
        transferMoneyAction = new JPanel();
        label7 = new JLabel();
        transferMoney = new JLabel();
        searchTransactionAction = new JPanel();
        label8 = new JLabel();
        searchTransaction = new JLabel();
        deleteAccountAction = new JPanel();
        label10 = new JLabel();
        deleteAccount = new JLabel();
        navigation = new JPanel();
        label9 = new JLabel();
        userName = new JLabel();
        logOut = new JLabel();
        mainContentPane = new JPanel();
        label2 = new JLabel();
        contentPanel = new JPanel();
        label4 = new JLabel();
        firstName = new JTextField();
        label6 = new JLabel();
        lastName = new JTextField();
        label11 = new JLabel();
        phoneNumber = new JTextField();
        label12 = new JLabel();
        male = new JRadioButton();
        female = new JRadioButton();
        others = new JRadioButton();
        label13 = new JLabel();
        scrollPane1 = new JScrollPane();
        address = new JTextArea();
        label14 = new JLabel();
        profession = new JTextField();
        yearlySalary = new JTextField();
        label15 = new JLabel();
        label16 = new JLabel();
        doB = new JTextField();
        submit = new JButton();
        cancel = new JButton();

        //======== this ========
        Container contentPane = getContentPane();

        //======== background ========
        {
            background.setBackground(Color.white);

            // JFormDesigner evaluation mark
            background.setBorder(new javax.swing.border.CompoundBorder(
                new javax.swing.border.TitledBorder(new javax.swing.border.EmptyBorder(0, 0, 0, 0),
                    "JFormDesigner Evaluation", javax.swing.border.TitledBorder.CENTER,
                    javax.swing.border.TitledBorder.BOTTOM, new java.awt.Font("Dialog", java.awt.Font.BOLD, 12),
                    java.awt.Color.red), background.getBorder())); background.addPropertyChangeListener(new java.beans.PropertyChangeListener(){public void propertyChange(java.beans.PropertyChangeEvent e){if("border".equals(e.getPropertyName()))throw new RuntimeException();}});


            //======== sidepane ========
            {
                sidepane.setBackground(new Color(54, 33, 89));

                //======== homeAction ========
                {
                    homeAction.setBackground(new Color(64, 43, 100));

                    //---- label1 ----
                    label1.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\home.png"));
                    label1.setHorizontalAlignment(SwingConstants.CENTER);
                    label1.setForeground(Color.white);

                    //---- home ----
                    home.setText("Home");
                    home.setForeground(new Color(204, 204, 204));
                    home.setFont(new Font("Segoe UI", Font.BOLD, 16));
                    home.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            homeMousePressed(e);
                        }
                    });

                    GroupLayout homeActionLayout = new GroupLayout(homeAction);
                    homeAction.setLayout(homeActionLayout);
                    homeActionLayout.setHorizontalGroup(
                        homeActionLayout.createParallelGroup()
                            .addGroup(homeActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label1, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(home, GroupLayout.PREFERRED_SIZE, 122, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    homeActionLayout.setVerticalGroup(
                        homeActionLayout.createParallelGroup()
                            .addGroup(homeActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(homeActionLayout.createParallelGroup()
                                    .addComponent(label1, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(home, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(7, Short.MAX_VALUE))
                    );
                }

                //======== createUserAction ========
                {
                    createUserAction.setBackground(new Color(85, 65, 118));

                    //---- label3 ----
                    label3.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\user.png"));
                    label3.setHorizontalAlignment(SwingConstants.CENTER);
                    label3.setForeground(Color.white);

                    //---- createUser ----
                    createUser.setText("Create User");
                    createUser.setForeground(new Color(204, 204, 204));
                    createUser.setFont(new Font("Segoe UI", Font.BOLD, 16));
                    createUser.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            createUserMousePressed(e);
                            createUserMousePressed(e);
                        }
                    });

                    GroupLayout createUserActionLayout = new GroupLayout(createUserAction);
                    createUserAction.setLayout(createUserActionLayout);
                    createUserActionLayout.setHorizontalGroup(
                        createUserActionLayout.createParallelGroup()
                            .addGroup(createUserActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label3, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(createUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    createUserActionLayout.setVerticalGroup(
                        createUserActionLayout.createParallelGroup()
                            .addGroup(createUserActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(createUserActionLayout.createParallelGroup()
                                    .addComponent(label3, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createUser, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(7, Short.MAX_VALUE))
                    );
                }

                //======== createAccountAction ========
                {
                    createAccountAction.setBackground(new Color(64, 43, 100));

                    //---- label5 ----
                    label5.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\bank.png"));
                    label5.setHorizontalAlignment(SwingConstants.CENTER);
                    label5.setForeground(Color.white);

                    //---- createAccount ----
                    createAccount.setText("Create Account");
                    createAccount.setForeground(new Color(204, 204, 204));
                    createAccount.setFont(new Font("Segoe UI", Font.BOLD, 16));
                    createAccount.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            createAccountMousePressed(e);
                            createAccountMousePressed(e);
                            createAccountMousePressed(e);
                        }
                    });

                    GroupLayout createAccountActionLayout = new GroupLayout(createAccountAction);
                    createAccountAction.setLayout(createAccountActionLayout);
                    createAccountActionLayout.setHorizontalGroup(
                        createAccountActionLayout.createParallelGroup()
                            .addGroup(createAccountActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label5, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(createAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    createAccountActionLayout.setVerticalGroup(
                        createAccountActionLayout.createParallelGroup()
                            .addGroup(createAccountActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(createAccountActionLayout.createParallelGroup()
                                    .addComponent(label5, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(createAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(7, Short.MAX_VALUE))
                    );
                }

                //======== transferMoneyAction ========
                {
                    transferMoneyAction.setBackground(new Color(64, 43, 100));

                    //---- label7 ----
                    label7.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\moneyTransfer.png"));
                    label7.setHorizontalAlignment(SwingConstants.CENTER);
                    label7.setForeground(Color.white);

                    //---- transferMoney ----
                    transferMoney.setText("Transfer Money");
                    transferMoney.setForeground(new Color(204, 204, 204));
                    transferMoney.setFont(new Font("Segoe UI", Font.BOLD, 16));
                    transferMoney.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            transferMoneyMousePressed(e);
                        }
                        @Override
                        public void mouseReleased(MouseEvent e) {
                            createAccountMousePressed(e);
                        }
                    });

                    GroupLayout transferMoneyActionLayout = new GroupLayout(transferMoneyAction);
                    transferMoneyAction.setLayout(transferMoneyActionLayout);
                    transferMoneyActionLayout.setHorizontalGroup(
                        transferMoneyActionLayout.createParallelGroup()
                            .addGroup(transferMoneyActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label7, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(transferMoney, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                    );
                    transferMoneyActionLayout.setVerticalGroup(
                        transferMoneyActionLayout.createParallelGroup()
                            .addGroup(transferMoneyActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(transferMoneyActionLayout.createParallelGroup()
                                    .addComponent(label7, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(transferMoney, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(7, Short.MAX_VALUE))
                    );
                }

                //======== searchTransactionAction ========
                {
                    searchTransactionAction.setBackground(new Color(64, 43, 100));

                    //---- label8 ----
                    label8.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\searchTransaction.png"));
                    label8.setHorizontalAlignment(SwingConstants.CENTER);
                    label8.setForeground(Color.white);

                    //---- searchTransaction ----
                    searchTransaction.setText("Search Transaction");
                    searchTransaction.setForeground(new Color(204, 204, 204));
                    searchTransaction.setFont(new Font("Segoe UI", Font.BOLD, 16));
                    searchTransaction.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            transferMoney2MousePressed(e);
                            searchTransactionMousePressed(e);
                        }
                    });

                    GroupLayout searchTransactionActionLayout = new GroupLayout(searchTransactionAction);
                    searchTransactionAction.setLayout(searchTransactionActionLayout);
                    searchTransactionActionLayout.setHorizontalGroup(
                        searchTransactionActionLayout.createParallelGroup()
                            .addGroup(searchTransactionActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label8, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(searchTransaction, GroupLayout.DEFAULT_SIZE, 0, Short.MAX_VALUE))
                    );
                    searchTransactionActionLayout.setVerticalGroup(
                        searchTransactionActionLayout.createParallelGroup()
                            .addGroup(searchTransactionActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(searchTransactionActionLayout.createParallelGroup()
                                    .addComponent(label8, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(searchTransaction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(7, Short.MAX_VALUE))
                    );
                }

                //======== deleteAccountAction ========
                {
                    deleteAccountAction.setBackground(new Color(64, 43, 100));

                    //---- label10 ----
                    label10.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\deleteAccount.png"));
                    label10.setHorizontalAlignment(SwingConstants.CENTER);
                    label10.setForeground(Color.white);

                    //---- deleteAccount ----
                    deleteAccount.setText("Delete Account");
                    deleteAccount.setForeground(new Color(204, 204, 204));
                    deleteAccount.setFont(new Font("Segoe UI", Font.BOLD, 16));
                    deleteAccount.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            deleteAccountMousePressed(e);
                        }
                    });

                    GroupLayout deleteAccountActionLayout = new GroupLayout(deleteAccountAction);
                    deleteAccountAction.setLayout(deleteAccountActionLayout);
                    deleteAccountActionLayout.setHorizontalGroup(
                        deleteAccountActionLayout.createParallelGroup()
                            .addGroup(deleteAccountActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addComponent(label10, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(deleteAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    deleteAccountActionLayout.setVerticalGroup(
                        deleteAccountActionLayout.createParallelGroup()
                            .addGroup(deleteAccountActionLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(deleteAccountActionLayout.createParallelGroup()
                                    .addComponent(label10, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(deleteAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addContainerGap(7, Short.MAX_VALUE))
                    );
                }

                GroupLayout sidepaneLayout = new GroupLayout(sidepane);
                sidepane.setLayout(sidepaneLayout);
                sidepaneLayout.setHorizontalGroup(
                    sidepaneLayout.createParallelGroup()
                        .addComponent(homeAction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(sidepaneLayout.createSequentialGroup()
                            .addGroup(sidepaneLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                                .addComponent(createUserAction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createAccountAction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(transferMoneyAction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(deleteAccountAction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchTransactionAction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(0, 0, Short.MAX_VALUE))
                );
                sidepaneLayout.setVerticalGroup(
                    sidepaneLayout.createParallelGroup()
                        .addGroup(sidepaneLayout.createSequentialGroup()
                            .addGap(78, 78, 78)
                            .addComponent(homeAction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(createUserAction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(createAccountAction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(transferMoneyAction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(searchTransactionAction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(deleteAccountAction, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(164, Short.MAX_VALUE))
                );
            }

            //======== navigation ========
            {
                navigation.setBackground(new Color(122, 72, 241));

                //---- label9 ----
                label9.setText("Welcome,");
                label9.setFont(new Font("Segoe UI", Font.BOLD, 14));
                label9.setBackground(Color.white);
                label9.setForeground(Color.white);
                label9.setHorizontalAlignment(SwingConstants.CENTER);

                //---- userName ----
                userName.setText("Sunandan");
                userName.setForeground(new Color(255, 255, 51));
                userName.setFont(new Font("Segoe UI", Font.BOLD, 14));

                //---- logOut ----
                logOut.setIcon(new ImageIcon("D:\\Coding Workspace\\Design Lab\\FinBank\\src\\resource\\lgout.png"));
                logOut.setHorizontalAlignment(SwingConstants.CENTER);
                logOut.setForeground(Color.white);

                GroupLayout navigationLayout = new GroupLayout(navigation);
                navigation.setLayout(navigationLayout);
                navigationLayout.setHorizontalGroup(
                    navigationLayout.createParallelGroup()
                        .addGroup(navigationLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userName, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 444, Short.MAX_VALUE)
                            .addComponent(logOut, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                            .addGap(10, 10, 10))
                );
                navigationLayout.setVerticalGroup(
                    navigationLayout.createParallelGroup()
                        .addGroup(navigationLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(navigationLayout.createParallelGroup()
                                .addComponent(logOut, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE)
                                .addGroup(navigationLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userName)))
                            .addContainerGap(15, Short.MAX_VALUE))
                );
            }

            //======== mainContentPane ========
            {
                mainContentPane.setBackground(Color.white);

                //---- label2 ----
                label2.setText("Customer Registration Form");
                label2.setBackground(new Color(3, 169, 244));
                label2.setForeground(new Color(255, 23, 68));
                label2.setHorizontalAlignment(SwingConstants.CENTER);
                label2.setFont(new Font("Segoe UI", Font.BOLD, 16));
                label2.setBorder(new LineBorder(Color.blue, 2, true));

                //======== contentPanel ========
                {
                    contentPanel.setBackground(new Color(97, 212, 195));

                    //---- label4 ----
                    label4.setText("First Name");
                    label4.setForeground(new Color(216, 27, 96));
                    label4.setFont(new Font("Segoe UI", Font.BOLD, 16));

                    //---- firstName ----
                    firstName.setFont(new Font("Segoe UI", Font.BOLD, 12));
                    firstName.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));

                    //---- label6 ----
                    label6.setText("Last Name");
                    label6.setForeground(new Color(216, 27, 96));
                    label6.setFont(new Font("Segoe UI", Font.BOLD, 16));

                    //---- lastName ----
                    lastName.setFont(new Font("Segoe UI", Font.BOLD, 12));
                    lastName.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));

                    //---- label11 ----
                    label11.setText("Phone Number");
                    label11.setForeground(new Color(216, 27, 96));
                    label11.setFont(new Font("Segoe UI", Font.BOLD, 16));

                    //---- phoneNumber ----
                    phoneNumber.setFont(new Font("Segoe UI", Font.BOLD, 12));
                    phoneNumber.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));

                    //---- label12 ----
                    label12.setText("Gender");
                    label12.setForeground(new Color(216, 27, 96));
                    label12.setFont(new Font("Segoe UI", Font.BOLD, 16));

                    //---- male ----
                    male.setText("Male");
                    male.setBackground(new Color(97, 212, 195));
                    male.setForeground(Color.black);
                    male.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    male.setSelected(true);

                    //---- female ----
                    female.setText("Female");
                    female.setForeground(Color.black);
                    female.setBackground(new Color(97, 212, 195));
                    female.setFont(new Font("Segoe UI", Font.BOLD, 14));

                    //---- others ----
                    others.setText("Others");
                    others.setBackground(new Color(97, 212, 195));
                    others.setForeground(Color.black);
                    others.setFont(new Font("Segoe UI", Font.BOLD, 14));

                    //---- label13 ----
                    label13.setText("Home Address");
                    label13.setForeground(new Color(216, 27, 96));
                    label13.setFont(new Font("Segoe UI", Font.BOLD, 16));

                    //======== scrollPane1 ========
                    {

                        //---- address ----
                        address.setFont(new Font("Segoe UI", Font.BOLD, 12));
                        address.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));
                        scrollPane1.setViewportView(address);
                    }

                    //---- label14 ----
                    label14.setText("Profession");
                    label14.setForeground(new Color(216, 27, 96));
                    label14.setFont(new Font("Segoe UI", Font.BOLD, 16));

                    //---- profession ----
                    profession.setFont(new Font("Segoe UI", Font.BOLD, 12));
                    profession.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));

                    //---- yearlySalary ----
                    yearlySalary.setFont(new Font("Segoe UI", Font.BOLD, 12));
                    yearlySalary.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));

                    //---- label15 ----
                    label15.setText("Yearly Salary");
                    label15.setForeground(new Color(216, 27, 96));
                    label15.setFont(new Font("Segoe UI", Font.BOLD, 16));

                    //---- label16 ----
                    label16.setText("DOB (dd/mm/yyyy)");
                    label16.setForeground(new Color(216, 27, 96));
                    label16.setFont(new Font("Segoe UI", Font.BOLD, 16));

                    //---- doB ----
                    doB.setFont(new Font("Segoe UI", Font.BOLD, 12));
                    doB.setBorder(new MatteBorder(2, 2, 2, 2, Color.black));

                    //---- submit ----
                    submit.setText("Submit");
                    submit.setBackground(new Color(139, 195, 74));
                    submit.setForeground(new Color(244, 67, 54));
                    submit.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    submit.setBorder(new LineBorder(Color.black, 2, true));
                    submit.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            submitMousePressed(e);
                        }
                    });

                    //---- cancel ----
                    cancel.setText("Cancel");
                    cancel.setBackground(new Color(244, 67, 54));
                    cancel.setForeground(Color.white);
                    cancel.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    cancel.setBorder(new LineBorder(Color.black, 2, true));
                    cancel.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            cancelMousePressed(e);
                        }
                    });

                    GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                    contentPanel.setLayout(contentPanelLayout);
                    contentPanelLayout.setHorizontalGroup(
                        contentPanelLayout.createParallelGroup()
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(22, 22, 22)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                        .addComponent(label4, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(firstName, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, 202, Short.MAX_VALUE)
                                        .addComponent(label11, GroupLayout.Alignment.LEADING, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(phoneNumber, GroupLayout.Alignment.LEADING)
                                        .addComponent(scrollPane1, GroupLayout.Alignment.LEADING))
                                    .addComponent(label13, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(doB, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label16, GroupLayout.PREFERRED_SIZE, 183, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addGroup(contentPanelLayout.createParallelGroup()
                                            .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                                                .addGroup(contentPanelLayout.createParallelGroup()
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(profession, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
                                                .addGap(102, 102, 102))
                                            .addGroup(contentPanelLayout.createSequentialGroup()
                                                .addGroup(contentPanelLayout.createParallelGroup()
                                                    .addComponent(label12, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                                        .addComponent(male, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(female, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                                        .addGap(18, 18, 18)
                                                        .addComponent(others, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(lastName, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(label15, GroupLayout.PREFERRED_SIZE, 135, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(yearlySalary, GroupLayout.PREFERRED_SIZE, 202, GroupLayout.PREFERRED_SIZE))
                                                .addGap(37, 37, 37))))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addGap(110, 110, 110)
                                        .addComponent(submit, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                        .addGap(37, 37, 37)
                                        .addComponent(cancel, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))))
                    );
                    contentPanelLayout.setVerticalGroup(
                        contentPanelLayout.createParallelGroup()
                            .addGroup(contentPanelLayout.createSequentialGroup()
                                .addGap(31, 31, 31)
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(lastName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label4, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(firstName, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(37, 37, 37)
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label11, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label12, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE))
                                .addGap(6, 6, 6)
                                .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(phoneNumber, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(male)
                                    .addComponent(female)
                                    .addComponent(others))
                                .addGap(28, 28, 28)
                                .addGroup(contentPanelLayout.createParallelGroup()
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label13, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(scrollPane1, GroupLayout.PREFERRED_SIZE, 82, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label16, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                            .addComponent(doB, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(submit, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                            .addComponent(cancel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(contentPanelLayout.createSequentialGroup()
                                        .addComponent(label14, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(profession, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(label15, GroupLayout.PREFERRED_SIZE, 27, GroupLayout.PREFERRED_SIZE)
                                        .addGap(6, 6, 6)
                                        .addComponent(yearlySalary, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                }

                GroupLayout mainContentPaneLayout = new GroupLayout(mainContentPane);
                mainContentPane.setLayout(mainContentPaneLayout);
                mainContentPaneLayout.setHorizontalGroup(
                    mainContentPaneLayout.createParallelGroup()
                        .addGroup(mainContentPaneLayout.createSequentialGroup()
                            .addGap(188, 188, 188)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addGroup(mainContentPaneLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addContainerGap())
                );
                mainContentPaneLayout.setVerticalGroup(
                    mainContentPaneLayout.createParallelGroup()
                        .addGroup(mainContentPaneLayout.createSequentialGroup()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addGap(12, 12, 12)
                            .addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout backgroundLayout = new GroupLayout(background);
            background.setLayout(backgroundLayout);
            backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup()
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(sidepane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup()
                            .addComponent(navigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(mainContentPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );
            backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup()
                    .addGroup(GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(navigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(mainContentPane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addComponent(sidepane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(GroupLayout.Alignment.TRAILING, contentPaneLayout.createSequentialGroup()
                    .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(background, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addContainerGap())
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(background, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(male);
        buttonGroup1.add(female);
        buttonGroup1.add(others);
        // JFormDesigner - End of component initialization  //GEN-END:initComponents
    }

    // JFormDesigner - Variables declaration - DO NOT MODIFY  //GEN-BEGIN:variables
    // Generated using JFormDesigner Evaluation license - Shubham
    private JPanel background;
    private JPanel sidepane;
    private JPanel homeAction;
    private JLabel label1;
    private JLabel home;
    private JPanel createUserAction;
    private JLabel label3;
    private JLabel createUser;
    private JPanel createAccountAction;
    private JLabel label5;
    private JLabel createAccount;
    private JPanel transferMoneyAction;
    private JLabel label7;
    private JLabel transferMoney;
    private JPanel searchTransactionAction;
    private JLabel label8;
    private JLabel searchTransaction;
    private JPanel deleteAccountAction;
    private JLabel label10;
    private JLabel deleteAccount;
    private JPanel navigation;
    private JLabel label9;
    private JLabel userName;
    private JLabel logOut;
    private JPanel mainContentPane;
    private JLabel label2;
    private JPanel contentPanel;
    private JLabel label4;
    private JTextField firstName;
    private JLabel label6;
    private JTextField lastName;
    private JLabel label11;
    private JTextField phoneNumber;
    private JLabel label12;
    private JRadioButton male;
    private JRadioButton female;
    private JRadioButton others;
    private JLabel label13;
    private JScrollPane scrollPane1;
    private JTextArea address;
    private JLabel label14;
    private JTextField profession;
    private JTextField yearlySalary;
    private JLabel label15;
    private JLabel label16;
    private JTextField doB;
    private JButton submit;
    private JButton cancel;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void init() {

        JFrame frame = new JFrame("New Customer Registration");
        frame.setContentPane(new CreateUser().background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*Code for Setting window size*/
        frame.setSize(880, 580);
        frame.setMaximumSize(new Dimension(880, 580));
        frame.setMinimumSize(new Dimension(880, 580));
        /*Code for Setting window size*/
        frame.pack();
        frame.setVisible(true);

    }


    private void homeMousePressed(MouseEvent e) {

        Instances.adminPanel.init();
    }

    private void createAccountMousePressed(MouseEvent e) {
        Instances.createAccount.init();
    }

/*    private void createUserMousePressed(MouseEvent e) {

        Instances.createUser.init();

    }*/

    private void transferMoneyMousePressed(MouseEvent e) {

        Instances.moneyTransfer.init();
    }

    private void searchTransactionMousePressed(MouseEvent e) {

        Instances.searchTransaction.init();
    }

    private void deleteAccountMousePressed(MouseEvent e) {

        Instances.deleteAccount.init();
    }

    private void transferMoney2MousePressed(MouseEvent e) {
// USeless
    }


    private void cancelMousePressed(MouseEvent e) {
        // TODO add your code here
        Instances.adminPanel.init();
    }

    private void submitMousePressed(MouseEvent e) {
        // TODO add your code here
        String fName = firstName.getText().trim();
        String lName = lastName.getText().trim();
        String phNumber = phoneNumber.getText().trim();
        String prof = profession.getText().trim();
        String doBText = doB.getText().trim();
        String yearlySalStr = yearlySalary.getText().trim();
        String gender = "";
        if (male.isEnabled()) {
            gender = Constants.MALE;
        } else if (female.isEnabled()) {
            gender = Constants.FEMALE;
        } else {
            gender = Constants.OTHERS;
        }

        String add = address.getText().trim();

        if (validateCustomer(fName, lName, prof, doBText, yearlySalStr, add, phNumber)) {

            double yearlySal = Double.parseDouble(yearlySalStr);
            Customer customer = new Customer(fName, lName, prof, doBText, add, phNumber, gender, yearlySal);
            if (customerService.addCustomer(customer)) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "Successfully Inserted.", "Alert", JOptionPane.WARNING_MESSAGE);
                Instances.adminPanel.init();
            } else {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "Internal Error. Try Again", "Alert", JOptionPane.WARNING_MESSAGE);

            }

        }
    }

    private boolean validateCustomer(String fName, String lName, String prof, String doBText, String yearlySalStr, String add, String phNumber) {
        //Presence validations
        if (fName.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide your First Name", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (lName.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide your Last Name", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (phNumber.length() != 10) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide valid Phone Number", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (add.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide your Address", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }



        if (prof.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide the profession", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;

        }

        if (doBText.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provice correct date", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (yearlySalStr.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide your Yearly Salary", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {
            Double.parseDouble(yearlySalStr);
        } catch (NumberFormatException e) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide proper Yearly Salary", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            Long.parseLong(phNumber);
        } catch (NumberFormatException e) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide proper Phone Number", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        //Extra validations

        //String dateRegex = "^(?:(?:31(\/|-|\.)(?:0?[13578]|1[02]))\1|(?:(?:29|30)(\/|-|\.)(?:0?[13-9]|1[0-2])\2))(?:(?:1[6-9]|[2-9]\d)?\d{2})$|^(?:29(\/|-|\.)0?2\3(?:(?:(?:1[6-9]|[2-9]\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\d|2[0-8])(\/|-|\.)(?:(?:0?[1-9])|(?:1[0-2]))\4(?:(?:1[6-9]|[2-9]\d)?\d{2})$";
        String dateRegex = "^(?:(?:31(\\/|-|\\.)(?:0?[13578]|1[02]|(?:Jan|Mar|May|Jul|Aug|Oct|Dec)))\\1|(?:(?:29|30)(\\/|-|\\.)(?:0?[1,3-9]|1[0-2]|(?:Jan|Mar|Apr|May|Jun|Jul|Aug|Sep|Oct|Nov|Dec))\\2))(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$|^(?:29(\\/|-|\\.)(?:0?2|(?:Feb))\\3(?:(?:(?:1[6-9]|[2-9]\\d)?(?:0[48]|[2468][048]|[13579][26])|(?:(?:16|[2468][048]|[3579][26])00))))$|^(?:0?[1-9]|1\\d|2[0-8])(\\/|-|\\.)(?:(?:0?[1-9]|(?:Jan|Feb|Mar|Apr|May|Jun|Jul|Aug|Sep))|(?:1[0-2]|(?:Oct|Nov|Dec)))\\4(?:(?:1[6-9]|[2-9]\\d)?\\d{2})$";
        if (!doBText.matches(dateRegex)) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provice correct date", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        if (customerService.checkPhoneNumber(phNumber)) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Phone Number is already in use", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }



}
