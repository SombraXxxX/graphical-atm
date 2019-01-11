package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

import controller.ViewManager;

@SuppressWarnings("serial")
public class CreateView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JTextField fName;
	private JTextField lName;
	private JTextField Address;
	private JTextField City;
	private JTextField dob;
	private JTextField PhoneNum;
	private JTextField Zipcode;
	private JButton CreateButton;
	private JButton returnButton;
	/**
	 * Constructs an instance (or object) of the CreateView class.
	 * 
	 * @param manager
	 */
	
	public CreateView(ViewManager manager) {
		super();
		
		this.manager = manager;
		initialize();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the CreateView components.
	 */
	
	private void initialize() {
		this.setLayout(null);
		
		initfName();
		initlName();
		initPhoneNum();
		initAddress();
		initCity();
		initZipcode();
		initCreateButton();
		initreturnButton();
		initdob();
		// TODO
		//
		// this is where you should build the CreateView (i.e., all the components that
		// allow the user to enter his or her information and create a new account).
		//
		// feel free to use my layout in LoginView as an example for laying out and
		// positioning your components.
	}
	
	private void initreturnButton() {
		returnButton = new JButton("Return");
		returnButton.setBounds(5, 5, 50, 50);
		returnButton.addActionListener(this);

		
		this.add(returnButton);
		
	}

	private void initCreateButton() {
		// TODO Auto-generated method stub
		CreateButton = new JButton("Create Account");
		CreateButton.setBounds(175, 420, 200, 35);
		CreateButton.addActionListener(this);
		
		this.add(CreateButton);
	}

	private void initPhoneNum() {
		JLabel label = new JLabel("Phone Number:", SwingConstants.RIGHT);
		label.setBounds(70, 150, 125, 35);
		label.setLabelFor(PhoneNum);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		PhoneNum = new JTextField(20);
		PhoneNum.setBounds(205, 150, 75, 35);
		this.add(label);
		this.add(PhoneNum);
//		PhoneNum = new JTextField(20);
//		PhoneNum.setBounds(205, 150, 75, 35);
//		this.add(label);
//		this.add(PhoneNum);
//		PhoneNum = new JTextField(20);
//		PhoneNum.setBounds(205, 150, 75, 35);
//		this.add(label);
//		this.add(PhoneNum);	
	}

	private void initlName() {
		JLabel label = new JLabel("Last Name:", SwingConstants.RIGHT);
		label.setBounds(70,100,125,35);
		label.setLabelFor(lName);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		lName = new JTextField(20);
		lName.setBounds(205, 100, 200, 35);
		
		this.add(label);
		this.add(lName);
		
	}

	private void initfName() {
		JLabel label = new JLabel("First Name:", SwingConstants.RIGHT);
		label.setBounds(70,50,125,35);
		label.setLabelFor(lName);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		lName = new JTextField(20);
		lName.setBounds(205, 50, 200, 35);
		
		this.add(label);
		this.add(lName);// TODO Auto-generated method stub
		
	}
	private void initAddress() {
		JLabel label = new JLabel("Street Address:", SwingConstants.RIGHT);
		label.setBounds(70,200,125,35);
		label.setLabelFor(Address);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		Address = new JTextField(20);
		Address.setBounds(205, 200, 200, 35);
		
		
		this.add(label);
		this.add(Address);// TODO Auto-generated method stub
		
	}
	private void initCity() {
		JLabel label = new JLabel("City:", SwingConstants.RIGHT);
		label.setBounds(70,235,125,35);
		label.setLabelFor(City);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		City = new JTextField(20);
		City.setBounds(205, 239, 200, 35);
		
		
		this.add(label);
		this.add(City);// TODO Auto-generated method stub
		
	}
	private void initZipcode() {
		JLabel label = new JLabel("Zipcode:", SwingConstants.RIGHT);
		label.setBounds(70,275,125,35);
		label.setLabelFor(Zipcode);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		Zipcode = new JTextField(20);
		Zipcode.setBounds(205, 275, 200, 35);
		
		
		this.add(label);
		this.add(Zipcode);// TODO Auto-generated method stub
		
	}
	private void initDobField() {
		JLabel label = new JLabel("Date of Birth", SwingConstants.RIGHT);
		label.setBounds(100, 300, 95, 35);

	    try {
			MaskFormatter dateFormat = new MaskFormatter("##/##/####");
			dateFormat.setPlaceholderCharacter('_');
			dob = new JFormattedTextField(dateFormat);
		} catch (ParseException e) {
			dob.setText("");
		}
		dob.setBounds(205, 300, 200, 35);
	}

	/*
	 * CreateView is not designed to be serialized, and attempts to serialize will throw an IOException.
	 * 
	 * @param 
	 * @throws IOException
	 */
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		throw new IOException("ERROR: The CreateView class is not serializable.");
	}
	
	///////////////////// OVERRIDDEN METHODS //////////////////////////////////////////
	
	/*
	 * Responds to button clicks and other actions performed in the CreateView.
	 * 
	 * @param e
	 */
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		// TODO
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
	}
}