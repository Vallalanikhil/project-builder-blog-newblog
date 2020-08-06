package model;
import java.time.LocalDate;

class Blog{
	String title;
	int description;
	LocalDate postedOn;
 
	Blog(String title,int description,LocalDate postedOn){
		this.title=title;
		this.description=description;
		this.postedOn=postedOn;
		
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public int getDescription() {
		return description;
	}
	public void setDescription(int description) {
		this.description = description;
	}
	public LocalDate getPostedOn() {
		return postedOn;
	}
	public void setPostedOn(LocalDate postedOn) {
		this.postedOn = postedOn;
	}
	
}