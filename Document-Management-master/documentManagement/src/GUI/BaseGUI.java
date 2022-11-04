package GUI;

import java.awt.Font;

import javax.swing.ImageIcon;
import javax.swing.JFrame;

public abstract class BaseGUI {
	public static class FontSize {
		public static final int 
		tiny = 11,
		small = 12,
		medium = 13,
		large = 14,
		huge = 15,
		HUGE = 16,
		header = 25;
	}
	
	public static final Font
	fontTiny = new Font("Tahoma", Font.PLAIN, FontSize.tiny),
	fontTinyBold = new Font("Tahoma", Font.BOLD, FontSize.tiny),
	fontSmallBold = new Font("Tahoma", Font.BOLD, FontSize.small),
	fontProfileLabel = new Font("Dialog", Font.PLAIN, FontSize.small),
	fontMedium = new Font("Tahoma", Font.PLAIN, FontSize.medium),
	fontMediumBold = new Font("Tahoma", Font.BOLD, FontSize.medium),
	fontLargeTNR = new Font("Times New Roman", Font.PLAIN, FontSize.large),
	fontLarge = new Font("Tahoma", Font.PLAIN, FontSize.large),
	fontLargeBold = new Font("Tahoma", Font.BOLD, FontSize.large),
	fontHuge = new Font("Tahoma", Font.PLAIN, FontSize.huge),
	fontHugeBold = new Font("Tahoma", Font.BOLD, FontSize.huge),
	fontHUGE = new Font("Tahoma", Font.PLAIN, FontSize.HUGE),
	fontHUGEbold = new Font("Tahoma", Font.BOLD, FontSize.HUGE),
	fontHeader = new Font("Tahoma", Font.PLAIN, FontSize.header);		
	
	public static final ImageIcon icon = new ImageIcon("src\\logo.png");
}
