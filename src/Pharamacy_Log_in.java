
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Color;
import java.awt.Font;

public class Pharamacy_Log_in {

	protected JFrame frame;
	private  JTextField txtUsername1;
	private JPasswordField txtPassword1;

	protected String password;
	protected String Pharmacy_name ;
	
	
	public Pharamacy_Log_in() {
		initialize();
		this.password=txtPassword1.getText();
		this.Pharmacy_name=txtUsername1.getText();
	
		
	}
	
     public Pharamacy_Log_in(String password, String pharmacy_name) {
    	 initialize();
		this.password = txtPassword1.getText();
		Pharmacy_name = txtUsername1.getText();
	}




	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Pharamacy_Log_in window = new Pharamacy_Log_in();
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
	

	


	
	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(200, 200, 500, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblWelcome = new JLabel("Welcome");
		lblWelcome.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblWelcome.setForeground(Color.RED);
		lblWelcome.setBounds(209, 22, 101, 43);
		frame.getContentPane().add(lblWelcome);

		JLabel lblUsername = new JLabel("Pharmacy name:");
		lblUsername.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblUsername.setForeground(Color.BLUE);
		lblUsername.setBounds(63, 78, 162, 43);
		frame.getContentPane().add(lblUsername);

		JLabel lblPassword = new JLabel("Password:");
		lblPassword.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblPassword.setForeground(Color.BLUE);
		lblPassword.setBounds(63, 147, 135, 43);
		frame.getContentPane().add(lblPassword);

		txtUsername1 = new JTextField();
		txtUsername1.setBounds(235, 78, 96, 34);
		frame.getContentPane().add(txtUsername1);
		txtUsername1.setColumns(10);

		txtPassword1 = new JPasswordField();
		txtPassword1.setBounds(235, 147, 96, 34);
		frame.getContentPane().add(txtPassword1);

		JButton btnNewButton = new JButton("Login");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				String phpassword=txtPassword1.getText();
				String phPharmacy_name =txtUsername1.getText();

				if (phpassword.contains("123") && phPharmacy_name.contains("Bahcesehir")) {
					txtPassword1.setText(null);
					txtUsername1.setText(null);
					frame.dispose();
					Employee empl = new Employee();
					empl.setVisible(true);
				}
				/*
				 * Before adding else if line 98, you wrote if and else statement.
				 * Since you control the pharmacy name checks with separate structures, the last part goes to the else part.
				 * Now, all if structures are related to each other.
				 */
			

				else {

					JOptionPane.showMessageDialog(null, "Invalid Login Details", "Login Error",
							JOptionPane.ERROR_MESSAGE);
					txtPassword1.setText(null);
					txtUsername1.setText(null);
				}
				
				

			}
		});
		btnNewButton.setBounds(350, 212, 85, 21);
		frame.getContentPane().add(btnNewButton);
	}

	@Override
	public String toString() {
		return "Pharamacy name: Bahcesehir";
	}


	

}
