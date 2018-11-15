import java.awt.EventQueue;

import javax.swing.JFrame;
import java.awt.FlowLayout;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.ImageIcon;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.border.Border;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Color;
import javax.swing.JPanel;
import javax.swing.border.LineBorder;

public class CurrencyConverter {

	private JFrame frame;

	private JLabel lblDollar;
	private JLabel lblEuro;
	private JLabel lblRupee;
	private JLabel lblCanada;
	private JLabel cdollarLogo;
	private JLabel lblDirhams;
	private JLabel dirhamLogo;
	private JLabel label;
	private JLabel yuanLogo;

	private JTextField dollarValue;
	private JTextField euroValue;
	private JTextField rupeeValue;
	private JTextField cdollarValue;
	private JTextField yuanValue;
	private JTextField dirhamValue;

	private JButton btnConvert;

	private double dollars;
	private double euros;
	private double rupees;
	private double yuans;
	private double canadianDollars;
	private double dirhams;

	private final double US_TO_EUROS = .85;
	private final double US_TO_RUPEES = 68.72;
	private final double US_TO_YUANS = 6.61;
	private final double US_TO_CANADIAN_DOLLARS = 1.31;
	private final double US_TO_DIRHAMS = 3.67;
	private JPanel panel;
	private JPanel panel_1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CurrencyConverter window = new CurrencyConverter();
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
	public CurrencyConverter() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.getContentPane().setBackground(new Color(255, 255, 255));
		frame.setTitle("Currency Converter");
		frame.setBounds(100, 100, 330, 455);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		/**
		 * -------------------------------------------------------------------------------------
		 */

		panel_1 = new JPanel();
		panel_1.setBackground(Color.WHITE);
		panel_1.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		panel_1.setBounds(10, 11, 294, 394);
		frame.getContentPane().add(panel_1);
		panel_1.setLayout(null);

