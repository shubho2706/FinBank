/*
 * Created by JFormDesigner on Mon May 13 00:48:23 IST 2019
 */

package controller.frames;

import entity.Customer;
import entity.SavingsAccount;
import service.CustomerService;
import service.SavingsAccountService;
import util.Constants;
import util.Instances;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;
import java.text.DateFormat;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * @author Sunandan Bhakat
 */
public class SavingsAccountForm extends JFrame {
    private CustomerService customerService = null;
    private SavingsAccountService savingsAccountService = null;


    {
        customerService = new CustomerService();
        savingsAccountService = new SavingsAccountService();
    }

    public SavingsAccountForm() {
        initComponents();
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
        contentPanel = new JPanel();
        label2 = new JLabel();
        searchCustomer = new JPanel();
        label4 = new JLabel();
        customerId = new JTextField();
        search = new JButton();
        createSavingsAccount = new JPanel();
        label6 = new JLabel();
        phoneNumber = new JLabel();
        label11 = new JLabel();
        age = new JLabel();
        label12 = new JLabel();
        customerName = new JLabel();
        label13 = new JLabel();
        initialDeposit = new JTextField();
        label14 = new JLabel();
        interestRate = new JLabel();
        label16 = new JLabel();
        cancel = new JButton();
        submit = new JButton();
        interestRate2 = new JLabel();
        label15 = new JLabel();
        gender = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== background ========
        {
            background.setBackground(new Color(250, 250, 250));

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
                    label1.setIcon(new ImageIcon(getClass().getResource("/resource/home.png")));
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
                    createUserAction.setBackground(new Color(64, 43, 100));

                    //---- label3 ----
                    label3.setIcon(new ImageIcon(getClass().getResource("/resource/user.png")));
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
                    createAccountAction.setBackground(new Color(85, 65, 118));

                    //---- label5 ----
                    label5.setIcon(new ImageIcon(getClass().getResource("/resource/bank.png")));
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
                    label7.setIcon(new ImageIcon(getClass().getResource("/resource/moneyTransfer.png")));
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
                    label8.setIcon(new ImageIcon(getClass().getResource("/resource/searchTransaction.png")));
                    label8.setHorizontalAlignment(SwingConstants.CENTER);
                    label8.setForeground(Color.white);

                    //---- searchTransaction ----
                    searchTransaction.setText("Search Transaction");
                    searchTransaction.setForeground(new Color(204, 204, 204));
                    searchTransaction.setFont(new Font("Segoe UI", Font.BOLD, 16));
                    searchTransaction.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
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
                    label10.setIcon(new ImageIcon(getClass().getResource("/resource/deleteAccount.png")));
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
                                .addComponent(deleteAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
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
                            .addGroup(sidepaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(deleteAccountAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchTransactionAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createUserAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createAccountAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(transferMoneyAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(0, 22, Short.MAX_VALUE))
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
                            .addContainerGap(200, Short.MAX_VALUE))
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
                logOut.setIcon(new ImageIcon(getClass().getResource("/resource/lgout.png")));
                logOut.setHorizontalAlignment(SwingConstants.CENTER);
                logOut.setForeground(Color.white);
                logOut.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        logOutMousePressed(e);
                    }
                });

                GroupLayout navigationLayout = new GroupLayout(navigation);
                navigation.setLayout(navigationLayout);
                navigationLayout.setHorizontalGroup(
                    navigationLayout.createParallelGroup()
                        .addGroup(navigationLayout.createSequentialGroup()
                            .addGap(14, 14, 14)
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 71, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userName, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 421, Short.MAX_VALUE)
                            .addComponent(logOut, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))
                );
                navigationLayout.setVerticalGroup(
                    navigationLayout.createParallelGroup()
                        .addGroup(navigationLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(navigationLayout.createParallelGroup()
                                .addGroup(navigationLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(userName))
                                .addComponent(logOut, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(15, Short.MAX_VALUE))
                );
            }

            //======== contentPanel ========
            {
                contentPanel.setBackground(new Color(250, 250, 250));

                //---- label2 ----
                label2.setText("Savings Account Create Form");
                label2.setBackground(Color.white);
                label2.setForeground(new Color(255, 23, 68));
                label2.setHorizontalAlignment(SwingConstants.CENTER);
                label2.setFont(new Font("Segoe UI", Font.BOLD, 16));
                label2.setBorder(new LineBorder(Color.blue, 2, true));

                //======== searchCustomer ========
                {
                    searchCustomer.setBackground(new Color(255, 112, 67));
                    searchCustomer.setBorder(new LineBorder(new Color(213, 0, 0), 2));

                    //---- label4 ----
                    label4.setText("Customer Id: ");
                    label4.setBackground(Color.white);
                    label4.setForeground(Color.black);
                    label4.setHorizontalAlignment(SwingConstants.CENTER);
                    label4.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    label4.setBorder(null);

                    //---- customerId ----
                    customerId.setForeground(new Color(55, 71, 79));
                    customerId.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
                    customerId.setFont(new Font("Segoe UI", Font.PLAIN, 14));

                    //---- search ----
                    search.setText("Search");
                    search.setBackground(new Color(139, 195, 74));
                    search.setForeground(new Color(213, 0, 0));
                    search.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    search.setBorder(new LineBorder(Color.black, 2, true));
                    search.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            searchMousePressed(e);
                            searchMousePressed(e);
                        }
                    });

