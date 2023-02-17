package view;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JLabel;

/** @author Alan Santos
 *  @version 1.0
 *  @description All i wanna to say is that its time for some Rock 'n Roll \../
 * 
*/
public class Screen {

	private JFrame frmCalculadora;

	
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Screen window = new Screen();
					window.frmCalculadora.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	
	public Screen() {
		initialize();
	}

	
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 421, 702);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		JLabel lblText = new JLabel("0");
		lblText.setFont(new Font("Arial", Font.PLAIN, 75));
		lblText.setHorizontalAlignment(SwingConstants.RIGHT);
		lblText.setVerticalAlignment(SwingConstants.BOTTOM);
		lblText.setBounds(23, 44, 373, 98);
		frmCalculadora.getContentPane().add(lblText);
		
		JButton btnPercent = new JButton("%");
		btnPercent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPercent.setBounds(10, 153, 89, 75);
		frmCalculadora.getContentPane().add(btnPercent);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblText.setText("0");
			}
		});
		btnCe.setBounds(109, 153, 89, 75);
		frmCalculadora.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblText.setText("0");
			}
		});
		btnC.setBounds(208, 153, 89, 75);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnErase = new JButton("<=");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((!lblText.getText().equalsIgnoreCase("0") && 
					!(lblText.getText().length() == 0) && 
					!lblText.getText().equalsIgnoreCase(""))) {
						StringBuilder field = new StringBuilder(lblText.getText());
						field.deleteCharAt(field.length() -1);
						lblText.setText(field.toString());
				}
			}
		});
		btnErase.setBounds(307, 153, 89, 75);
		frmCalculadora.getContentPane().add(btnErase);
		
		JButton btnDivideSign = new JButton("/");
		btnDivideSign.setBounds(307, 239, 89, 75);
		frmCalculadora.getContentPane().add(btnDivideSign);
		
		JButton btnMultiplySign = new JButton("x");
		btnMultiplySign.setBounds(307, 325, 89, 75);
		frmCalculadora.getContentPane().add(btnMultiplySign);
		
		JButton btnMinusSign = new JButton("-");
		btnMinusSign.setBounds(307, 411, 89, 75);
		frmCalculadora.getContentPane().add(btnMinusSign);
		
		JButton btnPlusSign = new JButton("+");
		btnPlusSign.setBounds(307, 497, 89, 75);
		frmCalculadora.getContentPane().add(btnPlusSign);
		
		JButton btnx = new JButton("1/x");
		btnx.setBounds(10, 239, 89, 75);
		frmCalculadora.getContentPane().add(btnx);
		
		JButton btnSeven = new JButton("7");
		btnSeven.setBounds(10, 325, 89, 75);
		frmCalculadora.getContentPane().add(btnSeven);
		
		JButton btnFour = new JButton("4");
		btnFour.setBounds(10, 411, 89, 75);
		frmCalculadora.getContentPane().add(btnFour);
		
		JButton btnOne = new JButton("1");
		btnOne.setBounds(10, 497, 89, 75);
		frmCalculadora.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.setBounds(109, 497, 89, 75);
		frmCalculadora.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.setBounds(208, 497, 89, 75);
		frmCalculadora.getContentPane().add(btnThree);
		
		JButton btnFive = new JButton("5");
		btnFive.setBounds(109, 411, 89, 75);
		frmCalculadora.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.setBounds(208, 411, 89, 75);
		frmCalculadora.getContentPane().add(btnSix);
		
		JButton btnEight = new JButton("8");
		btnEight.setBounds(109, 325, 89, 75);
		frmCalculadora.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				if(lblText.getText().equalsIgnoreCase("0")) {
					lblText.setText("9");
				}
				else {
					String nine = lblText.getText();
					nine = nine + "9";
					lblText.setText(nine);
				}
			}
		});
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if(lblText.getText().equalsIgnoreCase("0")) {
					lblText.setText("9");
				}
			}
		});
		btnNine.setBounds(208, 325, 89, 75);
		frmCalculadora.getContentPane().add(btnNine);
		
		JButton btnX_1 = new JButton("x²");
		btnX_1.setBounds(109, 239, 89, 75);
		frmCalculadora.getContentPane().add(btnX_1);
		
		JButton btnx_1 = new JButton("²√x");
		btnx_1.setBounds(208, 239, 89, 75);
		frmCalculadora.getContentPane().add(btnx_1);
		
		JButton btnNewButton_11_1 = new JButton("+/-");
		btnNewButton_11_1.setBounds(10, 583, 89, 75);
		frmCalculadora.getContentPane().add(btnNewButton_11_1);
		
		JButton btnZero = new JButton("0");
		btnZero.setBounds(109, 583, 89, 75);
		frmCalculadora.getContentPane().add(btnZero);
		
		JButton btnComma = new JButton(",");
		btnComma.setBounds(208, 583, 89, 75);
		frmCalculadora.getContentPane().add(btnComma);
		
		JButton btnEqualSign = new JButton("=");
		btnEqualSign.setBounds(307, 583, 89, 75);
		frmCalculadora.getContentPane().add(btnEqualSign);
		
	}
}
