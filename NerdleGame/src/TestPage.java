import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JLabel;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TestPage extends JFrame {
	
	private JPanel contentPane;
	private JTextField textField;
	private JButton btnBack;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TestPage frame = new TestPage();
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
	public TestPage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		textField = new JTextField();
		textField.setFont(new Font("Tahoma", Font.PLAIN, 20));
		textField.setBounds(69, 163, 285, 36);
		contentPane.add(textField);
		textField.setColumns(10);
		
		String eq0 = new String();
		eq0 = generate.generateEquations();
		textField.setText(eq0);
		
		JLabel lblNewLabel = new JLabel("   CREATED EQUATION : ");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 15));
		lblNewLabel.setBounds(129, 117, 175, 25);
		contentPane.add(lblNewLabel);
		
		JButton btnAgain = new JButton("CREATE AGAIN");
		btnAgain.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String eq1 = new String();
				eq1 = generate.generateEquations();
				textField.setText(eq1);
			}
		});
		btnAgain.setBounds(163, 37, 109, 44);
		contentPane.add(btnAgain); 
		
		btnBack = new JButton("<");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage h = new HomePage();
				h.setVisible(true);
				setVisible(false);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnBack.setBounds(10, 10, 80, 27);
		contentPane.add(btnBack);
	}
}
