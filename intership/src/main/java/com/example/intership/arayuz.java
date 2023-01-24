package com.example.intership;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JLayeredPane;
import javax.swing.ImageIcon;

public class arayuz extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					arayuz frame = new arayuz();
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
	public arayuz() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
		
		JLayeredPane layeredPane = new JLayeredPane();
		contentPane.add(layeredPane, BorderLayout.CENTER);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setIcon(new ImageIcon("C:\\Users\\huawei\\Desktop\\okul.png.jpg"));
		lblNewLabel.setBounds(10, 0, 233, 243);
		layeredPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("Öğrenci İşlemleri");
		btnNewButton.setBounds(264, 41, 152, 21);
		layeredPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Personel İşlemleri");
		btnNewButton_1.setBounds(264, 111, 152, 21);
		layeredPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Veritabanı İşlemleri");
		btnNewButton_2.setBounds(264, 193, 152, 21);
		layeredPane.add(btnNewButton_2);
	}
}
