package com.app.calculator;

import java.awt.EventQueue;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import java.awt.Color;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.Font;
import java.awt.SystemColor;

/**
 *
 * @author shahv
 */
public class CalculatorApplication {

    private JFrame frame;
    private JTextField txtCalculator;

    double firstNumber;
    double secondNumber;
    double result;
    String Operations;
    String answer;

    /**
     * Launch the application.
     *
     * @param args
     * @throws IllegalAccessException
     * @throws InstantiationException
     * @throws ClassNotFoundException
     */
    public static void main(String[] args) throws ClassNotFoundException,
            InstantiationException, IllegalAccessException {

        EventQueue.invokeLater(() -> {
            try {
                CalculatorApplication window = new CalculatorApplication();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public CalculatorApplication() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.setResizable(false);
        frame.setTitle("CALCULATOR");
        frame.getContentPane().setBackground(SystemColor.menu);
        frame.setAlwaysOnTop(true);
        frame.setBounds(100, 100, 280, 443);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);

        txtCalculator = new JTextField();
        txtCalculator.setBounds(10, 11, 252, 52);
        txtCalculator.setEditable(false);
        txtCalculator.setBackground(SystemColor.controlLtHighlight);
        txtCalculator.setFont(new Font("Segoe UI Symbol", Font.BOLD, 24));
        txtCalculator.setHorizontalAlignment(SwingConstants.RIGHT);
        frame.getContentPane().add(txtCalculator);
        txtCalculator.setColumns(10);

        JButton button7 = new JButton("7");
        button7.setBounds(10, 74, 55, 55);
        button7.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button7.setBackground(new Color(128, 128, 128));
        button7.setForeground(SystemColor.controlLtHighlight);
        button7.addActionListener((ActionEvent arg0) -> {
            String enteredNumber = txtCalculator.getText() + button7.getText();
            txtCalculator.setText(enteredNumber);
        });
        frame.getContentPane().add(button7);

        JButton button8 = new JButton("8");
        button8.setBounds(77, 74, 55, 55);
        button8.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button8.setForeground(new Color(255, 255, 255));
        button8.setBackground(new Color(128, 128, 128));
        button8.addActionListener((ActionEvent arg0) -> {
            String enteredNumber = txtCalculator.getText() + button8.getText();
            txtCalculator.setText(enteredNumber);
        });
        frame.getContentPane().add(button8);

        JButton button9 = new JButton("9");
        button9.setBounds(142, 74, 55, 55);
        button9.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button9.setForeground(new Color(255, 255, 255));
        button9.setBackground(new Color(128, 128, 128));
        button9.addActionListener((ActionEvent arg0) -> {
            String enteredNumber = txtCalculator.getText() + button9.getText();
            txtCalculator.setText(enteredNumber);
        });
        frame.getContentPane().add(button9);

        JButton button4 = new JButton("4");
        button4.setBounds(10, 140, 55, 55);
        button4.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button4.setForeground(new Color(255, 255, 255));
        button4.setBackground(new Color(128, 128, 128));
        button4.addActionListener((ActionEvent arg0) -> {
            String enteredNumber = txtCalculator.getText() + button4.getText();
            txtCalculator.setText(enteredNumber);
        });
        frame.getContentPane().add(button4);

        JButton button5 = new JButton("5");
        button5.setBounds(77, 140, 55, 55);
        button5.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button5.setForeground(new Color(255, 255, 255));
        button5.setBackground(new Color(128, 128, 128));
        button5.addActionListener((ActionEvent arg0) -> {
            String enteredNumber = txtCalculator.getText() + button5.getText();
            txtCalculator.setText(enteredNumber);
        });
        frame.getContentPane().add(button5);

        JButton button6 = new JButton("6");
        button6.setBounds(142, 140, 55, 55);
        button6.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button6.setForeground(new Color(255, 255, 255));
        button6.setBackground(new Color(128, 128, 128));
        button6.addActionListener((ActionEvent arg0) -> {
            String enteredNumber = txtCalculator.getText() + button6.getText();
            txtCalculator.setText(enteredNumber);
        });
        frame.getContentPane().add(button6);

        JButton button1 = new JButton("1");
        button1.setBounds(10, 206, 55, 55);
        button1.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button1.setBackground(new Color(128, 128, 128));
        button1.setForeground(new Color(255, 255, 255));
        button1.addActionListener((ActionEvent arg0) -> {
            String enteredNumber = txtCalculator.getText() + button1.getText();
            txtCalculator.setText(enteredNumber);
        });
        frame.getContentPane().add(button1);

        JButton button2 = new JButton("2");
        button2.setBounds(77, 206, 55, 55);
        button2.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button2.setBackground(new Color(128, 128, 128));
        button2.setForeground(new Color(255, 255, 255));
        button2.addActionListener((ActionEvent arg0) -> {
            String enteredNumber = txtCalculator.getText() + button2.getText();
            txtCalculator.setText(enteredNumber);
        });
        frame.getContentPane().add(button2);

        JButton button3 = new JButton("3");
        button3.setBounds(142, 206, 55, 55);
        button3.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button3.setBackground(new Color(128, 128, 128));
        button3.setForeground(new Color(255, 255, 255));
        button3.addActionListener((ActionEvent arg0) -> {
            String enteredNumber = txtCalculator.getText() + button3.getText();
            txtCalculator.setText(enteredNumber);
        });
        frame.getContentPane().add(button3);

        JButton buttonDot = new JButton(".");
        buttonDot.setBounds(142, 272, 55, 55);
        buttonDot.addActionListener((ActionEvent e) -> {
            String enteredNumber = txtCalculator.getText() + buttonDot.getText();
            txtCalculator.setText(enteredNumber);
        });
        buttonDot.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        buttonDot.setBackground(new Color(128, 128, 128));
        buttonDot.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(buttonDot);

        JButton buttonAdd = new JButton("+");
        buttonAdd.setBounds(207, 140, 55, 55);
        buttonAdd.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        buttonAdd.setForeground(new Color(255, 255, 255));
        buttonAdd.setBackground(new Color(255, 69, 0));
        buttonAdd.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(txtCalculator.getText());
            txtCalculator.setText("");
            Operations = "+";
        });

        frame.getContentPane().add(buttonAdd);

        JButton buttonSubtract = new JButton("\u2013");
        buttonSubtract.setBounds(207, 206, 55, 55);
        buttonSubtract.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        buttonSubtract.setForeground(new Color(255, 255, 255));
        buttonSubtract.setBackground(new Color(255, 69, 0));

        buttonSubtract.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(txtCalculator.getText());
            txtCalculator.setText("");
            Operations = "-";
        });
        frame.getContentPane().add(buttonSubtract);

        JButton buttonClear = new JButton("C");
        buttonClear.setBounds(10, 339, 55, 55);
        buttonClear.addActionListener((ActionEvent e) -> {
            txtCalculator.setText("");
        });
        buttonClear.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        buttonClear.setBackground(new Color(50, 205, 50));
        buttonClear.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(buttonClear);

        JButton button0 = new JButton("0");
        button0.setBounds(77, 272, 55, 55);
        button0.addActionListener((ActionEvent e) -> {
            String enteredNumber = txtCalculator.getText() + button0.getText();
            txtCalculator.setText(enteredNumber);
        });
        button0.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        button0.setBackground(new Color(128, 128, 128));
        button0.setForeground(new Color(255, 255, 255));
        frame.getContentPane().add(button0);

        JButton buttonMultiply = new JButton("*");
        buttonMultiply.setBounds(207, 273, 55, 55);
        buttonMultiply.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        buttonMultiply.setForeground(new Color(255, 255, 255));
        buttonMultiply.setBackground(new Color(255, 69, 0));
        buttonMultiply.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(txtCalculator.getText());
            txtCalculator.setText("");
            Operations = "*";
        });
        frame.getContentPane().add(buttonMultiply);

        JButton buttonDivide = new JButton("/");
        buttonDivide.setBounds(207, 339, 55, 55);
        buttonDivide.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        buttonDivide.setForeground(new Color(255, 255, 255));
        buttonDivide.setBackground(new Color(255, 69, 0));
        buttonDivide.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(txtCalculator.getText());
            txtCalculator.setText("");
            Operations = "/";
        });
        frame.getContentPane().add(buttonDivide);

        JButton buttonEquals = new JButton("=");
        buttonEquals.setBounds(142, 339, 55, 55);
        buttonEquals.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        buttonEquals.setBackground(new Color(255, 69, 0));
        buttonEquals.setForeground(new Color(255, 255, 255));
        buttonEquals.addActionListener((ActionEvent e) -> {
            secondNumber = Double.parseDouble(txtCalculator.getText());
            switch (Operations) {
                case "+":
                    result = firstNumber + secondNumber;
                    answer = String.format("%.2f", result);
                    txtCalculator.setText(answer);
                    break;
                case "-":
                    result = firstNumber - secondNumber;
                    answer = String.format("%.2f", result);
                    txtCalculator.setText(answer);
                    break;
                case "*":
                    result = firstNumber * secondNumber;
                    answer = String.format("%.2f", result);
                    txtCalculator.setText(answer);
                    break;
                case "/":
                    result = firstNumber / secondNumber;
                    answer = String.format("%.2f", result);
                    txtCalculator.setText(answer);
                    break;
            }
        });
        frame.getContentPane().add(buttonEquals);

        JButton buttonDelete = new JButton("\u2190");
        buttonDelete.setBounds(207, 74, 55, 55);
        buttonDelete.setForeground(Color.WHITE);
        buttonDelete.setFont(new Font("Segoe UI Black", Font.BOLD, 20));
        buttonDelete.setBackground(new Color(255, 69, 0));
        buttonDelete.addActionListener((ActionEvent e) -> {
            String delete = null;
            if (txtCalculator.getText().length() > 0) {
                StringBuilder str = new StringBuilder(txtCalculator.getText());
                str.deleteCharAt(txtCalculator.getText().length() - 1);
                delete = str.toString();
                txtCalculator.setText(delete);
            }
        });
        frame.getContentPane().add(buttonDelete);

        JButton buttonPercentage = new JButton("%");
        buttonPercentage.setBounds(10, 272, 55, 55);
        buttonPercentage.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(txtCalculator.getText());
            txtCalculator.setText("");
            result = firstNumber / 100;
            answer = String.format("%.2f", result);
            txtCalculator.setText(answer);
        });
        buttonPercentage.setForeground(Color.WHITE);
        buttonPercentage.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        buttonPercentage.setBackground(Color.GRAY);
        frame.getContentPane().add(buttonPercentage);

        JButton buttonSquareRoot = new JButton("\u221A");
        buttonSquareRoot.setBounds(77, 339, 55, 55);
        buttonSquareRoot.addActionListener((ActionEvent e) -> {
            firstNumber = Double.parseDouble(txtCalculator.getText());
            txtCalculator.setText("");
            result = Math.sqrt(firstNumber);
            answer = String.format("%.2f", result);
            txtCalculator.setText(answer);
        });
        buttonSquareRoot.setForeground(Color.WHITE);
        buttonSquareRoot.setFont(new Font("Segoe UI Black", Font.PLAIN, 20));
        buttonSquareRoot.setBackground(Color.GRAY);
        frame.getContentPane().add(buttonSquareRoot);
    }
}
