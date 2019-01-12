package view;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.io.ObjectOutputStream;

import javax.swing.JPanel;

import controller.ViewManager;

@SuppressWarnings("serial")
public class HomeView extends JPanel implements ActionListener {
	
	private ViewManager manager;		// manages interactions between the views, model, and database
	
	private JLabel AccountMessage;
	private JButton DepositButton;
	private JButton WithdrawButton;
	private JButton TransferButton;
	private JButton EditInfoButton;
	private JButton CloseAccountButton;
	private JButton LogoutButton;



	/**
	 * Constructs an instance (or objects) of the HomeView class.
	 * 
	 * @param manager
	 */
	
	public HomeView(ViewManager manager) {
		super();
		
		this.manager = manager;
		initialize();
	}
	
	///////////////////// PRIVATE METHODS /////////////////////////////////////////////
	
	/*
	 * Initializes the HomeView components.
	 */
	
	private void initialize() {
		initAccountMessage();
		initLogoutButton();
		initDepositButton();
		initWithdrawButton();
		initTransferButton();
		// TODO
		//
		// this is a placeholder for this view and should be removed once you start
		// building the HomeView.
		
		
		// TODO
		//
		// this is where you should build the HomeView (i.e., all the components that
		// allow the user to interact with the ATM - deposit, withdraw, transfer, etc.).
		//
		// feel free to use my layout in LoginView as an example for laying out and
		// positioning your components.
	}
	
	private void initAccountMessage() {
		AccountMessage = new JLabel("", SwingConstants.CENTER);
		AccountMessage.setBounds(50,50,500,50);
		this.add(accountMessage);
	}
	
	private void initWithdrawButton () {
		WithdrawButton = new JButton("Withdraw");
		WithdrawButton.setBounds(200,100,100,100);
		WithdrawButton.addActionListener(this);
		this.add(WithdrawButton);
	}
	
	private void initDepositButton() {
		DepositButton = new JButton("Deposit");
		DepositButton.setBounds(50,100,100,100);
	}
	
	private void initTransferButton() {
		TransferButton = new JButton("Transfer");
		TransferButton.setBounds(50,250,100,100);
		TransferButton.addActionListener(this);
		this.add(TransferButton);	
	}
	
	private void initLogoutButton() {
		LogoutButton = new JButton("Log out");
		LogoutButton.setBounds(5,5,100,50);
		LogoutButton.addActionListen(this);
		this.add(LogoutButton);
	}
	/*
	 * HomeView is not designed to be serialized, and attempts to serialize will throw an IOException.
	 * 
	 * @param oos
	 * @throws IOException
	 */
	
	private void writeObject(ObjectOutputStream oos) throws IOException {
		throw new IOException("ERROR: The HomeView class is not serializable.");
	}
	
	///////////////////// OVERRIDDEN METHODS //////////////////////////////////////////
	
	/*
	 * Responds to button clicks and other actions performed in the HomeView.
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
