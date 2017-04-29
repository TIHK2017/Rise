package bottombanner;

import java.awt.Image;

import javax.swing.ImageIcon;
import javax.swing.JButton;

public class BottomBanner {
	// Bottom banner buttons allow the user to navigate between the different functions================================
	//Home, Exercise, SmartBlinds, SmartTemp
	private ImageIcon HomeIcon = (new ImageIcon(new ImageIcon("C:\\Images\\Home.png").getImage().getScaledInstance(32, 24, Image.SCALE_DEFAULT)));
	private ImageIcon WeightIcon = (new ImageIcon(new ImageIcon("C:\\Images\\Weight.png").getImage().getScaledInstance(40, 30, Image.SCALE_DEFAULT)));
	private ImageIcon BlindsIcon = (new ImageIcon(new ImageIcon("C:\\Images\\Blinds.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
	private ImageIcon TempIcon = (new ImageIcon(new ImageIcon("C:\\Images\\Temp.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT)));
	
	public JButton btnHome;
	public JButton btnExercise;
	public JButton btnBlinds;
	public JButton btnTemp;
	
	public BottomBanner() {
		HomeIcon = new ImageIcon(new ImageIcon("C:\\Images\\Home.png").getImage().getScaledInstance(32, 24, Image.SCALE_DEFAULT));
		WeightIcon = new ImageIcon(new ImageIcon("C:\\Images\\Weight.png").getImage().getScaledInstance(40, 30, Image.SCALE_DEFAULT));
		BlindsIcon = new ImageIcon(new ImageIcon("C:\\Images\\Blinds.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));
		TempIcon = new ImageIcon(new ImageIcon("C:\\Images\\Temp.png").getImage().getScaledInstance(30, 30, Image.SCALE_DEFAULT));

		btnHome = new JButton("");
		btnHome.setBounds(21, 550, 73, 29);
		btnHome.setIcon(HomeIcon);
		
		btnExercise = new JButton("");
		btnExercise.setBounds(99, 550, 73, 29);
		btnExercise.setIcon(WeightIcon);
		
		btnBlinds = new JButton("");
		btnBlinds.setBounds(177, 550, 73, 29);
		btnBlinds.setIcon(BlindsIcon);
		
		btnTemp = new JButton("");
		btnTemp.setBounds(252, 550, 73, 29);
		btnTemp.setIcon(TempIcon);
	}
}
