package my.project.model;

import my.project.service.DocumentPrinter;

import java.math.BigDecimal;
import java.util.Objects;

public class Invoice {

    private final DocumentPrinter documentPrinter;
    private final BigDecimal amount;
    private final Customer customer;

    public Invoice(BigDecimal amount, Customer customer, DocumentPrinter documentPrinter) {
        this.amount = amount;
        this.customer = customer;
        this.documentPrinter = documentPrinter;
    }

    public void printInvoice() {
        documentPrinter.printInvoice(this);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;

        Invoice invoice = (Invoice) o;

        if (!Objects.equals(amount, invoice.amount)) return false;
        if (!Objects.equals(customer, invoice.customer)) return false;
        return Objects.equals(documentPrinter, invoice.documentPrinter);
    }

    @Override
    public int hashCode() {
        int result = amount != null ? amount.hashCode() : 0;
        result = 31 * result + (customer != null ? customer.hashCode() : 0);
        result = 31 * result + (documentPrinter != null ? documentPrinter.hashCode() : 0);
        return result;
    }
}
