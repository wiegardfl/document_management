package GUI;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.JSeparator;
import java.awt.SystemColor;

import javax.swing.border.Border;
import javax.swing.border.LineBorder;

import database.Database;

import javax.swing.ImageIcon;
@SuppressWarnings("serial")
public class LoginPageGUI extends JFrame {
	private static final int 
	windowOffset = 100,
	windowWidth = 273,
	windowHeight = 277,
	separatorWidth = 178,
	separatorHeight = 2,
	tfLblWidth = 88,
	tfLblHeight = 14,
	textfieldWidth = 171,
	textfieldHeight = 20,
	textFieldOffsetX = 46,
	textFieldOffsetY = 78,
	pwFieldOffsetY = 139,
	tfLabelOffsetX = 43,
	unameLblOffsetY = 59,
	pwLblOffSetY = 120,
	usernameColumns = 10,
	lblOffsetX = 188,
	lblWidth = 53,
	lblHeight = 20,
	lblSignInOffsetY = 232,
	lblCloseOffsetY = 24,
	imageWidth = 19, 
	imageHeight = 13, 
	imageOffsetX = 82,
	imageOffsetY = 30,
	sep1OffsetX = 41,
	sep1OffSetY = 101,
	sep2OffSetX = 44,
	sep2OffSetY = 162;

	private static final Color 
	standardBG = Color.DARK_GRAY,
	standardFG = Color.WHITE,
	separaratorBG = standardBG,
	separatorFG = standardBG,
	textfieldBG = standardBG,
	textfieldFG = standardFG,
	textfieldCaretColor = standardFG,
	tfLabelFG = standardFG;
	
	private static final Border textfieldBorder = null;
	
	private JPanel contentPane;
	private JPasswordField passwordTF;
	private JTextField usernameTF;

	/**
	 * Create the frame.
	 */
	public LoginPageGUI() {
		setUndecorated(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(windowOffset, windowOffset, windowWidth, windowHeight);
		contentPane = new JPanel();
		contentPane.setBackground(Color.DARK_GRAY);
		contentPane.setBorder(new LineBorder(Color.DARK_GRAY, 1, true));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblSignIn = new JLabel("Sign Up");
		addLabel(new SignUpMouseAdapter(lblSignIn, SystemColor.activeCaption), lblSignInOffsetY);
		
		JButton btnLogin = new JButton("Login");
		btnLogin.setFont(BaseGUI.fontMedium);
		btnLogin.setBackground(Color.GRAY);
		btnLogin.setForeground(SystemColor.text);
		btnLogin.setBounds(50, 192, 171, 30);
		contentPane.add(btnLogin);
		btnLogin.setFocusPainted(false);
		btnLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				try {
					String id=usernameTF.getText();
					if(Database.checkIDAlreadyExists(id)) {
						char password[]=passwordTF.getPassword();
						String psswd=new String(password);
						if(Database.checkPassword(id, psswd)) {																																																																																																																																																																																																																																									
							DashboardGUI dashboard = new DashboardGUI();
							dashboard.setVisible(true);
							setVisible(false);
							dispose();
						}
						else {
							
							throw new Exception("Enter Correct Details");
						}
					}
					else {
						throw new Exception("No such user exists");
					}
				}
				catch(Exception e) {
					JOptionPane.showMessageDialog(null,e.getMessage());
					passwordTF.setText("");
				}
			}
		});
		
		addTextField(new JPasswordField(), pwFieldOffsetY);
		
		usernameTF = new JTextField();
		usernameTF.setColumns(usernameColumns);
		addTextField(usernameTF, textFieldOffsetY);
		
		JLabel lblUsernameid = new JLabel("Username/ID");
		lblUsernameid.setHorizontalAlignment(SwingConstants.LEFT);
		lblUsernameid.setBackground(Color.WHITE);
		addTfLabel(lblUsernameid, unameLblOffsetY);

		addTfLabel(new JLabel("Password"), pwLblOffSetY);
		
		addSeparator(sep1OffsetX, sep1OffSetY);
		addSeparator(sep2OffSetX, sep2OffSetY);
		
		JLabel lblClose = new JLabel("Close");
		addLabel(new LabelMouseAdapter(lblClose, Color.RED), lblCloseOffsetY);
		
		JLabel imageLabel = new JLabel("");
		imageLabel.setIcon(BaseGUI.icon);
		imageLabel.setBounds(imageWidth, imageHeight, imageOffsetX, imageOffsetY);
		contentPane.add(imageLabel);
	}
	
	private void addSeparator(int offsetX, int offSetY) {
		JSeparator separator = new JSeparator();
		separator.setBackground(separaratorBG);
		separator.setForeground(separatorFG);
		separator.setBounds(offsetX, offSetY, separatorWidth, separatorHeight);
		contentPane.add(separator);
	}
	
	private void addTextField(JTextField textField, int offSetY) {
		textField.setForeground(textfieldFG);
		textField.setBackground(textfieldBG);
		textField.setBounds(textFieldOffsetX, offSetY, textfieldWidth, textfieldHeight);
		textField.setBorder(textfieldBorder);
		textField.setCaretColor(textfieldCaretColor);
		contentPane.add(textField);
	}
	
	private void addTfLabel(JLabel label, int offsetY) {
		label.setFont(BaseGUI.fontSmallBold);
		label.setForeground(tfLabelFG);
		label.setBounds(tfLabelOffsetX, offsetY, tfLblWidth, tfLblHeight);
		contentPane.add(label);
	}
	
	private void addLabel(LabelMouseAdapter l, int lblOffsetY) {
		JLabel label = l.label;
		label.setHorizontalAlignment(SwingConstants.TRAILING);
		label.setForeground(SystemColor.activeCaptionBorder);
		label.setFont(BaseGUI.fontLargeTNR);
		label.setBounds(lblOffsetX, lblOffsetY, lblWidth, lblHeight);
		label.addMouseListener(l);
		contentPane.add(label);
	}

	class LabelMouseAdapter extends MouseAdapter {
		JLabel label;
		Color mouseEnteredFG;
		
		LabelMouseAdapter(JLabel label, Color mouseEnteredFG){
			this.label = label; 
			this.mouseEnteredFG = mouseEnteredFG;
		}
		@Override
		public void mouseClicked(MouseEvent arg0) {
			dispose();
		}
		@Override
		public void mouseEntered(MouseEvent e) {
			label.setText("<HTML><U><B>" + label.getText() + "</B></U></HTML>");
			label.setForeground(mouseEnteredFG);
		}
		@Override
		public void mouseExited(MouseEvent e) {
			label.setText("<HTML>" + label.getText() + "</HTML>");
			label.setForeground(SystemColor.activeCaptionBorder);
		}
	}
	
	class SignUpMouseAdapter extends LabelMouseAdapter {
		@Override
		public void mouseClicked(MouseEvent e) {
			SignUpGUI signup = new SignUpGUI();
			signup.setVisible(true);
			setVisible(false);
			super.mouseClicked(e);
		}
		
		SignUpMouseAdapter(JLabel label, Color mouseEnteredFG){
			super(label, mouseEnteredFG);
		}
	}	
}
