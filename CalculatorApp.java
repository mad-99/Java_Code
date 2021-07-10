import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JLabel;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;

public class CalculatorApp implements ActionListener {

	private JFrame frame;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculatorApp window = new CalculatorApp();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public CalculatorApp() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 317, 250);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblFirst = new JLabel("First");
		lblFirst.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblFirst.setBounds(39, 29, 46, 14);
		frame.getContentPane().add(lblFirst);
		
		textField = new JTextField();
		textField.setBounds(109, 28, 122, 20);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		JLabel lblSecond = new JLabel("Second");
		lblSecond.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblSecond.setBounds(39, 77, 64, 14);
		frame.getContentPane().add(lblSecond);
		
		textField_1 = new JTextField();
		textField_1.setBounds(109, 75, 122, 20);
		frame.getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		JLabel lblNewLabel = new JLabel("Result");
		lblNewLabel.setFont(new Font("Tahoma", Font.BOLD, 13));
		lblNewLabel.setBounds(39, 158, 46, 14);
		frame.getContentPane().add(lblNewLabel);
		
		textField_2 = new JTextField();
		textField_2.setBounds(110, 156, 86, 32);
		frame.getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		JButton btnSubmit = new JButton("+");
		btnSubmit.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,res=0;
				try{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					res=num1+num2;
					textField_2.setText(Integer.toString(res));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
		});
		btnSubmit.setFont(new Font("Arial", Font.BOLD, 12));
		btnSubmit.setBounds(39, 116, 41, 23);
		frame.getContentPane().add(btnSubmit);
		
		JButton btnSubmit_1 = new JButton("-");
		btnSubmit_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,res=0;
				try{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					res=num1-num2;
					textField_2.setText(Integer.toString(res));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
		});
		btnSubmit_1.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnSubmit_1.setBounds(100, 116, 41, 23);
		frame.getContentPane().add(btnSubmit_1);
		
		JButton btnSubmit_2 = new JButton("/");
		btnSubmit_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,res=0;
				try{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					res=num1/num2;
					textField_2.setText(Integer.toString(res));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
		});
		btnSubmit_2.setFont(new Font("Arial", Font.BOLD, 13));
		btnSubmit_2.setBounds(163, 116, 41, 23);
		frame.getContentPane().add(btnSubmit_2);
		
		JButton btnSubmit_3 = new JButton("*");
		btnSubmit_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int num1,num2,res=0;
				try{
					num1=Integer.parseInt(textField.getText());
					num2=Integer.parseInt(textField_1.getText());
					res=num1*num2;
					textField_2.setText(Integer.toString(res));
				}catch(Exception e){
					JOptionPane.showMessageDialog(null, "Enter valid number");
				}
			}
		});
		btnSubmit_3.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnSubmit_3.setBounds(229, 116, 41, 23);
		frame.getContentPane().add(btnSubmit_3);
	}

	public void actionPerformed(ActionEvent arg0) {
		// TODO Auto-generated method stub
		
	}
}