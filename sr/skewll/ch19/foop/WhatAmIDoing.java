package skewll.ch19.foop;

import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JToggleButton;
import javax.swing.SwingConstants;

public class WhatAmIDoing {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					WhatAmIDoing window = new WhatAmIDoing();
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
	public WhatAmIDoing() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		JLabel lblSoThisExists = new JLabel("So this exists and I have no idea what I'm doing. How fun.");
		lblSoThisExists.setHorizontalAlignment(SwingConstants.CENTER);
		lblSoThisExists.setFont(new Font("Comic Sans MS", Font.PLAIN, 11));
		lblSoThisExists.setBounds(10, 11, 307, 39);
		frame.getContentPane().add(lblSoThisExists);

		JButton btnPointlessButton = new JButton("Pointless Button");
		btnPointlessButton.setFont(new Font("Trebuchet MS", Font.PLAIN, 11));
		btnPointlessButton.setBounds(127, 91, 155, 23);
		frame.getContentPane().add(btnPointlessButton);

		JToggleButton tglbtnTogglerIsThis = new JToggleButton("Toggler is this be");
		tglbtnTogglerIsThis.setBounds(127, 158, 155, 23);
		frame.getContentPane().add(tglbtnTogglerIsThis);
	}
}
