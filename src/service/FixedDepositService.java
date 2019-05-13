package service;

import dao.FixedDepositDao;
import entity.FixedDeposit;
import util.Constants;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.List;
import java.util.Random;

public class FixedDepositService {

    FixedDepositDao fixedDepositDao = null;

    {
        fixedDepositDao = new FixedDepositDao();
    }

    public String addAccount(FixedDeposit fixedDeposit) {
        fixedDeposit.setAccountNumber(getAccountNumber());

        DateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
        Date date = new Date();
        System.out.println(dateFormat.format(date)); //2016/11/16 12:08:43
        fixedDeposit.setAccountCreationDate(dateFormat.format(date));
        Calendar cal = Calendar.getInstance();
        cal.add(Calendar.MONTH, fixedDeposit.getDurationInMonths());
        Date matDate = cal.getTime();
        fixedDeposit.setMaturityDate(dateFormat.format(matDate));
        fixedDeposit.setInterestRate(Constants.getFixedDepositInterest(fixedDeposit.getDepositBalance()
                , fixedDeposit.getDurationInMonths()));


        double simpleInterest = (fixedDeposit.getDepositBalance() * fixedDeposit.getInterestRate() * fixedDeposit.getDurationInMonths() * 30) / (100 * 365);

        DecimalFormat df = new DecimalFormat("#.##");
        double amount = fixedDeposit.getDepositBalance() + simpleInterest;
        amount = Double.parseDouble(df.format(amount));
        fixedDeposit.setMaturityAmount(amount);

        if(fixedDepositDao.addAccount(fixedDeposit))
                return fixedDeposit.getAccountNumber();
        return null;

    }

    private String getAccountNumber() {


        //TODO :  to follow to specific bank a/c no pattern
        String accountNumber;
        do {
            Random random = new Random();
            accountNumber = Constants.BANK_CODE_FIXED + (random.nextInt(1000));
            System.out.println("ID ::" + accountNumber);

        } while (isPresent(accountNumber));
        return accountNumber;
    }

    public boolean isPresent(String accountNumber) {
        return fixedDepositDao.isPresent(accountNumber);
    }

    public String[] getAccountNumberList(String customerId) {

        List<String> list = fixedDepositDao.getAccountNumberList(customerId);
        return list.toArray(new String[list.size()]);
    }


    public FixedDeposit closeAccount(String accountNumber) {
        FixedDeposit fixedDeposit =  fixedDepositDao.deleteAccount(accountNumber);
        return fixedDeposit;
    }
}
