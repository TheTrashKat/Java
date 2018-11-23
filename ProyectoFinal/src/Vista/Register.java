package Vista;

import Modelo.*;
import java.awt.BorderLayout;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Controlador.dB_Conn;

import javax.swing.JLabel;
import java.awt.Panel;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JTextField;
import javax.swing.JFormattedTextField;
import javax.swing.JButton;

public class Register extends JFrame {
	private JTextField textField;
	private JTextField textField_1;

	

	/**
	 * Create the frame.
	 */
	public Register(Controlador c) {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblRegister = new JLabel("Register");
		lblRegister.setBounds(182, 42, 46, 14);
		getContentPane().add(lblRegister);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setBounds(171, 85, 46, 14);
		getContentPane().add(lblNombre);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(171, 99, 86, 20);
		getContentPane().add(textField);
		
		JLabel lblContrasea = new JLabel("Contrase\u00F1a");
		lblContrasea.setBounds(171, 130, 46, 14);
		getContentPane().add(lblContrasea);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(171, 143, 86, 20);
		getContentPane().add(textField_1);
		
		JButton btnRegister = new JButton("Register");
		btnRegister.setBounds(168, 191, 89, 23);
		getContentPane().add(btnRegister);
		
		btnRegister.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent arg0) {
				c.Register_action_B_register(textField.getText(), textField_1.getText());
			}
		});
		
		
	}
}
