package my.project.impl;

import my.project.CustomerInformer;
import my.project.Invoice;

public class EmailCustomerInformer implements CustomerInformer {
    @Override
    public void sendEmailToCustomer(Invoice invoice, String email) {
        // Отправка email
    }
}
