package frame12;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class test{
	JFrame F1;
	JLabel l1,l2,l3;
	JTextField t1,t2;
	JButton b1,b2;
	test()
	{
		F1=new JFrame();
		l1=new JLabel("welcome to page");
		l2=new JLabel("First name");
		l3=new JLabel("Last name");
		t1=new JTextField();
		t2=new JTextField();
		b1=new JButton("submit");
		b1=new JButton("Reset");
		l1.setBounds(100,10,150,30);
		l2.setBounds(10,60,100,30);
		t1.setBounds(130,60,100,30);
		l3.setBounds(10,110,100,30);
		t2.setBounds(130,110,100,30);
		b1.setBounds(100,160,70,30);
		b2.setBounds(190,110,70,30);
		F1.add(l1);
		F1.add(l2);
		F1.add(l3);
		F1.add(t1);
		F1.add(t2);
		F1.add(b1);
		F1.add(b2);
		F1.setTitle("form");
		F1.setSize(300,300);
		F1.setLayout(null);
		F1.setVisible(true);
	}
	
	

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		test t=new test();

	}

}
