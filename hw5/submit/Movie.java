public abstract class Movie {

    public static final int CHILDRENS   = 2;
    public static final int REGULAR     = 0;
    public static final int NEW_RELEASE = 1;
    
    private Genre genre = null;
    private String   _title;
    private Price    _price;
    
    /**
     * Constructor1: create New Movie by adding title and priceCode
     * @param title
     * @param priceCode
     */
    public Movie(String title, int priceCode) {
        _title = title;
        setPriceCode(priceCode);
    }
    
    /**
     * Constructor2
     * @param title
     * @param priceCode
     * @param genre
     */
    public Movie(String title, int priceCode, Genre genre) {
        _title = title;
        setPriceCode(priceCode);
        this.genre = genre;
    }
    
    /*
     * Set Genre to current movie
     */
    public void setGenre(Genre genre){
    	this.genre = genre;
    }
    
    /*
     * Set category as subset of genre
     */
    public void setCategory(String category){
    	this.genre.SetCategory(category);
    }
    
    /*
     * get category of current movie
     */
    public String getCategory(){
    	return this.genre.getCategory();
    }
    
    /*
     * get genre name
     */
    public String getGenreName(){
    	return this.genre.getGenreName();
    }
    
    public int getPriceCode() {
        return _price.getPriceCode();
    }
    
    public void setPriceCode(int arg) {
        switch (arg) {
            case REGULAR:
                _price = new RegularPrice();
                break;
            case CHILDRENS:
                _price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                _price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }
    }
    
    public String getTitle() {
        return _title;
    }
    
    double getRentalCharge(int daysRented) {
        return _price.getRentalCharge(daysRented);
    }

    public int getFrequentRenterPoints(int daysRented) {
        return _price.getFrequentRenterPoints(daysRented);
    }
    
    double getSellingCharge(){
    	return _price.getSellingCharge();
    }

}