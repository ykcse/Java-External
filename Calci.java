package calculator;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.GridLayout;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import java.awt.Font;
import java.awt.Component;
import java.awt.Color;
import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.border.LineBorder;
import javax.swing.SwingConstants;

public class Calci extends JFrame implements ActionListener{
	JButton btnNewButton_49 ;
	JLabel label;
	public Calci() {
		getContentPane().setBackground(Color.BLACK);
		setTitle("Scientific Calculator");
		setBounds(100, 100, 1000, 460);
		getContentPane().setLayout(null);

		JPanel panel = new JPanel();
		panel.setBackground(Color.BLACK);
		panel.setBounds(12, 110, 958, 290);
		getContentPane().add(panel);
		panel.setLayout(new GridLayout(0, 10, 0, 0));

		JLabel lblRad = new JLabel("Rad");
		lblRad.setForeground(Color.WHITE);
		lblRad.setFont(new Font("Arial", Font.BOLD, 16));
		lblRad.setBounds(22, 85, 56, 16);
		getContentPane().add(lblRad);

		label = new JLabel("0");
		label.setFont(new Font("Arial", Font.BOLD, 50));
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setForeground(Color.WHITE);
		label.setBounds(22, 31, 919, 46);
		getContentPane().add(label);

		JButton btnNewButton = new JButton("m-");
		btnNewButton.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton.setForeground(Color.WHITE);
		btnNewButton.setBackground(Color.GRAY);
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 16));

		JButton btnNewButton_10 = new JButton("(");
		btnNewButton_10.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_10.setForeground(Color.WHITE);
		btnNewButton_10.setBackground(Color.GRAY);
		btnNewButton_10.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_10);

		JButton btnNewButton_3 = new JButton(")");
		btnNewButton_3.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_3.setForeground(Color.WHITE);
		btnNewButton_3.setBackground(Color.GRAY);
		btnNewButton_3.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_3);

		JButton btnNewButton_2 = new JButton("mc");
		btnNewButton_2.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_2.setForeground(Color.WHITE);
		btnNewButton_2.setBackground(Color.GRAY);
		btnNewButton_2.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_2);

		JButton btnNewButton_1 = new JButton("m+");
		btnNewButton_1.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_1.setForeground(Color.WHITE);
		btnNewButton_1.setBackground(Color.GRAY);
		btnNewButton_1.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_1);
		panel.add(btnNewButton);

		JButton btnNewButton_4 = new JButton("mr");
		btnNewButton_4.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_4.setForeground(Color.WHITE);
		btnNewButton_4.setBackground(Color.GRAY);
		btnNewButton_4.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_4);

		JButton btnNewButton_5 = new JButton("AC");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText("0");
			}
		});
		btnNewButton_5.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_5.setForeground(Color.BLACK);
		btnNewButton_5.setBackground(Color.LIGHT_GRAY);
		btnNewButton_5.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_5);

		JButton btnNewButton_6 = new JButton("+/-");
		btnNewButton_6.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_6.setForeground(Color.BLACK);
		btnNewButton_6.setBackground(Color.LIGHT_GRAY);
		btnNewButton_6.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_6);

		JButton btnNewButton_7 = new JButton("%");
		btnNewButton_7.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_7.setForeground(Color.BLACK);
		btnNewButton_7.setBackground(Color.LIGHT_GRAY);
		btnNewButton_7.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_7);

		JButton btnNewButton_8 = new JButton("/");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = label.getText();
				char c = s.charAt(s.length() - 1);
				if (c == '/' || c == '*' || c == '+' || c == '-')
					return;
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + " / ");
			}
		});
		btnNewButton_8.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_8.setForeground(Color.WHITE);
		btnNewButton_8.setBackground(Color.ORANGE);
		btnNewButton_8.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_8);

		JButton btnNewButton_9 = new JButton("2nd");
		btnNewButton_9.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_9.setForeground(Color.WHITE);
		btnNewButton_9.setBackground(Color.GRAY);
		btnNewButton_9.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_9);

		JButton btnNewButton_20 = new JButton("x^2");
		btnNewButton_20.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_20.setForeground(Color.WHITE);
		btnNewButton_20.setBackground(Color.GRAY);
		btnNewButton_20.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_20);

		JButton btnNewButton_11 = new JButton("x^3");
		btnNewButton_11.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_11.setForeground(Color.WHITE);
		btnNewButton_11.setBackground(Color.GRAY);
		btnNewButton_11.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_11);

		JButton btnNewButton_12 = new JButton("x^y");
		btnNewButton_12.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_12.setForeground(Color.WHITE);
		btnNewButton_12.setBackground(Color.GRAY);
		btnNewButton_12.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_12);

		JButton btnNewButton_13 = new JButton("e^x");
		btnNewButton_13.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_13.setForeground(Color.WHITE);
		btnNewButton_13.setBackground(Color.GRAY);
		btnNewButton_13.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_13);

		JButton btnNewButton_14 = new JButton("10^x");
		btnNewButton_14.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_14.setForeground(Color.WHITE);
		btnNewButton_14.setBackground(Color.GRAY);
		btnNewButton_14.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_14);

		JButton btnNewButton_15 = new JButton("7");
		btnNewButton_15.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "7");
			}
		});
		btnNewButton_15.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_15.setForeground(Color.WHITE);
		btnNewButton_15.setBackground(Color.GRAY);
		btnNewButton_15.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_15);

		JButton btnNewButton_16 = new JButton("8");
		btnNewButton_16.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "8");
			}
		});
		btnNewButton_16.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_16.setForeground(Color.WHITE);
		btnNewButton_16.setBackground(Color.GRAY);
		btnNewButton_16.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_16);

		JButton btnNewButton_17 = new JButton("9");
		btnNewButton_17.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "9");
			}
		});
		btnNewButton_17.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_17.setForeground(Color.WHITE);
		btnNewButton_17.setBackground(Color.GRAY);
		btnNewButton_17.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_17);

		JButton btnNewButton_18 = new JButton("X");
		btnNewButton_18.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = label.getText();
				char c = s.charAt(s.length() - 1);
				if (c == '/' || c == '*' || c == '+' || c == '-')
					return;
				label.setText(label.getText() + " * ");
			}
		});
		btnNewButton_18.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_18.setForeground(Color.WHITE);
		btnNewButton_18.setBackground(Color.ORANGE);
		btnNewButton_18.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_18);

		JButton btnNewButton_19 = new JButton("1/x");
		btnNewButton_19.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_19.setForeground(Color.WHITE);
		btnNewButton_19.setBackground(Color.GRAY);
		btnNewButton_19.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_19);

		JButton btnNewButton_30 = new JButton("x^(1/2)");
		btnNewButton_30.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_30.setForeground(Color.WHITE);
		btnNewButton_30.setBackground(Color.GRAY);
		btnNewButton_30.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_30);

		JButton btnNewButton_21 = new JButton("x^(1/3)");
		btnNewButton_21.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_21.setForeground(Color.WHITE);
		btnNewButton_21.setBackground(Color.GRAY);
		btnNewButton_21.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_21);

		JButton btnNewButton_22 = new JButton("x^(1/y)");
		btnNewButton_22.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_22.setForeground(Color.WHITE);
		btnNewButton_22.setBackground(Color.GRAY);
		btnNewButton_22.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_22);

		JButton btnNewButton_23 = new JButton("ln");
		btnNewButton_23.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_23.setForeground(Color.WHITE);
		btnNewButton_23.setBackground(Color.GRAY);
		btnNewButton_23.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_23);

		JButton btnNewButton_24 = new JButton("log10");
		btnNewButton_24.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_24.setForeground(Color.WHITE);
		btnNewButton_24.setBackground(Color.GRAY);
		btnNewButton_24.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_24);

		JButton btnNewButton_25 = new JButton("4");
		btnNewButton_25.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "4");
			}
		});
		btnNewButton_25.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_25.setForeground(Color.WHITE);
		btnNewButton_25.setBackground(Color.GRAY);
		btnNewButton_25.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_25);

		JButton btnNewButton_26 = new JButton("5");
		btnNewButton_26.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "5");
			}
		});
		btnNewButton_26.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_26.setForeground(Color.WHITE);
		btnNewButton_26.setBackground(Color.GRAY);
		btnNewButton_26.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_26);

		JButton btnNewButton_27 = new JButton("6");
		btnNewButton_27.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "6");
			}
		});
		btnNewButton_27.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_27.setForeground(Color.WHITE);
		btnNewButton_27.setBackground(Color.GRAY);
		btnNewButton_27.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_27);

		JButton btnNewButton_28 = new JButton("-");
		btnNewButton_28.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = label.getText();
				char c = s.charAt(s.length() - 1);
				if (c == '/' || c == '*' || c == '+' || c == '-')
					return;
				label.setText(label.getText() + " - ");
			}
		});
		btnNewButton_28.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_28.setForeground(Color.WHITE);
		btnNewButton_28.setBackground(Color.ORANGE);
		btnNewButton_28.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_28);

		JButton btnNewButton_29 = new JButton("x!");
		btnNewButton_29.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_29.setForeground(Color.WHITE);
		btnNewButton_29.setBackground(Color.GRAY);
		btnNewButton_29.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_29);

		JButton btnNewButton_40 = new JButton("sin");
		btnNewButton_40.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_40.setForeground(Color.WHITE);
		btnNewButton_40.setBackground(Color.GRAY);
		btnNewButton_40.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_40);

		JButton btnNewButton_31 = new JButton("cos");
		btnNewButton_31.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_31.setForeground(Color.WHITE);
		btnNewButton_31.setBackground(Color.GRAY);
		btnNewButton_31.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_31);

		JButton btnNewButton_32 = new JButton("tan");
		btnNewButton_32.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_32.setForeground(Color.WHITE);
		btnNewButton_32.setBackground(Color.GRAY);
		btnNewButton_32.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_32);

		JButton btnNewButton_33 = new JButton("e");
		btnNewButton_33.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_33.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_33.setForeground(Color.WHITE);
		btnNewButton_33.setBackground(Color.GRAY);
		btnNewButton_33.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_33);

		JButton btnNewButton_34 = new JButton("EE");
		btnNewButton_34.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_34.setForeground(Color.WHITE);
		btnNewButton_34.setBackground(Color.GRAY);
		btnNewButton_34.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_34);

		JButton btnNewButton_35 = new JButton("1");
		btnNewButton_35.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "1");
			}
		});
		btnNewButton_35.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_35.setForeground(Color.WHITE);
		btnNewButton_35.setBackground(Color.GRAY);
		btnNewButton_35.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_35);

		JButton btnNewButton_36 = new JButton("2");
		btnNewButton_36.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "2");
			}
		});
		btnNewButton_36.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_36.setForeground(Color.WHITE);
		btnNewButton_36.setBackground(Color.GRAY);
		btnNewButton_36.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_36);

		JButton btnNewButton_37 = new JButton("3");
		btnNewButton_37.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "3");
			}
		});
		btnNewButton_37.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_37.setForeground(Color.WHITE);
		btnNewButton_37.setBackground(Color.GRAY);
		btnNewButton_37.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_37);

		JButton btnNewButton_38 = new JButton("+");
		btnNewButton_38.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(label.getText() + " + ");
			}
		});
		btnNewButton_38.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_38.setForeground(Color.WHITE);
		btnNewButton_38.setBackground(Color.ORANGE);
		btnNewButton_38.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_38);

		JButton btnNewButton_39 = new JButton("Deg");
		btnNewButton_39.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String s = lblRad.getText();
				if (s.equals("Deg")) {
					btnNewButton_39.setText("Deg");
					lblRad.setText("Rad");
				} else {
					btnNewButton_39.setText("Rad");
					lblRad.setText("Deg");
				}
			}
		});
		btnNewButton_39.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_39.setForeground(Color.WHITE);
		btnNewButton_39.setBackground(Color.GRAY);
		btnNewButton_39.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_39);

		JButton btnNewButton_41 = new JButton("sinh");
		btnNewButton_41.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_41.setForeground(Color.WHITE);
		btnNewButton_41.setBackground(Color.GRAY);
		btnNewButton_41.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_41);

		JButton btnNewButton_42 = new JButton("cosh");
		btnNewButton_42.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_42.setForeground(Color.WHITE);
		btnNewButton_42.setBackground(Color.GRAY);
		btnNewButton_42.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_42);

		JButton btnNewButton_43 = new JButton("tanh");
		btnNewButton_43.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_43.setForeground(Color.WHITE);
		btnNewButton_43.setBackground(Color.GRAY);
		btnNewButton_43.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_43);

		JButton btnNewButton_44 = new JButton("pi");
		btnNewButton_44.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_44.setForeground(Color.WHITE);
		btnNewButton_44.setBackground(Color.GRAY);
		btnNewButton_44.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_44);

		JButton btnNewButton_45 = new JButton("Rand");
		btnNewButton_45.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_45.setForeground(Color.WHITE);
		btnNewButton_45.setBackground(Color.GRAY);
		btnNewButton_45.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_45);

		JButton btnNewButton_46 = new JButton("^");
		btnNewButton_46.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_46.setForeground(Color.WHITE);
		btnNewButton_46.setBackground(Color.GRAY);
		btnNewButton_46.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_46);

		JButton btnNewButton_47 = new JButton("0");
		btnNewButton_47.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if (label.getText().equals("0")) {
					label.setText("");
				}
				label.setText(label.getText() + "0");
			}
		});
		btnNewButton_47.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_47.setForeground(Color.WHITE);
		btnNewButton_47.setBackground(Color.GRAY);
		btnNewButton_47.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_47);

		JButton btnNewButton_48 = new JButton(".");
		btnNewButton_48.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_48.setForeground(Color.WHITE);
		btnNewButton_48.setBackground(Color.GRAY);
		btnNewButton_48.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_48);

		btnNewButton_49 = new JButton("=");
		btnNewButton_49.setBorder(new LineBorder(new Color(0, 0, 0), 1, true));
		btnNewButton_49.setForeground(Color.WHITE);
		btnNewButton_49.setBackground(Color.ORANGE);
		btnNewButton_49.setFont(new Font("Arial", Font.BOLD, 16));
		panel.add(btnNewButton_49); 
		btnNewButton_49.addActionListener(this);

		setVisible(true);
	}
	public void actionPerformed(ActionEvent e)
	{
		if(e.getSource()==btnNewButton_49)
		{
			EvaluateString obj=new EvaluateString();
			String op=label.getText();
			System.out.println(op);
			
			int answer=obj.evaluate(op);
			System.out.println(answer);
			String a1=""+answer;
			label.setText(a1);
		}
		
	}

	public static void main(String args[]) {
  Calci obj = new Calci();
	}
}
package hw11;

