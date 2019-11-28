package Week1_Advanced;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class CalculaterWindow {

	private JFrame frame;
	private JTextField txtDisplay;
	private JButton btn0, btn1, btn2, btn3, btn4, btn5, btn6, btn7, btn8, btn9, btnDot;
	private JButton btnP, btnM, btnMult, btnDiv, btnEmpty, btnC, btnEqual;
	double firstNum = 0;
	double secondNum = 0;
	double result = 0;
	String operations;
	String operations2;
	String answer;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculaterWindow window = new CalculaterWindow();
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
	public CalculaterWindow() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 267, 397);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		txtDisplay = new JTextField();
		txtDisplay.setBounds(10, 11, 230, 32);
		frame.getContentPane().add(txtDisplay);
		txtDisplay.setColumns(10);
		
		// Row1==============
		
		// Clean all the text
		btnEmpty = new JButton("AC");
		btnEmpty.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtDisplay.setText("");
				firstNum = 0;
				secondNum = 0;
				result = 0;
				answer = null;
			}
		});
		btnEmpty.setBounds(10, 53, 110, 50);
		frame.getContentPane().add(btnEmpty);	
		
		// BackSpace
		btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				String backSpace = null;
				if(txtDisplay.getText().length()>0) {
					StringBuilder strB = new StringBuilder(txtDisplay.getText());
					strB.deleteCharAt(txtDisplay.getText().length()-1);
					backSpace = strB.toString();
					txtDisplay.setText(backSpace);
				}
				
			}
		});
		btnC.setBounds(130, 53, 50, 50);
		frame.getContentPane().add(btnC);
		
		// // Operation Divided by
		btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "/";
			}
		});
		btnDiv.setBounds(190, 53, 50, 50);
		frame.getContentPane().add(btnDiv);
		

		// Row2==============
		
		// Button number 7 
		btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn7.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn7.setBounds(10, 113, 50, 50);
		frame.getContentPane().add(btn7);
		
		// Button number 8
		btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn8.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn8.setBounds(70, 112, 50, 50);
		frame.getContentPane().add(btn8);
		
		// Button number 9
		btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn9.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn9.setBounds(130, 112, 50, 50);
		frame.getContentPane().add(btn9);

		// Operation multiplied by
		btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "*";
			}
		});
		btnMult.setBounds(190, 113, 50, 50);
		frame.getContentPane().add(btnMult);

		// Row3==============
		
		// Button number 4
		btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn4.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn4.setBounds(10, 173, 50, 50);
		frame.getContentPane().add(btn4);
		
		// Button number 5
		btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn5.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn5.setBounds(70, 173, 50, 50);
		frame.getContentPane().add(btn5);
		
		// Button number 6
		btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn6.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn6.setBounds(130, 173, 50, 50);
		frame.getContentPane().add(btn6);

		// Operation minus
		btnM = new JButton("-");
		btnM.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "-";
			}
		});
		btnM.setBounds(190, 173, 50, 50);
		frame.getContentPane().add(btnM);
		
		// Row4==============

		// Button number 1
		btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn1.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn1.setBounds(10, 234, 50, 50);
		frame.getContentPane().add(btn1);
		
		// Button number 2
		btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn2.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn2.setBounds(70, 234, 50, 50);
		frame.getContentPane().add(btn2);
		
		// Button number 3
		btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn3.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn3.setBounds(130, 234, 50, 50);
		frame.getContentPane().add(btn3);

		// Operation plus
		btnP = new JButton("+");
		btnP.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				firstNum = Double.parseDouble(txtDisplay.getText());
				txtDisplay.setText("");
				operations = "+";
			}
		});
		btnP.setBounds(190, 234, 50, 50);
		frame.getContentPane().add(btnP);
		
		//Row5==================
		
		// Button number 0
		btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btn0.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btn0.setBounds(10, 294, 110, 50);
		frame.getContentPane().add(btn0);
		
		btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String EnterNum = txtDisplay.getText() + btnDot.getText();
				txtDisplay.setText(EnterNum);
			}
		});
		btnDot.setBounds(130, 294, 50, 50);
		frame.getContentPane().add(btnDot);
		
		// Operation equals
		btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				secondNum = Double.parseDouble(txtDisplay.getText());
				if(operations == "+") {
					
					result = firstNum + secondNum;
					answer = String.format("%s", result);
					txtDisplay.setText(answer);
					
				}else if(operations == "-") {
					
					result = firstNum - secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}else if(operations == "*") {
					
					result = firstNum * secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}else if(operations == "/") {
					
					result = firstNum / secondNum;
					answer = String.format("%.2f", result);
					txtDisplay.setText(answer);
					
				}
				
			}
		});
		btnEqual.setBounds(190, 294, 50, 50);
		frame.getContentPane().add(btnEqual);		
		
	}
}
