package 주식정보시스템;

import java.io.IOException;

import org.jsoup.Connection;
import org.jsoup.Jsoup;
import org.jsoup.nodes.Document;
import org.jsoup.nodes.Element;
import org.jsoup.select.Elements;

public class 네이버증권크롤링5 {

	public void naver(String code4) {
		Connection con = Jsoup.connect("https://finance.naver.com/item/main.naver?code=" + code4);
//		System.out.println("1. 네트워크 연결 성공." + con);

		Document doc = null; // 로컬변수 초기화! 수동으로!
		try {
			doc = con.get();
			Elements codelist = doc.select(".code"); // <a class="nav">
//			System.out.println(codelist.size());

			Element tag = codelist.get(0);
			String code = tag.text();
			System.out.println("네이버");
			System.out.println("코드는 " + code);

			Elements list = doc.select("span.blind");
			// System.out.println(list.get(12));

//			System.out.println(list.get(16));

//			System.out.println(list.get(20));

			Element tag2 = list.get(12);
			Element high = list.get(16);
			Element low = list.get(20);
			String today = tag2.text();
			String today2 = high.text();
			String today3 = low.text();
			System.out.println("현재가" + today);
			System.out.println("고가" + today2);
			System.out.println("저가" + today3);
			System.out.println("================");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}