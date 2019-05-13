/*
 * Created by JFormDesigner on Mon May 13 03:19:44 IST 2019
 */

package controller.frames;

import entity.Transaction;
import service.SavingsAccountService;
import service.TransactionService;
import util.Constants;
import util.Instances;

import java.awt.event.*;
import javax.swing.*;
import javax.swing.border.*;
import java.awt.*;

/**
 * @author Sunandan Bhakat
 */
public class MoneyTransfer extends JFrame {

    TransactionService transactionService = null;
    SavingsAccountService savingsAccountService = null;
    {
        transactionService = new TransactionService();
        savingsAccountService = new SavingsAccountService();
    }
    public MoneyTransfer() {
        initComponents();
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

    private void cancelMousePressed(MouseEvent e) {
        Instances.adminPanel.init();

    }

    private void submitMousePressed(MouseEvent e) {

        if(radioTransfer.isEnabled()){

            String fromAcc = accNoFrom.getText().trim();
            String toAcc = accNoTo.getText().trim();
            String amtStr = amount.getText().trim();
            if(validateAccountNumber((fromAcc)) && validateAccountNumber(toAcc) && amountValidate(amtStr)){




                Transaction transaction = new Transaction();
                transaction.setTransactionAmount(Double.parseDouble(amtStr));
                transaction.setFromAccountNumber(fromAcc);
                transaction.setToAccountNumber(toAcc);
                System.out.println(transaction.getFromAccountNumber() +" and" + transaction.getToAccountNumber());
                transaction.setFromAccountType(Constants.SAVINGS_ACCOUNT_TYPE);
                transaction.setToAccountType(Constants.SAVINGS_ACCOUNT_TYPE);
                transaction.setTransactionMedium(Constants.TRANSACTION_MEDIUM_TRANSFER);
                if(transactionService.executeTransaction(transaction)){
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Transaction Successful", "Alert", JOptionPane.WARNING_MESSAGE);
                    Instances.adminPanel.init();
                }else{
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Transaction Failed", "Alert", JOptionPane.WARNING_MESSAGE);
                    Instances.moneyTransfer.init();
                }

            }

        }else if(radioWithdraw.isEnabled()){


            String fromAcc = accNoFrom.getText().trim();
            //String toAcc = accNoFrom.getText().trim();
            String amtStr = amount.getText().trim();
            if(validateAccountNumber(fromAcc) && amountValidate(amtStr)){
                Transaction transaction = new Transaction();
                transaction.setTransactionAmount(Double.parseDouble(amtStr));

                transaction.setFromAccountNumber(fromAcc);

                //transaction.setToAccountNumber(toAcc);
                transaction.setFromAccountType(Constants.SAVINGS_ACCOUNT_TYPE);
                //transaction.setToAccountType(Constants.SAVINGS_ACCOUNT_TYPE);
                transaction.setTransactionMedium(Constants.TRANSACTION_MEDIUM_CASH);
                if(transactionService.executeTransaction(transaction)){
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Transaction Successful", "Alert", JOptionPane.WARNING_MESSAGE);
                    //Instances.adminPanel.init();
                }else{
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Transaction Failed due to insufficienet balance", "Alert", JOptionPane.WARNING_MESSAGE);
                    //sInstances.moneyTransfer.init();
                }

            }

        }else{

            //String fromAcc = accNoFrom.getText().trim();
            String toAcc = accNoFrom.getText().trim();
            String amtStr = amount.getText().trim();
            if(validateAccountNumber(toAcc) && amountValidate(amtStr)){
                Transaction transaction = new Transaction();
                transaction.setTransactionAmount(Double.parseDouble(amtStr));
                //transaction.setFromAccountNumber(fromAcc);

                transaction.setToAccountNumber(toAcc);

                //transaction.setFromAccountType(Constants.SAVINGS_ACCOUNT_TYPE);
                transaction.setToAccountType(Constants.SAVINGS_ACCOUNT_TYPE);
                transaction.setTransactionMedium(Constants.TRANSACTION_MEDIUM_TRANSFER);
                if(transactionService.executeTransaction(transaction)){
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Transaction Successful", "Alert", JOptionPane.WARNING_MESSAGE);
                    Instances.adminPanel.init();
                }else{
                    JFrame f = new JFrame();
                    JOptionPane.showMessageDialog(f, "Transaction Failed", "Alert", JOptionPane.WARNING_MESSAGE);
                    Instances.moneyTransfer.init();
                }

            }

        }



    }




    private boolean validateAccountNumber(String accNumber) {

        if (accNumber.length() == 6) {
            if (savingsAccountService.isPresent(accNumber)) {
                return true;
            } else {
                JFrame f = new JFrame();
                JOptionPane.showMessageDialog(f, " Account numbers not found: "+ accNumber , "Alert", JOptionPane.WARNING_MESSAGE);
               // Instances.moneyTransfer.init();

                return false;
            }

        } else {

            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Invalid Account numbers" , "Alert", JOptionPane.WARNING_MESSAGE);
           // Instances.moneyTransfer.init();

            return false;
        }
    }



    private boolean amountValidate(String amtStr) {
        double amount = 0.0;
        if (amtStr.length() == 0) {
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Please provide the Amount", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        try {
            amount = Double.parseDouble(amtStr);
        } catch (NumberFormatException e) {

            System.out.println(e);
            JFrame f = new JFrame();
            JOptionPane.showMessageDialog(f, "Invalid Amount", "Alert", JOptionPane.WARNING_MESSAGE);
            return false;
        }

        return true;
    }

    private void radioTransferMousePressed(MouseEvent e) {
        // TUseless
    }

    private void radioTransferActionPerformed(ActionEvent e) {
        labelFrom.setEnabled(true);
        labelTo.setEnabled(true);
        accNoFrom.setEnabled(true);
        accNoTo.setEnabled(true);
        neft.setVisible(true);
    }

    private void radioWithdrawActionPerformed(ActionEvent e) {
        labelFrom.setEnabled(true);
        labelTo.setEnabled(false);
        accNoFrom.setEnabled(true);
        accNoTo.setEnabled(false);
        neft.setVisible(false);
    }

    private void radioDepositActionPerformed(ActionEvent e) {
        labelFrom.setEnabled(false);
        labelTo.setEnabled(true);
        accNoFrom.setEnabled(false);
        accNoTo.setEnabled(true);
        neft.setVisible(false);
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
        label2 = new JLabel();
        panel1 = new JPanel();
        labelFrom = new JLabel();
        accNoFrom = new JTextField();
        label6 = new JLabel();
        labelTo = new JLabel();
        accNoTo = new JTextField();
        submit = new JButton();
        cancel = new JButton();
        label12 = new JLabel();
        amount = new JTextField();
        cash = new JRadioButton();
        cheque = new JRadioButton();
        neft = new JRadioButton();
        radioTransfer = new JRadioButton();
        radioDeposit = new JRadioButton();
        radioWithdraw = new JRadioButton();

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
                                .addContainerGap(30, Short.MAX_VALUE))
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
                    transferMoneyAction.setBackground(new Color(85, 65, 118));

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
                            .addContainerGap(147, Short.MAX_VALUE))
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

