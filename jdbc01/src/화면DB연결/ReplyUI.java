package 화면DB연결;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

import 자바DB연결.ReplyDAO;

public class ReplyUI {

	public static void main(String[] args) {
		JFrame f = new JFrame();
		f.setTitle("후기페이지");
		f.setSize(550, 455);
		
		JLabel l1 = new JLabel("<<<< 리뷰 남기기 >>>>");
		JLabel l2 = new JLabel("아이디:");
		JLabel l3 = new JLabel("날 짜:");
		JLabel l4 = new JLabel("평 점:");
		JLabel l5 = new JLabel("작 성:");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		JTextField t3 = new JTextField(10);
		JTextField t4 = new JTextField(10);
		
		JButton b1 = new JButton("후기남기기");	
		JButton b2 = new JButton("삭제");
		JButton b3 = new JButton("수정");
		JButton b4 = new JButton("후기 확인하러가기");

		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("리뷰 남기기 성공!");
				String  id = t1.getText();
				String  day = t2.getText();
				String  avg = t3.getText();
				String review = t4.getText(); //""
				if(id.equals("")) { //기본형 4가지만 == 로 값을 비교 가능! 
					JOptionPane.showMessageDialog(f, "id는 필수입력항목입니다.");
				}
				ReplyDAO dao = new ReplyDAO();
				//1.가방 객체를 만들고
				ReplyVO bag = new ReplyVO();
				//2. 가방에 넣고
				bag.setId(Integer.parseInt(id));
				//Date date = new Date(day)
				bag.setDay(day);
				
				bag.setReview(review);
				System.out.println();
				//3. 가방을 전달 
				
				if (Integer.parseInt(avg) <= 10 ) {
					JOptionPane.showMessageDialog(f, "평점을 메겨주셔서 감사합니다");
					bag.setAvg(Integer.parseInt(avg));	
				} else {
					// 초과가 되엇습니다 문구 작성
					JOptionPane.showMessageDialog(f, "10점을 초과했습니다.");
					//10 초과시 10으로 db저장
					bag.setAvg(10);
				}
				 
				int result = dao.insert(bag);//1 or 0
				
				if(result == 1 ) {
					//JOptionPane.showMessageDialog(f, "리뷰 남기기 성공!");
				}else {
					//JOptionPane.showMessageDialog(f, "리뷰 남기기 실패, 재입력해주세요.");
				}
			}//action
		}); //b1
		
		//탈퇴기능 
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("리뷰 삭제");
				String id = t1.getText();
				
				ReplyDAO dao = new ReplyDAO();
				
				
				int result = dao.delete(id);
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "삭제 성공");
				}else {
					JOptionPane.showMessageDialog(f, "삭제 실패, 다시 해주세요.");
				}
			}//action
		}); //b2
		
		//수정기능 
		b3.addActionListener(new ActionListener() {
				
			@Override
			public void actionPerformed(ActionEvent e) {
				System.out.println("후기 수정처리");
				String  id = t1.getText();
				String  day = t2.getText();
				String  avg = t3.getText();
				String review = t4.getText(); //""
				ReplyDAO dao = new ReplyDAO();
				ReplyVO bag = new ReplyVO();	
				
				bag.setId(Integer.parseInt(id));
				bag.setDay(day);
				bag.setAvg(Integer.parseInt(avg));
				bag.setReview(review);
				
				int result = dao.update(bag);
				if(result == 1) {
					JOptionPane.showMessageDialog(f, "후기 수정 성공");
				}else {
					JOptionPane.showMessageDialog(f, "후기 수정 실패, 재입력해주세요.");
				}
			}//action
		}); //b3
		
		b4.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				//String name = b1.getText();
				//JOptionPane.showMessageDialog(f, "리뷰 페이지로 이동합니다");
				ReplyUI2 re = new ReplyUI2();
				re.ReplyUI2();
				f.setVisible(false);
			}
		});
		
		
		//f에 위에 있는 요소들을 add로 붙여주어야하는데,
		//붙이는 순서대로 물흐르듯이 붙여주고 싶음.
		//물흐르듯이 붙여주는 부품이 필요
		FlowLayout flow = new FlowLayout();
		
		//폰트를 설정하기 위해 font부품 필요 
		Font font = new Font("궁서", Font.BOLD, 40);
		
		//////////// 필요한 부품(객체)를 ram에 가져다 놓고, 준비 끝 ///////
		///조립을 시작해보자. ///
		f.setLayout(flow);
		
		f.add(l1);
		f.add(l2); f.add(t1);
		f.add(l3); f.add(t2);
		f.add(l4); f.add(t3);
		f.add(l5); f.add(t4);
		f.add(b1); f.add(b2);
		f.add(b3); f.add(b4);
		
		l1.setFont(font);
		l2.setFont(font);
		l3.setFont(font);
		l4.setFont(font);
		l5.setFont(font);
		t1.setFont(font);
		t2.setFont(font);
		t3.setFont(font);
		t4.setFont(font);
		b1.setFont(font);
		b2.setFont(font);
		b3.setFont(font);
		b4.setFont(font);

		
		t1.setBackground(Color.yellow);
		t1.setForeground(Color.black);
		t2.setBackground(Color.yellow);
		t2.setForeground(Color.black);
		t3.setBackground(Color.yellow);
		t3.setForeground(Color.black);
		t4.setBackground(Color.yellow);
		t4.setForeground(Color.black);
		
		b1.setBackground(Color.black); //배경색
		b1.setForeground(Color.white); //글자색 
		b2.setBackground(Color.red);
		b2.setForeground(Color.white);
		b3.setBackground(Color.blue);
		b3.setForeground(Color.white);
		b4.setBackground(Color.black);
		b4.setForeground(Color.orange);

		
		f.getContentPane().setBackground(Color.gray);
		//맨 끝으로~~~~~
		f.setVisible(true);

	}

}