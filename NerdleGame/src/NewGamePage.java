import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;
import java.awt.Color;
import java.awt.Component;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.text.JTextComponent;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.Timer;

import java.awt.Font;

import javax.swing.Box;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.FocusListener;
import java.awt.event.MouseListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;

import java.util.*;
import java.lang.*;
import java.io.*;
import javax.swing.SwingConstants;

public class NewGamePage extends JFrame {

	private JPanel contentPane;
	ArrayList<JPanel> rows = new ArrayList<>();
	JTextField tmp_txt = new JTextField();
	JTextField selected_text = new JTextField();
	JTextField parameter_text = new JTextField();
	String a = new String();
	static String eq1 = new String();
	ArrayList <String> get_row = new ArrayList<>();
	ArrayList <ArrayList<BoxInfo>> box_rows_later= new ArrayList<>();
	ArrayList <BoxInfo> boxes_later= new ArrayList<>();
	String get_colomn = new String("");
	String num1 = new String();
	String num2 = new String();
	String num3 = new String();
	String num4 = new String();
	StringBuilder yellow_text = new StringBuilder("");
	String testReS = new String("");
	int num1_i;
	int num2_i;
	int num3_i;
	String op1 = new String("");;
	String op2 = new String("");
	String op3 = new String("");
	int opNum = 0 , inputRow = 0;
	int testResult;
	String [] op1_nums;
	String tmp = new String();
	int secs = 0;

	
	int box_num = eq1.length(); 
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		boolean flag = false;
//		eq1 = "96+36=132";
		
		eq1 = generate.generateEquations();
		System.out.println(eq1);
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					if(!flag) {
						HomePage h = new HomePage();
						h.setVisible(true);
					}		
						
					NewGamePage frame = new NewGamePage();
					if(flag)
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
	public NewGamePage() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		setBounds(100, 100, 950, 630);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("  MAKE A GUESS");
		lblNewLabel.setFont(new Font("Tahoma", Font.PLAIN, 25));
		lblNewLabel.setBounds(184, 10, 199, 89);
		contentPane.add(lblNewLabel);
		
