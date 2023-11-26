import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JButton;
import javax.swing.SwingConstants;
import javax.swing.border.EtchedBorder;

public class Menu extends JFrame {

	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Menu frame = new Menu();
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
	public Menu() {
		setForeground(new Color(255, 255, 255));
		setTitle("Меню");
		setBackground(SystemColor.control);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 390, 214);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Оперативная инф. об автостоянке");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				OperativInfo operativInfo = new OperativInfo();
				operativInfo.setVisible(true);
				operativInfo.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton.setBounds(32, 32, 310, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("Справочник автовладельцев");
		btnNewButton_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_1.setBackground(Color.WHITE);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Avtovladelec avtovladelec = new Avtovladelec();
				avtovladelec.setVisible(true);
				avtovladelec.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_1.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_1.setBounds(32, 73, 310, 30);
		contentPane.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("Справочник автомобилей");
		btnNewButton_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				Avtomobil avtomobil = new Avtomobil();
				avtomobil.setVisible(true);
				avtomobil.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton_2.setHorizontalTextPosition(SwingConstants.CENTER);
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_2.setBounds(32, 114, 310, 30);
		contentPane.add(btnNewButton_2);
	}
}
