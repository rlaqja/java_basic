package 화면DB연결;

public class ReplyVO {
	
	int id;
	String day;
	int avg;
	String review;
	
	public void setDay(String day) {
		this.day = day;
	}
	public String getDay() {
		return day;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	
	public int getAvg() {
		return avg;
	}
	public void setAvg(int avg) {
		this.avg = avg;
	}
	public String getReview() {
		return review;
	}
	public void setReview(String review) {
		this.review = review;
	}
	
	@Override
	public String toString() {
		return "ReplyVO [id=" + id + ", day=" + day + ", avg=" + avg + ", review=" + review + "]";
	}
	
	
	
	
}
