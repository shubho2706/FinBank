package service;

import dao.CustomerDao;
import entity.Customer;

import java.util.List;
import java.util.Random;

public class CustomerService {

    CustomerDao customerDao = null;

    {
        customerDao = new CustomerDao();
    }
    public String addCustomer(Customer customer) {
        String id = getId();
        customer.setCustomerId(id);

        if( customerDao.addCustomer(customer))
            return id;
        return null;

    }

    public boolean isPresent(String id) {
        return customerDao.isPresent(id);
    }

    private String getId() {

        String id;
        do {
            Random random = new Random();
            id = String.format("%04d", random.nextInt(10000));
            System.out.println("ID ::" + id);

        } while (isPresent(id));
        return id;
    }

    public Integer[] getCustomerIdList(){

        List<Integer> idList = customerDao.getCustomerIdList();
        if(idList == null)
            return null;
        System.out.println("CUSTOMER SERVICE ::" + idList);
        Integer[] idArr = new Integer[idList.size()];
        idArr = idList.toArray(idArr);
        return idArr;
    }

    public Customer getCustomer(String customerId) {
        return customerDao.getCustomer(customerId);
    }

    public boolean checkPhoneNumber(String phNumber) {
        return customerDao.checkPhoneNumber(phNumber);
    }

    public boolean deleteCustomer(String customerId) {
        return customerDao.deleteCustomer(customerId);

    }
}
