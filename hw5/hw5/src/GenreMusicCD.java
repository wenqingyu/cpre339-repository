
public class GenreMusicCD extends Genre {
	
	private String Category = "";
		
	@Override
	void SetCategory(String category) {
		this.Category = category;
	}

	@Override
	String getCategory() {
		return this.Category;
	}

	@Override
	String getGenreName() {
		return "Music CD";
	}
	
}
