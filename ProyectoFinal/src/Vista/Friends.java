package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Modelo.Amigos;
import Modelo.Jugador;

import javax.swing.JEditorPane;
import javax.swing.JPasswordField;
import javax.swing.JButton;
import javax.swing.JTextField;
import javax.swing.JList;
import java.awt.List;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Friends extends JFrame {

	private JPanel contentPane;
	private JTextField textField;
	

	/**
	 * Launch the application.
	 */
	

	/**
	 * Create the frame.
	 */
	public Friends(Controlador c , Jugador j) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnNewButton = new JButton("Agregar");
		btnNewButton.setBounds(274, 53, 89, 23);
		btnNewButton.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(btnNewButton);
		
		textField = new JTextField();
		textField.setBounds(97, 54, 156, 20);
		contentPane.add(textField);
		textField.setColumns(10);
		
		
		
		
		
		List list_1 = new List();
		list_1.setBounds(197, 102, 110, 129);
		for (Amigos a: j.getFiends() ){
			list_1.add(a.getPlayer_2_name());
		}
		contentPane.add(list_1);
		
		JButton btnNewButton_1 = new JButton("Borrar");
		btnNewButton_1.setBounds(335, 227, 89, 23);
		btnNewButton_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				// TODO Auto-generated method stub
				
			}
		});
		contentPane.add(btnNewButton_1);
	
		
		
		JButton button_1 = new JButton("Salir");
		button_1.setBounds(313, 124, 89, 23);
		button_1.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					this.finalize();
				} catch (Throwable e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
				
			}
		});
		contentPane.add(button_1);
	}
}
