package Vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Image;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import Controlador.Controlador;
import Modelo.Jugador;

import java.awt.SystemColor;
import javax.swing.JLabel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.image.BufferedImage;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.awt.event.ActionEvent;

import javax.imageio.ImageIO;
import javax.swing.Icon;
import javax.swing.ImageIcon;	

import java.awt.Image;
import java.io.IOException;
import java.net.URL;
import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class Menu extends JFrame {

	private JPanel contentPane;
	private JButton Amigos; 
	
	private JButton btnNewButton;
	private JButton btnNewButton_1;
	private ImageIcon imagen ;
	private JLabel player_name;
	private JLabel Influence;
	private JLabel image_view;
	private URL url;
	private JLabel Info;
	private int count;
	
	
	
	
	public URL getUrl() {
		return url;
	}

	public void setUrl(URL url) {
		this.url = url;
	}

	public JLabel getPlayer_name() {
		return player_name;
	}

	public void setPlayer_name(JLabel player_name) {
		this.player_name = player_name;
	}

	public JLabel getInfluence() {
		return Influence;
	}

	public void setInfluence(JLabel influence) {
		Influence = influence;
	}

	public JLabel getImage_view() {
		return image_view;
	}

	public void setImage_view(JLabel image_view) {
		this.image_view = image_view;
	}

	public JLabel getInfo() {
		return Info;
	}

	public void setInfo(JLabel info) {
		Info = info;
	}

	public Menu(Controlador c, Jugador j) {
		setBackground(SystemColor.controlText);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		player_name = new JLabel("New label");
		player_name.setBounds(21, 11, 46, 14);
		contentPane.add(player_name);
		
		 Influence = new JLabel("New label");
		Influence.setBounds(97, 11, 46, 14);
		contentPane.add(Influence);
		
		 image_view = new JLabel("New label");
		 
		image_view.setBounds(136, 25, 145, 134);
		
		contentPane.add(image_view);
		
		JButton btnNewButton = new JButton("This like");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update(j,-1);
			}
		});
		btnNewButton.setBounds(315, 103, 89, 23);
		contentPane.add(btnNewButton);
		
		 btnNewButton_1 = new JButton("Like");
		 
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				update(j,1);
			}
		});
		btnNewButton_1.setBounds(21, 103, 89, 23);
		contentPane.add(btnNewButton_1);
		
		JButton newMision = new JButton("Nueva Mision");
		newMision.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		newMision.setBounds(10, 227, 89, 23);
		contentPane.add(newMision);
		
		JButton btnMisRetos = new JButton("Mis Retos");
		btnMisRetos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnMisRetos.setBounds(109, 227, 89, 23);
		contentPane.add(btnMisRetos);
		
		Amigos= new JButton("Amigos");
		Amigos.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Amigos.setBounds(204, 227, 89, 23);
		contentPane.add(Amigos);
		
		 Info = new JLabel("New label");
		Info.setBounds(120, 152, 201, 54);
		contentPane.add(Info);
		
		update(j,0);
		
	}


	private void update(Jugador j,int n){
		
		 count+=n;
		 if(count > j.getLi_re_calificados().size()){
			 btnNewButton_1.setEnabled(false);
		 }
		  if(count < 0){
			 btnNewButton.setEnabled(false);
		 }
		  
		  
		 	System.out.println(j);
		 
			 player_name.setText(j.getName());
			 Influence.setText(""+j.getInfluencie());
			 
		 
			 if(j.getLi_re_calificados().size() >0){
				
				 Info.setText(j.getLi_re_calificados().get(count).getDescription());
				
				 
				 try {
					 // url = new URL(j.getLi_re_calificados().get(count).getImg());
					 url= new URL("https://banner2.kisspng.com/20180424/pyq/kisspng-animal-raccoon-logo-wildlife-giant-panda-animal-logo-5adfd8ccab5c47.5733684715246194687019.jpg");
					 System.out.println(url.toString());
					 imagen = new ImageIcon(url);
					 
					 
					  //Image i = ImageIO.read(url);
					  //image_view= new JLabel(new ImageIcon(i));
					image_view.setIcon(imagen);
					 contentPane.add(image_view);
					 // repaint();
				} catch (Exception e) {
					// TODO: handle exception
				}
			 
				
				 
				 
				 
			 }
			 
				 
			 }
		}
	 

