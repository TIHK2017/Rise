import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;

import java.awt.GridLayout;
import java.awt.Image;

import javax.swing.JButton;
import java.awt.CardLayout;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridBagLayout;
import java.awt.GridBagConstraints;
import java.awt.Insets;
import java.awt.LayoutManager;

import javax.swing.JLabel;
import javax.swing.JPasswordField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;
import javax.swing.JLayeredPane;
import javax.swing.JRadioButton;
import java.awt.Font;
import java.awt.Color;
import javax.swing.UIManager;
import javax.swing.JScrollPane;
import javax.swing.JCheckBox;
import javax.swing.JTextArea;
import javax.swing.JSeparator;
import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;


public class rise_ui {

	private JFrame frame;
	private JTextField txtUsername;
	private JPasswordField passwordField;
	private JLabel lblUsername;
	private JLabel Pswd;
	private JLabel lblRise_Icon;
	private JButton btnLogin;
	private JButton btnCancel;
	private JPanel Home_panel;
	private JLabel Welcome_banner;
	private JLabel Rise_small;
	private JLabel Rise_image;
	private JLabel Weather;
	private JLabel Time_Date;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JButton btnHome;
	private JButton btnTemp;
	private JButton btnExercise;
	private JButton btnBlinds;
	private JLabel lblNewLabel;
	private JPanel panel;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					rise_ui window = new rise_ui();
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
	public rise_ui() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 360, 640);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new CardLayout(0, 0));
		
	// This set of code creates the Login Panel, which allows the user to type in their user-name and password.=============================
	// Action listeners need to be added to check if the User-name and Password match what is "on-file" after pressing login
		
		JPanel Login_Panel = new JPanel();
		frame.getContentPane().add(Login_Panel, "name_1236561112062331");
		GridBagLayout gbl_Login_Panel = new GridBagLayout();
		gbl_Login_Panel.columnWidths = new int[]{120, 112, 115, 95};
		gbl_Login_Panel.rowHeights = new int[]{0, 42, 101, 0, 31, 42, 40, 47, 40, 0, 0, 0};
		gbl_Login_Panel.columnWeights = new double[]{1.0, 1.0, 1.0, 1.0};
		gbl_Login_Panel.rowWeights = new double[]{0.0, 0.0, 1.0, 0.0, 0.0, 0.0, 0.0, 0.0, 1.0, 0.0, 0.0, Double.MIN_VALUE};
		Login_Panel.setLayout(gbl_Login_Panel);
		
		ImageIcon imageIcon = (new ImageIcon(new ImageIcon("C:\\Images\\SunIcon_Rise.png").getImage().getScaledInstance(300, 225, Image.SCALE_DEFAULT)));
		
		Rise_image = new JLabel("");
		GridBagConstraints gbc_Rise_image = new GridBagConstraints();
		gbc_Rise_image.gridwidth = 4;
		gbc_Rise_image.gridheight = 4;
		gbc_Rise_image.insets = new Insets(0, 0, 5, 0);
		gbc_Rise_image.gridx = 0;
		gbc_Rise_image.gridy = 1;
		Login_Panel.add(Rise_image, gbc_Rise_image);
		Rise_image.setIcon(imageIcon);
		
						
		lblUsername = new JLabel("Username");
		GridBagConstraints gbc_lblUsername = new GridBagConstraints();
		gbc_lblUsername.anchor = GridBagConstraints.NORTHEAST;
		gbc_lblUsername.insets = new Insets(0, 0, 5, 5);
		gbc_lblUsername.gridx = 0;
		gbc_lblUsername.gridy = 5;
		Login_Panel.add(lblUsername, gbc_lblUsername);
		
		txtUsername = new JTextField();
		GridBagConstraints gbc_txtUsername = new GridBagConstraints();
		gbc_txtUsername.anchor = GridBagConstraints.NORTH;
		gbc_txtUsername.fill = GridBagConstraints.HORIZONTAL;
		gbc_txtUsername.insets = new Insets(0, 0, 5, 5);
		gbc_txtUsername.gridx = 1;
		gbc_txtUsername.gridy = 5;
		gbc_txtUsername.gridwidth = 2;
		Login_Panel.add(txtUsername, gbc_txtUsername);
		txtUsername.setColumns(10);
		
		Pswd = new JLabel("Password");
		GridBagConstraints gbc_Pswd = new GridBagConstraints();
		gbc_Pswd.anchor = GridBagConstraints.NORTHEAST;
		gbc_Pswd.insets = new Insets(0, 0, 5, 5);
		gbc_Pswd.gridx = 0;
		gbc_Pswd.gridy = 6;
		Login_Panel.add(Pswd, gbc_Pswd);
		
		passwordField = new JPasswordField();
		GridBagConstraints gbc_passwordField = new GridBagConstraints();
		gbc_passwordField.anchor = GridBagConstraints.NORTH;
		gbc_passwordField.gridwidth = 2;
		gbc_passwordField.insets = new Insets(0, 0, 5, 5);
		gbc_passwordField.fill = GridBagConstraints.HORIZONTAL;
		gbc_passwordField.gridx = 1;
		gbc_passwordField.gridy = 6;
		Login_Panel.add(passwordField, gbc_passwordField);
		
		btnLogin = new JButton("Login");
		GridBagConstraints gbc_btnLogin = new GridBagConstraints();
		gbc_btnLogin.insets = new Insets(0, 0, 5, 5);
		gbc_btnLogin.gridx = 1;
		gbc_btnLogin.gridy = 7;
		Login_Panel.add(btnLogin, gbc_btnLogin);
		
		btnCancel = new JButton("Cancel");
		GridBagConstraints gbc_btnCancel = new GridBagConstraints();
		gbc_btnCancel.insets = new Insets(0, 0, 5, 5);
		gbc_btnCancel.gridx = 2;
		gbc_btnCancel.gridy = 7;
		Login_Panel.add(btnCancel, gbc_btnCancel);
		ImageIcon imageIcon_small = (new ImageIcon(new ImageIcon("C:\\Images\\SunIcon_Rise.png").getImage().getScaledInstance(80, 60, Image.SCALE_DEFAULT)));
		TitledBorder title;
		title = BorderFactory.createTitledBorder("Weather");
		Border empty = BorderFactory.createEmptyBorder();
		
