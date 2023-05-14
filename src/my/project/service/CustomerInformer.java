package my.project.service;

import my.project.model.Customer;

public interface CustomerInformer {
    void sendEmailToCustomer(Customer customer, String message);
}
