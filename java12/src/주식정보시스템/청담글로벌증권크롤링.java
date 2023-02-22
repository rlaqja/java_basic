package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 청담글로벌증권크롤링 {

	public static void main(String[] args) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=005930");
		System.out.println("1. 네트워크 연결 성공."  + con);
		
		Document doc = null; //로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements codelist = doc.select(".code"); //<a class="nav">
			System.out.println(codelist.size());
			
			Element tag = codelist.get(0);
			String code = tag.text();
			System.out.println("코드는 " + code);
			
			Elements list = doc.select("span.blind"); //<a class="nav">
			System.out.println(list.size());
			System.out.println(list);
			
			Element tag2 = list.get(0);
			String text1 = tag2.text();
			System.out.println("text1 " + text1);

		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}