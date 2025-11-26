package classes;

import java.util.Enumeration;

public abstract class Statement {

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

    protected abstract String header(Customer aCustomer);

    protected abstract String rentalInfo(Rental each);

    protected abstract String footer(Customer aCustomer);
}
