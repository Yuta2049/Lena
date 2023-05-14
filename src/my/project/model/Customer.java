package my.project.model;

import my.project.service.CustomerInformer;

import java.util.Objects;
import java.util.UUID;

public class Customer {
    private UUID customerId;
    private String customerName;
    private String customerEmail;
    private CustomerInformer customerInformer;

    public Customer(UUID customerId, String customerName, String customerEmail, CustomerInformer customerInformer) {
        this.customerId = customerId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerInformer = customerInformer;
    }

    public UUID getCustomerId() {
        return customerId;
    }

    public void setCustomerId(UUID customerId) {
        this.customerId = customerId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public void sendEmailToCustomer(String message) {
        customerInformer.sendEmailToCustomer(this, message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Customer customer = (Customer) o;
        return Objects.equals(customerId, customer.customerId) && Objects.equals(customerName, customer.customerName) && Objects.equals(customerEmail, customer.customerEmail);
    }

    @Override
    public int hashCode() {
        return Objects.hash(customerId, customerName, customerEmail);
    }
}
