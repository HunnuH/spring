package task2;
public class Video extends Content{
	String genre;
    public Video() {
    }
    
    public Video (String title,String genre){
		super(title);
		this.genre = genre;
    }
    
	public String getGenre() {
		return genre;
	}
	public void setGenre(String genre) {
		this.genre = genre;
	}

	public void totalPrice() {
		if(genre.equals("new")) {
			price =2000;
		}else if(genre.equals("comic")) {
			price =1500;
		}else if(genre.equals("child")) {
			price =1000;
		}else {
			price =500;
		}
	}
}
