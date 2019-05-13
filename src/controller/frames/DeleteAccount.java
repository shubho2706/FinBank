/*
 * Created by JFormDesigner on Sun May 12 02:41:31 IST 2019
 */

package controller.frames;

import util.Instances;

import java.awt.event.*;
import javax.swing.*;
import java.awt.*;

/**
 * @author Sunandan Bhakat
 */
public class DeleteAccount extends JFrame {
    public DeleteAccount() {
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



    private void deleteSavingsMousePressed(MouseEvent e) {
        Instances.savingsAccountClose.init();

    }

    private void deleteFixedMousePressed(MouseEvent e) {
        Instances.fixedDepositAccountClose.init();
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
        contentPanel = new JPanel();
        deleteSavings = new JButton();
        deleteFixed = new JButton();
        label4 = new JLabel();
        label6 = new JLabel();

        //======== this ========
        Container contentPane = getContentPane();

        //======== background ========
        {
            background.setBackground(new Color(224, 224, 224));

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
                    deleteAccountAction.setBackground(new Color(85, 65, 118));

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
                            .addGap(0, 12, Short.MAX_VALUE))
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
                            .addContainerGap(190, Short.MAX_VALUE))
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
                            .addComponent(label9, GroupLayout.PREFERRED_SIZE, 115, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(userName, GroupLayout.PREFERRED_SIZE, 91, GroupLayout.PREFERRED_SIZE)
                            .addPreferredGap(LayoutStyle.ComponentPlacement.RELATED, 377, Short.MAX_VALUE)
                            .addComponent(logOut, GroupLayout.PREFERRED_SIZE, 42, GroupLayout.PREFERRED_SIZE)
                            .addGap(33, 33, 33))
                );
                navigationLayout.setVerticalGroup(
                    navigationLayout.createParallelGroup()
                        .addGroup(navigationLayout.createSequentialGroup()
                            .addGap(10, 10, 10)
                            .addGroup(navigationLayout.createParallelGroup()
                                .addGroup(navigationLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                    .addComponent(userName)
                                    .addComponent(label9, GroupLayout.PREFERRED_SIZE, 24, GroupLayout.PREFERRED_SIZE))
                                .addComponent(logOut, GroupLayout.PREFERRED_SIZE, 33, GroupLayout.PREFERRED_SIZE))
                            .addContainerGap(15, Short.MAX_VALUE))
                );
            }

            //======== contentPanel ========
            {
                contentPanel.setBackground(new Color(224, 224, 224));

                //---- deleteSavings ----
                deleteSavings.setIcon(new ImageIcon(getClass().getResource("/resource/savingsClose.png")));
                deleteSavings.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        deleteSavingsMousePressed(e);
                    }
                });

                //---- deleteFixed ----
                deleteFixed.setIcon(new ImageIcon(getClass().getResource("/resource/fixedClose.png")));
                deleteFixed.addMouseListener(new MouseAdapter() {
                    @Override
                    public void mousePressed(MouseEvent e) {
                        deleteFixedMousePressed(e);
                    }
                });

                //---- label4 ----
                label4.setText("Close Savings Account");
                label4.setHorizontalAlignment(SwingConstants.CENTER);
                label4.setForeground(new Color(204, 0, 0));
                label4.setFont(new Font("Segoe UI", Font.BOLD, 18));

                //---- label6 ----
                label6.setText("Close Fixed Account");
                label6.setHorizontalAlignment(SwingConstants.CENTER);
                label6.setForeground(new Color(204, 0, 0));
                label6.setFont(new Font("Segoe UI", Font.BOLD, 18));

                GroupLayout contentPanelLayout = new GroupLayout(contentPanel);
                contentPanel.setLayout(contentPanelLayout);
                contentPanelLayout.setHorizontalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(GroupLayout.Alignment.TRAILING, contentPanelLayout.createSequentialGroup()
                            .addGap(59, 59, 59)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(deleteSavings, GroupLayout.PREFERRED_SIZE, 236, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
                            .addGap(51, 51, 51)
                            .addGroup(contentPanelLayout.createParallelGroup()
                                .addComponent(deleteFixed, GroupLayout.PREFERRED_SIZE, 244, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 224, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 63, Short.MAX_VALUE))
                );
                contentPanelLayout.setVerticalGroup(
                    contentPanelLayout.createParallelGroup()
                        .addGroup(contentPanelLayout.createSequentialGroup()
                            .addGap(42, 42, 42)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.TRAILING)
                                .addComponent(deleteSavings, GroupLayout.PREFERRED_SIZE, 196, GroupLayout.PREFERRED_SIZE)
                                .addComponent(deleteFixed, GroupLayout.PREFERRED_SIZE, 198, GroupLayout.PREFERRED_SIZE))
                            .addGap(18, 18, 18)
                            .addGroup(contentPanelLayout.createParallelGroup(GroupLayout.Alignment.BASELINE)
                                .addComponent(label4, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE)
                                .addComponent(label6, GroupLayout.PREFERRED_SIZE, 44, GroupLayout.PREFERRED_SIZE))
                            .addGap(0, 146, Short.MAX_VALUE))
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
                        .addContainerGap(62, Short.MAX_VALUE))
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
    private JButton deleteSavings;
    private JButton deleteFixed;
    private JLabel label4;
    private JLabel label6;
    // JFormDesigner - End of variables declaration  //GEN-END:variables

    public void init() {

        JFrame frame = new JFrame("Delete Account");
        frame.setContentPane(new DeleteAccount().background);
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
