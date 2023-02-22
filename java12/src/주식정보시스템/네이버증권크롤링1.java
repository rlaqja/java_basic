package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링1 {

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
			
			Elements textlist = doc.select(".sptxt.sp_txt9"); //<a class="nav">
			System.out.println(textlist.size());
			
			Element tag2 = textlist.get(0);
			String text1 = tag2.text();
			System.out.println("text1 " + text1);
			
			Elements textlist2 = doc.select(".sptxt.sp_txt10"); //<a class="nav">
			System.out.println(textlist2.size());
			
			Element tag3 = textlist.get(0);
			String text2 = tag3.text();
			System.out.println("text2 " + text2);
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}