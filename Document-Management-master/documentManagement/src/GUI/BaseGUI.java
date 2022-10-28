package GUI;

import java.awt.Font;
import javax.swing.JFrame;

@SuppressWarnings("serial")
public abstract class BaseGUI {
	
	private static final int 
	fontSizeTiny = 11,
	fontSizeSmall = 12,
	fontSizeMedium = 13,
	fontSizeLarge = 14,
	fontSizeHuge = 15,
	fontSizeHUGE = 16,
	fontSIzeHeader = 25;
	
	public static final Font 
	fontTinyBold = new Font("Tahoma", Font.BOLD, fontSizeTiny),
	fontSmall = new Font("Tahoma", Font.BOLD, fontSizeSmall),
	fontMedium = new Font("Tahoma", Font.PLAIN, fontSizeMedium),
	fontLabelLargeTNR = new Font("Times New Roman", Font.PLAIN, fontSizeLarge),
	fontLarge = new Font("Tahoma", Font.PLAIN, fontSizeLarge),
	fontLargeBold = new Font("Tahoma", Font.BOLD, fontSizeLarge),
	fontHuge = new Font("Tahoma", Font.PLAIN, fontSizeHuge),
	fontHugeBold = new Font("Tahoma", Font.BOLD, fontSizeHuge),
	fontHUGE = new Font("Tahoma", Font.PLAIN, fontSizeHUGE),
	fontHUGEbold = new Font("Tahoma", Font.BOLD, fontSizeHUGE),
	fontHeader = new Font("Tahoma", Font.PLAIN, fontSIzeHeader);	
}
