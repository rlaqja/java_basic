package multi;

public class MovieVo {
	
	private int id;
	private String title;
	private String content;
	private String location;
	private String director;
	
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getTitle() {
		return title;
	}
	public void setTitle(String title) {
		this.title = title;
	}
	public String getContent() {
		return content;
	}
	public void setContent(String content) {
		this.content = content;
	}
	public String getLocation() {
		return location;
	}
	public void setLocation(String location) {
		this.location = location;
	}
	public String getDirector() {
		return director;
	}
	public void setDirector(String director) {
		this.director = director;
	}
	@Override
	public String toString() {
		return "MovieVo [id=" + id + ", title=" + title + ", content=" + content + ", location=" + location
				+ ", director=" + director + "]";
	}
	
	



}