                    GroupLayout searchCustomerLayout = new GroupLayout(searchCustomer);
                    searchCustomer.setLayout(searchCustomerLayout);
                    searchCustomerLayout.setHorizontalGroup(
                        searchCustomerLayout.createParallelGroup()
                            .addGroup(searchCustomerLayout.createSequentialGroup()
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 186, GroupLayout.PREFERRED_SIZE)
                                .addGap(32, 32, 32)
                                .addComponent(customerId, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 69, Short.MAX_VALUE)
                                .addComponent(search, GroupLayout.PREFERRED_SIZE, 109, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                    );
                    searchCustomerLayout.setVerticalGroup(
                        searchCustomerLayout.createParallelGroup()
                            .addGroup(searchCustomerLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(searchCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerId)
                                    .addComponent(search, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addContainerGap(50, Short.MAX_VALUE))
                    );
                }

                //======== createSavingsAccount ========
                {
                    createSavingsAccount.setBackground(new Color(0, 229, 255));
                    createSavingsAccount.setBorder(new LineBorder(Color.blue, 2));

                    //---- label6 ----
                    label6.setText("Phone No:");
                    label6.setBackground(Color.white);
                    label6.setForeground(Color.black);
                    label6.setHorizontalAlignment(SwingConstants.CENTER);
                    label6.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    label6.setBorder(null);

                    //---- phoneNumber ----
                    phoneNumber.setBackground(Color.white);
                    phoneNumber.setForeground(new Color(245, 0, 87));
                    phoneNumber.setFont(new Font("Verdana", Font.BOLD, 16));
                    phoneNumber.setBorder(null);

                    //---- label11 ----
                    label11.setText("Age :");
                    label11.setBackground(Color.white);
                    label11.setForeground(Color.black);
                    label11.setHorizontalAlignment(SwingConstants.CENTER);
                    label11.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    label11.setBorder(null);

                    //---- age ----
                    age.setBackground(Color.white);
                    age.setForeground(new Color(245, 0, 87));
                    age.setFont(new Font("Verdana", Font.BOLD, 16));
                    age.setBorder(null);

                    //---- label12 ----
                    label12.setText("Customer Name:");
                    label12.setBackground(Color.white);
                    label12.setForeground(Color.black);
                    label12.setHorizontalAlignment(SwingConstants.CENTER);
                    label12.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    label12.setBorder(null);

                    //---- customerName ----
                    customerName.setBackground(Color.white);
                    customerName.setForeground(new Color(245, 0, 87));
                    customerName.setFont(new Font("Verdana", Font.BOLD, 16));
                    customerName.setBorder(null);

                    //---- label13 ----
                    label13.setText("Initial Deposit:");
                    label13.setBackground(Color.white);
                    label13.setForeground(Color.black);
                    label13.setHorizontalAlignment(SwingConstants.CENTER);
                    label13.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    label13.setBorder(null);

                    //---- initialDeposit ----
                    initialDeposit.setForeground(new Color(55, 71, 79));
                    initialDeposit.setBorder(new MatteBorder(1, 1, 1, 1, Color.black));
                    initialDeposit.setFont(new Font("Segoe UI Semibold", Font.BOLD, 14));

                    //---- label14 ----
                    label14.setText("Interest Rate: ");
                    label14.setBackground(Color.white);
                    label14.setForeground(Color.black);
                    label14.setHorizontalAlignment(SwingConstants.CENTER);
                    label14.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    label14.setBorder(null);

                    //---- interestRate ----
                    interestRate.setBackground(Color.white);
                    interestRate.setForeground(Color.red);
                    interestRate.setHorizontalAlignment(SwingConstants.LEFT);
                    interestRate.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    interestRate.setBorder(null);

                    //---- label16 ----
                    label16.setText("%");
                    label16.setBackground(Color.white);
                    label16.setForeground(Color.black);
                    label16.setHorizontalAlignment(SwingConstants.LEFT);
                    label16.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    label16.setBorder(null);

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

                    //---- submit ----
                    submit.setText("Create Account");
                    submit.setBackground(new Color(0, 200, 83));
                    submit.setForeground(Color.black);
                    submit.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    submit.setBorder(new LineBorder(Color.black, 2, true));
                    submit.setEnabled(false);
                    submit.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            submitMousePressed(e);
                        }
                    });

                    //---- interestRate2 ----
                    interestRate2.setText("INR");
                    interestRate2.setBackground(Color.white);
                    interestRate2.setForeground(new Color(109, 76, 65));
                    interestRate2.setHorizontalAlignment(SwingConstants.CENTER);
                    interestRate2.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    interestRate2.setBorder(null);

                    //---- label15 ----
                    label15.setText("Sex :");
                    label15.setForeground(Color.black);

                    //---- gender ----
                    gender.setForeground(new Color(255, 51, 51));

                    GroupLayout createSavingsAccountLayout = new GroupLayout(createSavingsAccount);
                    createSavingsAccount.setLayout(createSavingsAccountLayout);
                    createSavingsAccountLayout.setHorizontalGroup(
                        createSavingsAccountLayout.createParallelGroup()
                            .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                .addContainerGap()
                                .addGroup(createSavingsAccountLayout.createParallelGroup()
                                    .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                        .addComponent(label6, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(phoneNumber, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                        .addComponent(label11, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(age, GroupLayout.PREFERRED_SIZE, 161, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                        .addComponent(label12, GroupLayout.PREFERRED_SIZE, 144, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(customerName, GroupLayout.PREFERRED_SIZE, 248, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                        .addComponent(label13, GroupLayout.PREFERRED_SIZE, 138, GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addGroup(createSavingsAccountLayout.createParallelGroup()
                                            .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                                .addGroup(createSavingsAccountLayout.createParallelGroup()
                                                    .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                                        .addComponent(initialDeposit, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE)
                                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                        .addComponent(interestRate2, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                                                    .addComponent(submit, GroupLayout.PREFERRED_SIZE, 125, GroupLayout.PREFERRED_SIZE))
                                                .addGap(16, 16, 16)
                                                .addGroup(createSavingsAccountLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                    .addComponent(label14, GroupLayout.PREFERRED_SIZE, 108, GroupLayout.PREFERRED_SIZE)
                                                    .addComponent(cancel, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(interestRate, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE)
                                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                .addComponent(label16, GroupLayout.PREFERRED_SIZE, 29, GroupLayout.PREFERRED_SIZE))
                                            .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                                .addGap(204, 204, 204)
                                                .addComponent(label15)
                                                .addGap(39, 39, 39)
                                                .addComponent(gender, GroupLayout.PREFERRED_SIZE, 70, GroupLayout.PREFERRED_SIZE)))))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    createSavingsAccountLayout.setVerticalGroup(
                        createSavingsAccountLayout.createParallelGroup()
                            .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                .addGap(7, 7, 7)
                                .addGroup(createSavingsAccountLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addComponent(label12, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerName, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(createSavingsAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(phoneNumber, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGroup(createSavingsAccountLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                    .addGroup(createSavingsAccountLayout.createParallelGroup()
                                        .addComponent(label11, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(age, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(createSavingsAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label15)
                                        .addComponent(gender)))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(createSavingsAccountLayout.createParallelGroup()
                                    .addGroup(createSavingsAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(label13, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(initialDeposit, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(createSavingsAccountLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                        .addComponent(interestRate, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label16, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(label14, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                        .addComponent(interestRate2, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)))
                                .addGroup(createSavingsAccountLayout.createParallelGroup()
                                    .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 18, Short.MAX_VALUE)
                                        .addComponent(submit, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap())
                                    .addGroup(createSavingsAccountLayout.createSequentialGroup()
                                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cancel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                        .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                    );
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 277, GroupLayout.PREFERRED_SIZE)
                            .addGap(189, 189, 189))
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(searchCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addComponent(createSavingsAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addGap(30, 30, 30))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addContainerGap()
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(searchCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(createSavingsAccount, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
            }

            GroupLayout backgroundLayout = new GroupLayout(background);
            background.setLayout(backgroundLayout);
            backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup()
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(sidepane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(backgroundLayout.createParallelGroup()
                            .addComponent(navigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
            );
            backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup()
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(navigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentPanel, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(69, Short.MAX_VALUE))
                    .addComponent(sidepane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(background, GroupLayout.DEFAULT_SIZE, 878, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(background, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
        );
        pack();
        setLocationRelativeTo(getOwner());
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
    private JPanel contentPanel;
    private JLabel label2;
    private JPanel searchCustomer;
    private JLabel label4;
    private JTextField customerId;
    private JButton search;
    private JPanel createSavingsAccount;
    private JLabel label6;
    private JLabel phoneNumber;
    private JLabel label11;
    private JLabel age;
    private JLabel label12;
    private JLabel customerName;
    private JLabel label13;
    private JTextField initialDeposit;
    private JLabel label14;
    private JLabel interestRate;
    private JLabel label16;
    private JButton cancel;
    private JButton submit;
    private JLabel interestRate2;
    private JLabel label15;
    private JLabel gender;
    // JFormDesigner - End of variables declaration  //GEN-END:variables
    public void init() {

        JFrame frame = new JFrame("Savings Account Form");
        frame.setContentPane(new SavingsAccountForm().background);
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

    private void createUserMousePressed(MouseEvent e) {
        Instances.createUser.init();
    }

    private void createAccountMousePressed(MouseEvent e) {

        Instances.createAccount.init();
    }

    private void transferMoneyMousePressed(MouseEvent e) {
        Instances.moneyTransfer.init();
    }

    private void searchTransactionMousePressed(MouseEvent e) {
        Instances.searchTransaction.init();
    }

    private void deleteAccountMousePressed(MouseEvent e) {
        Instances.deleteAccount.init();
    }

    private void logOutMousePressed(MouseEvent e) {
        Instances.adminLoginForm.init();
    }

    private void searchMousePressed(MouseEvent e) {


        String customerId = SavingsAccountForm.this.customerId.getText().trim();
        if (customerIdValidate(customerId)) {
            Customer customer = customerService.getCustomer(customerId);
            if (customer == null) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "Customer id not found. Please Create Customer First", "Alert", JOptionPane.WARNING_MESSAGE);
            } else {
                customerName.setText(customer.getFirstName() + " " + customer.getLastName());
                phoneNumber.setText(customer.getPhoneNumber());
                gender.setText(customer.getGender());
//                System.out.println(customer.get);
                age.setText(calcAge(customer.getDoB()));
                interestRate.setText(String.valueOf(Constants.SAVINGS_INTEREST_RATE));


                submit.setEnabled(true);
                SavingsAccountForm.this.customerId.setEditable(false);
            }

        }
    }

    private void submitMousePressed(MouseEvent e) {

        if(customerId.getText().trim().length() !=0) {
            String initAmount = initialDeposit.getText().trim();
            if (amountValidate(initAmount)) {
                SavingsAccount account = new SavingsAccount();
                Customer customer = new Customer();
                customer.setCustomerId(SavingsAccountForm.this.customerId.getText().trim());
                account.setCustomer(customer);
                account.setCurrentBalance(Double.parseDouble(initAmount));
                if (savingsAccountService.addAccount(account)) {
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Savings Account Successfully Created ", "Alert", JOptionPane.WARNING_MESSAGE);
                    Instances.createAccount.init();
                    //TODO :: show the user details about the a/c
                } else {
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Internal Error. Try Again", "Alert", JOptionPane.WARNING_MESSAGE);
                }

            }
        }

    }
    private void cancelMousePressed(MouseEvent e) {
        Instances.createAccount.init();
    }

    private boolean amountValidate(String amtStr) {
        double amount = 0.0;
        if (amtStr.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide Initial Amount", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            amount = Double.parseDouble(amtStr);
        } catch (NumberFormatException e) {

            System.out.println(e);
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Invalid Initial Amount", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        if (amount < Constants.MINIMUM_ACCOUNT_BALANCE) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Minimum account balance is " + Constants.MINIMUM_ACCOUNT_BALANCE, "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }


    private boolean customerIdValidate(String customerId) {
        if (customerId.length() != 4) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Invalid Customer ID", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        try {

            Integer.parseInt(customerId);
        } catch (NumberFormatException e) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Invalid Customer ID", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }
        return true;
    }

    private String calcAge(String dobText){
        try {

            dobText = dobText.replace('.','/');
            dobText = dobText.replace('.','/');
            dobText = dobText.replace('-','/');
            dobText = dobText.replace('-','/');
            DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");

            Date currentDate = new Date();


            Date dobDate = dateFormat.parse(dobText);
            long diff = currentDate.getTime() - dobDate.getTime();
            long div = (long)1000 * 60 * 60 * 24 * 30 * 12L;
            int userAge = (int)(diff/div);
            System.out.println("age " + userAge);
            return userAge +"";

        } catch (ParseException e1) {
            e1.printStackTrace();
            return "---";
        }
    }
}
