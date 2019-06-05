package robot_actions;

import java.awt.AWTException;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.datatransfer.Clipboard;
import java.awt.datatransfer.StringSelection;
import java.awt.event.KeyEvent;
import java.io.IOException;


public class Robot_Copy_String {

	public static void main(String[] args) throws IOException, InterruptedException, AWTException {
		
		//Launch notepad file at runtime
		Runtime.getRuntime().exec("notepad.exe");
		Thread.sleep(5000);
		
		//Create object for robot class
		Robot robot=new Robot();
		robot.setAutoDelay(500);
		
		String text="Selenium automate web browser interfaces";
		
		//String selection command
		StringSelection Stext=new StringSelection(text);
		//Get default system clipboard
		Clipboard clipboard=Toolkit.getDefaultToolkit().getSystemClipboard();
		//Set All content to system clipboard
		clipboard.setContents(Stext, Stext);
		
		
		//Pefrom ctrl+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		
		//Press S key to save file[Control is already pressed in previous line]
		robot.keyPress(KeyEvent.VK_S);
		//Keyup control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		Thread.sleep(5000);
		
		
		//Add text to Clipbord at runtime
		String path="C:\\Users\\SUNIL\\git\\Apr_12th_3-30PM\\Project163\\src\\robot_actions\\OP.txt";
		StringSelection Spath=new StringSelection(path);
		clipboard.setContents(Spath, Spath);
		
		
		//Pefrom ctrl+V shortcut
		robot.keyPress(KeyEvent.VK_CONTROL);
		robot.keyPress(KeyEvent.VK_V);
		
		//Keyup control
		robot.keyRelease(KeyEvent.VK_CONTROL);
		
		//Press Enter key
		robot.keyPress(KeyEvent.VK_ENTER);
		
		
		
		
		
	
		
		
		
		


	}

}
