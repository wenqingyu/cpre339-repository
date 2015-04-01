public class NewReleasePrice extends Price {
    int getPriceCode() {
        return Movie.NEW_RELEASE;
    }

    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2 : 1;
    }

	@Override
	double getRentalCharge(int daysRented) {
		return daysRented * 3;
	}

	@Override
	double getSellingCharge() {
		return 10;
	}

}
