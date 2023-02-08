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

/** @author Alan Santos
 * @version 1.0
 *  @description All i wanna to say is that its time for some Rock 'n Roll \../
 * 
*/
public class Screen {

	private JFrame frmCalculadora;
	private JTextField txtResult;

	
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

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmCalculadora = new JFrame();
		frmCalculadora.setTitle("Calculadora");
		frmCalculadora.setBounds(100, 100, 421, 702);
		frmCalculadora.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frmCalculadora.getContentPane().setLayout(null);
		
		txtResult = new JTextField();
		txtResult.setText("0");
		txtResult.setHorizontalAlignment(SwingConstants.RIGHT);
		Font font1 = new Font("SansSerif", Font.BOLD, 20);
		txtResult.setFont(new Font("Arial", Font.BOLD, 70));
		txtResult.setBounds(10, 26, 386, 99);
		frmCalculadora.getContentPane().add(txtResult);
		txtResult.setColumns(10);
		
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
				txtResult.setText("0");
			}
		});
		btnCe.setBounds(109, 153, 89, 75);
		frmCalculadora.getContentPane().add(btnCe);
		
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				txtResult.setText("0");
			}
		});
		btnC.setBounds(208, 153, 89, 75);
		frmCalculadora.getContentPane().add(btnC);
		
		JButton btnErase = new JButton("<=");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				if((!txtResult.getText().equalsIgnoreCase("0") && 
					!(txtResult.getText().length() == 0) && 
					!txtResult.getText().equalsIgnoreCase(""))) {
						StringBuilder field = new StringBuilder(txtResult.getText());
						field.deleteCharAt(field.length() -1);
						txtResult.setText(field.toString());
				}
			}
		});
		btnErase.setBounds(307, 153, 89, 75);
		frmCalculadora.getContentPane().add(btnErase);
		
		JButton btnDivideSign = new JButton("/");
		btnDivideSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnDivideSign.setBounds(307, 239, 89, 75);
		frmCalculadora.getContentPane().add(btnDivideSign);
		
		JButton btnMultiplySign = new JButton("x");
		btnMultiplySign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMultiplySign.setBounds(307, 325, 89, 75);
		frmCalculadora.getContentPane().add(btnMultiplySign);
		
		JButton btnMinusSign = new JButton("-");
		btnMinusSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMinusSign.setBounds(307, 411, 89, 75);
		frmCalculadora.getContentPane().add(btnMinusSign);
		
		JButton btnPlusSign = new JButton("+");
		btnPlusSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnPlusSign.setBounds(307, 497, 89, 75);
		frmCalculadora.getContentPane().add(btnPlusSign);
		
		JButton btnx = new JButton("1/x");
		btnx.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnx.setBounds(10, 239, 89, 75);
		frmCalculadora.getContentPane().add(btnx);
		
		JButton btnSeven = new JButton("7");
		btnSeven.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSeven.setBounds(10, 325, 89, 75);
		frmCalculadora.getContentPane().add(btnSeven);
		
		JButton btnFour = new JButton("4");
		btnFour.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFour.setBounds(10, 411, 89, 75);
		frmCalculadora.getContentPane().add(btnFour);
		
		JButton btnOne = new JButton("1");
		btnOne.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnOne.setBounds(10, 497, 89, 75);
		frmCalculadora.getContentPane().add(btnOne);
		
		JButton btnTwo = new JButton("2");
		btnTwo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnTwo.setBounds(109, 497, 89, 75);
		frmCalculadora.getContentPane().add(btnTwo);
		
		JButton btnThree = new JButton("3");
		btnThree.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnThree.setBounds(208, 497, 89, 75);
		frmCalculadora.getContentPane().add(btnThree);
		
		JButton btnFive = new JButton("5");
		btnFive.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnFive.setBounds(109, 411, 89, 75);
		frmCalculadora.getContentPane().add(btnFive);
		
		JButton btnSix = new JButton("6");
		btnSix.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnSix.setBounds(208, 411, 89, 75);
		frmCalculadora.getContentPane().add(btnSix);
		
		JButton btnEight = new JButton("8");
		btnEight.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEight.setBounds(109, 325, 89, 75);
		frmCalculadora.getContentPane().add(btnEight);
		
		JButton btnNine = new JButton("9");
		btnNine.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNine.setBounds(208, 325, 89, 75);
		frmCalculadora.getContentPane().add(btnNine);
		
		JButton btnX_1 = new JButton("x²");
		btnX_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnX_1.setBounds(109, 239, 89, 75);
		frmCalculadora.getContentPane().add(btnX_1);
		
		JButton btnx_1 = new JButton("²√x");
		btnx_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnx_1.setBounds(208, 239, 89, 75);
		frmCalculadora.getContentPane().add(btnx_1);
		
		JButton btnNewButton_11_1 = new JButton("+/-");
		btnNewButton_11_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton_11_1.setBounds(10, 583, 89, 75);
		frmCalculadora.getContentPane().add(btnNewButton_11_1);
		
		JButton btnZero = new JButton("0");
		btnZero.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnZero.setBounds(109, 583, 89, 75);
		frmCalculadora.getContentPane().add(btnZero);
		
		JButton btnComma = new JButton(",");
		btnComma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnComma.setBounds(208, 583, 89, 75);
		frmCalculadora.getContentPane().add(btnComma);
		
		JButton btnEqualSign = new JButton("=");
		btnEqualSign.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEqualSign.setBounds(307, 583, 89, 75);
		frmCalculadora.getContentPane().add(btnEqualSign);
	}
}
