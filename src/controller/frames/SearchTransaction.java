/*
 * Created by JFormDesigner on Sun May 12 02:36:42 IST 2019
 */

package controller.frames;

import javax.swing.table.*;
import entity.Customer;
import entity.Transaction;
import service.CustomerService;
import service.SavingsAccountService;
import service.TransactionService;
import util.Constants;
import util.Instances;

import java.awt.*;
import java.awt.event.*;
import java.util.Vector;
import javax.swing.*;
import javax.swing.GroupLayout;
import javax.swing.border.*;

/**
 * @author Sunandan Bhakat
 */
public class SearchTransaction extends JFrame {
    private CustomerService customerService = null;
    private SavingsAccountService savingsAccountService = null;
    private TransactionService transactionService = null;
    {
        customerService = new CustomerService();
        savingsAccountService = new SavingsAccountService();
        transactionService = new TransactionService();
    }
    public SearchTransaction() {
        initComponents();
    }

    private void searchCustMousePressed(MouseEvent e) {

        savingsAccCombo.removeAllItems();
        // TODO add your code here
        String customerId = SearchTransaction.this.customerId.getText().trim();
        if (customerIdValidate(customerId)) {
            Customer customer = customerService.getCustomer(customerId);
            if (customer == null) {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, "Customer id not found. Please Create Customer First", "Alert", JOptionPane.WARNING_MESSAGE);
            } else {
                //Add to the combo box
                String arrAcc[] = savingsAccountService.getAccountNumberList(customerId);
                for (String accNo : arrAcc) {
                    savingsAccCombo.addItem(accNo);
                }
                SearchTransaction.this.customerId.setEditable(false);

            }

        }
    }

    private void searchTransMousePressed(MouseEvent e) {

        //TODO  credit
        //String customerId = SearchTransaction.this.customerId.getText().trim();
        String accountNumber = savingsAccCombo.getSelectedItem().toString();


        String[][] creditMat = transactionService.getCreditMat(accountNumber);
        String creditHead[] = {"Transaction ID", "Transaction Date", "Transaction Medium", "Transaction Amount",
                "Transaction Status", "From Account Number"};

        System.out.println(creditMat.length);







        DefaultTableModel dm = new DefaultTableModel(0, 0);
        dm.setColumnIdentifiers(creditHead);
        creditTable.setModel(dm);

        for (int i = 0; i < creditMat.length; ++i) {

            Vector<Object> data = new Vector<Object>();
            data.add(creditMat[i][0]);
            data.add(creditMat[i][1]);
            data.add(creditMat[i][2]);
            data.add(creditMat[i][3]);
            data.add(creditMat[i][4]);
            data.add(creditMat[i][5]);
            dm.addRow(data);

        }

        //TODO DEBIT
         String[][] debitMat =transactionService.getDebitMat(accountNumber);
        String debitHead[] = {"Transaction ID", "Transaction Date" , "Transaction Medium" , "Transaction Amount",
                "Transaction Status", "To Account Number"};






        DefaultTableModel dm1 = new DefaultTableModel(0, 0);
        dm1.setColumnIdentifiers(debitHead);
        debitTable.setModel(dm1);

        System.out.println("--" + debitMat.length);
        for (int i = 0; i < debitMat.length; ++i) {

            Vector<Object> data = new Vector<Object>();
            data.add(debitMat[i][0]);
            data.add(debitMat[i][1]);
            data.add(debitMat[i][2]);
            data.add(debitMat[i][3]);
            data.add(debitMat[i][4]);
            data.add(debitMat[i][5]);
            dm1.addRow(data);

        }




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
        searchCust = new JButton();
        label15 = new JLabel();
        savingsAccCombo = new JComboBox();
        searchTrans = new JButton();
        scrollPane2 = new JScrollPane();
        debitTable = new JTable();
        scrollPane3 = new JScrollPane();
        creditTable = new JTable();

        //======== this ========
        setUndecorated(true);
        setLocationByPlatform(true);
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
                    createAccountAction.setBackground(new Color(64, 43, 100));

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
                    searchTransactionAction.setBackground(new Color(85, 65, 118));

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
                                .addComponent(searchTransaction, GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE))
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
                        .addGroup(sidepaneLayout.createSequentialGroup()
                            .addGroup(sidepaneLayout.createParallelGroup(GroupLayout.Alignment.TRAILING, false)
                                .addComponent(deleteAccountAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchTransactionAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createUserAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(createAccountAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(transferMoneyAction, GroupLayout.Alignment.LEADING, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(homeAction, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                            .addContainerGap(9, Short.MAX_VALUE))
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
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
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
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 409, Short.MAX_VALUE)
                            .addComponent(logOut, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                            .addGap(45, 45, 45))
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

                //---- label2 ----
                label2.setText("Search Transaction");
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

                    //---- searchCust ----
                    searchCust.setText("Search Customer");
                    searchCust.setBackground(new Color(139, 195, 74));
                    searchCust.setForeground(new Color(213, 0, 0));
                    searchCust.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    searchCust.setBorder(new LineBorder(Color.black, 2, true));
                    searchCust.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            searchCustMousePressed(e);
                        }
                    });

                    //---- label15 ----
                    label15.setText("Choose Saving's Account No:");
                    label15.setBackground(Color.white);
                    label15.setForeground(Color.black);
                    label15.setHorizontalAlignment(SwingConstants.CENTER);
                    label15.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    label15.setBorder(null);

                    //---- savingsAccCombo ----
                    savingsAccCombo.setFont(new Font("Segoe UI", Font.BOLD, 12));
                    savingsAccCombo.setBackground(Color.white);

                    //---- searchTrans ----
                    searchTrans.setText("Search Transaction");
                    searchTrans.setBackground(new Color(139, 195, 74));
                    searchTrans.setForeground(new Color(213, 0, 0));
                    searchTrans.setFont(new Font("Segoe UI", Font.BOLD, 14));
                    searchTrans.setBorder(new LineBorder(Color.black, 2, true));
                    searchTrans.addMouseListener(new MouseAdapter() {
                        @Override
                        public void mousePressed(MouseEvent e) {
                            searchTransMousePressed(e);
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
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(searchCust, GroupLayout.PREFERRED_SIZE, 159, GroupLayout.PREFERRED_SIZE)
                                .addGap(36, 36, 36))
                            .addGroup(searchCustomerLayout.createSequentialGroup()
                                .addGroup(searchCustomerLayout.createParallelGroup()
                                    .addGroup(searchCustomerLayout.createSequentialGroup()
                                        .addGap(45, 45, 45)
                                        .addComponent(label15, GroupLayout.PREFERRED_SIZE, 206, GroupLayout.PREFERRED_SIZE)
                                        .addGap(46, 46, 46)
                                        .addComponent(savingsAccCombo, GroupLayout.PREFERRED_SIZE, 189, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(searchCustomerLayout.createSequentialGroup()
                                        .addGap(244, 244, 244)
                                        .addComponent(searchTrans, GroupLayout.PREFERRED_SIZE, 168, GroupLayout.PREFERRED_SIZE)))
                                .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    );
                    searchCustomerLayout.setVerticalGroup(
                        searchCustomerLayout.createParallelGroup()
                            .addGroup(searchCustomerLayout.createSequentialGroup()
                                .addGap(37, 37, 37)
                                .addGroup(searchCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(label4, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(customerId)
                                    .addComponent(searchCust, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                .addGroup(searchCustomerLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(savingsAccCombo, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                    .addComponent(label15, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE))
                                .addGap(4, 4, 4)
                                .addComponent(searchTrans, GroupLayout.PREFERRED_SIZE, 37, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                    );
                }

                //======== scrollPane2 ========
                {

                    //---- debitTable ----
                    debitTable.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                        },
                        new String[] {
                            "Transaction ID", "Transaction Date", "Transaction Medium", "Transaction Amount", "Transaction Status", "To Account Number"
                        }
                    ));
                    scrollPane2.setViewportView(debitTable);
                }

                //======== scrollPane3 ========
                {

                    //---- creditTable ----
                    creditTable.setModel(new DefaultTableModel(
                        new Object[][] {
                            {null, null, null, null, null, null},
                            {null, null, null, null, null, null},
                        },
                        new String[] {
                            "Transaction ID", "Transaction Date", "Transaction Medium", "Transaction Amount", "Transaction Status", "To Account Number"
                        }
                    ));
                    scrollPane3.setViewportView(creditTable);
                }

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addComponent(searchCustomer, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGap(38, 38, 38))
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(161, 161, 161)
                                    .addComponent(label2, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addContainerGap()
                                    .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE))
                                .addGroup(contentPanelLayout.createSequentialGroup()
                                    .addGap(15, 15, 15)
                                    .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 640, GroupLayout.PREFERRED_SIZE)))
                            .addContainerGap(GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(18, 18, 18)
                            .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(searchCustomer, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addComponent(scrollPane3, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE)
                            .addComponent(scrollPane2, GroupLayout.PREFERRED_SIZE, 72, GroupLayout.PREFERRED_SIZE)
                            .addGap(54, 54, 54))
                );
            }

            GroupLayout backgroundLayout = new GroupLayout(background);
            background.setLayout(backgroundLayout);
            backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup()
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(sidepane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(backgroundLayout.createParallelGroup(GroupLayout.Alignment.LEADING, false)
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addComponent(navigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                                .addContainerGap())
                            .addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
            );
            backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup()
                    .addComponent(sidepane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(navigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(contentPanel, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addGroup(contentPaneLayout.createSequentialGroup()
                    .addComponent(background, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                    .addGap(0, 0, Short.MAX_VALUE))
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
    private JButton searchCust;
    private JLabel label15;
    private JComboBox savingsAccCombo;
    private JButton searchTrans;
    private JScrollPane scrollPane2;
    private JTable debitTable;
    private JScrollPane scrollPane3;
    private JTable creditTable;
    // JFormDvoidesigner - End of variables declaration  //GEN-END:variables

    public void init() {

        JFrame frame = new JFrame("Search Transaction");
        frame.setContentPane(new SearchTransaction().background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*Code for Setting window size*/
        frame.setSize(880, 580);
        frame.setMaximumSize(new Dimension(880, 580));
        frame.setMinimumSize(new Dimension(880, 580));
        /*Code for Setting window size*/
        frame.pack();
        frame.setVisible(true);

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

}
