package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Modelo.Jugador;
import Modelo.Reto;

import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.ActionEvent;
import java.awt.List;

public class My_Misions extends JFrame {

	private JPanel contentPane;
	public Jugador j;
	/**
	 * Launch the application.
	 */


	/**
	 * Create the frame.
	 */
	public My_Misions(Controlador c , Jugador j) {
		this.j=j;
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblMisiones = new JLabel("MISIONES");
		lblMisiones.setBounds(198, 11, 76, 14);
		contentPane.add(lblMisiones);
		
		
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnEliminar.setBounds(128, 199, 89, 23);
		contentPane.add(btnEliminar);
		
		List list_1 = new List();
		list_1.setBounds(239, 68, 171, 126);
		contentPane.add(list_1);
		
		List list = new List();
		list.setBounds(30, 67, 162, 126);
		for (Reto a : j.getLi_re_en_curso()){
			list.add(a.getDescription());
			list.addItemListener(new ItemListener() {
				
				@Override
				public void itemStateChanged(ItemEvent e) {
					list_1.removeAll();
					for(Modelo.Tarea b : a.getTareas()){
						list_1.add(b.getNombre());
						
					}
				}
			});
		}
		
		
		JButton btnNewButton = new JButton("Terminar");
		btnNewButton.addActionListener(new ActionListener() {
			

			public void actionPerformed(ActionEvent e) {
				 //c.My_Misions_action_B_Terminar( j.getLi_re_calificados().get(list.getSelectedIndex()));
					c.My_Misions_action_B_Terminar(list.getSelectedIndex());
			}
		});
		btnNewButton.setBounds(40, 199, 89, 23);
		contentPane.add(btnNewButton);
		
		contentPane.add(list);
		
		
		
		JButton button = new JButton("Terminar");
		button.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		button.setBounds(249, 199, 89, 23);
		contentPane.add(button);
	}
}