            //---- label2 ----
            label2.setText("Money Transfer");
            label2.setBackground(Color.white);
            label2.setForeground(new Color(255, 23, 68));
            label2.setHorizontalAlignment(SwingConstants.CENTER);
            label2.setFont(new Font("Segoe UI", Font.BOLD, 16));
            label2.setBorder(new LineBorder(Color.blue, 2, true));

            //======== panel1 ========
            {
                panel1.setBackground(new Color(234, 128, 252));

                //---- labelFrom ----
                labelFrom.setText("Transfer From Savings A/C No:");
                labelFrom.setForeground(new Color(54, 33, 89));
                labelFrom.setFont(new Font("Segoe UI", Font.BOLD, 14));
                labelFrom.setHorizontalAlignment(SwingConstants.CENTER);

                //---- accNoFrom ----
                accNoFrom.setHorizontalAlignment(SwingConstants.CENTER);
                accNoFrom.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
                accNoFrom.setBorder(new BevelBorder(BevelBorder.RAISED));

                //---- label6 ----
                label6.setText("TO");
                label6.setForeground(Color.red);
                label6.setFont(new Font("Segoe UI", Font.BOLD, 18));
                label6.setHorizontalAlignment(SwingConstants.CENTER);

                //---- labelTo ----
                labelTo.setText("Transfer To Savings A/C No:");
                labelTo.setForeground(new Color(54, 33, 89));
                labelTo.setFont(new Font("Segoe UI", Font.BOLD, 14));
                labelTo.setHorizontalAlignment(SwingConstants.CENTER);

                //---- accNoTo ----
                accNoTo.setHorizontalAlignment(SwingConstants.CENTER);
                accNoTo.setFont(new Font("Segoe UI Black", Font.PLAIN, 14));
                accNoTo.setBorder(new BevelBorder(BevelBorder.RAISED));

                //---- submit ----
                submit.setText("Proceed");
                submit.setBackground(new Color(0, 200, 83));
                submit.setForeground(Color.black);
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

                //---- label12 ----
                label12.setText("Amount:");
                label12.setForeground(new Color(54, 33, 89));
                label12.setFont(new Font("Segoe UI", Font.BOLD, 14));
                label12.setHorizontalAlignment(SwingConstants.CENTER);

                //---- amount ----
                amount.setFont(new Font("Segoe UI", Font.PLAIN, 14));
                amount.setBorder(new LineBorder(new Color(98, 0, 234), 2));

                //---- cash ----
                cash.setText("By Cash");
                cash.setFont(new Font("Segoe UI", Font.BOLD, 14));
                cash.setBorder(null);
                cash.setBackground(new Color(234, 128, 252));
                cash.setSelected(true);

                //---- cheque ----
                cheque.setText("By Cheque");
                cheque.setFont(new Font("Segoe UI", Font.BOLD, 14));
                cheque.setBackground(new Color(234, 128, 252));

                //---- neft ----
                neft.setText("By NEFT");
                neft.setFont(new Font("Segoe UI", Font.BOLD, 14));
                neft.setBackground(new Color(234, 128, 252));

                //---- radioTransfer ----
                radioTransfer.setText("Transfer");
                radioTransfer.setSelected(true);
                radioTransfer.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        radioTransferMousePressed(e);
                    }
                });
                radioTransfer.addActionListener(e -> radioTransferActionPerformed(e));

                //---- radioDeposit ----
                radioDeposit.setText("Deposit");
                radioDeposit.addActionListener(e -> radioDepositActionPerformed(e));

                //---- radioWithdraw ----
                radioWithdraw.setText("Withdraw");
                radioWithdraw.addActionListener(e -> radioWithdrawActionPerformed(e));

                GroupLayout panel1Layout = new GroupLayout(panel1);
                panel1.setLayout(panel1Layout);
                panel1Layout.setHorizontalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(19, 19, 19)
                                    .addGroup(panel1Layout.createParallelGroup()
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(labelFrom, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE)
                                            .addGap(35, 35, 35)
                                            .addComponent(accNoFrom, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addComponent(label12, GroupLayout.PREFERRED_SIZE, 131, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                            .addComponent(amount, GroupLayout.PREFERRED_SIZE, 128, GroupLayout.PREFERRED_SIZE)
                                            .addPreferredGap(LayoutStyle.ComponentPlacement.UNRELATED)
                                            .addComponent(cash, GroupLayout.PREFERRED_SIZE, 87, GroupLayout.PREFERRED_SIZE)
                                            .addGap(12, 12, 12)
                                            .addComponent(cheque, GroupLayout.PREFERRED_SIZE, 98, GroupLayout.PREFERRED_SIZE)
                                            .addGap(18, 18, 18)
                                            .addComponent(neft, GroupLayout.PREFERRED_SIZE, 93, GroupLayout.PREFERRED_SIZE))
                                        .addGroup(panel1Layout.createSequentialGroup()
                                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(28, 28, 28)
                                                    .addComponent(labelTo, GroupLayout.PREFERRED_SIZE, 265, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(GroupLayout.Alignment.LEADING, panel1Layout.createSequentialGroup()
                                                    .addGap(130, 130, 130)
                                                    .addComponent(submit, GroupLayout.PREFERRED_SIZE, 142, GroupLayout.PREFERRED_SIZE)))
                                            .addGroup(panel1Layout.createParallelGroup()
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addGap(46, 46, 46)
                                                    .addComponent(cancel, GroupLayout.PREFERRED_SIZE, 121, GroupLayout.PREFERRED_SIZE))
                                                .addGroup(panel1Layout.createSequentialGroup()
                                                    .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                                                    .addComponent(accNoTo, GroupLayout.PREFERRED_SIZE, 258, GroupLayout.PREFERRED_SIZE))))))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(238, 238, 238)
                                    .addComponent(label6, GroupLayout.PREFERRED_SIZE, 104, GroupLayout.PREFERRED_SIZE))
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addGap(30, 30, 30)
                                    .addComponent(radioTransfer, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                                    .addGap(101, 101, 101)
                                    .addComponent(radioWithdraw)
                                    .addGap(116, 116, 116)
                                    .addComponent(radioDeposit)))
                            .addContainerGap(38, Short.MAX_VALUE))
                );
                panel1Layout.setVerticalGroup(
                    panel1Layout.createParallelGroup()
                        .addGroup(panel1Layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(panel1Layout.createParallelGroup()
                                .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(radioTransfer)
                                    .addComponent(radioWithdraw))
                                .addComponent(radioDeposit, GroupLayout.Alignment.TRAILING))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addGroup(panel1Layout.createParallelGroup()
                                .addComponent(labelFrom, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addGroup(panel1Layout.createSequentialGroup()
                                    .addComponent(accNoFrom, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                    .addGap(0, 0, Short.MAX_VALUE)))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(label6, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                            .addGap(18, 18, 18)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(labelTo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE)
                                .addComponent(accNoTo, GroupLayout.PREFERRED_SIZE, 32, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label12, GroupLayout.PREFERRED_SIZE, 38, GroupLayout.PREFERRED_SIZE)
                                .addComponent(amount)
                                .addComponent(cash, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(cheque, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE)
                                .addComponent(neft, GroupLayout.PREFERRED_SIZE, 31, GroupLayout.PREFERRED_SIZE))
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 22, Short.MAX_VALUE)
                            .addGroup(panel1Layout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(submit, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE)
                                .addComponent(cancel, GroupLayout.PREFERRED_SIZE, 45, GroupLayout.PREFERRED_SIZE))
                            .addGap(17, 17, 17))
                );
            }

            GroupLayout backgroundLayout = new GroupLayout(background);
            background.setLayout(backgroundLayout);
            backgroundLayout.setHorizontalGroup(
                backgroundLayout.createParallelGroup()
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(sidepane, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGroup(backgroundLayout.createParallelGroup()
                            .addGroup(GroupLayout.Alignment.TRAILING, backgroundLayout.createSequentialGroup()
                                .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(navigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE))
                            .addGroup(backgroundLayout.createSequentialGroup()
                                .addGroup(backgroundLayout.createParallelGroup()
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(171, 171, 171)
                                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 304, GroupLayout.PREFERRED_SIZE))
                                    .addGroup(backgroundLayout.createSequentialGroup()
                                        .addGap(18, 18, 18)
                                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addContainerGap())
            );
            backgroundLayout.setVerticalGroup(
                backgroundLayout.createParallelGroup()
                    .addComponent(sidepane, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(backgroundLayout.createSequentialGroup()
                        .addComponent(navigation, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(label2, GroupLayout.PREFERRED_SIZE, 35, GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(panel1, GroupLayout.PREFERRED_SIZE, GroupLayout.DEFAULT_SIZE, GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 107, Short.MAX_VALUE))
            );
        }

        GroupLayout contentPaneLayout = new GroupLayout(contentPane);
        contentPane.setLayout(contentPaneLayout);
        contentPaneLayout.setHorizontalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(background, GroupLayout.DEFAULT_SIZE, 858, Short.MAX_VALUE)
        );
        contentPaneLayout.setVerticalGroup(
            contentPaneLayout.createParallelGroup()
                .addComponent(background, GroupLayout.DEFAULT_SIZE, GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        pack();
        setLocationRelativeTo(getOwner());

        //---- buttonGroup1 ----
        ButtonGroup buttonGroup1 = new ButtonGroup();
        buttonGroup1.add(cash);
        buttonGroup1.add(cheque);
        buttonGroup1.add(neft);

        //---- buttonGroup2 ----
        ButtonGroup buttonGroup2 = new ButtonGroup();
        buttonGroup2.add(radioTransfer);
        buttonGroup2.add(radioDeposit);
        buttonGroup2.add(radioWithdraw);
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
    private JLabel label2;
    private JPanel panel1;
    private JLabel labelFrom;
    private JTextField accNoFrom;
    private JLabel label6;
    private JLabel labelTo;
    private JTextField accNoTo;
    private JButton submit;
    private JButton cancel;
    private JLabel label12;
    private JTextField amount;
    private JRadioButton cash;
    private JRadioButton cheque;
    private JRadioButton neft;
    private JRadioButton radioTransfer;
    private JRadioButton radioDeposit;
    private JRadioButton radioWithdraw;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void init() {

        JFrame frame = new JFrame("Money Transfer");
        frame.setContentPane(new MoneyTransfer().background);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);


        /*Code for Setting window size*/
        frame.setSize(880, 580);
        frame.setMaximumSize(new Dimension(880, 580));
        frame.setMinimumSize(new Dimension(880, 580));
        /*Code for Setting window size*/
        frame.pack();
        frame.setVisible(true);

    }
}
