public class RegularPrice extends Price {
    int getPriceCode() {
        return Movie.REGULAR;
    }

	@Override
	double getRentalCharge(int daysRented) {
		double result = 2;
        if (daysRented > 2) {
            result += (daysRented - 2) * 1.5;
        }
        return result;
	}

	@Override
	double getSellingCharge() {
		return 10;
	}
    
}
