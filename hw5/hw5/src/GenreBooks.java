
public class GenreBooks extends Genre {
	private String category = "";
		
	@Override
	void SetCategory(String category) {
		this.category = category;
	}

	@Override
	String getCategory() {
		return this.category;
	}

	@Override
	String getGenreName() {
		return "Books";
	}

}
