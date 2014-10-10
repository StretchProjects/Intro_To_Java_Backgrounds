/**
 * Author   : Stretch Projects
 * Series   : Introduction to Java
 * Topic    : Backgrounds & buttons
 * Lecture  : http://youtu.be/u_b2_fdm3IY
 * Tutorial : http://youtu.be/TzU7HpRB5RA
 * License  : None.  Do with it as you wish! :)
 */

import java.awt.FlowLayout;
import java.awt.event.*;

import javax.swing.*;

public class Main {
	public static void main(String[] args) {
		new Main();
	}
	public Main() {
		JFrame frame = new JFrame("Youtube");
		
		frame.setSize(640, 480);
		
		frame.addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent windowEvent) {
				System.exit(0);
			}
		});
		
		frame.setLayout(new FlowLayout());
		JPanel panel = new JPanel();
		panel.setLayout(new FlowLayout());
		frame.add(panel);
		
		JButton button1 = new JButton("Click me");
		panel.add(button1);
		
		button1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				System.out.println("Clicked");
			}
		});
		
		
		frame.setVisible(true);
	}
}
