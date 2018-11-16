import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.SoftBevelBorder;
import javax.swing.border.BevelBorder;
import javax.swing.border.LineBorder;
import java.awt.Color;
import java.awt.Component;

import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.security.cert.PKIXRevocationChecker.Option;
import java.awt.event.ActionEvent;
import javax.swing.JTextField;
import java.awt.SystemColor;

public class TicTacToe {

	// Launch the application.
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TicTacToe window = new TicTacToe();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public TicTacToe() {
		initialize();
	}

	private void gameScore() {
		scoreX.setText(String.valueOf(Xscore));
		score0.setText(String.valueOf(Oscore));
	}

	private void playerTurn() {
		if (game.equalsIgnoreCase("X"))
			game = "O";
		else
			game = "X";
	}

	private void lockComponents() {
		btn1.setEnabled(false);
		btn2.setEnabled(false);
		btn3.setEnabled(false);

		btn4.setEnabled(false);
		btn5.setEnabled(false);
		btn6.setEnabled(false);

		btn7.setEnabled(false);
		btn8.setEnabled(false);
		btn9.setEnabled(false);

	}

	private void unlockComponents() {
		btn1.setEnabled(true);
		btn2.setEnabled(true);
		btn3.setEnabled(true);

		btn4.setEnabled(true);
		btn5.setEnabled(true);
		btn6.setEnabled(true);

		btn7.setEnabled(true);
		btn8.setEnabled(true);
		btn9.setEnabled(true);

	}

	private boolean checkPosition(JButton button) {

		if (!button.getText().equals(""))
			return false;

		else
			return true;
	}

