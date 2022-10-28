package GUI;

import java.awt.Font;
import javax.swing.JFrame;

@SuppressWarnings("serial")
abstract class GUIbase extends JFrame {	
	protected final Font fontLabelSmall = new Font("Tahoma", Font.BOLD, 12);
	protected final Font fontLabelLarge = new Font("Times New Roman", Font.PLAIN, 14);
	protected final Font fontButton = new Font("Tahoma", Font.PLAIN, 13);
}