//This set of code creates the Home panel===========================================================================
		
		Home_panel = new JPanel();
		frame.getContentPane().add(Home_panel, "name_1236601911399576");
		Home_panel.setLayout(null);
		
		Rise_small = new JLabel("");
		Rise_small.setBounds(21, 13, 67, 60);
		Rise_small.setFont(new Font("Segoe Script", Font.PLAIN, 13));
		Home_panel.add(Rise_small);
		Rise_small.setIcon(imageIcon_small);
		
		Welcome_banner = new JLabel("Welcome");
		Welcome_banner.setBounds(116, 19, 155, 54);
		Welcome_banner.setForeground(new Color(255, 102, 51));
		Welcome_banner.setFont(new Font("Script MT Bold", Font.PLAIN, 44));
		Welcome_banner.setBackground(Color.CYAN);
		Home_panel.add(Welcome_banner);
		
		Time_Date = new JLabel("[create clock code]");
		Time_Date.setBounds(16, 79, 309, 115);
		Time_Date.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Right now, it is...", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		Home_panel.add(Time_Date);
		
		Weather = new JLabel("[import weather data]");
		Weather.setBounds(16, 199, 309, 106);
		Home_panel.add(Weather);
		Weather.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weather", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		
		scrollPane = new JScrollPane();
		scrollPane.setBounds(16, 310, 309, 194);
		scrollPane.setViewportBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Notes ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)), "Notes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
		scrollPane.setBorder(empty);
		Home_panel.add(scrollPane);
		
		textArea = new JTextArea();
		textArea.setRows(2);
		scrollPane.setViewportView(textArea);
		
		btnNewButton = new JButton("Save");
		btnNewButton.setBounds(264, 500, 61, 25);
		Home_panel.add(btnNewButton);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
			}
		});
		
		JButton btnSeeAllNotes = new JButton("See All Notes");
		btnSeeAllNotes.setBounds(21, 500, 109, 25);
		Home_panel.add(btnSeeAllNotes);
		
