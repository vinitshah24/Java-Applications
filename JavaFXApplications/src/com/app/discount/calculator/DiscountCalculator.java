package com.app.discount.calculator;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import java.awt.Font;
import java.awt.Color;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;

/**
 *
 * @author shahv
 */
public class DiscountCalculator {

    private JFrame frame;
    private JTextField BeforeAmount;
    private JTextField Discount;
    private JTextField AfterAmount;
    private JTextField Save;

    /**
     * Launch the application.
     *
     * @param args
     */
    public static void main(String[] args) {
        EventQueue.invokeLater(() -> {
            try {
                DiscountCalculator window = new DiscountCalculator();
                window.frame.setVisible(true);
            } catch (Exception e) {
                e.printStackTrace();
            }
        });
    }

    /**
     * Create the application.
     */
    public DiscountCalculator() {
        initialize();
    }

    /**
     * Initialize the contents of the frame.
     */
    private void initialize() {
        frame = new JFrame();
        frame.getContentPane().setBackground(new Color(248, 248, 255));
        frame.setResizable(false);
        frame.setBounds(100, 100, 320, 380);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.getContentPane().setLayout(null);
        frame.setTitle("Discount Calculator");

        JLabel lblNewLabel = new JLabel("Discount");
        lblNewLabel.setForeground(Color.BLACK);
        lblNewLabel.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
        lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel.setBounds(32, 115, 113, 37);
        frame.getContentPane().add(lblNewLabel);

        JLabel lblBeforeAmount = new JLabel("Before Amount");
        lblBeforeAmount.setBackground(Color.ORANGE);
        lblBeforeAmount.setForeground(Color.BLACK);
        lblBeforeAmount.setHorizontalAlignment(SwingConstants.CENTER);
        lblBeforeAmount.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
        lblBeforeAmount.setBounds(32, 67, 121, 37);
        frame.getContentPane().add(lblBeforeAmount);

        JLabel lblAfterAmount = new JLabel("After Amount");
        lblAfterAmount.setHorizontalAlignment(SwingConstants.CENTER);
        lblAfterAmount.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
        lblAfterAmount.setBounds(40, 207, 113, 37);
        frame.getContentPane().add(lblAfterAmount);

        JLabel lblYouSave = new JLabel("You Save");
        lblYouSave.setHorizontalAlignment(SwingConstants.CENTER);
        lblYouSave.setFont(new Font("Segoe UI Semibold", Font.BOLD, 15));
        lblYouSave.setBounds(40, 255, 113, 37);
        frame.getContentPane().add(lblYouSave);

        BeforeAmount = new JTextField();
        BeforeAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
        BeforeAmount.setBounds(163, 67, 121, 37);
        frame.getContentPane().add(BeforeAmount);
        BeforeAmount.setColumns(10);

        Discount = new JTextField();
        Discount.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Discount.setColumns(10);
        Discount.setBounds(163, 115, 121, 37);
        frame.getContentPane().add(Discount);

        AfterAmount = new JTextField();
        AfterAmount.setHorizontalAlignment(SwingConstants.CENTER);
        AfterAmount.setFont(new Font("Tahoma", Font.PLAIN, 15));
        AfterAmount.setEditable(false);
        AfterAmount.setColumns(10);
        AfterAmount.setBounds(161, 208, 121, 37);
        frame.getContentPane().add(AfterAmount);

        Save = new JTextField();
        Save.setHorizontalAlignment(SwingConstants.CENTER);
        Save.setFont(new Font("Tahoma", Font.PLAIN, 15));
        Save.setEditable(false);
        Save.setColumns(10);
        Save.setBounds(161, 256, 121, 35);
        frame.getContentPane().add(Save);

        JButton btnNewButton = new JButton("CALCULATE");
        btnNewButton.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        btnNewButton.setBackground(new Color(255, 0, 0));
        btnNewButton.setForeground(Color.WHITE);
        btnNewButton.addActionListener((ActionEvent arg0) -> {
            String orgPrice = BeforeAmount.getText();
            double price = Double.parseDouble(orgPrice);

            String dis = Discount.getText();
            double discount = Double.parseDouble(dis);

            double discountedPrice = price - ((discount / 100) * price);
            double savings = price - discountedPrice;

            String dp = String.format("%.2f", discountedPrice);
            String sav = String.format("%.2f", savings);
            AfterAmount.setText(dp);
            Save.setText(sav);
        });
        btnNewButton.setBounds(85, 163, 131, 33);
        frame.getContentPane().add(btnNewButton);

        JLabel lblNewLabel_1 = new JLabel("DISCOUNT CALCULATOR");
        lblNewLabel_1.setFont(new Font("Segoe UI Symbol", Font.BOLD, 22));
        lblNewLabel_1.setBackground(SystemColor.activeCaption);
        lblNewLabel_1.setForeground(new Color(0, 0, 0));
        lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
        lblNewLabel_1.setBounds(10, 22, 283, 24);
        frame.getContentPane().add(lblNewLabel_1);

        JButton btnNewButton_1 = new JButton("RESET");
        btnNewButton_1.setForeground(new Color(255, 255, 255));
        btnNewButton_1.setBackground(new Color(50, 205, 50));
        btnNewButton_1.addActionListener((ActionEvent e) -> {
            BeforeAmount.setText("");
            Discount.setText("");
            Save.setText("");
            AfterAmount.setText("");
        });
        btnNewButton_1.setFont(new Font("Segoe UI Semibold", Font.PLAIN, 18));
        btnNewButton_1.setBounds(197, 307, 96, 33);
        frame.getContentPane().add(btnNewButton_1);
    }
}
