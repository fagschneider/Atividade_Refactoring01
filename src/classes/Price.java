package classes;

public abstract class Price {
    public abstract int getPriceCode();

    public double getCharge(int daysRented) {
        if (getPriceCode() == Movie.REGULAR) {
            double result = 2;
            if (daysRented > 2)
                result += (daysRented - 2) * 1.5;
            return result;
        }
        if (getPriceCode() == Movie.NEW_RELEASE) {
            return daysRented * 3;
        }
        if (getPriceCode() == Movie.CHILDRENS) {
            double result = 1.5;
            if (daysRented > 3)
                result += (daysRented - 3) * 1.5;
            return result;
        }
        return 0;
    }
}
