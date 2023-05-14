package my.project.service.impl;

import my.project.model.Customer;
import my.project.service.CustomerInformer;

public class EmailCustomerInformer implements CustomerInformer {
    @Override
    public void sendEmailToCustomer(Customer customer, String message) {
        // Отправка email
    }
}
