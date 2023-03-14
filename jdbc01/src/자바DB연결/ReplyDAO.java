package 자바DB연결;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Locale;

import 화면DB연결.ReplyVO;

public class ReplyDAO { //CRUD

	public ArrayList<ReplyVO> list() {

		ResultSet rs = null;
		
		ArrayList<ReplyVO> list = new ArrayList<>();
		
		ReplyVO bag = null;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "select * from hr.REPLY";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			rs = ps.executeQuery();
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			System.out.println("rs : "+rs);
			while( rs.next() ) {
				//System.out.println("검색결과 있음. 성공.");
				int id = rs.getInt(1);
				String day = rs.getString(2);
				int avg = rs.getInt(3);
				String review = rs.getString(4);
				//System.out.println(id2 +" "+ pw +" "+ name +" "+ tel);
				
				bag = new ReplyVO();
				
				bag.setId(id);
				bag.setDay(day);
				bag.setAvg(avg);
				bag.setReview(review);
				
				list.add(bag);
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return list;
		
	}
	
	public int delete(String id) {
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "delete from hr.REPLY where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setString(1, id);
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); 
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("탈퇴 성공.");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		
		return result;
		
	}
	
	public int update(ReplyVO bag) {
		int result = 0;
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			String sql = "update hr.REPLY set avg = ? , REVIEW = ? where id = ? ";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			ps.setInt(1, bag.getAvg());
			ps.setString(2, bag.getReview());
			ps.setInt(3, bag.getId());
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); 
			//insert, update, delete문만!! sql문 실행결과가 int
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("수정 성공.");
			}
			//System.out.println(result);
		} catch (Exception e) {
			e.printStackTrace();
		}
		return result;
	}
	
	//public void add2() {
	public int insert(ReplyVO bag) {
		int result = 0;
		
		try {
			// 1.오라클 11g와 연결한 부품 설정
			Class.forName("oracle.jdbc.driver.OracleDriver");
			System.out.println("1. 오라클과 자바 연결할 부품 설정 성공.");
			Locale.setDefault(Locale.US); //맥 locale에러나신 분들만!!!
			
			// 2.오라클 11g에 연결해보자.(java --- oracle) 
			String url = "jdbc:oracle:thin:@localhost:1521:xe";
			String user = "system";
			String password = "oracle";
			Connection con = DriverManager.getConnection(url, user, password); //Connection
			//String data = JOptionPane.showInputDialog("이름입력"); //String, 임아무개 
			System.out.println("2. 오라클 연결 성공.");
			
			//ipaddress ==> InetAddress
			//String url = "http://wwww.naver.com";
			//URL u = new URL(url);
			//자바는 부품조립식이여서,String에 넣은 문자열을 특정한 부품으로 인식하지 못함.
			//특정한 부품으로 인식하려면 그 부품으로 만들어주어야 한다.
			//SQL부품으로 만들어주어야 함.
			//PreparedStatement가 SQL부품!!
			
			//public void insert(String id, String pw, String name, String tel) 
			String sql = "insert into hr.REPLY values (hr.REPLY_ID_SEQ.nextVal, SYSDATE, ?, ?)";
			PreparedStatement ps = con.prepareStatement(sql); //PreparedStatement
			//con부품으로 sql스트링에 있는 것 SQL부품으로 만들어주세요.
			//R빼고, 인덱스 0부터 시작!!
			//유일하게 db은 인덱스가 1부터 시작!!
			//pssetInt(1, bag.getId()); //ps.setInt(1, no);
			ps.setInt(1, bag.getAvg());
			ps.setString(2, bag.getReview());
			//==> insert into hr.MEMBER values ('a','a','a','a');
			System.out.println("3. SQL문 부품(객체)으로 만들어주기 성공.");
			
			result = ps.executeUpdate(); //1
			System.out.println("4. SQL문 오라클로 보내기 성공.");
			if(result == 1) {
				System.out.println("후기작성 성공!");
			}
			//System.out.println(result);
		} catch (Exception e) {
			//insert가 제대로 안된 경우, 위험한 상황이라고 판단하고
			//catch가 실행
			//실행된 Row수가 없으므로 Result에 0을 넣어주자.!
			//result = 0;
			e.printStackTrace();
		}
		
		System.out.println(result);
		return result;
	}
}