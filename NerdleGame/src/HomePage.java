import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextPane;
import java.awt.Font;
import javax.swing.JLabel;


public class HomePage extends JFrame {
	
	private int a = 0;
	
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					HomePage frame = new HomePage();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public HomePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 722, 543);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JPanel panel = new JPanel();
		contentPane.add(panel, BorderLayout.CENTER);
		panel.setLayout(null);
		
		JButton btnNewGame = new JButton("NEW GAME");
		btnNewGame.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnNewGame.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				NewGamePage n = new NewGamePage();
				n.setVisible(true);
				setVisible(false);
			}
		});
		btnNewGame.setBounds(272, 166, 125, 45);
		panel.add(btnNewGame);
		
		JTextPane txtWelcome = new JTextPane();
		txtWelcome.setFont(new Font("Tahoma", Font.PLAIN, 23));
		txtWelcome.setText("  WELCOME TO THE NERDLE GAME");
		txtWelcome.setBounds(157, 61, 387, 45);
		panel.add(txtWelcome);
		
		JLabel btn1Prompt = new JLabel("");
		btn1Prompt.setBounds(70, 352, 45, 13);
		panel.add(btn1Prompt);
		
		JButton btnTest = new JButton("TEST");
		btnTest.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				TestPage t = new TestPage();
				t.setVisible(true);
				setVisible(false);
			}
		});
		btnTest.setFont(new Font("Tahoma", Font.PLAIN, 15));
		btnTest.setBounds(272, 246, 125, 45);
		panel.add(btnTest);

	}
}
