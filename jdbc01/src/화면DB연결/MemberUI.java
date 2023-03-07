package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class MemberUI {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f= new JFrame();
		f.setTitle("나의 회원가입 화면");
		f.setSize(650, 500);
		
		Font font = new Font("궁서",Font.BOLD,40);
		
		JLabel l1 = new JLabel("<<<<회원가입 화면>>>>");
		JLabel l2 = new JLabel("아이디");
		JLabel l3 = new JLabel("비밀번호");
		JLabel l4 = new JLabel("이 름");
		JLabel l5 = new JLabel("전화번호");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("회원가입 처리");
		JButton b2 = new JButton("회원탈퇴 처리");
		JButton b3 = new JButton("회원수정 처리");
		JButton b4 = new JButton("회원검색 처리");
		
		FlowLayout flow = new FlowLayout();
		
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		
		
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		
		b1.setFont(font); b2.setFont(font);
		b3.setFont(font); b4.setFont(font);
		
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		t1.setBackground(Color.DARK_GRAY);
		t1.setForeground(Color.white);
		
		t2.setBackground(Color.DARK_GRAY);
		t2.setForeground(Color.white);
		
		t3.setBackground(Color.DARK_GRAY);
		t3.setForeground(Color.white);
		
		t4.setBackground(Color.DARK_GRAY);
		t4.setForeground(Color.white);
		
		b1.setBackground(Color.pink);
		b1.setForeground(Color.yellow);
		
		b2.setBackground(Color.pink);
		b2.setForeground(Color.yellow);
		
		b3.setBackground(Color.pink);
		b3.setForeground(Color.yellow);
		
		b4.setBackground(Color.pink);
		b4.setForeground(Color.yellow);
		
		f.getContentPane().setBackground(Color.green);
		
		
		
		
		f.setVisible(true);
		
	}

}
