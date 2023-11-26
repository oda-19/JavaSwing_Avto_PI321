import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.awt.Cursor;
import java.awt.SystemColor;
import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.EmptyBorder;
import javax.swing.JTable;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;
import javax.swing.RowFilter;
import javax.swing.JButton;
import javax.swing.border.EtchedBorder;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableRowSorter;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

import org.apache.poi.ss.usermodel.BorderStyle;
import org.apache.poi.ss.usermodel.Cell;
import org.apache.poi.ss.usermodel.CellStyle;
import org.apache.poi.ss.usermodel.Row;
import org.apache.poi.xssf.usermodel.XSSFCell;
import org.apache.poi.xssf.usermodel.XSSFFont;
import org.apache.poi.xssf.usermodel.XSSFRow;
import org.apache.poi.xssf.usermodel.XSSFSheet;
import org.apache.poi.xssf.usermodel.XSSFWorkbook;

public class Avtomobil extends JFrame {

	private JPanel contentPane;
	private static JTable table;
	private JTextField textField;
	private JLabel lblNewLabel;
	private JTextField textField_1;
	private JScrollPane scrollPane;
    
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Avtomobil frame = new Avtomobil();
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
	public Avtomobil() {
		setForeground(SystemColor.control);
		setCursor(Cursor.getPredefinedCursor(Cursor.DEFAULT_CURSOR));
		setTitle("Справочник автомобилей");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(0, 0, 1042, 408);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		scrollPane = new JScrollPane();
		scrollPane.setBackground(Color.WHITE);
		scrollPane.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		scrollPane.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		scrollPane.setBounds(12, 52, 1002, 266);
		contentPane.add(scrollPane);
		
		table = new JTable(new DefaultTableModel(
			new Object[][] {
			},
			new String[] {
				"Марка", "Модель", "Цвет", "Номерной знак", "Год приобретения", "Пробег, км", "Дата техосмотра"
			}
		));
		table.setBackground(SystemColor.WHITE);
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setAutoResizeMode(JTable.AUTO_RESIZE_OFF);
		Font bigFont = new Font("Trebuchet MS", Font.BOLD, 16);
		table.getTableHeader().setFont(bigFont);
		
		table.getColumnModel().getColumn(0).setPreferredWidth(80);
		table.getColumnModel().getColumn(1).setPreferredWidth(130);
		table.getColumnModel().getColumn(2).setPreferredWidth(250);
		table.getColumnModel().getColumn(3).setPreferredWidth(140);
		table.getColumnModel().getColumn(4).setPreferredWidth(150);
		table.getColumnModel().getColumn(5).setPreferredWidth(90);
		table.getColumnModel().getColumn(6).setPreferredWidth(140);

		table.setRowHeight(30);
		
		scrollPane.setViewportView(table);
		table.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		table.setFont(new Font("Trebuchet MS", Font.PLAIN, 16));
		
		DefaultTableModel model = (DefaultTableModel)table.getModel();
		
		lblNewLabel = new JLabel("Поиск по марке");
		lblNewLabel.setBackground(SystemColor.WHITE);
		lblNewLabel.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel.setBounds(12, 11, 132, 30);
		contentPane.add(lblNewLabel);
		
		textField = new JTextField();
		textField.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(textField.getText(), 0));
			}
		});
		textField.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField.setBounds(154, 12, 132, 30);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JLabel lblNewLabel_1 = new JLabel("Поиск по номерному знаку");
		lblNewLabel_1.setBackground(SystemColor.WHITE);
		lblNewLabel_1.setBorder(new EmptyBorder(0, 0, 0, 0));
		lblNewLabel_1.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		lblNewLabel_1.setBounds(658, 11, 214, 30);
		contentPane.add(lblNewLabel_1);
		
		textField_1 = new JTextField();
		textField_1.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		textField_1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyPressed(KeyEvent e) {
				TableRowSorter<DefaultTableModel> tr = new TableRowSorter<DefaultTableModel>(model);
				table.setRowSorter(tr);
				tr.setRowFilter(RowFilter.regexFilter(textField_1.getText(), 3));
			}
		});
		textField_1.setFont(new Font("Trebuchet MS", Font.PLAIN, 14));
		textField_1.setBounds(882, 12, 132, 30);
		contentPane.add(textField_1);
		textField_1.setColumns(10);
		
		JButton btnNewButton = new JButton("Добавить");
		btnNewButton.setBackground(Color.WHITE);
		btnNewButton.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				AvtomobilDobavit add = new AvtomobilDobavit(null);
				add.setVisible(true);
				add.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			}
		});
		btnNewButton.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton.setBounds(377, 328, 122, 30);
		contentPane.add(btnNewButton);
		
		JButton btnNewButton_2 = new JButton("Удалить");
		btnNewButton_2.setBackground(Color.WHITE);
		btnNewButton_2.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int result = JOptionPane.showConfirmDialog(null,
						"Вы уверены, что хотите удалить эту запись?",
						getTitle(),
						JOptionPane.YES_NO_OPTION,
						JOptionPane.WARNING_MESSAGE);
						if (result == JOptionPane.YES_OPTION) {
							int getSelectedRowforDeletion = table.getSelectedRow();
							if (getSelectedRowforDeletion >= 0) {
								Avtomobil.DeleteRowToJTable(getSelectedRowforDeletion);
								JOptionPane.showMessageDialog(null, "Строка удалена!");
							}
						}
			}
		});
		btnNewButton_2.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_2.setBounds(509, 328, 110, 30);
		contentPane.add(btnNewButton_2);

		JButton btnNewButton_3 = new JButton("Импорт из Excel");
		btnNewButton_3.setBackground(Color.WHITE);
		btnNewButton_3.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				FileInputStream file = null;
				XSSFWorkbook workbook = null;
				
				try {
					file = new FileInputStream(new File("C:\\Users\\79034\\Desktop\\Геворгян. ПИ-321. Java.xlsx"));
					workbook = new XSSFWorkbook (file);
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
				XSSFSheet excelSheet = workbook.getSheetAt(2);
				
				try {
					for (int row = 1; row <= excelSheet.getLastRowNum(); row++) {
						XSSFRow excelRow = excelSheet.getRow(row);

		                    XSSFCell excelMarka = excelRow.getCell(0);
		                    XSSFCell excelModel = excelRow.getCell(1);
		                    XSSFCell excelCvet = excelRow.getCell(2);
		                    XSSFCell excelZnak = excelRow.getCell(3);
		                    XSSFCell excelGod = excelRow.getCell(4);
		                    XSSFCell excelProbeg = excelRow.getCell(5);
		                    XSSFCell excelData = excelRow.getCell(6);
		                    
		                    model.addRow(new Object[]{excelMarka, excelModel, excelCvet, excelZnak, excelGod, excelProbeg, excelData});
		                }
		                JOptionPane.showMessageDialog(null, "Успешно!");
				} finally {
		        	try {
		        		if (workbook != null) {
		        			workbook.close();
		                }
		            } catch (IOException iOException) {
		            	JOptionPane.showMessageDialog(null, iOException.getMessage());
		            }
		        }
			}
		});
		btnNewButton_3.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_3.setBounds(296, 11, 170, 30);
		contentPane.add(btnNewButton_3);
		
		JButton btnNewButton_4 = new JButton("Экспорт в Excel");
		btnNewButton_4.setBorder(new EtchedBorder(EtchedBorder.LOWERED, null, null));
		btnNewButton_4.setBackground(Color.WHITE);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String path = "C:\\Users\\79034\\Desktop\\Геворгян. ПИ-321. Java.xlsx";
		        FileInputStream fileinp = null;
		        XSSFWorkbook workbook = null;
				try {
					fileinp = new FileInputStream(path);
					workbook = new XSSFWorkbook(fileinp);
					} catch (FileNotFoundException e2) {
					// TODO Auto-generated catch block
						e2.printStackTrace();
					} catch (IOException e2) {
					// TODO Auto-generated catch block
						e2.printStackTrace();
					}
				
				int index = 0;
				XSSFSheet sheet = workbook.getSheet("Справочник автомобилей");
				if(sheet != null)   {
				    index = workbook.getSheetIndex(sheet);
				    workbook.removeSheetAt(index);
				}
				
				XSSFSheet excelSheet = workbook.createSheet("Справочник автомобилей");
				workbook.setSheetOrder("Справочник автомобилей", 2);
				
				try {
					Row rowCol = excelSheet.createRow(0);
		                for (int k = 0; k < table.getColumnCount(); k++) {
		                        Cell excel = rowCol.createCell(k);         
		                        excel.setCellValue(table.getColumnName(k));
		                        CellStyle style = workbook.createCellStyle();
		                        style.setBorderTop(BorderStyle.THIN);
		                        style.setBorderBottom(BorderStyle.THIN);
		                        style.setBorderLeft(BorderStyle.THIN);
		                        style.setBorderRight(BorderStyle.THIN);
		                        XSSFFont font = workbook.createFont();
		                        font.setFontName("Calibri");
		                        font.setFontHeightInPoints((short) 12);
		                        font.setBold(true);
		                        style.setFont(font);
		                        excel.setCellStyle(style);
		                }
		                
		                for (int i = 0; i < model.getRowCount(); i++) {
		                    XSSFRow excelRow = excelSheet.createRow(i + 1);
		                    for (int j = 0; j < model.getColumnCount(); j++) {
		                        XSSFCell excelCell = excelRow.createCell(j);         
		                        excelCell.setCellValue(model.getValueAt(i, j).toString());   
				                excelSheet.autoSizeColumn(j);
		                    }
		                }

		                JOptionPane.showMessageDialog(null, "Успешно!");

				} finally {
					FileOutputStream fileOut = null;
					try {
						fileOut = new FileOutputStream(path);
						workbook.write(fileOut);
						fileOut.close();
						fileinp.close();
					} catch (FileNotFoundException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					} catch (IOException e1) {
						// TODO Auto-generated catch block
						e1.printStackTrace();
					}
		        }
			}
		});
		btnNewButton_4.setFont(new Font("Trebuchet MS", Font.BOLD, 16));
		btnNewButton_4.setBounds(476, 11, 160, 30);
		contentPane.add(btnNewButton_4);
	}
	
	 public static void AddRowToJTable(Object[] dataRow)
	 {
		 DefaultTableModel model = (DefaultTableModel)table.getModel();
	     model.addRow(dataRow);
	 }   
	 public static void DeleteRowToJTable(int dataRow)
	 {
		 DefaultTableModel model = (DefaultTableModel)table.getModel();
		 model.removeRow(dataRow);
	 }    
}