// Bottom banner buttons allow the user to navigate between the different functions================================
			//Home, Exercise, SmartBlinds, SmartTemp
			
			// Create the image icons
			ImageIcon HomeIcon = (new ImageIcon(new ImageIcon("C:\\Images\\Home.png").getImage().getScaledInstance(32, 24, Image.SCALE_DEFAULT)));
			ImageIcon WeightIcon = (new ImageIcon(new ImageIcon("C:\\Images\\Weight.png").getImage().getScaledInstance(40, 30, Image.SCALE_DEFAULT)));
			ImageIcon BlindsIcon = (new ImageIcon(new ImageIcon("C:\\Images\\Blinds3.png").getImage().getScaledInstance(40, 30, Image.SCALE_DEFAULT)));
			ImageIcon TempIcon = (new ImageIcon(new ImageIcon("C:\\Images\\Temp.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
			
		panel = new JPanel();
		panel.setBounds(0, 538, 342, 55);
		Home_panel.add(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[]{23, 73, 71, 63, 0, 0, 0};
		gbl_panel.rowHeights = new int[]{39, 0};
		gbl_panel.columnWeights = new double[]{0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE};
		gbl_panel.rowWeights = new double[]{0.0, Double.MIN_VALUE};
		panel.setLayout(gbl_panel);
		
		// Create the buttons and input the images
		btnHome = new JButton("");
		btnHome.setIcon(HomeIcon);
		GridBagConstraints gbc_btnHome = new GridBagConstraints();
		gbc_btnHome.fill = GridBagConstraints.BOTH;
		gbc_btnHome.insets = new Insets(0, 0, 0, 5);
		gbc_btnHome.gridx = 1;
		gbc_btnHome.gridy = 0;
		panel.add(btnHome, gbc_btnHome);
		
		btnExercise = new JButton("");
		btnExercise.setIcon(WeightIcon);
		GridBagConstraints gbc_btnExercise = new GridBagConstraints();
		gbc_btnExercise.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnExercise.insets = new Insets(0, 0, 0, 5);
		gbc_btnExercise.gridx = 2;
		gbc_btnExercise.gridy = 0;
		panel.add(btnExercise, gbc_btnExercise);
		
		btnBlinds = new JButton("");
		btnBlinds.setIcon(BlindsIcon);
		GridBagConstraints gbc_btnBlinds = new GridBagConstraints();
		gbc_btnBlinds.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnBlinds.insets = new Insets(0, 0, 0, 5);
		gbc_btnBlinds.gridx = 3;
		gbc_btnBlinds.gridy = 0;
		panel.add(btnBlinds, gbc_btnBlinds);
		
		btnTemp = new JButton("");
		btnTemp.setIcon(TempIcon);
		GridBagConstraints gbc_btnTemp = new GridBagConstraints();
		gbc_btnTemp.insets = new Insets(0, 0, 0, 5);
		gbc_btnTemp.anchor = GridBagConstraints.NORTHWEST;
		gbc_btnTemp.gridx = 4;
		gbc_btnTemp.gridy = 0;
		panel.add(btnTemp, gbc_btnTemp);
		
	
// Create the Exercise Panel here========================================================================
		JPanel Exercise_Panel = new JPanel();
		frame.getContentPane().add(Exercise_Panel, "");
		Exercise_Panel.setLayout(null);
		
		//Exercise_Panel.add(Rise_small);
	
	
	}
}