	private void getWinner() {

		String b1 = btn1.getText();
		String b2 = btn2.getText();
		String b3 = btn3.getText();

		String b4 = btn4.getText();
		String b5 = btn5.getText();
		String b6 = btn6.getText();

		String b7 = btn7.getText();
		String b8 = btn8.getText();
		String b9 = btn9.getText();

		if (b1 == "X" && b2 == "X" && b3 == "X") {
			message.setText("");
			message.setText("X won the game!");
			Xscore++;
			gameScore();
			btn1.setBackground(Color.YELLOW);
			btn2.setBackground(Color.YELLOW);
			btn3.setBackground(Color.YELLOW);
			lockComponents();
		}

		else if (b4 == "X" && b5 == "X" && b6 == "X") {
			message.setText("");
			message.setText("X won the game!");
			Xscore++;
			gameScore();
			btn4.setBackground(Color.YELLOW);
			btn5.setBackground(Color.YELLOW);
			btn6.setBackground(Color.YELLOW);
			lockComponents();

		}

		else if (b7 == "X" && b8 == "X" && b9 == "X") {
			message.setText("");
			message.setText("X won the game!");
			Xscore++;
			gameScore();
			btn7.setBackground(Color.yellow);
			btn8.setBackground(Color.yellow);
			btn9.setBackground(Color.yellow);
			lockComponents();

		}

		else if (b1 == "X" && b4 == "X" && b7 == "X") {
			message.setText("");
			message.setText("X won the game!");
			Xscore++;
			gameScore();
			btn1.setBackground(Color.YELLOW);
			btn4.setBackground(Color.YELLOW);
			btn7.setBackground(Color.YELLOW);
			lockComponents();

		} else if (b2 == "X" && b5 == "X" && b8 == "X") {
			message.setText("");
			message.setText("X won the game!");
			Xscore++;
			gameScore();
			btn2.setBackground(Color.YELLOW);
			btn5.setBackground(Color.YELLOW);
			btn8.setBackground(Color.YELLOW);
			lockComponents();

		} else if (b3 == "X" && b6 == "X" && b9 == "X") {
			message.setText("");
			message.setText("X won the game!");
			Xscore++;
			gameScore();
			btn3.setBackground(Color.YELLOW);
			btn6.setBackground(Color.YELLOW);
			btn9.setBackground(Color.YELLOW);
			lockComponents();

		} else if (b1 == "X" && b5 == "X" && b9 == "X") {
			message.setText("");
			message.setText("X won the game!");
			Xscore++;
			gameScore();
			btn1.setBackground(Color.YELLOW);
			btn5.setBackground(Color.YELLOW);
			btn9.setBackground(Color.YELLOW);
			lockComponents();

		}

		else if (b3 == "X" && b5 == "X" && b7 == "X") {
			message.setText("");
			message.setText("X won the game!");
			Xscore++;
			gameScore();
			btn3.setBackground(Color.YELLOW);
			btn5.setBackground(Color.YELLOW);
			btn7.setBackground(Color.YELLOW);
			lockComponents();

		}

		else if (b1 == "O" && b2 == "O" && b3 == "O") {
			message.setText("");
			message.setText("O won the game!");
			Oscore++;
			gameScore();
			btn1.setBackground(new Color(240, 248, 251));
			btn2.setBackground(new Color(240, 248, 251));
			btn3.setBackground(new Color(240, 248, 251));
			lockComponents();

		}

		else if (b4 == "O" && b5 == "O" && b6 == "O") {
			message.setText("");
			message.setText("O won the game!");
			Oscore++;
			gameScore();
			btn4.setBackground(new Color(240, 248, 251));
			btn5.setBackground(new Color(240, 248, 251));
			btn6.setBackground(new Color(240, 248, 251));
			lockComponents();

		}

		else if (b7 == "O" && b8 == "O" && b9 == "O") {
			message.setText("");
			message.setText("O won the game!");
			Oscore++;
			gameScore();
			btn7.setBackground(new Color(240, 248, 251));
			btn8.setBackground(new Color(240, 248, 251));
			btn9.setBackground(new Color(240, 248, 251));
			lockComponents();

		}

		else if (b1 == "O" && b4 == "O" && b7 == "O") {
			message.setText("");
			message.setText("O won the game!");
			Oscore++;
			gameScore();
			btn1.setBackground(new Color(240, 248, 251));
			btn4.setBackground(new Color(240, 248, 251));
			btn7.setBackground(new Color(240, 248, 251));
			lockComponents();

		}

		else if (b2 == "O" && b5 == "O" && b8 == "O") {
			message.setText("");
			message.setText("O won the game!");
			Oscore++;
			gameScore();
			btn2.setBackground(new Color(240, 248, 251));
			btn5.setBackground(new Color(240, 248, 251));
			btn8.setBackground(new Color(240, 248, 251));
			lockComponents();

		}

		else if (b3 == "O" && b6 == "O" && b9 == "O") {
			message.setText("");
			message.setText("O won the game!");
			Oscore++;
			gameScore();
			btn3.setBackground(new Color(240, 248, 251));
			btn6.setBackground(new Color(240, 248, 251));
			btn9.setBackground(new Color(240, 248, 251));
			lockComponents();

		}

		else if (b1 == "O" && b5 == "O" && b9 == "O") {
			message.setText("");
			message.setText("O won the game!");
			Oscore++;
			gameScore();
			btn1.setBackground(new Color(240, 248, 251));
			btn5.setBackground(new Color(240, 248, 251));
			btn9.setBackground(new Color(240, 248, 251));
			lockComponents();

		}

		else if (b3 == "O" && b5 == "O" && b7 == "O") {
			message.setText("");
			message.setText("O won the game!");
			Oscore++;
			gameScore();
			btn3.setBackground(new Color(240, 248, 251));
			btn5.setBackground(new Color(240, 248, 251));
			btn7.setBackground(new Color(240, 248, 251));
			lockComponents();

		}

		else if (b1 != "" && b2 != "" && b3 != "" && b4 != "" && b5 != "" && b6 != "" && b7 != "" && b8 != ""
				&& b9 != "") {
			message.setText("");
			message.setText("It's a tie!");
		}

	}

	private JFrame frame;

	private JButton btn1;
	private JButton btn2;
	private JButton btn3;
	private JButton btn4;
	private JButton btn5;
	private JButton btn6;
	private JButton btn7;
	private JButton btn8;
	private JButton btn9;
	private JButton refresh;

