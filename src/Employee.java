
import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.HeadlessException;

public  class Employee extends JFrame{
	
	private JPanel contentPane;
	private JTextField txtUsername1;
	private JPasswordField txtPassword1;
	protected String name, password;
	 Employee emp;
	 LinkedList<employeesWorkForPharmacy> employeelist= new LinkedList<employeesWorkForPharmacy>();

	
	public Employee() throws HeadlessException {
		initialize();
		this.name = txtUsername1.getText();
		this.password = txtPassword1.getText();
	
	}
	
	
	public Employee(String name, String password) throws HeadlessException {
		super();
		this.name = name;
		this.password = password;
	}

	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Employee frame = new Employee();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
		
		
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public void initialize() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(200, 200, 500, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Welcome to Bahcesehir Pharmacy");
		lblNewLabel.setFont(new Font("Times New Roman", Font.BOLD, 22));
		lblNewLabel.setBounds(72, 10, 439, 30);
		contentPane.add(lblNewLabel);
		
		JLabel lblNewLabel_1 = new JLabel("Employee name:");
		lblNewLabel_1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_1.setBounds(37, 69, 174, 35);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("Password:");
		lblNewLabel_2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		lblNewLabel_2.setBounds(37, 143, 146, 24);
		contentPane.add(lblNewLabel_2);
		
		txtUsername1 = new JTextField();
		txtUsername1.setBounds(243, 69, 96, 35);
		contentPane.add(txtUsername1);
		txtUsername1.setColumns(10);
		
		txtPassword1 = new JPasswordField();
		txtPassword1.setBounds(243, 132, 96, 35);
		contentPane.add(txtPassword1);
		
		JButton btnNewButton = new JButton("Login");
		btnNewButton.setFont(new Font("Times New Roman", Font.BOLD, 22));
		
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose(); //For closing the login frame
				String Epassword = txtPassword1.getText();
				String Eusername = txtUsername1.getText();
				emp= new Employee(Eusername,Epassword);
				
				
				if (Epassword.contains("123") && Eusername.contains("Mhnd")){
					txtPassword1.setText(null);
					txtUsername1.setText(null); 
					
					patientGUI fourth=new patientGUI();
					fourth.setVisible(true);
					
					if(employeelist.add(new employeesWorkForPharmacy(emp))) {
						System.out.println("yes, Mhnd has been added");
					}
				
					
					
					
					
					
				}
				else if (Epassword.contains("1900812") && Eusername.contains("umniah")){
					txtPassword1.setText(null);
					txtUsername1.setText(null); 
					
					patientGUI fourth=new patientGUI();
					fourth.setVisible(true);
				
					if(employeelist.add(new employeesWorkForPharmacy(emp))) {
						System.out.println("yes, umniah has been added");
					}
					
					
					
					
					
					
				}else if (Epassword.contains("2000") && Eusername.contains("lana")){
					txtPassword1.setText(null);
					txtUsername1.setText(null); 
					
					patientGUI fourth=new patientGUI();
					fourth.setVisible(true);
				
					if(employeelist.add(new employeesWorkForPharmacy(emp))) {
						System.out.println("yes, lana has been added");
					}
					
					
					
					
					
					
				}
					
					else
					{
						
						JOptionPane.showMessageDialog(null,"Invalid Login Details","Login Error", JOptionPane.ERROR_MESSAGE);
						txtPassword1.setText(null);
						txtUsername1.setText(null);
					}
				
        		
				
				
			}
		});
		btnNewButton.setBounds(370, 214, 106, 39);
		contentPane.add(btnNewButton);
	}
	
	

}
