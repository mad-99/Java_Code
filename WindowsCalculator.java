import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;

public class WindowsCalculator implements ActionListener{
	JButton add, minus, multiply, divide, clear, dot, equal, delete;
	JButton b0, b1, b2, b3, b4 ,b5, b6, b7, b8, b9;
	JTextField tf;
	static double a = 0, b = 0, result = 0;
	static int operator = 0;
	public WindowsCalculator() {
		JFrame jf = new JFrame();
		tf = new JTextField();
		b1 = new JButton("1");
		b2 = new JButton("2");
		b3 = new JButton("3");
		b4 = new JButton("4");
		b5 = new JButton("5");
		b6 = new JButton("6");
		b7 = new JButton("7");
		b8 = new JButton("8");
		b9 = new JButton("9");
		b0 = new JButton("0");
		divide = new JButton("/");
		multiply = new JButton("x");
		minus = new JButton("-");
		add = new JButton("+");
		dot = new JButton(".");
		equal = new JButton("=");
		delete = new JButton("Delete");
		clear = new JButton("Clear");
		
		tf.setBounds(30,40,280,30);
		b7.setBounds(40,100,50,40);
		b8.setBounds(110,100,50,40);
		b9.setBounds(180,100,50,40);
		divide.setBounds(250,100,50,40);
		b4.setBounds(40,170,50,40);
		b5.setBounds(110,170,50,40);
		b6.setBounds(180,170,50,40);
		multiply.setBounds(250,170,50,40);
		b1.setBounds(40,240,50,40);
		b2.setBounds(110,240,50,40);
		b3.setBounds(180,240,50,40);
		minus.setBounds(250,240,50,40);
		dot.setBounds(40,310,50,40);
		b0.setBounds(110,310,50,40);
		equal.setBounds(180,310,50,40);
		add.setBounds(250,310,50,40);
		delete.setBounds(60,380,100,40);
		clear.setBounds(180,380,100,40);
		jf.add(tf);
		jf.add(b7);
		jf.add(b8);
		jf.add(b9);
		jf.add(divide);
		jf.add(b4);
		jf.add(b5);
		jf.add(b6);
		jf.add(multiply);
		jf.add(b1);
		jf.add(b2);
		jf.add(b3);
		jf.add(minus);
		jf.add(dot);
		jf.add(b0);
		jf.add(equal);
		jf.add(add);
		jf.add(delete);
		jf.add(clear);
		jf.setLayout(null);
	    jf.setSize(350, 500);
		jf.setVisible(true);
		jf.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		b1.addActionListener(this);
		b2.addActionListener(this);
		b3.addActionListener(this);
		b4.addActionListener(this);
		b5.addActionListener(this);
		b6.addActionListener(this);
		b7.addActionListener(this);
		b8.addActionListener(this);
		b9.addActionListener(this);
		b0.addActionListener(this);
		add.addActionListener(this);
		divide.addActionListener(this);
		multiply.addActionListener(this);
		minus.addActionListener(this);
		dot.addActionListener(this);
		equal.addActionListener(this);
		delete.addActionListener(this);
		clear.addActionListener(this);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == b1)
			tf.setText(tf.getText().concat("1"));
		if(e.getSource() == b2)
			tf.setText(tf.getText().concat("2"));
		if(e.getSource() == b3)
			tf.setText(tf.getText().concat("3"));
		if(e.getSource() == b4)
			tf.setText(tf.getText().concat("4"));			
		if(e.getSource() == b5)
			tf.setText(tf.getText().concat("5"));
		if(e.getSource() == b6)
			tf.setText(tf.getText().concat("6"));
		if(e.getSource() == b7)
			tf.setText(tf.getText().concat("7"));
		if(e.getSource() == b8)
			tf.setText(tf.getText().concat("8"));
		if(e.getSource() == b9)
			tf.setText(tf.getText().concat("9"));
		if(e.getSource() == b0)
			tf.setText(tf.getText().concat("0"));
		if(e.getSource() == dot)
			tf.setText(tf.getText().concat("."));
		if(e.getSource() == add) {
			a = Double.parseDouble(tf.getText());
			operator = 1;
			tf.setText("");
		}
		if(e.getSource() == minus) {
			a = Double.parseDouble(tf.getText());
			operator = 2;
			tf.setText("");
		}
		if(e.getSource() == multiply) {
			a = Double.parseDouble(tf.getText());
			operator = 3;
			tf.setText("");
		}
		if(e.getSource() == divide) {
			a = Double.parseDouble(tf.getText());
			operator = 4;
			tf.setText("");
		}
		if(e.getSource() == equal) {
			b = Double.parseDouble(tf.getText());
			switch(operator) {
			case 1: result = a + b;
			break;
			case 2: result = a - b;
			break;
			case 3: result = a * b;
			break;
			case 4: result = a / b;
			break;
			default: result = 0;
			}
			tf.setText("" + result);
		}
		if(e.getSource() == clear)
			tf.setText("");
		if(e.getSource() == delete) {
			String s = tf.getText();
			tf.setText("");
			for(int i = 0; i < s.length() - 1; i++) {
				tf.setText(tf.getText() + s.charAt(i));
			}
		}

		// TODO Auto-generated method stub
		
	}

	public static void main(String[] args) {
		new WindowsCalculator();
		// TODO Auto-generated method stub

	}

}