	private JTextField scoreX;
	private JTextField score0;
	private JTextField txtPlayerX;
	private JTextField txtPlayer0;

	private JPanel contentPanel;
	private JPanel messagePanel;
	private JPanel panel;

					private JLabel message;
	private JLabel titleLabel;

	private String game = "X";
	private int Xscore = 0;
	private int Oscore = 0;

	private void initialize() {
		frame = new JFrame();
		frame.setResizable(false);
		frame.getContentPane().setBackground(Color.PINK);
		frame.setTitle("Tic Tac Toe");
		frame.setBackground(new Color(240, 128, 128));
		frame.setBounds(100, 100, 392, 610);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);

		contentPanel = new JPanel();
		contentPanel.setBackground(new Color(255, 255, 255));
		contentPanel.setForeground(Color.WHITE);
		contentPanel.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		contentPanel.setBounds(10, 11, 364, 559);
		frame.getContentPane().add(contentPanel);
		contentPanel.setLayout(null);

		titleLabel = new JLabel("TIC TAC TOE");
		titleLabel.setFont(new Font("Segoe Print", Font.BOLD, 42));
		titleLabel.setHorizontalAlignment(SwingConstants.CENTER);
		titleLabel.setBounds(31, 11, 300, 48);
		contentPanel.add(titleLabel);

