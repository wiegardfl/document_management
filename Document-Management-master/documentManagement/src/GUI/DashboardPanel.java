package GUI;

import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

@SuppressWarnings("serial")
class DashboardPanel extends JPanel {

	private final ButtonGroup toggleButtonGroup = new ButtonGroup();
//	private DashboardGUI dashboardGUI;
	private IPanelUpdateHandler searchDocumentPanelHandler;
	
	public DashboardPanel(/*DashboardGUI dashboardGUI*/) {
//		this.dashboardGUI = dashboardGUI;
		
		this.setBackground(Color.DARK_GRAY);
		this.setBounds(0, 0, 254, 580);
		this.setLayout(null);
		
		JLabel label = new JLabel("");
		label.setBounds(10, 4, 82, 30);
		this.add(label);
		label.setIcon(new ImageIcon("~/eclipse-workspace/Document-Management-master/documentManagement/src/logo.png"));
		
		addTglbtnUploadANew();
		
		addTglbtnVeiwableNotice();
		
		addTglbtnViewSubmittedDocuments();
		
		addBtnProfile();
		
		addLblLogout();
		
		addToggleSearchUserButton();
		
		addTglbtnSearchDocument();
	}

	private void addTglbtnSearchDocument() {
		JToggleButton tglbtnSearchDocument = new JToggleButton("               Search Document");
		tglbtnSearchDocument.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {

				searchDocumentPanelHandler.Visualize(tglbtnSearchDocument);
			}
		});
		toggleButtonGroup.add(tglbtnSearchDocument);
		tglbtnSearchDocument.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnSearchDocument.setForeground(Color.WHITE);
		tglbtnSearchDocument.setFocusPainted(false);
		tglbtnSearchDocument.setBorder(null);
		tglbtnSearchDocument.setBackground(Color.DARK_GRAY);
		tglbtnSearchDocument.setBounds(0, 125, 256, 47);
		this.add(tglbtnSearchDocument);
	}
	
	public void setSearchDocumentPanelHandler(IPanelUpdateHandler handler)
	{
		searchDocumentPanelHandler = handler;
	}

	private void addToggleSearchUserButton() {
		JToggleButton toggleSearchUserButton = new JToggleButton("               Search User");
		toggleSearchUserButton.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
//				searchUserPanel.setVisible(toggleSearchUserButton.isSelected());
//				searchDocumentPanel.setVisible(false);
//				uploadDocumentsPanel.setVisible(false);
//				viewSubmittedDocumentsPanel.setVisible(false);
//				viewAvailableNoticePanel.setVisible(false);
				
				dashboardGUI.Visualize("toggleSearchUserButton", DashboardPanel.class);
			}
		});
		toggleButtonGroup.add(toggleSearchUserButton);
		toggleSearchUserButton.setHorizontalAlignment(SwingConstants.LEFT);
		toggleSearchUserButton.setForeground(Color.WHITE);
		toggleSearchUserButton.setFocusPainted(false);
		toggleSearchUserButton.setBorder(null);
		toggleSearchUserButton.setBackground(Color.DARK_GRAY);
		toggleSearchUserButton.setBounds(0, 172, 256, 47);
		this.add(toggleSearchUserButton);
	}

	private void addLblLogout() {
		JLabel lblLogout = new JLabel("Logout");
		lblLogout.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblLogout.setForeground(Color.LIGHT_GRAY);
		lblLogout.setBounds(193, 45, 55, 23);
		this.add(lblLogout);
		lblLogout.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent arg0) {
				LoginPageGUI login=new LoginPageGUI();
				login.setVisible(true);
				dashboardGUI.dispose();
			}
			@Override
			public void mouseEntered(MouseEvent e) {
				lblLogout.setText("<HTML><U><B>Logout</B></U></HTML>");
				lblLogout.setForeground(Color.RED);
			}
			@Override
			public void mouseExited(MouseEvent e) {
				lblLogout.setText("<HTML>Logout</HTML>");
				lblLogout.setForeground(Color.WHITE);
			}
		});
	}

	private void addBtnProfile() {
		JButton btnProfile = new JButton("Profile");
		btnProfile.setBackground(Color.GRAY);
		btnProfile.setForeground(Color.WHITE);
		btnProfile.setBounds(155, 11, 89, 23);
		this.add(btnProfile);
		btnProfile.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				ProfileGUI profilepage=new ProfileGUI();
				profilepage.setVisible(true);
				dashboardGUI.dispose();
			}
		});
		btnProfile.setFocusPainted(false);
	}

	private void addTglbtnViewSubmittedDocuments() {
		JToggleButton tglbtnViewSubmittedDocuments = new JToggleButton("              View Submitted Documents");
		tglbtnViewSubmittedDocuments.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent e) {
				
//				viewSubmittedDocumentsPanel.setVisible(tglbtnViewSubmittedDocuments.isSelected());
//				if(tglbtnViewSubmittedDocuments.isSelected()) {					
//					showDocumentList(Database.getCurrentProfile().getID(), false);
//				}
				
				dashboardGUI.Visualize("tglbtnViewSubmittedDocuments", DashboardPanel.class);
			}
		});
		toggleButtonGroup.add(tglbtnViewSubmittedDocuments);
		tglbtnViewSubmittedDocuments.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnViewSubmittedDocuments.setForeground(Color.WHITE);
		tglbtnViewSubmittedDocuments.setBackground(Color.DARK_GRAY);
		tglbtnViewSubmittedDocuments.setBounds(0, 349, 256, 47);
		this.add(tglbtnViewSubmittedDocuments);
		tglbtnViewSubmittedDocuments.setFocusPainted(false);
		tglbtnViewSubmittedDocuments.setBorder(null);
	}

	private void addTglbtnVeiwableNotice() {
		JToggleButton tglbtnVeiwableNotice = new JToggleButton("              View available notices");
		toggleButtonGroup.add(tglbtnVeiwableNotice);
		tglbtnVeiwableNotice.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
//				welcomePanel.setVisible(false);
//				viewAvailableNoticePanel.setVisible(tglbtnVeiwableNotice.isSelected());
//				Component[] components=showAvailableNoticeResultPanel.getComponents();
//				for(Component c:components) {
//					remove(c);
//					c.setVisible(false);
//				}
//				showAvailableNoticeList();
				
				dashboardGUI.Visualize("tglbtnVeiwableNotice", DashboardPanel.class);
			}
		});
		tglbtnVeiwableNotice.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnVeiwableNotice.setForeground(Color.WHITE);
		tglbtnVeiwableNotice.setBackground(Color.DARK_GRAY);
		tglbtnVeiwableNotice.setBounds(0, 302, 256, 47);
		this.add(tglbtnVeiwableNotice);
		tglbtnVeiwableNotice.setFocusPainted(false);
		tglbtnVeiwableNotice.setBorder(null);
	}

	private void addTglbtnUploadANew() {
		JToggleButton tglbtnUploadANew = new JToggleButton("              Upload a new Document");
		toggleButtonGroup.add(tglbtnUploadANew);
		tglbtnUploadANew.addItemListener(new ItemListener() {
			public void itemStateChanged(ItemEvent arg0) {
//				uploadDocumentsPanel.setVisible(tglbtnUploadANew.isSelected());
//				searchDocumentPanel.setVisible(false);
//				searchUserPanel.setVisible(false);
//				viewSubmittedDocumentsPanel.setVisible(false);
//				viewAvailableNoticePanel.setVisible(false);
//				welcomePanel.setVisible(false);
				
				dashboardGUI.Visualize("tglbtnUploadANew", DashboardPanel.class);
			}
		});
		tglbtnUploadANew.setHorizontalAlignment(SwingConstants.LEFT);
		tglbtnUploadANew.setBackground(Color.DARK_GRAY);
		tglbtnUploadANew.setForeground(Color.WHITE);
		tglbtnUploadANew.setBounds(0, 255, 256, 47);
		this.add(tglbtnUploadANew);
		tglbtnUploadANew.setBorder(null);
	}
}
