package my.project.service.impl;

import my.project.service.DocumentPrinter;
import my.project.model.Invoice;

public class InvoicePrinter implements DocumentPrinter {

    @Override
    public void printInvoice(Invoice invoice) {
        System.out.println("Invoice printed");
    }
}
