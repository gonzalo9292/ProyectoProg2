package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingUtilities;
import javax.swing.border.Border;



public class VentanaPrincipal extends JFrame{

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	 public VentanaPrincipal() {
	        setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	        setSize(800, 600);
	        setTitle("BibliotecaOnline");
	        
	        setLocation((int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth() - getWidth()) / 2),  
	                (int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight() - getHeight()) / 2));

	        JPanel panelInicial = new JPanel(new GridLayout(3,1));
	        JPanel panelSur = new JPanel();
	        JPanel panelCentral = new JPanel();
	    
	        JPanel panelNorte = new JPanel();
	        JPanel panelBotones = new JPanel(new GridLayout(1,2));
	        JPanel panelBotones2 = new JPanel(new GridLayout(1,2));

	        JButton botonAlquilar = new JButton("Alquilar Productos");
	        JButton botonDevolver = new JButton("Devolver Productos");
	        JButton botonIniciarSesion = new JButton("IniciarSesion");
	        JButton botonRegistrarse = new JButton("Registrarse");
	        

	        add(panelInicial);
	        panelInicial.add(panelSur);
	        panelInicial.add(panelCentral);
	        panelInicial.add(panelNorte);
	        
	        panelSur.add(panelBotones);
	        panelCentral.add(panelBotones2);
	      
	        panelBotones.add(botonIniciarSesion);
	        panelBotones.add(botonRegistrarse);
	        panelBotones2.add(botonAlquilar);
	        panelBotones2.add(botonDevolver);
	        panelBotones.setLayout(new FlowLayout(FlowLayout.CENTER));
	        panelBotones2.setLayout(new FlowLayout(FlowLayout.CENTER));



	        setVisible(true);
	        
	        
	        
	        
	        botonIniciarSesion.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					new VentanaIniciarSesion();
					
				}
			});
	        
	        
	        botonRegistrarse.addActionListener(new ActionListener() {
				
				@Override
				public void actionPerformed(ActionEvent e) {
					// TODO Auto-generated method stub
					new VentanaRegistrarse();
				}
			});
	    }
	
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaPrincipal();
				
			}
		});
	}

	
	
	
	

}
