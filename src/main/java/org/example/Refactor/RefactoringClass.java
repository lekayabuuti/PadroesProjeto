package org.example.Refactor;

public class RefactoringClass {

    private Customer customer;

    private String reportHeader;
    private String reportFooter;

    private double totalSales;
    private double totalTaxes;
    private double totalDiscounts;

    private String temporaryMessage;

    public void processOrder(
            Customer customer,
            String productName,
            double productPrice,
            int quantity,
            int customerType,
            boolean sendEmail,
            boolean printReport) {

        double total = 0;

        total = productPrice * quantity;

        if (customerType == 1) {
            total = total - (total * 0.05);
        } else if (customerType == 2) {
            total = total - (total * 0.10);
        } else if (customerType == 3) {
            total = total - (total * 0.15);
        }

        if (customer.getZipCode().startsWith("1")) {
            total = total + 10;
        } else if (customer.getZipCode().startsWith("2")) {
            total = total + 20;
        } else if (customer.getZipCode().startsWith("3")) {
            total = total + 30;
        } else {
            total = total + 40;
        }

        System.out.println("Customer: " + customer.getName());
        System.out.println("Email: " + customer.getEmail());
        System.out.println("Address: " + customer.getAddress());
        System.out.println("ZipCode: " + customer.getZipCode());
        System.out.println("Product: " + productName);
        System.out.println("Price: " + productPrice);
        System.out.println("Quantity: " + quantity);
        System.out.println("Total: " + total);

        String report =
                "CUSTOMER: " + customer.getName() + "\n" +
                        "EMAIL: " + customer.getEmail() + "\n" +
                        "ADDRESS: " + customer.getAddress() + "\n" +
                        "ZIP: " + customer.getZipCode() + "\n" +
                        "PRODUCT: " + productName + "\n" +
                        "PRICE: " + productPrice + "\n" +
                        "QTY: " + quantity + "\n" +
                        "TOTAL: " + total;

        if (printReport) {
            System.out.println(report);
        }

        if (sendEmail) {
            sendEmail(customer, report);
        }

        saveOrder(customer, productName, productPrice, quantity, total);

        totalSales += total;
    }

    public void sendEmail(
            Customer customer,
            String report) {

        System.out.println(
                "Sending email to "
                        + customer.getName()
                        + " ("
                        + customer.getEmail()
                        + ")");

        System.out.println(report);
    }

    public void saveOrder(
            Customer customer,
            String productName,
            double productPrice,
            int quantity,
            double total) {

        System.out.println("Saving order...");
    }

    public double calculateTax(double total, int regionCode) {

        double result = total;

        if (regionCode == 1) {
            result = total * 0.10;
        }

        if (regionCode == 2) {
            result = total * 0.15;
        }

        if (regionCode == 3) {
            result = total * 0.20;
        }

        return result;
    }

    public String getTemporaryMessage() {
        return temporaryMessage;
    }

    public void setTemporaryMessage(String temporaryMessage) {
        this.temporaryMessage = temporaryMessage;
    }

    public String getReportHeader() {
        return reportHeader;
    }

    public void setReportHeader(String reportHeader) {
        this.reportHeader = reportHeader;
    }

    public String getReportFooter() {
        return reportFooter;
    }

    public void setReportFooter(String reportFooter) {
        this.reportFooter = reportFooter;
    }

    public double getTotalSales() {
        return totalSales;
    }

    public void setTotalSales(double totalSales) {
        this.totalSales = totalSales;
    }

    public double getTotalTaxes() {
        return totalTaxes;
    }

    public void setTotalTaxes(double totalTaxes) {
        this.totalTaxes = totalTaxes;
    }

    public double getTotalDiscounts() {
        return totalDiscounts;
    }

    public void setTotalDiscounts(double totalDiscounts) {
        this.totalDiscounts = totalDiscounts;
    }
}