import java.util.Stack; 

public class EvaluateString 
{ 
	public static int evaluate(String expression) 
	{ 
		char[] tokens = expression.toCharArray(); 

		// Stack for numbers: 'values' 
		Stack<Integer> values = new Stack<Integer>(); 

		// Stack for Operators: 'ops' 
		Stack<Character> ops = new Stack<Character>(); 

		for (int i = 0; i < tokens.length; i++) 
		{ 
			// Current token is a whitespace, skip it 
			if (tokens[i] == ' ') 
				continue; 

			// Current token is a number, push it to stack for numbers 
			if (tokens[i] >= '0' && tokens[i] <= '9') 
			{ 
				StringBuffer sbuf = new StringBuffer(); 
				// There may be more than one digits in number 
				while (i < tokens.length && tokens[i] >= '0' && tokens[i] <= '9') 
					sbuf.append(tokens[i++]); 
				values.push(Integer.parseInt(sbuf.toString())); 
			} 

			else if (tokens[i] == '(') 
				ops.push(tokens[i]); 
          	else if (tokens[i] == ')') 
			{ 
				while (ops.peek() != '(') 
				values.push(applyOp(ops.pop(), values.pop(), values.pop())); 
				ops.pop(); 
			} 

			// Current token is an operator. 
			else if (tokens[i] == '+' || tokens[i] == '-' || 
					tokens[i] == '*' || tokens[i] == '/') 
			{ 
				// While top of 'ops' has same or greater precedence to current 
				// token, which is an operator. Apply operator on top of 'ops' 
				// to top two elements in values stack 
				while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) 
				values.push(applyOp(ops.pop(), values.pop(), values.pop())); 

				// Push current token to 'ops'. 
				ops.push(tokens[i]); 
			} 
		} 

		while (!ops.empty()) 
			values.push(applyOp(ops.pop(), values.pop(), values.pop())); 

			return values.pop(); 
	} 

	// Returns true if 'op2' has higher or same precedence as 'op1', 
	// otherwise returns false. 
	public static boolean hasPrecedence(char op1, char op2) 
	{ 
		if (op2 == '(' || op2 == ')') 
			return false; 
		if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-')) 
			return false; 
		else
			return true; 
	} 

	// A utility method to apply an operator 'op' on operands 'a' 
	// and 'b'. Return the result. 
	public static int applyOp(char op, int b, int a) 
	{ 
		switch (op) 
		{ 
		case '+': 
			return a + b; 
		case '-': 
			return a - b; 
		case '*': 
			return a * b; 
		case '/': 
			if (b == 0) 
				throw new
				UnsupportedOperationException("Cannot divide by zero"); 
			return a / b; 
		} 
		return 0; 
	}
	
}

