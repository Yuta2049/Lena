package my.project;

import java.math.BigDecimal;
import java.util.Objects;

public class Invoice {

    private BigDecimal amount;

    private Customer customer;

    public Invoice(BigDecimal amount, Customer customer) {
        this.amount = amount;
        this.customer = customer;
    }

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public Customer getCustomer() {
        return customer;
    }

    public void setCustomer(Customer customer) {
        this.customer = customer;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Invoice invoice = (Invoice) o;
        return Objects.equals(amount, invoice.amount) && Objects.equals(customer, invoice.customer);
    }

    @Override
    public int hashCode() {
        return Objects.hash(amount, customer);
    }
}
