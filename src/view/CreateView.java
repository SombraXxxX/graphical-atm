package view;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.text.ParseException;

import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.text.MaskFormatter;

import com.toedter.calendar.JDateChooser;

import javax.swing.JPasswordField;
import javax.swing.JComboBox;
import javax.swing.JFormattedTextField;
import javax.swing.JRadioButton;

import controller.ViewManager;

public class CreateView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	private JTextField fName;	// first name
	private JTextField lName;	// last name
	private JTextField Address;
	private JTextField City;
	private JComboBox State;
	private JDateChooser dob;
	private JTextField PhoneNum;
	private JTextField Zipcode;
	private JButton CreateButton;
	private JButton returnButton;
	private JPasswordField Pin;
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
		initState();
		initPin();
		
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
		returnButton.setBounds(5, 5, 75, 50);
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
		label.setBounds(70, 125, 125, 35);
		
	    try {
			MaskFormatter phoneFormat = new MaskFormatter("(###)-###-####");
			phoneFormat.setPlaceholderCharacter('_');
			PhoneNum = new JFormattedTextField(phoneFormat);
		} catch (ParseException e) {
			PhoneNum.setText("");
		}
		PhoneNum.setBounds(205, 125, 100, 35);
		this.add(label);
		this.add(PhoneNum);


	}

	private void initlName() {
		JLabel label = new JLabel("Last Name:", SwingConstants.RIGHT);
		label.setBounds(70,80,125,35);
		label.setLabelFor(lName);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		lName = new JTextField(20);
		lName.setBounds(205, 80, 200, 35);
		
		this.add(label);
		this.add(lName);
		
	}

	private void initfName() {
		JLabel label = new JLabel("First Name:", SwingConstants.RIGHT);
		label.setBounds(70,30,125,35);
		label.setLabelFor(lName);
		label.setFont(new Font("DialogInput", Font.BOLD,  14));
		
		lName = new JTextField(20);
		lName.setBounds(205, 30, 200, 35);
		
		this.add(label);
		this.add(lName);// TODO Auto-generated method stub
		
	}
	private void initAddress() {
		JLabel label = new JLabel("Street Address:", SwingConstants.RIGHT);
		label.setBounds(70,165,125,35);
		label.setLabelFor(Address);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		Address = new JTextField(20);
		Address.setBounds(205, 165, 200, 35);
		
		
		this.add(label);
		this.add(Address);// TODO Auto-generated method stub
		
	}
	private void initCity() {
		JLabel label = new JLabel("City:", SwingConstants.RIGHT);
		label.setBounds(70,205,125,35);
		label.setLabelFor(City);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		City = new JTextField(20);
		City.setBounds(205, 205, 200, 35);
		
		
		this.add(label);
		this.add(City);// TODO Auto-generated method stub
		
	}
	private void initZipcode() {
		JLabel label = new JLabel("Zipcode:", SwingConstants.RIGHT);
		label.setBounds(70,245,125,35);
		label.setLabelFor(Zipcode);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		Zipcode = new JTextField(20);
		Zipcode.setBounds(205, 245, 200, 35);
		
		
		this.add(label);
		this.add(Zipcode);// TODO Auto-generated method stub
		
	}
	
	private void initState() {
		JLabel label = new JLabel("State", SwingConstants.RIGHT);
		label.setBounds(70, 285, 95, 35);
		label.setLabelFor(State);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));

		String[] listStates = {"AK","AL","AR","AZ","CA","CO","CT","DC","DE",
				"FL","GA","GU","HI","IA","ID", "IL","IN","KS","KY","LA","MA",
				"MD","ME","MH","MI","MN","MO","MS","MT","NC","ND","NE","NH",
				"NJ","NM","NV","NY", "OH","OK","OR","PA","PR","PW","RI","SC",
				"SD","TN","TX","UT","VA","VI","VT","WA","WI","WV","WY"};

		
		State = new JComboBox(listStates);
		State.setBounds(205, 285, 200, 35);
		
		this.add(label);
		this.add(State);
	}
	
	private void initdob() {
		JLabel label = new JLabel("DOB: ", SwingConstants.RIGHT);
		label.setBounds(70, 365, 95, 35);
		label.setLabelFor(dob);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		
		dob = new JDateChooser();
		dob.setBounds(205, 365, 200, 35);
		
		this.add(label);
		this.add(dob);
	}
	private void initPin() {
		JLabel label = new JLabel("Pin:", SwingConstants.RIGHT);
		label.setBounds(70, 325, 95, 35);
		label.setLabelFor(Pin);
		label.setFont(new Font("DialogInput", Font.BOLD, 14));
		Pin = new JPasswordField(20);
		Pin.setBounds(205, 325, 200, 35);
		
		this.add(label);
		this.add(Pin);
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
		Object source = e.getSource();
		if (source.equals(CreateButton)) {
			
			manager.switchTo(ATM.HOME_VIEW);
	} else if (source.equals(returnButton)) {
			manager.switchTo(ATM.LOGIN_VIEW);
	} else {
		System.err.println("ERROR: Action command not found (" + e.getActionCommand() + ")");
		//
		// this is where you'll setup your action listener, which is responsible for
		// responding to actions the user might take in this view (an action can be a
		// user clicking a button, typing in a textfield, etc.).
		//
		// feel free to use my action listener in LoginView.java as an example.
	}
	}
}
