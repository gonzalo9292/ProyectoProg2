package gui;

import java.awt.BorderLayout;
import java.awt.Font;
import java.awt.GridLayout;
import java.awt.Toolkit;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;

public class VentanaIniciarSesion extends JFrame{
	
public VentanaIniciarSesion() {
	
	
	setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
	setSize(800, 600);
	setTitle("BibliotecaOnline");
	setVisible(true);
	setLocation(	(int) ((Toolkit.getDefaultToolkit().getScreenSize().getWidth() - getWidth()) / 2),  
			(int) ((Toolkit.getDefaultToolkit().getScreenSize().getHeight() - getHeight()) / 2));
	

			JPanel panelIniciarSesion  = new JPanel();
			JPanel panelBotones = new JPanel();
			JPanel userPass = new JPanel();
			JPanel pUsuario = new JPanel();
			JPanel pContraseña = new JPanel();
			userPass.setLayout(new GridLayout(2,1));
	
			JButton bInicioSecion = new JButton("Iniciar sesión");
		
			JTextField tfUsuario = new JTextField(20);
			JPasswordField passContraseña = new JPasswordField(20);

			JLabel lIniciarSesion = new JLabel("Iniciar sesion");
			Font fuente = new Font("Arial",Font.BOLD,40);
	        lIniciarSesion.setFont(fuente);
			JLabel lUsurario = new JLabel("Usuario");
			JLabel lContraseña = new JLabel("Contraseña");
			
			
		
			add(panelIniciarSesion, BorderLayout.NORTH);
			panelIniciarSesion.add(lIniciarSesion, BorderLayout.CENTER);
	
			add(userPass,BorderLayout.CENTER);
			userPass.add(pUsuario);
			userPass.add(pContraseña);
			add(panelBotones,BorderLayout.SOUTH);
		
			pUsuario.add(lUsurario);
			pUsuario.add(tfUsuario);
			pContraseña.add(lContraseña);
			pContraseña.add(passContraseña);
			panelBotones.add(bInicioSecion);
}

public static void main(String[] args) {
	SwingUtilities.invokeLater(new Runnable() {
		
		@Override
		public void run() {
			new VentanaIniciarSesion();
			
		}
	});
}
	
	

}
