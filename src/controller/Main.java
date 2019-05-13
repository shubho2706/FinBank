package controller;

import controller.frames.*;
import util.Instances;

public class Main {
    public static void main(String[] args) {



        Instances.adminLoginForm = new AdminLoginForm();
        Instances.adminPanel = new AdminPanel();
        Instances.createAccount = new CreateAccount();
        Instances.createUser = new CreateUser();
        Instances.deleteAccount = new DeleteAccount();
        Instances.searchTransaction = new SearchTransaction();
        Instances.moneyTransfer = new MoneyTransfer();

        Instances.savingsAccountClose = new SavingsAccountClose();
        Instances.fixedDepositAccountClose = new FixedDepositAccountClose();

        Instances.savingsAccountForm = new SavingsAccountForm();
        Instances.fixedDepositAccountForm = new FixedDepositAccountForm();


        //Instances.adminLoginForm.init();

       // Instances.deleteAccount.init();

        //Instances.moneyTransfer.init();
        Instances.fixedDepositAccountForm.init();



    }
}
