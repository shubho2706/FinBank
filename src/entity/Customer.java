package entity;

public class Customer {


    private String firstName, lastName,  profession, doB, customerId ,address, phoneNumber, gender;
    private double yearlySalary;
    // private ArrayList<Account> accountList;

    public Customer() {
    }

    public Customer(String firstName, String lastName, String profession, String doB, String address, String phoneNumber, String gender, double yearlySalary) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.profession = profession;
        this.doB = doB;
        this.address = address;
        this.phoneNumber = phoneNumber;
        this.gender = gender;
        this.yearlySalary = yearlySalary;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getCustomerId() {
        return customerId;
    }

    public void setCustomerId(String customerId) {
        this.customerId = customerId;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public String getDoB() {
        return doB;
    }

    public void setDoB(String doB) {
        this.doB = doB;
    }

    public double getYearlySalary() {
        return yearlySalary;
    }

    public void setYearlySalary(double yearlySalary) {
        this.yearlySalary = yearlySalary;
    }

 /*   public ArrayList<Account> getAccountList() {
        return accountList;
    }

    public void setAccountList(ArrayList<Account> accountList) {
        this.accountList = accountList;
    }*/

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }
}