		// RESET
		JButton btnReset = new JButton("RESET");
		btnReset.setBounds(180, 353, 95, 30);
		panel_1.add(btnReset);
		btnReset.setForeground(new Color(255, 255, 255));
		btnReset.setBackground(new Color(30, 144, 255));
		btnReset.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				dollarValue.setText("");
				euroValue.setText("");
				rupeeValue.setText("");
				dirhamValue.setText("");
				cdollarValue.setText("");
				yuanValue.setText("");

			}
		});
		btnReset.setFont(new Font("Segoe UI", Font.BOLD, 18));

		// EUROS
		euroValue = new JTextField();
		euroValue.setBounds(140, 170, 90, 25);
		panel_1.add(euroValue);
		euroValue.setHorizontalAlignment(SwingConstants.CENTER);
		euroValue.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		euroValue.setEditable(false);
		euroValue.setColumns(10);

		lblDollar = new JLabel("DOLLARS");
		lblDollar.setBounds(27, 87, 114, 25);
		panel_1.add(lblDollar);
		lblDollar.setForeground(new Color(32, 178, 170));
		lblDollar.setHorizontalAlignment(SwingConstants.CENTER);
		lblDollar.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));

		// DOLLAR AMOUNT FROM USER
		dollarValue = new JTextField();
		dollarValue.setBounds(140, 89, 90, 25);
		panel_1.add(dollarValue);
		dollarValue.setHorizontalAlignment(SwingConstants.CENTER);
		dollarValue.setFont(new Font("Tahoma", Font.PLAIN, 15));
		dollarValue.setColumns(10);

		JLabel dollarLogo = new JLabel("$");
		dollarLogo.setBounds(232, 87, 30, 25);
		panel_1.add(dollarLogo);
		dollarLogo.setForeground(new Color(0, 128, 128));
		dollarLogo.setHorizontalAlignment(SwingConstants.CENTER);
		dollarLogo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));

		// CONVERT
		btnConvert = new JButton("CONVERT");
		btnConvert.setBounds(82, 127, 122, 30);
		panel_1.add(btnConvert);
		btnConvert.setBackground(new Color(154, 205, 50));
		btnConvert.setForeground(new Color(255, 255, 255));
		btnConvert.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

				dollars = Double.parseDouble(dollarValue.getText());

				euros = dollars * US_TO_EUROS;
				String Euro = String.format("%.2f", euros);
				euroValue.setText(Euro);

				rupees = dollars * US_TO_RUPEES;
				String Rupee = String.format("%.2f", rupees);
				rupeeValue.setText(Rupee);

				canadianDollars = dollars * US_TO_CANADIAN_DOLLARS;
				String CDollar = String.format("%.2f", canadianDollars);
				cdollarValue.setText(CDollar);

				dirhams = dollars * US_TO_DIRHAMS;
				String Dirhams = String.format("%.2f", dirhams);
				dirhamValue.setText(Dirhams);

				yuans = dollars * US_TO_YUANS;
				String Yuans = String.format("%.2f", yuans);
				yuanValue.setText(Yuans);

			}
		});
		btnConvert.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));

		lblEuro = new JLabel("EUROS");
		lblEuro.setBounds(27, 169, 114, 25);
		panel_1.add(lblEuro);
		lblEuro.setForeground(new Color(100, 149, 237));
		lblEuro.setHorizontalAlignment(SwingConstants.CENTER);
		lblEuro.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));

		JLabel euroLogo = new JLabel("\u20AC");
		euroLogo.setBounds(232, 168, 30, 25);
		panel_1.add(euroLogo);
		euroLogo.setForeground(new Color(30, 144, 255));
		euroLogo.setHorizontalAlignment(SwingConstants.CENTER);
		euroLogo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));

		lblRupee = new JLabel("RUPEES");
		lblRupee.setBounds(27, 207, 114, 25);
		panel_1.add(lblRupee);
		lblRupee.setForeground(new Color(60, 179, 113));
		lblRupee.setHorizontalAlignment(SwingConstants.CENTER);
		lblRupee.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));

		// RUPEES
		rupeeValue = new JTextField();
		rupeeValue.setBounds(140, 208, 90, 25);
		panel_1.add(rupeeValue);
		rupeeValue.setHorizontalAlignment(SwingConstants.CENTER);
		rupeeValue.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		rupeeValue.setEditable(false);
		rupeeValue.setColumns(10);

		JLabel rupeeLogo = new JLabel("\u20B9");
		rupeeLogo.setBounds(232, 206, 30, 25);
		panel_1.add(rupeeLogo);
		rupeeLogo.setForeground(new Color(60, 179, 113));
		rupeeLogo.setHorizontalAlignment(SwingConstants.CENTER);
		rupeeLogo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));

		// DIRHAM
		dirhamValue = new JTextField();
		dirhamValue.setBounds(140, 244, 90, 25);
		panel_1.add(dirhamValue);
		dirhamValue.setHorizontalAlignment(SwingConstants.CENTER);
		dirhamValue.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		dirhamValue.setEditable(false);
		dirhamValue.setColumns(10);

		lblDirhams = new JLabel("DIRHAMS");
		lblDirhams.setBounds(27, 243, 114, 25);
		panel_1.add(lblDirhams);
		lblDirhams.setForeground(new Color(250, 128, 114));
		lblDirhams.setHorizontalAlignment(SwingConstants.CENTER);
		lblDirhams.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));

		dirhamLogo = new JLabel("\u062F.\u0625");
		dirhamLogo.setBounds(232, 244, 30, 25);
		panel_1.add(dirhamLogo);
		dirhamLogo.setForeground(new Color(250, 128, 114));
		dirhamLogo.setHorizontalAlignment(SwingConstants.CENTER);
		dirhamLogo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));

		// CANADIAN DOLLAR
		cdollarValue = new JTextField();
		cdollarValue.setBounds(140, 282, 90, 25);
		panel_1.add(cdollarValue);
		cdollarValue.setHorizontalAlignment(SwingConstants.CENTER);
		cdollarValue.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		cdollarValue.setEditable(false);
		cdollarValue.setColumns(10);

		lblCanada = new JLabel("CANADA");
		lblCanada.setBounds(27, 281, 114, 25);
		panel_1.add(lblCanada);
		lblCanada.setForeground(new Color(123, 104, 238));
		lblCanada.setHorizontalAlignment(SwingConstants.CENTER);
		lblCanada.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));

		cdollarLogo = new JLabel("$");
		cdollarLogo.setBounds(232, 280, 30, 25);
		panel_1.add(cdollarLogo);
		cdollarLogo.setForeground(new Color(147, 112, 219));
		cdollarLogo.setHorizontalAlignment(SwingConstants.CENTER);
		cdollarLogo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));

		// YUAN
		yuanValue = new JTextField();
		yuanValue.setBounds(140, 316, 90, 25);
		panel_1.add(yuanValue);
		yuanValue.setHorizontalAlignment(SwingConstants.CENTER);
		yuanValue.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 15));
		yuanValue.setEditable(false);
		yuanValue.setColumns(10);

		label = new JLabel("YUANS");
		label.setBounds(27, 315, 114, 25);
		panel_1.add(label);
		label.setForeground(new Color(186, 85, 211));
		label.setHorizontalAlignment(SwingConstants.CENTER);
		label.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));

		yuanLogo = new JLabel("\u00A5");
		yuanLogo.setBounds(232, 316, 30, 25);
		panel_1.add(yuanLogo);
		yuanLogo.setForeground(new Color(218, 112, 214));
		yuanLogo.setHorizontalAlignment(SwingConstants.CENTER);
		yuanLogo.setFont(new Font("Segoe UI Semibold", Font.BOLD, 24));

		JLabel Label = new JLabel("CURRENCY CONVERTER");
		Label.setBounds(20, 23, 255, 41);
		panel_1.add(Label);
		Label.setBackground(new Color(220, 20, 60));
		Label.setForeground(new Color(0, 0, 0));
		Label.setHorizontalAlignment(SwingConstants.CENTER);
		Label.setFont(new Font("Segoe Print", Font.BOLD, 18));

		panel = new JPanel();
		panel.setForeground(new Color(255, 255, 255));
		panel.setBorder(new LineBorder(new Color(220, 20, 60), 4));
		panel.setBounds(20, 23, 255, 41);
		panel_1.add(panel);
		panel.setBackground(new Color(255, 255, 255));

	}
}
