package classes;

import java.util.Enumeration;

import java.util.Enumeration;

public class TextStatement extends Statement {

    public String value(Customer aCustomer) {
        String result = header(aCustomer);
        Enumeration rentals = aCustomer.getRentals();
        while (rentals.hasMoreElements()) {
            Rental each = (Rental) rentals.nextElement();
            result += rentalInfo(each);
        }
        result += footer(aCustomer);
        return result;
    }

    private String header(Customer aCustomer) {
        return "Rental Record for " + aCustomer.getName() + "\n";
    }

    private String rentalInfo(Rental each) {
        return "\t" + each.getMovie().getTitle() + "\t" +
                String.valueOf(each.getCharge()) + "\n";
    }

    private String footer(Customer aCustomer) {
        return "Amount owed is " + String.valueOf(aCustomer.getTotalCharge()) + "\n" +
                "You earned " + String.valueOf(aCustomer.getTotalFrequentRenterPoints()) +
                " frequent renter points";
    }
}
