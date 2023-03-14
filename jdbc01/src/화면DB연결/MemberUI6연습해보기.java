package 화면DB연결;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

import 자바DB연결.ReplyDAO;

public class MemberUI6연습해보기 {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setSize(500, 700);
		
		
		ReplyDAO dao = new ReplyDAO();
		ArrayList<ReplyVO> list = dao.list();

		String[] header = {"아이디","패스워드","이름","전화번호"};
		Object[][] all = new String[list.size()][4];

		if (list.size() == 0) {
			System.out.println("검색결과 없음.");
		} else {
			System.out.println("검색결과는 전체" + list.size() + "입니다");

			for (int i = 0; i < all.length; i++) {
				all[i][0] = String.valueOf(list.get(i).getId());
				all[i][1] = list.get(i).getDay();
				all[i][2] = String.valueOf(list.get(i).getAvg());
				all[i][3] = list.get(i).getReview();
			}
		}
		
		JTable table= new JTable(all, header);
		JScrollPane scroll = new JScrollPane(table);
		f.setLayout(new FlowLayout());
		scroll.setFont(new Font("궁서", Font.BOLD, 40));
		f.add(scroll);
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		f.setVisible(true);
	}
}
