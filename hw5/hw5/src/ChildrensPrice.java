public class ChildrensPrice extends Price {
    int getPriceCode() {
        return Movie.CHILDRENS;
    }

    @Override
    double getRentalCharge(int daysRented) {
        double result = 1.5;
        if (daysRented > 3) {
            result += (daysRented - 3) * 1.5;
        }
        return result;
    }
    
    @Override
    double getSellingCharge(){
    	return 15;
    }

}
