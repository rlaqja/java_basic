import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextArea;

public class 글자길이판독기 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame f = new JFrame();
		f.setSize(500, 700);
		f.setTitle("글자/단어 길이 판독기");
		Font font = new Font("궁서",Font.BOLD,20);
		
		FlowLayout flow = new FlowLayout();
		f.setLayout(flow);
		
		JLabel label1= new JLabel("Words:");
		label1.setFont(font);
		
		JTextArea area = new JTextArea("",20,30);
		area.setFont(font);

		
		JButton b1= new JButton("click");
		b1.setFont(font);
		JButton b2= new JButton("pad Color");
		b2.setFont(font);
		JButton b3= new JButton("Text Color");
		b3.setFont(font);
		
		b1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				String text = area.getText();
				JOptionPane.showMessageDialog(f, "글자수는" + text.length());
				area.setText("");
			}
		});
		b2.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				area.setBackground(Color.black);
			}
		});
		b3.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				area.setForeground(Color.white);
			}
		});
		
		
		

		f.add(label1);
		f.add(area);
		f.add(b1);
		f.add(b2);
		f.add(b3);
		
		
		
		
		
		
		f.setVisible(true);
		
		
		
		
	}

}
