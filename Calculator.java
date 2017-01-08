package Calculators;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.SwingConstants;

public class Calculator {
//Here we declare the global variables
	private JFrame frame;
	private JTextField textField;
	
	double numb1;//Declares the first number
	double numb2;//Declares the second number
	double result;//Declares the calculations result
	String calcOperator;//Declares the calculations operator
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculator window = new Calculator();
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
	public Calculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(UIManager.getColor("Button.darkShadow"));
		frame.setBounds(100, 100, 237, 374);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("My Calculator");

		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 11, 201, 50);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		textField.setFont(new Font("Arial Rounded MT Bold", Font.BOLD, 25));
		
		
	

		// Button area
		// -------------------------- ROW 1-----------------------------------

		JButton btnClear = new JButton("C");
		
		btnClear.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				textField.setText(null);//Clears all the inputed numbers
			}
		});
		btnClear.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnClear.setBounds(10, 72, 50, 50);
		frame.getContentPane().add(btnClear);

		JButton btnPM = new JButton("+/-");
		btnPM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				double ops = Double.parseDouble(String.valueOf(textField.getText()));
				ops = ops * (-1);
				textField.setText(String.valueOf(ops));
			}
		});
		btnPM.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnPM.setBounds(60, 72, 50, 50);
		frame.getContentPane().add(btnPM);

		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numb1 = Double.parseDouble(textField.getText());
				textField.setText("");
				calcOperator= "%";
			}
		});
		btnPercent.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 10));
		btnPercent.setBounds(110, 72, 50, 50);
		frame.getContentPane().add(btnPercent);

		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numb1 = Double.parseDouble(textField.getText());
				textField.setText("");
				calcOperator= "+";
			}
		});
		btnPlus.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnPlus.setBounds(160, 72, 50, 50);
		frame.getContentPane().add(btnPlus);
		// -------------------------- ROW 2-----------------------------------

		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn7.getText();
				textField.setText(EnterNumber);
			}
		});
		
		btn7.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn7.setBounds(10, 122, 50, 50);
		frame.getContentPane().add(btn7);
		

		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn8.getText();
				textField.setText(EnterNumber);
			}
		});
		btn8.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn8.setBounds(60, 122, 50, 50);
		frame.getContentPane().add(btn8);

		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn9.getText();
				textField.setText(EnterNumber);
			}
		});
		btn9.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn9.setBounds(110, 122, 50, 50);
		frame.getContentPane().add(btn9);

		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numb1 = Double.parseDouble(textField.getText());
				textField.setText("");
				calcOperator= "-";
			}
		});
		btnSub.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnSub.setBounds(160, 122, 50, 50);
		frame.getContentPane().add(btnSub);

		// -------------------------- ROW 2-----------------------------------
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn4.getText();
				textField.setText(EnterNumber);
			}
		});
		btn4.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn4.setBounds(10, 172, 50, 50);
		frame.getContentPane().add(btn4);

		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn5.getText();
				textField.setText(EnterNumber);
			}
		});
		btn5.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn5.setBounds(60, 172, 50, 50);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn6.getText();
				textField.setText(EnterNumber);
			}
		});
		btn6.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn6.setBounds(110, 172, 50, 50);
		frame.getContentPane().add(btn6);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numb1 = Double.parseDouble(textField.getText());
				textField.setText("");
				calcOperator= "/";
			}
		});
		btnDiv.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnDiv.setBounds(160, 172, 50, 50);
		frame.getContentPane().add(btnDiv);

		// -------------------------- ROW 3-----------------------------------
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn1.getText();
				textField.setText(EnterNumber);
			}
		});
		btn1.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn1.setBounds(10, 222, 50, 50);
		frame.getContentPane().add(btn1);

		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn2.getText();
				textField.setText(EnterNumber);
			}
		});
		btn2.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn2.setBounds(60, 222, 50, 50);
		frame.getContentPane().add(btn2);

		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn3.getText();
				textField.setText(EnterNumber);
			}
		});
		btn3.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn3.setBounds(110,222, 50, 50);
		frame.getContentPane().add(btn3);

		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				numb1 = Double.parseDouble(textField.getText());
				textField.setText("");
				calcOperator= "*";
			}
		});
		btnMult.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnMult.setBounds(160, 222, 50, 50);
		frame.getContentPane().add(btnMult);

		// -------------------------- ROW 4-----------------------------------
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterNumber = textField.getText() + btn0.getText();
				textField.setText(EnterNumber);
			}
		});
		btn0.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btn0.setBounds(10, 272, 100, 50);
		frame.getContentPane().add(btn0);

		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String EnterDot = textField.getText() + btnDot.getText();
				textField.setText(EnterDot);
				
			}
		});
		btnDot.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnDot.setBounds(110, 272, 50, 50);
		frame.getContentPane().add(btnDot);

		
		JButton btnEqual= new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				String answer;
				numb2 = Double.parseDouble(textField.getText());
				
				switch (calcOperator) {
				case "+":
					result = numb1 + numb2;// Returns  the sum of the two numbers on the screen
					answer = String.format("%.2f", result);//This line formats the result answer into a float result with two decimal numbers
					textField.setText(answer);
					break;		
				case "-":
					result = numb1 - numb2;// Returns  the subtraction of the two numbers on the screen	
					answer = String.format("%.2f", result);
					textField.setText(answer);
					break;		
				case "/":
					result = numb1 / numb2;// Returns  the division of the two numbers on the screen	
					answer = String.format("%.2f", result);
					textField.setText(answer);
					break;		
				case "*":
					result = numb1 * numb2;// Returns  the multiplication of the two numbers on the screen
					answer = String.format("%.2f", result);
					textField.setText(answer);
					break;
				case "%":
					result = (numb1 * numb2)/100;// Returns  the percentage of the two numbers on the screen
					answer = String.format("%.2f", result);
					textField.setText(answer);
					break;
			}
			}
		});
		btnEqual.setFont(new Font("Arial Rounded MT Bold", Font.PLAIN, 20));
		btnEqual.setBounds(160,272, 50, 50);
		frame.getContentPane().add(btnEqual);
	}
}
