package homepanel;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.UIManager;
import javax.swing.border.Border;
import javax.swing.border.TitledBorder;

import bottombanner.BottomBanner;

public class HomePanel {
	private JLabel Welcome_banner;
	private JLabel Rise_small;
	private JLabel lblNewLabel_2;
	private JLabel Rise_image;
	private JLabel Weather;
	private JLabel Time_Date;
	private JScrollPane scrollPane;
	private JTextArea textArea;
	private JButton btnNewButton;
	private JPanel panelHome;
	
	public HomePanel() {
			panelHome = new JPanel();
			panelHome.setLayout(null);
			
			ImageIcon imageIcon_small = (new ImageIcon(new ImageIcon("C:\\Images\\SunIcon_Rise.png").getImage().getScaledInstance(80, 60, Image.SCALE_DEFAULT)));
			TitledBorder title;
			title = BorderFactory.createTitledBorder("Weather");
			Border empty = BorderFactory.createEmptyBorder();
			
			Rise_small = new JLabel("");
			Rise_small.setBounds(21, 13, 67, 60);
			Rise_small.setFont(new Font("Segoe Script", Font.PLAIN, 13));
			panelHome.add(Rise_small);
			Rise_small.setIcon(imageIcon_small);
			
			Welcome_banner = new JLabel("Welcome");
			Welcome_banner.setBounds(116, 19, 155, 54);
			Welcome_banner.setForeground(new Color(255, 102, 51));
			Welcome_banner.setFont(new Font("Script MT Bold", Font.PLAIN, 44));
			Welcome_banner.setBackground(Color.CYAN);
			panelHome.add(Welcome_banner);
			
			Time_Date = new JLabel("[create clock code]");
			Time_Date.setBounds(16, 79, 314, 115);
			Time_Date.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Right now, it is...", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
			panelHome.add(Time_Date);
			
			Weather = new JLabel("[import weather data]");
			Weather.setBounds(16, 199, 314, 106);
			panelHome.add(Weather);
			Weather.setBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Weather", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
			
			scrollPane = new JScrollPane();
			scrollPane.setBounds(16, 310, 314, 194);
			scrollPane.setViewportBorder(new TitledBorder(new TitledBorder(UIManager.getBorder("TitledBorder.border"), "Notes ", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)), "Notes", TitledBorder.LEADING, TitledBorder.TOP, null, new Color(0, 0, 255)));
			scrollPane.setBorder(empty);
			panelHome.add(scrollPane);
			
			textArea = new JTextArea();
			textArea.setRows(2);
			scrollPane.setViewportView(textArea);
			
			btnNewButton = new JButton("Save");
			btnNewButton.setBounds(269, 512, 61, 25);
			btnNewButton.addActionListener(new ActionListener() {
				public void actionPerformed(ActionEvent arg0) {
				}
			});
			panelHome.add(btnNewButton);
			
			JButton btnSeeAllNotes = new JButton("See All Notes");
			btnSeeAllNotes.setBounds(21, 512, 115, 25);
			panelHome.add(btnSeeAllNotes);
			
			BottomBanner ban_butt = new BottomBanner();
			
			panelHome.add(ban_butt.btnHome);
			panelHome.add(ban_butt.btnExercise);
			panelHome.add(ban_butt.btnBlinds);
			panelHome.add(ban_butt.btnTemp);
	}
}
