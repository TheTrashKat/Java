package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JList;
import javax.swing.JScrollBar;
import java.awt.List;
import java.awt.Button;
import javax.swing.JTextPane;
import javax.swing.JTextField;
import javax.swing.JCheckBox;
import javax.swing.JLabel;

public class Mision extends JFrame {

	private JPanel contentPane;
	private JTextField textField;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Mision frame = new Mision();
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
	public Mision() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JList list = new JList();
		list.setBounds(57, 229, 56, -135);
		contentPane.add(list);
		
		JScrollBar scrollBar = new JScrollBar();
		scrollBar.setBounds(149, 89, 17, 161);
		contentPane.add(scrollBar);
		
		List list_1 = new List();
		list_1.setBounds(20, 100, 110, 151);
		contentPane.add(list_1);
		
		Button button = new Button("New button");
		button.setBounds(190, 110, 70, 22);
		contentPane.add(button);
		
		Button button_1 = new Button("New button");
		button_1.setBounds(190, 148, 70, 22);
		contentPane.add(button_1);
		
		List list_2 = new List();
		list_2.setBounds(299, 178, 110, 73);
		contentPane.add(list_2);
		
		textField = new JTextField();
		textField.setBounds(69, 38, 340, 39);
		contentPane.add(textField);
		textField.setColumns(10);
		
		JCheckBox chckbxNewCheckBox = new JCheckBox("New check box");
		chckbxNewCheckBox.setBounds(299, 100, 97, 23);
		contentPane.add(chckbxNewCheckBox);
		
		JCheckBox chckbxNewCheckBox_1 = new JCheckBox("New check box");
		chckbxNewCheckBox_1.setBounds(299, 126, 97, 23);
		contentPane.add(chckbxNewCheckBox_1);
		
		Button button_2 = new Button("New button");
		button_2.setBounds(190, 204, 70, 22);
		contentPane.add(button_2);
		
		Button button_3 = new Button("New button");
		button_3.setBounds(190, 229, 70, 22);
		contentPane.add(button_3);
		
		JLabel lblNewLabel = new JLabel("New label");
		lblNewLabel.setBounds(69, 11, 46, 14);
		contentPane.add(lblNewLabel);
	}
}