		JButton btnBack = new JButton("<--");
		btnBack.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				HomePage h = new HomePage();
				setVisible(false);
				h.setVisible(true);
			}
		});
		btnBack.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnBack.setBounds(10, 20, 110, 43);
		contentPane.add(btnBack);
		
		JButton btnBoxGenerate = new JButton("GUESS");
		btnBoxGenerate.setFont(new Font("Tahoma", Font.PLAIN, 16));
		
		btnBoxGenerate.setBounds(415, 50, 150, 43);
		contentPane.add(btnBoxGenerate);
		
		JPanel boxes1 = new JPanel();
		boxes1.setBounds(21, 129, 541, 48);
		contentPane.add(boxes1);
		
		JPanel boxes2 = new JPanel();
		boxes2.setBounds(21, 187, 541, 48);
		contentPane.add(boxes2);
		
		JPanel boxes3 = new JPanel();
		boxes3.setBounds(21, 245, 541, 48);
		contentPane.add(boxes3);
		
		JPanel boxes4 = new JPanel();
		boxes4.setBounds(21, 303, 541, 48);
		contentPane.add(boxes4);
		
		JPanel boxes5 = new JPanel();
		boxes5.setBounds(21, 361, 541, 48);
		contentPane.add(boxes5);
		
		JPanel boxes6 = new JPanel();
		boxes6.setBounds(21, 416, 541, 48);
		contentPane.add(boxes6);
		
		rows.add(boxes1);
		rows.add(boxes2);
		rows.add(boxes3);
		rows.add(boxes4);
		rows.add(boxes5);
		rows.add(boxes6);
		
		JButton btn1 = new JButton("1");
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("1");
			}
		});
		btn1.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn1.setBounds(625, 303, 58, 48);
		contentPane.add(btn1);
		
		JButton btn2 = new JButton("2");
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("2");
			}
		});
		btn2.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn2.setBounds(693, 303, 58, 48);
		contentPane.add(btn2);
		
		JButton btn3 = new JButton("3");
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("3");
			}
		});
		btn3.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn3.setBounds(761, 303, 58, 48);
		contentPane.add(btn3);
		
		JButton btn4 = new JButton("4");
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("4");
			}
		});
		btn4.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn4.setBounds(625, 245, 58, 48);
		contentPane.add(btn4);
		
		JButton btn5 = new JButton("5");
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("5");
			}
		});
		btn5.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn5.setBounds(693, 245, 58, 48);
		contentPane.add(btn5);
		
		JButton btn6 = new JButton("6");
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("6");
			}
		});
		btn6.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn6.setBounds(761, 245, 58, 48);
		contentPane.add(btn6);
		
		JButton btn7 = new JButton("7");
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("7");
			}
		});
		btn7.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn7.setBounds(625, 187, 58, 48);
		contentPane.add(btn7);
		
		JButton btn8 = new JButton("8");
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("8");
			}
		});
		btn8.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn8.setBounds(693, 187, 58, 48);
		contentPane.add(btn8);
		
		JButton btn9 = new JButton("9");
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("9");
			}
		});
		btn9.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn9.setBounds(761, 187, 58, 48);
		contentPane.add(btn9);
		
		JButton btn0 = new JButton("0");
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("0");
			}
		});
		btn0.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btn0.setBounds(625, 361, 58, 48);
		contentPane.add(btn0);
		
		JButton btnDel = new JButton("DEL");
		btnDel.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("");
			}
		});
		btnDel.setFont(new Font("Tahoma", Font.PLAIN, 12));
		btnDel.setBounds(761, 361, 58, 48);
		contentPane.add(btnDel);
		
		JButton btnMUL = new JButton("X");
		btnMUL.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("*");
			}
		});
		btnMUL.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnMUL.setBounds(829, 303, 59, 48);
		contentPane.add(btnMUL);
		
		JButton btnDIV = new JButton("/");
		btnDIV.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("/");
			}
		});
		btnDIV.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnDIV.setBounds(829, 361, 58, 48);
		contentPane.add(btnDIV);
		
		JButton btnSUB = new JButton("-");
		btnSUB.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("-");
			}
		});
		btnSUB.setFont(new Font("Tahoma", Font.PLAIN, 25));
		btnSUB.setBounds(829, 245, 58, 48);
		contentPane.add(btnSUB);
		
		JButton btnADD = new JButton("+");
		btnADD.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("+");
			}
		});
		btnADD.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnADD.setBounds(829, 187, 58, 48);
		contentPane.add(btnADD);
		
		JButton btnEQU = new JButton("=");
		btnEQU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				selected_text.setText("=");
			}
		});
		btnEQU.setFont(new Font("Tahoma", Font.PLAIN, 27));
		btnEQU.setBounds(693, 361, 58, 48);
		contentPane.add(btnEQU);
		
		JLabel timerLabel = new JLabel("");
		timerLabel.setFont(new Font("Tahoma", Font.BOLD, 20));
		timerLabel.setBounds(338, 508, 133, 43);
		contentPane.add(timerLabel);
		
		JPanel panel_saver = new JPanel();
		panel_saver.setBounds(385, 535, 541, 48);
		contentPane.add(panel_saver);
		
		
		
		JButton btnGuessLater = new JButton("PLAY LATER");
		btnGuessLater.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {					
				HomePage h = new HomePage();
				h.setVisible(true);
				setVisible(false);
			}
		});
		
		btnGuessLater.setFont(new Font("Tahoma", Font.PLAIN, 17));
		btnGuessLater.setBounds(665, 444, 196, 63);
		contentPane.add(btnGuessLater);
		
		JLabel lblNewLabel_1 = new JLabel("BOXES MAY NOT BE SELECTED AT ONCE");
		lblNewLabel_1.setBounds(598, 28, 297, 43);
		contentPane.add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("PLEASE CLICK TWICE");
		lblNewLabel_2.setBounds(598, 81, 199, 43);
		contentPane.add(lblNewLabel_2);
		
        Timer time = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent actionEvent) {
            	timerLabel.setText(String.valueOf(secs));
               secs++;
            }
        });
        time.start();

		for(int a = 0 ; a < 6; a++) {
			
			for(int j = 0 ; j < eq1.length() ; j++) {
				rows.get(a).add(new JTextField(5));
			    rows.get(a).getComponent(j).addMouseListener(new MouseAdapter() {   		//DÝNAMÝK OLARAK OLUÞTURULAN KUTULARA MOUSE ÝLE TIKLANIP SEÇÝLEBÝLME VE BUTONLARA BASILDIÐINDA SEÇÝLÝ KUTUNUN DEÐERÝNÝN SET EDÝLEBÝLME ÖZELLÝÐÝ EKLENÝR
			        @Override
			        public void mouseClicked(MouseEvent e) {
			        	selected_text = (JTextField) e.getSource();
			        }
			    });
			}
		}
		
		for(int g = 1 ; g < 6; g++)													// ILK SATIR DIÞINDAKI SATIRLARIN KILITLENMESI
			for(int j = 0 ; j < eq1.length(); j++) {
				tmp_txt = (JTextField)rows.get(g).getComponent(j);
				tmp_txt.setEditable(false);
			}
		
		btnBoxGenerate.addActionListener(new ActionListener() {
			int i = 0;
			public void actionPerformed(ActionEvent e) {
					opNum = 0;
					boolean flagValid = true;
					for(int j = 0 ; j < eq1.length() ; j++ ) {                  //            KUTULARA GÝRÝLEN DEÐERLERÝN KONTROL EDÝLEBÝLMESÝ ÝÇÝN  
						tmp_txt = (JTextField)rows.get(i).getComponent(j);      //            STRING OLARAK KAYDEDILMESI
//					    tmp_txt.setText(String.valueOf(eq1.charAt(j)));
						get_colomn = get_colomn + tmp_txt.getText();
					}
//					System.out.println(get_colomn);
					get_row.add(get_colomn);
					get_colomn = "";
					

					if(get_row.get(i).length() != eq1.length()) {              //            BOÞ KUTU BIRAKILMIÞSA  INDIS ILERLEMEZ VE BIR SONRAKI SATIRA GEÇILMEZ
			            JOptionPane.showMessageDialog(contentPane, "DO NOT LEAVE BLANK",
			                    "INVALID INPUT", JOptionPane.ERROR_MESSAGE);						//               INVALID INPUT , DENENMÝÞLER ARRAY INDEN SÝLÝNÝR
						inputRow--;
						get_row.remove(i);
						i--;
						opNum = 0;
						num1 = "";num2 = ""; num3 = ""; testReS = ""; op1 = "" ; op2 = "";
						flagValid = false;
					}
					
					else {
						for(int a = 0 ; a < eq1.length() ; a++) {
							if(get_row.get(i).charAt(a) == '+' || get_row.get(i).charAt(a) == '-' || get_row.get(i).charAt(a) == '*' || get_row.get(i).charAt(a) == '/') {
								opNum++;
							}
						}																				// OPERATOR SAYISI TESPÝT EDÝLÝR BUNA GÖRE ÝÞLEME GEÇÝLÝR
						
						if(opNum < 1 || opNum > 3) {
				            JOptionPane.showMessageDialog(contentPane, "INVALID INPUT ENTERED",
				                    "RE-ENTER YOUR INPUT ", JOptionPane.ERROR_MESSAGE);
							inputRow--;
							get_row.remove(i);
							i--;
							System.out.println("Geçersiz Giriþ"); 										// 1 OPERATORDEN AZ YA DA 3 OPERATORDEN FAZLA OLAMAZ
							opNum = 0;
							flagValid = false;
						}
						
						if(opNum == 1) {
							System.out.println("girilen " + get_row.get(i));
							int opNUM = 0;
							int z = 0;
							
							
							while(get_row.get(i).charAt(z) != '=') {                            // DENKLEMÝN SOL TARAFI ALINIR
								
								if(generate.isOperator(get_row.get(i).charAt(z))) {
									opNUM++;
									op1 = String.valueOf(get_row.get(i).charAt(z));
								}
								else if(opNUM == 0) {
									
										num1 = num1 + get_row.get(i).charAt(z);							// OPERATORE KADAR OLANLAR ALINIR NUM1 E ATANIR
								}
								else if(flagValid == true & opNUM == 1) {
										num2 = num2 + get_row.get(i).charAt(z);							// OPERATORDEN SONRASI  ALINIR NUM 2 E ATANIR
								}
								
								z++;
								
							}
							
							if(get_row.get(i).charAt(z) == '=') {
								for(int f = ++z ; f < eq1.length() ; f++) {
									testReS = testReS + get_row.get(i).charAt(f); 							// EÞÝTTÝRDEN SONRASI ALINIR KULLANICININ SONUCUNA ATANIR
								}
								
								
							}
								
							System.out.println("num1 : " + num1 + " num2 : "+ num2 + " operator : " + op1 + " result : " + testReS);
							
							if(flagValid) {
								if(!checkOneOp(Integer.parseInt(num1), Integer.parseInt(num2), op1, Integer.parseInt(testReS))){
						            JOptionPane.showMessageDialog(contentPane, "EQUATION RESULT IS WRONG",
						                    "RE-ENTER YOUR INPUT ", JOptionPane.ERROR_MESSAGE);
									inputRow--;
									get_row.remove(i);
									i--;
									System.out.println("WRONG EQUATION");										// VALID BIR DENKLEM ISE SONUCU KONTROL EDÝLÝR 
									opNum = 0;
									num1 = "";num2 = ""; num3 = ""; testReS = ""; op1 = "" ; op2 = "";
									flagValid = false;
								}
							}
							
							
							if(flagValid){ 																	// DENKLEMÝN SONUCU DOÐRUYSA , ÜRETÝLEN DENKLEMLE KARÞILAÞTIRMA VE BOYAMA KISMINA GEÇÝLÝR
								
									yellow_text.append(eq1);
								
			
								for(int a = 0 ; a < eq1.length() ; a++) {
									if(eq1.charAt(a) == get_row.get(i).charAt(a)) {
										rows.get(i).getComponent(a).setBackground(Color.green);
										yellow_text.setCharAt(a, ' ');
										System.out.println("Yeþil Girdi");
									}
										
									else if(yellow_text.toString().contains(Character.toString(get_row.get(i).charAt(a)))) {
										rows.get(i).getComponent(a).setBackground(Color.yellow);
										yellow_text.setCharAt(a, ' ');
										System.out.println("sarý Girdi");
									}
										
									else {
										rows.get(i).getComponent(a).setBackground(Color.red);
										System.out.println("kýrm Girdi");
									}
										
									System.out.println(yellow_text);
									
								} 
								yellow_text.setLength(0);
								
								boolean colorFlag = true;
								for(int j = 0 ; j < eq1.length(); j++) {
									if(rows.get(i).getComponent(j).getBackground() != Color.green)							// TÜM KUTULAR YEÞÝL ÝSE TEBRÝK EDÝLÝR OYUN SONA ERER
										colorFlag = false;
								}
								
								if(colorFlag) {
						            JOptionPane.showMessageDialog(contentPane, " CONGRATS RIGHT GUESS",
						                    " YOU HAVE WON ", JOptionPane.INFORMATION_MESSAGE);
						            HomePage h = new HomePage();
						            h.setVisible(true);
						            setVisible(false);
								}
								
								
								
									for(int j = 0 ; j < eq1.length(); j++) {
										BoxInfo box = new BoxInfo();
										JTextField temporary = new JTextField();
										temporary = (JTextField) rows.get(i).getComponent(j);						// TÜM KUTULARIN YAZI RENK VE ERÝÞÝLEBÝLÝRLÝK BÝLGÝLERÝ , KAYDEDÝLÝP YENÝ DOSYADA KULLANILMAK ÜZERE ALINIR 
										box.value = temporary.getText();
										box.visibility = temporary.isEditable();
										box.color = temporary.getBackground();
										System.out.print("edit : " + box.visibility + " color : " + box.color + "val : " + box.value);
										boxes_later.add(box);
									}
									box_rows_later.add(boxes_later);
									boxes_later.clear(); 
							}             
							
							opNum = 0;
							num1 = "";num2 = ""; num3 = ""; testReS = ""; op1 = "" ; op2 = "";
							
						}
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////						
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						else if(opNum == 2) {																
							
							System.out.println("girilen " + get_row.get(i));						// 	YUKARIDA ANLATILAN AYNI ÝÞLEMLERÝN 2 OPERATORLU HALÝ
							int opNUM = 0;
							int z = 0;
							num1 = "";num2 = ""; num3 = ""; testReS = ""; op1 = "" ; op2 = "";
							
							while(get_row.get(i).charAt(z) != '=') {
								
								if(generate.isOperator(get_row.get(i).charAt(z))) {
									opNUM++;
									if(opNUM == 1)
									op1 = String.valueOf(get_row.get(i).charAt(z));
									else if(opNUM == 2)
									op2 = String.valueOf(get_row.get(i).charAt(z));	
								}
								else if(opNUM == 0) {												//  2 OPERATORLU ISLEMLER ICIN SAYILARI ALMAK
									num1 = num1 + get_row.get(i).charAt(z);
								}
								else if(opNUM == 1) {
									num2 = num2 + get_row.get(i).charAt(z);
								}
								else if(opNUM == 2) {
									num3 = num3 + get_row.get(i).charAt(z);
								}
								
								z++;
								
							}
							
							if(get_row.get(i).charAt(z) == '=') {
								for(int f = ++z ; f < eq1.length() ; f++) {
									testReS = testReS + get_row.get(i).charAt(f); 
								}
								
								
							}
								
							System.out.println("num1 : " + num1 + " num2 : "+ num2 + " num3 : " +" operator 1 : " + op1 + " operator 2 : " + op2 +" result : " + testReS);
							
							if(!checkTwoOp(Integer.parseInt(num1), Integer.parseInt(num2), Integer.parseInt(num3) , op1 , op2 , Integer.parseInt(testReS))){
					            JOptionPane.showMessageDialog(contentPane, "EQUATION RESULT IS WRONG",
					                    "RE-ENTER YOUR INPUT", JOptionPane.ERROR_MESSAGE);
								inputRow--;
								get_row.remove(i);
								i--;
								System.out.println("WRONG EQUATION");
								opNum = 0;
								num1 = "";num2 = ""; num3 = ""; testReS = ""; op1 = "" ; op2 = "";
								flagValid = false;
							}
							
							if(flagValid){
								
								yellow_text.append(eq1);
							
		
							for(int a = 0 ; a < eq1.length() ; a++) {
								if(eq1.charAt(a) == get_row.get(i).charAt(a)) {
									rows.get(i).getComponent(a).setBackground(Color.green);
									yellow_text.setCharAt(a, ' ');
								}
									
								else if(yellow_text.toString().contains(Character.toString(get_row.get(i).charAt(a)))) {
									rows.get(i).getComponent(a).setBackground(Color.yellow);
									yellow_text.setCharAt(a, ' ');
								}
									
								else {
									rows.get(i).getComponent(a).setBackground(Color.red);
								}
									
								System.out.println(yellow_text);
							} 
							
							yellow_text.setLength(0);
							boolean colorFlag = true;
							for(int j = 0 ; j < eq1.length(); j++) {
								if(rows.get(i).getComponent(j).getBackground() != Color.green)
									colorFlag = false;
							}
							
							if(colorFlag) {
					            JOptionPane.showMessageDialog(contentPane, " CONGRATS RIGHT GUESS",
					                    " YOU HAVE WON ", JOptionPane.INFORMATION_MESSAGE);
					            HomePage h = new HomePage();
					            h.setVisible(true);
					            setVisible(false);
							}
							
							for(int j = 0 ; j < eq1.length(); j++) {
								BoxInfo box = new BoxInfo();
								JTextField temporary = new JTextField();
								temporary = (JTextField) rows.get(i).getComponent(j);
								box.value = temporary.getText();
								box.visibility = temporary.isEditable();
								box.color = temporary.getBackground();
								System.out.print("edit : " + box.visibility + " color : " + box.color + "val : " + box.value);
								boxes_later.add(box);
							}
							box_rows_later.add(boxes_later);
							boxes_later.clear();
								
							
						}
							

							
							opNum = 0;
							num1 = "";num2 = ""; num3 = ""; testReS = ""; op1 = "" ; op2 = "";
							
						}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
						else if(opNum == 3) {
							System.out.println("girilen " + get_row.get(i));
							int opNUM = 0;
							int z = 0;
							num1 = "";num2 = ""; num3 = ""; testReS = ""; op1 = "" ; op2 = "";
							
							while(get_row.get(i).charAt(z) != '=') {
								
								if(generate.isOperator(get_row.get(i).charAt(z))) {
									opNUM++;
									if(opNUM == 1)
									op1 = String.valueOf(get_row.get(i).charAt(z));
									else if(opNUM == 2)
									op2 = String.valueOf(get_row.get(i).charAt(z));	
									else if(opNUM == 3)
									op3 = String.valueOf(get_row.get(i).charAt(z));	
								}
								else if(opNUM == 0) {												//  1 OPERATORLU ISLEMLER ICIN SAYILARI ALMAK
									num1 = num1 + get_row.get(i).charAt(z);
								}
								else if(opNUM == 1) {
									num2 = num2 + get_row.get(i).charAt(z);
								}
								else if(opNUM == 2) {
									num3 = num3 + get_row.get(i).charAt(z);
								}
								else if(opNUM == 3) {
									num4 = num4 + get_row.get(i).charAt(z);
								}
								
								z++;
								
							}
							
							if(get_row.get(i).charAt(z) == '=') {
								for(int f = ++z ; f < eq1.length() ; f++) {
									testReS = testReS + get_row.get(i).charAt(f); 
								}
								
								
							}
								
							System.out.println("num1 : " + num1 + " num2 : "+ num2 + " num3 : " + "num4 : " + num4 + " operator 1 : " + op1 + " operator 2 : " + op2 + " operator 3 : " + op3  +" result : " + testReS);
							
							if(flagValid){
								for(int a = 0 ; a < eq1.length() ; a++) {
									if(eq1.charAt(a) == get_row.get(i).charAt(a))
										rows.get(i).getComponent(a).setBackground(Color.green);
									else if(eq1.contains(Character.toString(get_row.get(i).charAt(a))))
										rows.get(i).getComponent(a).setBackground(Color.yellow);
									else
										rows.get(i).getComponent(a).setBackground(Color.red);
										
								} 
							}
						}
						
					}
		
				i++;
				inputRow++;
				if(i == 6) {
					i = 0;
					inputRow = 0;
		            JOptionPane.showMessageDialog(contentPane, " YOU ARE OUT OF GUESS \n THE EQUATION IS : " + eq1,
		                    " YOU HAVE FAILED ", JOptionPane.INFORMATION_MESSAGE);
		            HomePage h = new HomePage();
		            h.setVisible(true);
		            setVisible(false);
				}
				for(int i = 0 ; i < 6; i++)													// YANLIÞ TAHMÝNDEN DOLAYI SEÇÝLÝ SATIR KÝLÝTLENÝR
					for(int j = 0 ; j < eq1.length(); j++) {
						tmp_txt = (JTextField)rows.get(i).getComponent(j);
						tmp_txt.setEditable(false);
					}
				
					for(int j = 0 ; j < eq1.length(); j++) {
							tmp_txt = (JTextField)rows.get(inputRow).getComponent(j);      // GEÇÝLEN BÝR SONRAKÝ SATIRIN KÝLÝDÝ AÇILIR
							tmp_txt.setEditable(true);
					}
					
					
				
			}
		});
		
				
		}

