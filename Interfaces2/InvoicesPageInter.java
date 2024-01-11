package Interfaces2;

public class InvoicesPageInter {
    public static final String ADDPAYMENT = "//a[@title='Manage labels']/following-sibling::a[@title='Add payment']";
    public static final String INVOICE="//div[@title='Invoice']";
    public static final String CLICKiNVOICE="//li[contains(., \"INVOICE #10\")]";
    public static final String PAYMENTMETHOD="//label[text()='Payment method']//following-sibling::div";
    public static final String CLICKPAYMENTMETHOD="//li[contains(., \"Cash\")]";
    public static final String PAYMENTDATE="//input[@name=\"invoice_payment_date\"]";
    public static final String INVOICEPAYMENTAMOUNT="//input[@name=\"invoice_payment_amount\"]";
    public static final String NOTE="//textarea[@name='invoice_payment_note']";
    public static final String CLICKNOTE="//div[@class='note-editable']";
    public static final String SUBMIT="//button[@type='submit']";
}
