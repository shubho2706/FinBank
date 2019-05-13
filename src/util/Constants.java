package util;

public class Constants {
    public static final String DATABASE_NAME = "FinBank";
    public static final String DB_USER_NAME = "root";
    public static final String DB_PASSWORD = "shubho";

    public static final String MALE = "male";
    public static final String FEMALE = "female";
    public static final String OTHERS = "others";

    public static final String ADMIN_TABLE = "Admin";
    public static final String CUSTOMER_TABLE = "Customer";
    public static final String SAVINGS_ACCOUNT_TABLE = "SavingsAccount";
    public static final String FIXED_DEPOSIT_TABLE = "FixedDeposit";
    public static final String TRANSACTION_TABLE = "Transaction";



    public static final int MINIMUM_ACCOUNT_BALANCE = 2000;


    public static final double SAVINGS_INTEREST_RATE = 5;
    public static final double FD_LIMIT_1 =  200_000_00;
    public static final double FD_LIMIT_2 =  1000_000_00;
    public static final String BANK_CODE_SAVINGS = "130";
    public static final String BANK_CODE_FIXED = "131";


    public static final String TRANSACTION_MEDIUM_CASH = "cash";
    public static final String TRANSACTION_MEDIUM_TRANSFER = "transfer";
    public static final String TRANSACTION_MEDIUM_NEFT = "neft";
    public static final String SAVINGS_ACCOUNT_TYPE= "savings";
    public static final String FIXED_DEPOSIT_TYPE= "fixedDeposit";


    public static final String TRANSACTION_STATUS_COMMITTED = "committed";
    public static final String TRANSACTION_STATUS_CREATED = "created";
    public static final String TRANSACTION_STATUS_FAILED = "failed";





    public static  double getFixedDepositInterest(double amt, int durationInMonths){
        int days = durationInMonths * 30;
        if(days < 7)
            return 0;
        if(amt < FD_LIMIT_1){
            if(days >=7 && days <= 45)
                return 5.75;
            else if(days >=46 && days <= 179 )
                return 6.25;
            else if(days >=180 && days <= 210 )
                return 6.35;
            else if(days >=211 && days < 365 )
                return 6.40;
            else if(days >=366 && days < (2 * 365) )
                return 7;
            else if(days >=(2 * 365) && days < (3 * 365) )
                return 6.75;
            else if(days >=(3 * 365) && days < (5 * 365) )
                return 6.70;
            else if(days >=(5 * 365) && days <= (10 * 365) )
                return 6.60;




       /* }else if(amt >= FD_LIMIT_1 && amt < FD_LIMIT_2){
            if(days >=7 && days <= 45)
                return 5.75;
            else if(days >=46 && days <= 179 )
                return 6.25;
            else if(days >=180 && days <= 210 )
                return 6.35;
            else if(days >=211 && days < 365 )
                return 6.40;
            else if(days >=366 && days < (2 * 365) )
                return 6.70;
            else if(days >=(2 * 365) && days < (3 * 365) )
                return 6.75;
            else if(days >=(3 * 365) && days < (5 * 365) )
                return 6.80;
            else if(days >=(5 * 365) && days <= (10 * 365) )
                return 6.85;


        }*/else {
                if (days >= 7 && days <= 45)
                    return 5.75;
                else if (days >= 46 && days <= 179)
                    return 6.25;
                else if (days >= 180 && days <= 210)
                    return 6.35;
                else if (days >= 211 && days < 365)
                    return 6.40;
                else if (days >= 366 && days < (2 * 365))
                    return 6.70;
                else if (days >= (2 * 365) && days < (3 * 365))
                    return 6.75;
                else if (days >= (3 * 365) && days < (5 * 365))
                    return 6.80;
                else if (days >= (5 * 365) && days <= (10 * 365))
                    return 6.85;
            }

        }
        return  0;

    }
}
