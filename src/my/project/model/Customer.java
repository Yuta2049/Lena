package my.project.model;

import my.project.service.CustomerInformer;

import java.util.Objects;

public class Customer {
    private final int id;
    private final String name;
    private final String email;
    private final CustomerInformer customerInformer;

    public Customer(int id, String name, String email, CustomerInformer customerInformer) {
        this.id = id;
        this.name = name;
        this.email = email;
        this.customerInformer = customerInformer;
    }

    public void informCustomer(String message) {
        customerInformer.sendEmailToCustomer(this, message);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Customer customer = (Customer) o;

        if (id != customer.id) return false;
        if (!Objects.equals(name, customer.name))
            return false;
        if (!Objects.equals(email, customer.email))
            return false;
        return Objects.equals(customerInformer, customer.customerInformer);
    }

    @Override
    public int hashCode() {
        int result = id;
        result = 31 * result + (name != null ? name.hashCode() : 0);
        result = 31 * result + (email != null ? email.hashCode() : 0);
        result = 31 * result + (customerInformer != null ? customerInformer.hashCode() : 0);
        return result;
    }
}