////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////
////////////////////////////////////////////   E    //////////////////      N     //////////////////////       D     ///////////////////////////////////////
///////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////////	
	
	
	 public static boolean checkOneOp(int num1 , int num2 , String op , int userResult){
	    	int result = -1;
	    	float result_tmp = -1;
	    	boolean flag = true , flag2 = true;

	        	if(op.equals("+")) {												// KULLANICIDAN ALINAN 1 OPERATORLU VALID OLDUÐU BÝLÝNEN DENKLEMÝN SONUCUNUN DOÐRU OLUP OLMADIÐINI KONTROL EDEN METHOD
	    			result_tmp = num1 + num2;						
	    			result = (int) result_tmp;
	    		}
	    		
	    		else if(op.equals("-")) {
	    			result_tmp = num1 - num2;
	    			result = (int) result_tmp;
	    		}
	    		else if(op.equals("*")) {
	    			result_tmp = num1 * num2;		
	    			result = (int) result_tmp;  
	    		}
	    		else if(op.equals("/")) {
	    			result_tmp = (float)num1 / (float)num2;
	    			result = (int) result_tmp; 
	    			
	    			if(result == 0 || (result != result_tmp)) {
	    				flag2 = false;
	    			}
	    				
	    		}	
	        	
	        	if(flag2) {
	        		if(userResult == result)
	        			return true;
	        		return false;
	        	}
	        	else {
	        		return false;
	        	}

	    }
	 
	 public static boolean checkTwoOp(int num1 , int num2 , int num3 , String op1 , String op2 , int testReS) {
	    	int result = -1;
	    	float result_tmp = -1;
	    	float preResult = -1;								// KULLANICIDAN ALINAN 2 OPERATORLU VALID OLDUÐU BÝLÝNEN DENKLEMÝN SONUCUNUN DOÐRU OLUP OLMADIÐINI KONTROL EDEN METHOD
	    	boolean flag = true , flag_divide = true;	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////7//////////		    	
		    	
		    	
		    	if(op1.equals("+")) {                        // ÝLK ELEMAN + ÝSE DÝGER OPERAND KONTROL EDÝLÝR
		    		
		    		
		    		if(op2.equals("+")) {
		    			
		    			result = num1 + num2 + num3;
		    			
		    		}
		    		else if(op2.equals("-")) {
		    			
		    			result = num1 + num2 - num3;
		    			
		    		}
		    		else if(op2.equals("*")) {
		    			
		    			result = num1 + num2 * num3;
		    			
		    		}
		    		else if(op2.equals("/")) {
		    			
		    			if(generate.divide_control(num2,num3)) {
		    				result = num1 + num2 / num3;
		    				flag_divide = true;
		    			}
		    			else {
		    				flag_divide = false;
		    			}
		    			
		    		}
		    	}
		
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////7//////////		    	
		    	
		    	else if(op1.equals("-")) {                                       // ÝLK ELEMAN - ÝSE DÝGER OPERAND KONTROL EDÝLÝR
		
		    		
		    		if(op2.equals("+")) {
		    			
		    			result = num1 - num2 + num3;
		    		}
		    		else if(op2.equals("-")) {
		    			result = num1 - num2 - num3;
		    		}
		    		else if(op2.equals("*")) {
		    			result = num1 - num2 * num3;
		    		}
		    		else if(op2.equals("/")) {
		    			if(generate.divide_control(num2,num3)) {
		    				result = num1 - num2 / num3;
		    				flag_divide = true;
		    			}
		    			else {
		    				flag_divide = false;
		    			}
		    			
		    		}
		    	}
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////7//////////	    	
		    	else if(op1.equals("*")) {
		    																// ÝLK ELEMAN ÇARPI ÝSE
		    		preResult = num1 * num2;
		    		
		    		if(op2.equals("+")) {
		    			
		    			result = (int)preResult + num3;
		    			
		    		}
		    		else if(op2.equals("-")) {
		    			
		    			result = (int)preResult - num3;

		    		}
		    		else if(op2.equals("*")) {
		    			
		    			result = (int)preResult * num3;

		    		}
		    		else if(op2.equals("/")) {
		    			
		    			if(generate.divide_control((int)preResult,num3)) {
		    				result = (int)preResult / num3;
		    				flag_divide = true;
		    			}
		    			
		    			else {
		    				flag_divide = false;
		    			}
		    		}
		    		
		    	}
		    	
	///////////////////////////////////////////////////////////////////////////////////////////////////////////////7//////////		    				
		    	
		    	else if(op1.equals("/")) {
		    		
		    		if(generate.divide_control(num1,num2)) {
		    			preResult = num1 / num2;
		    			flag_divide = true;
		    		}

		    		else
		    			flag_divide = false;
		    		
		    		if(flag_divide) {
		    			
		    			if(op2.equals("+")) {
			    			
			    			result = (int)preResult + num3;
			    			
			    		}
			    		else if(op2.equals("-")) {
			    			
			    			result = (int)preResult - num3;
			    			
			    		}
			    		else if(op2.equals("*")) {
			    			
			    			result = (int)preResult * num3;
			    			
			    		}
			    		else if(op2.equals("/")) {
			    			
			    			if(generate.divide_control((int)preResult,num3)) {
			    				result = (int)preResult / num3;
			    				flag_divide = true;
			    			}
			    			else 
			    				flag_divide = false;
			    		}
		    		}
		    	  		
		    		
		    	}
		    	
		    	
		    	if(flag_divide) {
		    		
		    		if(testReS == result)
		    			return true;
		    		
		    		return false;
		    	}
		    	else {
		    		return false;
	    	
	    	}

	    }
}