		btn1 = new JButton("");
		btn1.setFont(new Font("Segoe UI Semibold", Font.BOLD, 60));
		btn1.setBackground(new Color(255, 255, 255));
		btn1.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		btn1.setForeground(new Color(0, 0, 0));
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (checkPosition(btn1) == true) {
					btn1.setText(game);
					if (game.equalsIgnoreCase("X"))
						btn1.setForeground(new Color(220, 20, 60));
					else
						btn1.setForeground(new Color(34, 139, 34));

					playerTurn();
					getWinner();
				}
			}
		});
		btn1.setBounds(49, 129, 80, 80);
		contentPanel.add(btn1);

		btn2 = new JButton("");
		btn2.setFont(new Font("Segoe UI Semibold", Font.BOLD, 60));
		btn2.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		btn2.setBackground(new Color(255, 255, 255));
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (checkPosition(btn2) == true) {
					btn2.setText(game);
					if (game.equalsIgnoreCase("X"))
						btn2.setForeground(new Color(220, 20, 60));
					else
						btn2.setForeground(new Color(34, 139, 34));

					playerTurn();
					getWinner();

				}
			}
		});
		btn2.setBounds(139, 129, 80, 80);
		contentPanel.add(btn2);

		btn3 = new JButton("");
		btn3.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		btn3.setFont(new Font("Segoe UI Semibold", Font.BOLD, 60));
		btn3.setBackground(new Color(255, 255, 255));
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkPosition(btn3) == true) {

					btn3.setText(game);
					if (game.equalsIgnoreCase("X"))
						btn3.setForeground(new Color(220, 20, 60));
					else
						btn3.setForeground(new Color(34, 139, 34));

					playerTurn();
					getWinner();

				}
			}
		});
		btn3.setBounds(229, 129, 80, 80);
		contentPanel.add(btn3);

		btn4 = new JButton("");
		btn4.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		btn4.setFont(new Font("Segoe UI Semibold", Font.BOLD, 60));
		btn4.setBackground(new Color(255, 255, 255));
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				if (checkPosition(btn4) == true) {

					btn4.setText(game);
					if (game.equalsIgnoreCase("X"))
						btn4.setForeground(new Color(220, 20, 60));
					else
						btn4.setForeground(new Color(34, 139, 34));

					playerTurn();
					getWinner();
				}
			}
		});
		btn4.setBounds(49, 216, 80, 80);
		contentPanel.add(btn4);

		btn5 = new JButton("");
		btn5.setFont(new Font("Segoe UI Semibold", Font.BOLD, 60));
		btn5.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		btn5.setBackground(new Color(255, 255, 255));
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (checkPosition(btn5) == true) {

					btn5.setText(game);
					if (game.equalsIgnoreCase("X"))
						btn5.setForeground(new Color(220, 20, 60));
					else
						btn5.setForeground(new Color(34, 139, 34));

					playerTurn();
					getWinner();
				}
			}
		});
		btn5.setBounds(139, 216, 80, 80);
		contentPanel.add(btn5);

		btn6 = new JButton("");
		btn6.setFont(new Font("Segoe UI Semibold", Font.BOLD, 60));
		btn6.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		btn6.setBackground(new Color(255, 255, 255));
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (checkPosition(btn6) == true) {

					btn6.setText(game);
					if (game.equalsIgnoreCase("X"))
						btn6.setForeground(new Color(220, 20, 60));
					else
						btn6.setForeground(new Color(34, 139, 34));

					playerTurn();
					getWinner();
				}
			}
		});
		btn6.setBounds(229, 216, 80, 80);
		contentPanel.add(btn6);

		btn7 = new JButton("");
		btn7.setFont(new Font("Segoe UI Semibold", Font.BOLD, 60));
		btn7.setBackground(new Color(255, 255, 255));
		btn7.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (checkPosition(btn7) == true) {

					btn7.setText(game);
					if (game.equalsIgnoreCase("X"))
						btn7.setForeground(new Color(220, 20, 60));
					else
						btn7.setForeground(new Color(34, 139, 34));

					playerTurn();
					getWinner();
				}
			}
		});
		btn7.setBounds(49, 304, 80, 80);
		contentPanel.add(btn7);

		btn8 = new JButton("");

		btn8.setFont(new Font("Segoe UI Semibold", Font.BOLD, 60));
		btn8.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		btn8.setBackground(new Color(255, 255, 255));
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (checkPosition(btn8) == true) {
					btn8.setText(game);
					if (game.equalsIgnoreCase("X"))
						btn8.setForeground(new Color(220, 20, 60));
					else
						btn8.setForeground(new Color(34, 139, 34));

					playerTurn();
					getWinner();
				}
			}
		});
		btn8.setBounds(139, 304, 80, 80);
		contentPanel.add(btn8);

		btn9 = new JButton("");
		btn9.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		btn9.setFont(new Font("Segoe UI Semibold", Font.BOLD, 60));
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {

				if (checkPosition(btn9) == true) {

					btn9.setText(game);
					if (game.equalsIgnoreCase("X"))
						btn9.setForeground(new Color(220, 20, 60));
					else
						btn9.setForeground(new Color(34, 139, 34));

					playerTurn();
					getWinner();
				}
			}
		});
		btn9.setBackground(new Color(255, 255, 255));
		btn9.setBounds(229, 304, 80, 80);
		contentPanel.add(btn9);

		refresh = new JButton("REFRESH");
		refresh.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");

				btn4.setText("");
				btn5.setText("");
				btn6.setText("");

				btn7.setText("");
				btn8.setText("");
				btn9.setText("");

				message.setText("");

				btn1.setBackground(Color.WHITE);
				btn2.setBackground(Color.WHITE);
				btn3.setBackground(Color.WHITE);

				btn4.setBackground(Color.WHITE);
				btn5.setBackground(Color.WHITE);
				btn6.setBackground(Color.WHITE);

				btn7.setBackground(Color.WHITE);
				btn8.setBackground(Color.WHITE);
				btn9.setBackground(Color.WHITE);

				unlockComponents();
			}
		});
		refresh.setBackground(new Color(0, 153, 204));
		refresh.setForeground(new Color(255, 255, 255));
		refresh.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		refresh.setBounds(49, 495, 122, 32);
		contentPanel.add(refresh);

		panel = new JPanel();
		panel.setBackground(new Color(255, 245, 238));
		panel.setBorder(new LineBorder(new Color(220, 20, 60), 3, true));
		panel.setBounds(31, 121, 300, 276);
		contentPanel.add(panel);

		scoreX = new JTextField();
		scoreX.setForeground(Color.BLACK);
		scoreX.setBackground(Color.WHITE);
		scoreX.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		scoreX.setHorizontalAlignment(SwingConstants.CENTER);
		scoreX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		scoreX.setEditable(false);
		scoreX.setBounds(187, 408, 122, 31);
		contentPanel.add(scoreX);
		scoreX.setColumns(10);

		score0 = new JTextField();
		score0.setForeground(Color.BLACK);
		score0.setBackground(Color.WHITE);
		score0.setHorizontalAlignment(SwingConstants.CENTER);
		score0.setBorder(new LineBorder(new Color(34, 139, 34), 3));
		score0.setFont(new Font("Segoe UI Semibold", Font.BOLD, 22));
		score0.setEditable(false);
		score0.setColumns(10);
		score0.setBounds(187, 453, 122, 31);
		contentPanel.add(score0);

		txtPlayerX = new JTextField();
		txtPlayerX.setEditable(false);
		txtPlayerX.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlayerX.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		txtPlayerX.setForeground(new Color(255, 255, 255));
		txtPlayerX.setBackground(new Color(220, 20, 60));
		txtPlayerX.setText("PLAYER X:");
		txtPlayerX.setColumns(10);
		txtPlayerX.setBounds(49, 408, 122, 31);
		contentPanel.add(txtPlayerX);

		txtPlayer0 = new JTextField();
		txtPlayer0.setEditable(false);
		txtPlayer0.setText("PLAYER 0:");
		txtPlayer0.setHorizontalAlignment(SwingConstants.CENTER);
		txtPlayer0.setForeground(Color.WHITE);
		txtPlayer0.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		txtPlayer0.setColumns(10);
		txtPlayer0.setBackground(new Color(34, 139, 34));
		txtPlayer0.setBounds(49, 453, 122, 31);
		contentPanel.add(txtPlayer0);

		messagePanel = new JPanel();
		messagePanel.setForeground(new Color(255, 245, 238));
		messagePanel.setBorder(new LineBorder(new Color(220, 20, 60), 3));
		messagePanel.setBackground(new Color(255, 245, 238));
		messagePanel.setBounds(31, 70, 300, 40);
		contentPanel.add(messagePanel);
		messagePanel.setLayout(null);

		message = new JLabel("LETS START !");
		message.setBounds(0, 0, 300, 40);
		messagePanel.add(message);
		message.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		message.setHorizontalAlignment(SwingConstants.CENTER);
		message.setBackground(new Color(0, 0, 0));
		message.setForeground(new Color(0, 0, 0));
		
		JButton btnU = new JButton("RESTART");
		btnU.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				btn1.setText("");
				btn2.setText("");
				btn3.setText("");

				btn4.setText("");
				btn5.setText("");
				btn6.setText("");

				btn7.setText("");
				btn8.setText("");
				btn9.setText("");

				message.setText("");

				btn1.setBackground(Color.WHITE);
				btn2.setBackground(Color.WHITE);
				btn3.setBackground(Color.WHITE);

				btn4.setBackground(Color.WHITE);
				btn5.setBackground(Color.WHITE);
				btn6.setBackground(Color.WHITE);

				btn7.setBackground(Color.WHITE);
				btn8.setBackground(Color.WHITE);
				btn9.setBackground(Color.WHITE);

				unlockComponents();
				
				scoreX.setText("");
				score0.setText("");
				Xscore = 0;
				Oscore = 0;

			}
		});
		btnU.setForeground(Color.WHITE);
		btnU.setFont(new Font("Segoe UI Semibold", Font.BOLD, 20));
		btnU.setBackground(new Color(112, 128, 144));
		btnU.setBounds(187, 495, 122, 32);
		contentPanel.add(btnU);
		
		JLabel lblCreatedByVinit = new JLabel("CREATED BY VINIT SHAH");
		lblCreatedByVinit.setHorizontalAlignment(SwingConstants.CENTER);
		lblCreatedByVinit.setFont(new Font("Segoe Print", Font.BOLD, 14));
		lblCreatedByVinit.setBounds(31, 525, 300, 32);
		contentPanel.add(lblCreatedByVinit);
	}
}
