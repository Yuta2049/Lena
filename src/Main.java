import my.project.model.Customer;
import my.project.model.Invoice;
import my.project.service.CustomerInformer;
import my.project.service.DocumentPrinter;
import my.project.service.impl.EmailCustomerInformer;
import my.project.service.impl.InvoicePrinter;

import java.math.BigDecimal;

public class Main {
    public static void main(String[] args) {

        CustomerInformer emailCustomerInformer = new EmailCustomerInformer();
        DocumentPrinter invoicePrinter = new InvoicePrinter();

        Customer customer = new Customer(1, "Ivan", "ivan@mail.ru", emailCustomerInformer);
        customer.informCustomer("message");

        Invoice invoice = new Invoice(BigDecimal.valueOf(1000), customer, invoicePrinter);
        invoice.printInvoice();
    }
}