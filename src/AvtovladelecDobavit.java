import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.event.ActionEvent;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JComboBox;
import javax.swing.JButton;
import javax.swing.DefaultComboBoxModel;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;

public class AvtovladelecDobavit extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_4;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvtovladelecDobavit frame = new AvtovladelecDobavit(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}
  
	/**
	 * Create the frame.
	 * @param model 
	 */
	public AvtovladelecDobavit(DefaultTableModel model) {
		setBackground(SystemColor.control);	
		setTitle("Добавить");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 302, 348);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("ФИО");
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 11, 96, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField.getText().length() >= 60)
					e.consume();
		    }
		});
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(118, 12, 156, 30);
		contentPane.add(textField);
		
		JLabel lblNewLabel_3 = new JLabel("Пол");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_3.setBounds(12, 53, 96, 30);
		contentPane.add(lblNewLabel_3);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(new String[] {"Мужской", "Женский"}));
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox.setBounds(118, 54, 156, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_4 = new JLabel("Дата");
		lblNewLabel_4.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_4.setBounds(12, 98, 96, 19);
		contentPane.add(lblNewLabel_4);
		
		JLabel lblNewLabel_5 = new JLabel("рождения");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5.setBounds(12, 118, 96, 30);
		contentPane.add(lblNewLabel_5);
		
		textField_1 = new JTextField();
		textField_1.setBackground(Color.WHITE);
		textField_1.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_1.getText().length() >= 14)
					e.consume();
		    }
		});
		textField_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_1.setColumns(10);
		textField_1.setBounds(118, 95, 156, 30);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_6 = new JLabel("Номер");
		lblNewLabel_6.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_6.setBounds(12, 159, 96, 19);
		contentPane.add(lblNewLabel_6);
		
		JLabel lblNewLabel_7 = new JLabel("телефона");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setVerticalAlignment(SwingConstants.TOP);
		lblNewLabel_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_7.setBounds(12, 179, 96, 30);
		contentPane.add(lblNewLabel_7);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_2.getText().length() >= 19)
					e.consume();
		    }
		});
		textField_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBounds(118, 154, 156, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_8 = new JLabel("Адрес");
		lblNewLabel_8.setVerticalAlignment(SwingConstants.BOTTOM);
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_8.setBounds(12, 220, 96, 19);
		contentPane.add(lblNewLabel_8);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.WHITE);
		textField_4.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_4.getText().length() >= 50)
					e.consume();
		    }
		});
		textField_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBounds(118, 215, 156, 30);
		contentPane.add(textField_4);
		
		JButton btnNewButton = new JButton("ОК");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avtovladelec.AddRowToJTable(new Object[]{
						 textField.getText(),
						 comboBox.getSelectedItem(),
						 textField_1.getText(),
						 textField_2.getText(),
						 textField_4.getText(),
                  });
				 dispose();
			}
		});

		btnNewButton.setBounds(105, 270, 89, 30);
		contentPane.add(btnNewButton);
	}
}
