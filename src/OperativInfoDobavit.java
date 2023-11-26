import java.awt.EventQueue;
import java.awt.Font;
import java.awt.SystemColor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;
import java.awt.Color;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;

public class OperativInfoDobavit extends JFrame {

	private JPanel contentPane;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					OperativInfoDobavit frame = new OperativInfoDobavit(null);
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
    
	/**
	 * Create the frame.
	 * @param model 
	 */
	public OperativInfoDobavit(DefaultTableModel model) {
		setBackground(SystemColor.control);	
		setTitle("Добавить");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 381, 377);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Место");
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(Color.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 11, 131, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBackground(Color.WHITE);
		textField.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField.getText().length() >= 3)
					e.consume();
		    }
		});
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(153, 12, 200, 30);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("ФИО");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 52, 131, 30);
		contentPane.add(lblNewLabel_1);
		
		JComboBox comboBox = new JComboBox();
		comboBox.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox.setBackground(Color.WHITE);
		comboBox.setModel(new DefaultComboBoxModel(OperativInfo.FioLoad(false)));
		comboBox.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox.setBounds(153, 52, 200, 30);
		contentPane.add(comboBox);
		
		JLabel lblNewLabel_2 = new JLabel("Номерной знак");
		lblNewLabel_2.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_2.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_2.setBackground(Color.WHITE);
		lblNewLabel_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_2.setBounds(12, 93, 131, 30);
		contentPane.add(lblNewLabel_2);
		
		JComboBox comboBox_1 = new JComboBox();
		comboBox_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		comboBox_1.setBackground(Color.WHITE);
		comboBox_1.setModel(new DefaultComboBoxModel(OperativInfo.ZnakLoad(false)));
		comboBox_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		comboBox_1.setBounds(153, 93, 200, 30);
		contentPane.add(comboBox_1);
		
		JLabel lblNewLabel_3 = new JLabel("Дата приема");
		lblNewLabel_3.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_3.setBackground(Color.WHITE);
		lblNewLabel_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_3.setBounds(12, 134, 131, 30);
		contentPane.add(lblNewLabel_3);
		
		textField_2 = new JTextField();
		textField_2.setBackground(Color.WHITE);
		textField_2.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_2.getText().length() >= 10)
					e.consume();
		    }
		});
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_2.setBounds(153, 134, 200, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_4 = new JLabel("Время приема");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_4.setBounds(12, 175, 131, 30);
		contentPane.add(lblNewLabel_4);
		
		textField_3 = new JTextField();
		textField_3.setBackground(Color.WHITE);
		textField_3.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_3.getText().length() >= 5)
					e.consume();
		    }
		});
		textField_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_3.setBounds(153, 175, 200, 30);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_3_1 = new JLabel("Дата выпуска");
		lblNewLabel_3_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_3_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_3_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_3_1.setBackground(Color.WHITE);
		lblNewLabel_3_1.setBounds(12, 216, 131, 30);
		contentPane.add(lblNewLabel_3_1);
		
		textField_4 = new JTextField();
		textField_4.setBackground(Color.WHITE);
		textField_4.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_4.getText().length() >= 10)
					e.consume();
		    }
		});
		textField_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_4.setBounds(153, 216, 200, 30);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_4_1 = new JLabel("Время выпуска");
		lblNewLabel_4_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_4_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_4_1.setBackground(Color.WHITE);
		lblNewLabel_4_1.setBounds(12, 257, 131, 30);
		contentPane.add(lblNewLabel_4_1);
		
		textField_5 = new JTextField();
		textField_5.setBackground(Color.WHITE);
		textField_5.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_5.getText().length() >= 5)
					e.consume();
		    }
		});
		textField_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_5.setBounds(153, 257, 200, 30);
		contentPane.add(textField_5);
		
		JButton btnNewButton = new JButton("ОК");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				OperativInfo.AddRowToJTable(new Object[]{
						 textField.getText(),
						 comboBox.getSelectedItem(),
						 comboBox_1.getSelectedItem(),
						 textField_2.getText(),
						 textField_3.getText(),
						 textField_4.getText(),
						 textField_5.getText(),
                  });
				 dispose();
			}
		});

		btnNewButton.setBounds(140, 298, 89, 30);
		contentPane.add(btnNewButton);
	}
}
