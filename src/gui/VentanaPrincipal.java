package gui;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.Toolkit;

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
		setVisible(true);
		setLocation(	(int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth() - getWidth()) / 2),  
				(int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight() - getHeight()) / 2));
		
		
		
		JPanel panelInicial = new JPanel();
		JPanel panelCentral = new JPanel(new GridLayout(1,2));
		
		
		JPanel panelAlquilar = new JPanel(new FlowLayout());
		JPanel panelDevolver = new JPanel(new FlowLayout());
		JButton botonAlquilar = new JButton("Alquilar Productos");
		JButton botonDevolver = new JButton("Devolver Productos");
		
		add(panelInicial);
		panelInicial.add(panelCentral);
		
		
		panelCentral.add(panelAlquilar);
		panelCentral.add(panelDevolver);
		
		panelAlquilar.add(botonAlquilar);
		panelDevolver.add(botonDevolver);
		
		
		
	
		
		
		
		
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
