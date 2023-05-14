package my.project.model;

import my.project.service.DocumentPrinter;

import java.math.BigDecimal;
import java.util.Objects;

public class Invoice {

    private BigDecimal amount;

    private Customer customer;

    private DocumentPrinter documentPrinter;

    public Invoice(BigDecimal amount, Customer customer, DocumentPrinter documentPrinter) {
        this.amount = amount;
        this.customer = customer;
        this.documentPrinter = documentPrinter;
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

    public void printInvoice() {
        documentPrinter.printInvoice(this);
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
