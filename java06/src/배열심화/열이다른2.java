package 배열심화;

import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTable;

public class 열이다른2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f  = new JFrame();
		f.setSize(500, 500);
		String head[] = {"월","수","금"};
		String contents[][]= {
				{"오전","오전","오전"},
				{"오후","오후","오후"},
				{"심야","심야","심야"}
				
		};
		JTable table =new JTable(contents,head);
		JScrollPane scroll = new JScrollPane(table);
		f.add(scroll);
		f.setVisible(true);
		}

}
