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
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.SwingConstants;

public class AvtomobilDobavit extends JFrame {

	private JPanel contentPane;
	private static JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AvtomobilDobavit frame = new AvtomobilDobavit(null);
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
	public AvtomobilDobavit(DefaultTableModel model) {
		setBackground(SystemColor.WHITE);	
		setTitle("Добавить");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 368, 377);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(SystemColor.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Марка");
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel.setBackground(SystemColor.WHITE);
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 11, 144, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField.getText().length() >= 15)
					e.consume();
		    }
		});
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField.setColumns(10);
		textField.setBounds(166, 12, 173, 30);
		contentPane.add(textField);
		
		JLabel lblNewLabel_1 = new JLabel("Модель");
		lblNewLabel_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_1.setBackground(Color.WHITE);
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(12, 52, 144, 30);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_1.getText().length() >= 15)
					e.consume();
		    }
		});
		textField_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_1.setBounds(166, 53, 173, 30);
		textField_1.setColumns(10);
		contentPane.add(textField_1);
		
		JLabel lblNewLabel_4 = new JLabel("Цвет");
		lblNewLabel_4.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_4.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_4.setBackground(Color.WHITE);
		lblNewLabel_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_4.setBounds(12, 93, 144, 30);
		contentPane.add(lblNewLabel_4);
		
		textField_2 = new JTextField();
		textField_2.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_2.getText().length() >= 40)
					e.consume();
		    }
		});
		textField_2.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_2.setColumns(10);
		textField_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_2.setBounds(166, 94, 173, 30);
		contentPane.add(textField_2);
		
		JLabel lblNewLabel_5 = new JLabel("Номерной знак");
		lblNewLabel_5.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_5.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_5.setBackground(Color.WHITE);
		lblNewLabel_5.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_5.setBounds(12, 134, 144, 30);
		contentPane.add(lblNewLabel_5);
		
		textField_3 = new JTextField();
		textField_3.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_3.getText().length() >= 9)
					e.consume();
		    }
		});
		textField_3.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_3.setColumns(10);
		textField_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_3.setBounds(166, 134, 173, 30);
		contentPane.add(textField_3);
		
		JLabel lblNewLabel_6 = new JLabel("Год приобретения");
		lblNewLabel_6.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_6.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_6.setBackground(Color.WHITE);
		lblNewLabel_6.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_6.setBounds(12, 175, 144, 30);
		contentPane.add(lblNewLabel_6);
		
		textField_4 = new JTextField();
		textField_4.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_4.getText().length() >= 4)
					e.consume();
		    }
		});
		textField_4.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_4.setColumns(10);
		textField_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_4.setBounds(166, 175, 173, 30);
		contentPane.add(textField_4);
		
		JLabel lblNewLabel_7 = new JLabel("Пробег, км");
		lblNewLabel_7.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_7.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_7.setBackground(Color.WHITE);
		lblNewLabel_7.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_7.setBounds(12, 216, 144, 30);
		contentPane.add(lblNewLabel_7);
		
		textField_5 = new JTextField();
		textField_5.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_5.getText().length() >= 10)
					e.consume();
		    }
		});
		textField_5.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_5.setColumns(10);
		textField_5.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_5.setBounds(166, 216, 173, 30);
		contentPane.add(textField_5);
		
		JLabel lblNewLabel_8 = new JLabel("Дата техосмотра");
		lblNewLabel_8.setHorizontalAlignment(SwingConstants.CENTER);
		lblNewLabel_8.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_8.setBackground(Color.WHITE);
		lblNewLabel_8.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_8.setBounds(12, 257, 144, 30);
		contentPane.add(lblNewLabel_8);
		
		textField_6 = new JTextField();
		textField_6.addKeyListener((KeyListener) new KeyAdapter() {
			@Override
		    public void keyTyped(KeyEvent e) {
				if (textField_6.getText().length() >= 10)
					e.consume();
		    }
		});
		textField_6.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_6.setColumns(10);
		textField_6.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_6.setBounds(166, 257, 173, 30);
		contentPane.add(textField_6);
		
		JButton btnNewButton = new JButton("ОК");
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Avtomobil.AddRowToJTable(new Object[]{
						 textField.getText(),
						 textField_1.getText(),
						 textField_2.getText(),
						 textField_3.getText(),
						 textField_4.getText(),
						 textField_5.getText(),
						 textField_6.getText(),
                  });
			}
		});

		btnNewButton.setBounds(134, 298, 89, 30);
		contentPane.add(btnNewButton);
	}
}
