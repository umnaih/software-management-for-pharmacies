import java.awt.EventQueue;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.event.DocumentEvent;
import javax.swing.event.DocumentListener;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;
import javax.swing.table.TableRowSorter;

import java.awt.Color;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.ButtonGroup;
import javax.swing.JComboBox;
import javax.swing.JRadioButton;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JScrollPane;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.LinkedHashMap;
import java.util.LinkedList;

public class patientGUI extends JFrame {

	private JPanel contentPane;
	private JTextField ID;
	private JTextField Name;
	private JTextField Surname;
	private JTextField Phone;
	private JTextField Age;
	private JTextField Email;
	private JTextField Med;
	private JTextField search;
	private JTable table;
	private JScrollPane scrollPane;
	private JFrame frame;
	private JButton btnadd;
	private JButton btndelete;
	private JButton btnupdate;
	private JLabel lblsearch;
	private String[] address = {"Istanbul", "Ankara" , "Bursa" , "Antalya"};
	private JComboBox cmbaddress;
	private JRadioButton rdbtnNewRadioButtonFemale ;
	private JRadioButton rdbtnNewRadioButtonMale ;
	private ButtonGroup group;
	private String gender = "";
	DefaultTableModel model;

	Pharamacy_Log_in ph= new Pharamacy_Log_in("123", "Bahcesehir");
	LinkedHashMap<Pharamacy_Log_in, Patient> linkedlistMap = new LinkedHashMap<Pharamacy_Log_in, Patient>(); 



	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					patientGUI frame = new patientGUI();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public patientGUI() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(400,400, 1500, 549);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(127, 179, 213));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		setLocationRelativeTo(null);
		
		
		JPanel panel = new JPanel();
		panel.setForeground(new Color(219, 112, 147));
		panel.setBounds(0, 0, -32348, 32475);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblId = new JLabel("ID:");
		lblId.setBounds(20, 23, 45, 13);
		contentPane.add(lblId);
		
		JLabel lblName = new JLabel("Name:");
		lblName.setBounds(20, 50, 45, 13);
		contentPane.add(lblName);
		
		JLabel lblSurname = new JLabel("Surname:");
		lblSurname.setBounds(20, 83, 68, 13);
		contentPane.add(lblSurname);
		
		JLabel lblPhoneNumber = new JLabel("Phone number:");
		lblPhoneNumber.setBounds(20, 126, 86, 13);
		contentPane.add(lblPhoneNumber);
		
		JLabel lblGender = new JLabel("Gender:");
		lblGender.setBounds(20, 160, 68, 13);
		contentPane.add(lblGender);
		
		JLabel lblAge = new JLabel("Age:");
		lblAge.setBounds(20, 193, 45, 13);
		contentPane.add(lblAge);
		
		JLabel lblEmailAddress = new JLabel("Email address:");
		lblEmailAddress.setBounds(20, 239, 86, 13);
		contentPane.add(lblEmailAddress);
		
		JLabel lblAddress = new JLabel("Address");
		lblAddress.setBounds(20, 276, 86, 13);
		contentPane.add(lblAddress);
		
		JLabel label_8_1 = new JLabel("Medicine name:");
		label_8_1.setBounds(20, 322, 100, 13);
		contentPane.add(label_8_1);
		
		ID = new JTextField();
		ID.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE ) { 
					
					e.consume();
					
				}
				}
		});
		ID.setBounds(120, 20, 96, 19);
		contentPane.add(ID);
		ID.setColumns(20);
		
		Name = new JTextField();
		Name.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
				{
					Name.setEditable(true);
				}
				else
				{
					Name.setEditable(false);
				}
				}
				
				
		
		});
		Name.setColumns(10);
		Name.setBounds(120, 47, 96, 19);
		contentPane.add(Name);
		
		Surname = new JTextField();
		Surname.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c = e.getKeyChar();
				
				if(Character.isLetter(c) || Character.isWhitespace(c) || Character.isISOControl(c))
				{
					Surname.setEditable(true);
				}
				else
				{
					Surname.setEditable(false);
				}
				}
				
				
		
		});
		Surname.setColumns(10);
		Surname.setBounds(120, 80, 96, 19);
		contentPane.add(Surname);
		
		Phone = new JTextField();
		Phone.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE ) { 
					
					e.consume();
					
				}
				}
		
				
				
		});
		Phone.setColumns(10);
		Phone.setBounds(120, 123, 96, 19);
		contentPane.add(Phone);
		
		Age = new JTextField();
		Age.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE ) { 
					
					e.consume();
					
				}
				}
		
				
				
		});
		Age.setColumns(10);
		Age.setBounds(120, 190, 96, 19);
		contentPane.add(Age);
		
		Email = new JTextField();
		Email.setColumns(10);
		Email.setBounds(120, 236, 96, 19);
		contentPane.add(Email);
		
		Med = new JTextField();
		Med.setColumns(10);
		Med.setBounds(120, 319, 96, 19);
		contentPane.add(Med);
		
		cmbaddress = new JComboBox(address);
		
		cmbaddress.setBounds(130, 276, 86, 21);
		contentPane.add(cmbaddress);
		
		 rdbtnNewRadioButtonFemale = new JRadioButton("Female");
		rdbtnNewRadioButtonFemale.setBounds(87, 156, 103, 21);
		contentPane.add(rdbtnNewRadioButtonFemale);
		
	    rdbtnNewRadioButtonMale = new JRadioButton("Male");
		rdbtnNewRadioButtonMale.setBounds(215, 156, 103, 21);
		contentPane.add(rdbtnNewRadioButtonMale);
		
		 group = new ButtonGroup();
		group.add(rdbtnNewRadioButtonFemale);
		group.add(rdbtnNewRadioButtonMale);
		
	

	
		
		scrollPane  = new JScrollPane();
		scrollPane.setBounds(389, 10, 1087, 492);
		contentPane.add(scrollPane);
		
		table = new JTable();
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int i=table.getSelectedRow();
				ID.setText(model.getValueAt(i, 0).toString());
				Name.setText(model.getValueAt(i, 1).toString());
				Surname.setText(model.getValueAt(i, 2).toString());
				Phone.setText(model.getValueAt(i, 3).toString());
				Age.setText(model.getValueAt(i, 5).toString());
				Email.setText(model.getValueAt(i, 6).toString());
				Med.setText(model.getValueAt(i, 8).toString());
			}
		});
		table.setForeground(Color.BLACK);
		model= new DefaultTableModel();
		Object[] column = {"ID","Name","Surname","Phone number","Gender","Age","Email address","Address","Medicine name"};
		final Object [] row= new Object[10];
		model.setColumnIdentifiers(column);
		table.setModel(model);
		scrollPane.setViewportView(table);
		
		 btnadd = new JButton("Add");
		btnadd.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(ID.getText().equals("") || Name.getText().equals("") || Surname.getText().equals("") || Phone.getText().equals("") || Age.getText().equals("")  ||  Med.getText().equals("")  )
				{
					JOptionPane.showMessageDialog(null, "Please Fill Complete Info ! :-( ");
					
				}
				else
				{
				row[0]=ID.getText();
				row[1]=Name.getText();
				row[2]=Surname.getText();
				row[3]=Phone.getText();
				if(rdbtnNewRadioButtonFemale.isSelected()) {
					 gender="F";
					row[4]=gender;
					
				} 
				
				else if (rdbtnNewRadioButtonMale.isSelected()) {
					 gender="M";
					row[4]=gender;
				}
				
				
				row[5]=Age.getText();
				row[6]=Email.getText();
				row[7]=cmbaddress.getSelectedItem().toString();
				row[8]=Med.getText();
				model.addRow(row);
				
				
				linkedlistMap.put(ph, new Patient(ID.getText(), Age.getText(), Name.getText(), Surname.getText(), Email.getText(), Med.getText(),Phone.getText(), gender, cmbaddress.getSelectedItem().toString()));
				System.out.println(linkedlistMap.toString());
				
				ID.setText("");
				Name.setText("");
				Surname.setText("");
				Phone.setText("");
				Age.setText("");
				Email.setText("");
				Med.setText("");
				
				JOptionPane.showMessageDialog(null, "Saved Successfully ! :-) ");
				}
				
			}
			});
				
				btnadd.setBounds(63, 355, 85, 21);
				contentPane.add(btnadd);
		
		
			lblsearch = new JLabel("Search");
	
		 lblsearch.setBounds(243, 394, 85, 31);
		
		contentPane.add(lblsearch);
		
		 btndelete = new JButton("Delete");
		btndelete.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int i=table.getSelectedRow();
				if(i>=0) {
					model.removeRow(i);
					linkedlistMap.remove(ph);
					System.out.println(linkedlistMap.toString());
				JOptionPane.showMessageDialog(null, "Deleted Successfully ! :-) ");
				}
				else
				{
					JOptionPane.showMessageDialog(null, "Please Select a Row First ! :-( ");
				}
				
			}
		});
		btndelete.setBounds(215, 355, 85, 21);
		contentPane.add(btndelete);
		
		 btnupdate = new JButton("Update");
		btnupdate.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				int i=table.getSelectedRow();

				if(ID.getText().equals("") || Name.getText().equals("") || Surname.getText().equals("") || Phone.getText().equals("") || Age.getText().equals("")  ||  Med.getText().equals("")  )
				{
					JOptionPane.showMessageDialog(null, "Please Fill Complete Info ! :-( ");}
					
					else if(i>=0)
{
	model.setValueAt(ID.getText(), i, 0);
				model.setValueAt(Name.getText(), i, 1);
				model.setValueAt(Surname.getText(), i, 2);
				model.setValueAt(Phone.getText(), i, 3);
				if(rdbtnNewRadioButtonFemale.isSelected()) {
					gender="F";
					model.setValueAt(gender, i, 4);
				}
				else if(rdbtnNewRadioButtonMale.isSelected()) {
					gender="M";
					model.setValueAt(gender, i, 4);
				}
			
			
				model.setValueAt(Age.getText(), i, 5);
				model.setValueAt(Email.getText(), i, 6);
				
			
				model.setValueAt(cmbaddress.getSelectedItem().toString(), i, 7);
				model.setValueAt(Med.getText(), i, 8);
				JOptionPane.showMessageDialog(null, "Updated Successfully ! :-) ");
				
				
				Patient p= new Patient(ID.getText(), Age.getText(), Name.getText(), Surname.getText(), Email.getText(), Med.getText(),Phone.getText(), gender, cmbaddress.getSelectedItem().toString());
			   linkedlistMap.replace(ph, p);
			
				System.out.println("this is replaced "+linkedlistMap.toString());
				
}
else
{
	JOptionPane.showMessageDialog(null, "Please Select a Row First ! :-( ");
}
				
			}
		});
		btnupdate.setBounds(145, 355, 85, 21);
		contentPane.add(btnupdate);
		
		TableRowSorter<TableModel> rowSorter= new TableRowSorter<>(table.getModel());
		  table.setRowSorter(rowSorter);
		search = new JTextField();
		search.getDocument().addDocumentListener(new DocumentListener() {
			
			@Override
			public void removeUpdate(DocumentEvent e) {
				// TODO Auto-generated method stub
				 String text = search.getText();

	                if (text.trim().length() == 0) {
	                    rowSorter.setRowFilter(null);
	                } else {
	                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
	                }
				
			}
			
			@Override
			public void insertUpdate(DocumentEvent e) {
				String text = search.getText();

                if (text.trim().length() == 0) {
                    rowSorter.setRowFilter(null);
                } else {
                    rowSorter.setRowFilter(RowFilter.regexFilter("(?i)" + text));
                }
                
                linkedlistMap.containsKey(ph);
              
            
			}
			
			@Override
			public void changedUpdate(DocumentEvent e) {
				  throw new UnsupportedOperationException("Not supported yet."); 
			}
		});
		search.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char c=e.getKeyChar();
				if(!(Character.isDigit(c) || c==KeyEvent.VK_BACK_SPACE) || c==KeyEvent.VK_DELETE ) { 
					
					e.consume();
					
				}
				}
			
			
			
			
			
		});
		search.setBounds(120, 400, 96, 19);
		contentPane.add(search);
		search.setColumns(10);
	}
}
	