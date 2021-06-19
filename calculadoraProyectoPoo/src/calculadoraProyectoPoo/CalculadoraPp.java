package calculadoraProyectoPoo;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.ImageIcon;

public class CalculadoraPp extends JFrame {

	private JPanel contentPane;
	private JTextField resultadoCu;
	private JButton igual;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraPp frame = new CalculadoraPp();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
	
	public static boolean existepunto(String cadena) {
		boolean resultados;
		resultados=false;
		
		for(int i=0;i<cadena.length();i++) {
			if(cadena.substring(i, i+1).equals(".")) {
				resultados=true;
				break;
			}
		}
		return resultados;
	}
	
	/**
	 * Create the frame.
	 */
	public CalculadoraPp() {
		setBackground(new Color(255, 255, 255));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 312, 535);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setForeground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton b1 = new JButton("1");
		b1.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b1.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b1.setHorizontalTextPosition(SwingConstants.CENTER);
		b1.setFocusPainted(false);
		b1.setBorder(null);
		b1.setBackground(Color.WHITE);
		b1.setForeground(new Color(0, 51, 51));
		b1.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"1");
			}
		});
		b1.setBounds(16, 357, 50, 50);
		contentPane.add(b1);
		
		JButton b2 = new JButton("2");
		b2.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b2.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b2.setHorizontalTextPosition(SwingConstants.CENTER);
		b2.setFocusPainted(false);
		b2.setBorder(null);
		b2.setBackground(Color.WHITE);
		b2.setForeground(new Color(0, 51, 51));
		b2.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"2");
			}
		});
		b2.setBounds(96, 357, 50, 50);
		contentPane.add(b2);
		
		JButton b3 = new JButton("3");
		b3.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b3.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b3.setHorizontalTextPosition(SwingConstants.CENTER);
		b3.setFocusPainted(false);
		b3.setBorder(null);
		b3.setBackground(Color.WHITE);
		b3.setForeground(new Color(0, 51, 51));
		b3.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"3");
			}
		});
		b3.setBounds(166, 357, 50, 50);
		contentPane.add(b3);
		
		JButton b4 = new JButton("4");
		b4.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b4.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b4.setHorizontalTextPosition(SwingConstants.CENTER);
		b4.setFocusPainted(false);
		b4.setBorder(null);
		b4.setBackground(Color.WHITE);
		b4.setForeground(new Color(0, 51, 51));
		b4.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"4");
			}
		});
		b4.setBounds(16, 277, 50, 50);
		contentPane.add(b4);
		
		JButton b5 = new JButton("5");
		b5.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b5.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b5.setHorizontalTextPosition(SwingConstants.CENTER);
		b5.setFocusPainted(false);
		b5.setBorder(null);
		b5.setBackground(Color.WHITE);
		b5.setForeground(new Color(0, 51, 51));
		b5.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"5");
			}
		});
		b5.setBounds(96, 277, 50, 50);
		contentPane.add(b5);
		
		JButton b6 = new JButton("6");
		b6.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b6.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b6.setHorizontalTextPosition(SwingConstants.CENTER);
		b6.setFocusPainted(false);
		b6.setBorder(null);
		b6.setBackground(Color.WHITE);
		b6.setForeground(new Color(0, 51, 51));
		b6.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"6");
			}
		});
		b6.setBounds(166, 277, 50, 50);
		contentPane.add(b6);
		
		JButton b7 = new JButton("7");
		b7.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b7.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b7.setHorizontalTextPosition(SwingConstants.CENTER);
		b7.setFocusPainted(false);
		b7.setBorder(null);
		b7.setBackground(Color.WHITE);
		b7.setForeground(new Color(0, 51, 51));
		b7.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"7");
			}
		});
		b7.setBounds(16, 197, 50, 50);
		contentPane.add(b7);
		
		JButton b8 = new JButton("8");
		b8.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b8.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b8.setHorizontalTextPosition(SwingConstants.CENTER);
		b8.setFocusPainted(false);
		b8.setBorder(null);
		b8.setBackground(Color.WHITE);
		b8.setForeground(new Color(0, 51, 51));
		b8.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"8");
			}
		});
		b8.setBounds(96, 197, 50, 50);
		contentPane.add(b8);
		
		JButton b9 = new JButton("9");
		b9.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b9.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b9.setHorizontalTextPosition(SwingConstants.CENTER);
		b9.setFocusPainted(false);
		b9.setBorder(null);
		b9.setBackground(Color.WHITE);
		b9.setForeground(new Color(0, 51, 51));
		b9.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"9");
			}
		});
		b9.setBounds(166, 197, 50, 50);
		contentPane.add(b9);
		
		JButton b0 = new JButton("0");
		b0.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		b0.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		b0.setHorizontalTextPosition(SwingConstants.CENTER);
		b0.setFocusPainted(false);
		b0.setBorder(null);
		b0.setBackground(Color.WHITE);
		b0.setForeground(new Color(0, 51, 51));
		b0.setFont(new Font("Times New Roman", Font.PLAIN, 22));
		b0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"0");
			}
		});
		b0.setBounds(16, 437, 50, 50);
		contentPane.add(b0);
		
		JButton btnNewButton_10 = new JButton(".");
		btnNewButton_10.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		btnNewButton_10.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton3.png"));
		btnNewButton_10.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_10.setFocusPainted(false);
		btnNewButton_10.setBorder(null);
		btnNewButton_10.setBackground(Color.WHITE);
		btnNewButton_10.setForeground(new Color(0, 51, 51));
		btnNewButton_10.setFont(new Font("Tahoma", Font.PLAIN, 20));
		btnNewButton_10.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena;
				cadena=resultadoCu.getText();
				
				if (cadena.length()<=0) {
					resultadoCu.setText("0.");
				}
				else {
					if(!existepunto(resultadoCu.getText())) {
						resultadoCu.setText(resultadoCu.getText()+".");
					}
				}
			}
		});
		btnNewButton_10.setBounds(96, 436, 50, 50);
		contentPane.add(btnNewButton_10);
		
		JButton division = new JButton("/");
		division.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		division.setBorder(null);
		division.setFocusPainted(false);
		division.setHorizontalTextPosition(SwingConstants.CENTER);
		division.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton1.png"));
		division.setForeground(new Color(0, 51, 51));
		division.setFont(new Font("Rockwell", Font.PLAIN, 22));
		division.setBackground(new Color(255, 228, 225));
		division.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"/");
				igual.doClick();
			}
		});
		division.setBounds(166, 115, 50, 50);
		contentPane.add(division);
		
		JButton multiplicacion = new JButton("*");
		multiplicacion.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		multiplicacion.setForeground(new Color(0, 51, 51));
		multiplicacion.setBorder(null);
		multiplicacion.setFocusPainted(false);
		multiplicacion.setHorizontalTextPosition(SwingConstants.CENTER);
		multiplicacion.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton1.png"));
		multiplicacion.setFont(new Font("Rockwell", Font.PLAIN, 22));
		multiplicacion.setBackground(new Color(255, 228, 225));
		multiplicacion.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"*");
			}
		});
		multiplicacion.setBounds(236, 117, 50, 50);
		contentPane.add(multiplicacion);
		
		JButton resta = new JButton("-");
		resta.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		resta.setForeground(new Color(0, 51, 51));
		resta.setBorder(null);
		resta.setFocusPainted(false);
		resta.setHorizontalTextPosition(SwingConstants.CENTER);
		resta.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton1.png"));
		resta.setFont(new Font("Rockwell", Font.PLAIN, 22));
		resta.setBackground(new Color(255, 228, 225));
		resta.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"-");
			}
		});
		resta.setBounds(236, 196, 50, 50);
		contentPane.add(resta);
		
		JButton suma = new JButton("+");
		suma.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton1.png"));
		suma.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		suma.setBorder(null);
		suma.setHorizontalTextPosition(SwingConstants.CENTER);
		suma.setFont(new Font("Rockwell", Font.PLAIN, 22));
		suma.setForeground(new Color(0, 51, 51));
		suma.setBackground(Color.WHITE);
		suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText(resultadoCu.getText()+"+");
			}
		});
		suma.setBounds(236, 276, 50, 50);
		contentPane.add(suma);
		
		igual = new JButton("=");
		igual.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		igual.setBorder(null);
		igual.setForeground(Color.WHITE);
		igual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String cadena=resultadoCu.getText();
				int largo = cadena.length();
				for(int i=0;i<largo;i++) {
					char caracter=cadena.charAt(i);
					if(caracter=='+'){
						String parte1 = cadena.substring(0,i);
						String parte2 = cadena.substring(i+1,largo);
						double resultado=Double.parseDouble(parte1)+Double.parseDouble(parte2);
						resultadoCu.setText(Double.toString(resultado));
					}
					if(caracter=='-'){
						String parte1 = cadena.substring(0,i);
						String parte2 = cadena.substring(i+1,largo);
						double resultado=Double.parseDouble(parte1)-Double.parseDouble(parte2);
						resultadoCu.setText(Double.toString(resultado));
					}
					if(caracter=='*'){
						String parte1 = cadena.substring(0,i);
						String parte2 = cadena.substring(i+1,largo);
						double resultado=Double.parseDouble(parte1)*Double.parseDouble(parte2);
						resultadoCu.setText(Double.toString(resultado));
					}
					if(caracter=='/'){
						String parte1 = cadena.substring(0,i);
						String parte2 = cadena.substring(i+1,largo);
						double resultado=Double.parseDouble(parte1)/Double.parseDouble(parte2);
						double eval = Double.parseDouble(parte2);
						if(eval==0) {
							resultadoCu.setText("Indefinido");
						}
						else {
							resultadoCu.setText(Double.toString(resultado));
						}
					}
				}
			}
		});
		igual.setBackground(new Color(0, 153, 153));
		igual.setFont(new Font("Rockwell", Font.PLAIN, 25));
		igual.setBounds(236, 336, 50, 151);
		contentPane.add(igual);
		
		resultadoCu = new JTextField();
		resultadoCu.setBorder(null);
		resultadoCu.setForeground(new Color(0, 51, 51));
		resultadoCu.setFont(new Font("Rockwell", Font.PLAIN, 23));
		resultadoCu.setHorizontalAlignment(SwingConstants.RIGHT);
		resultadoCu.setBounds(16, 27, 260, 78);
		contentPane.add(resultadoCu);
		resultadoCu.setColumns(10);
		
		JButton bc = new JButton("C");
		bc.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		bc.setForeground(new Color(0, 51, 51));
		bc.setBorder(null);
		bc.setFocusPainted(false);
		bc.setHorizontalTextPosition(SwingConstants.CENTER);
		bc.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton1.png"));
		bc.setBackground(new Color(255, 228, 225));
		bc.setFont(new Font("Rockwell", Font.PLAIN, 22));
		bc.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				resultadoCu.setText("");
			}
		});
		bc.setBounds(16, 117, 50, 50);
		contentPane.add(bc);
		
		JButton btnCe = new JButton("CE");
		btnCe.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String texto = resultadoCu.getText().substring(0,resultadoCu.getText().length()-1);
				resultadoCu.setText(texto);
			}
		});
		btnCe.setIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton1.png"));
		btnCe.setRolloverIcon(new ImageIcon("C:\\Users\\Yoselin\\eclipse-workspace\\prcalculadora\\src\\imagenes\\boton2.png"));
		btnCe.setHorizontalTextPosition(SwingConstants.CENTER);
		btnCe.setForeground(new Color(0, 51, 51));
		btnCe.setFont(new Font("Rockwell", Font.PLAIN, 22));
		btnCe.setFocusPainted(false);
		btnCe.setBorder(null);
		btnCe.setBackground(new Color(255, 228, 225));
		btnCe.setBounds(96, 115, 50, 50);
		contentPane.add(btnCe);
	}
	public JButton getIgual() {
		return igual;
	}
}