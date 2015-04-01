public abstract class Price {
    abstract int getPriceCode();
    
    /*
     *  get the rental charge based on the days rented 
     */
    abstract double getRentalCharge(int daysRented);
    
    int getFrequentRenterPoints(int daysRented) {
        return 1;
    }
    
    /*
     *  get the price amount for selling this movie
     */
    abstract double getSellingCharge();

}
