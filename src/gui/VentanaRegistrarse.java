package gui;

import java.awt.Color;
import java.awt.FlowLayout;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingUtilities;



public class VentanaRegistrarse extends JFrame{


	

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	//Color del panel
	
	public VentanaRegistrarse() {
		
			setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
			setSize(400, 500);
			setTitle("Sing Up");
			setLocationRelativeTo(null);
			setVisible(true);
			
			JLabel Registrarse = new JLabel            ("   Registrarse");
			Font fuente = new Font("Arial",Font.BOLD,40);
	        Registrarse.setFont(fuente);
			JLabel DNI = new JLabel            ("       DNI :");
			JLabel Nombre = new JLabel         ("  Nombre :");
			JLabel Apellido = new JLabel       ("    Apellidos :");
			JLabel FechaNacimiento = new JLabel(  "Fecha de Nacimiento :"         );
			JLabel Usuario = new JLabel        ("     Nombre de Usuario:");
			JLabel Contraseña = new JLabel     ("                    Contraseña:");
			
			JTextField txtDNI = new JTextField(15);
			JTextField txtNombre= new JTextField(15);
			JTextField txtApellido= new JTextField(15);
			JTextField txtUsuario= new JTextField(15);
			JTextField txtContraseña= new JTextField(15);
			JTextField txtFecha= new JTextField(15);
			
			JButton btnRegistro = new JButton("Registrarse");
			JButton PoliticaDePrivacidad = new JButton("--Politica de privacidad--");
				PoliticaDePrivacidad.setForeground(Color.BLUE);
				PoliticaDePrivacidad.setBackground(Color.WHITE);
				
		
			JCheckBox pol = new JCheckBox("He leido y acepto la politica de privacidad");
				pol.setSelected(false);
				pol.setEnabled(true);
				
			JPanel central = new JPanel();
			
			JPanel pRegistrarse = new JPanel();
			JPanel pNombre = new JPanel();
			JPanel pApellido = new JPanel();
			JPanel pDNI = new JPanel();
			JPanel pFecha = new JPanel();
			JPanel pNombreU = new JPanel();
			JPanel pContraseña = new JPanel();
			JPanel pAvisos = new JPanel();
			JPanel pPrivacidad = new JPanel();
			JPanel pBoton = new JPanel();
			
			
		
		
			pRegistrarse.setLayout(new FlowLayout());
			pRegistrarse.add(Registrarse);
			
			pDNI.setLayout(new FlowLayout());
			pDNI.add(DNI);
			pDNI.add(txtDNI);
			
			pNombre.setLayout(new FlowLayout());
			pNombre.add(Nombre);
			pNombre.add(txtNombre);
			
			pApellido.setLayout(new FlowLayout());
			pApellido.add(Apellido);
			pApellido.add(txtApellido);
			
			pFecha.setLayout(new FlowLayout());
			pFecha.add(FechaNacimiento);
			pFecha.add(txtFecha);
			
			pNombreU.setLayout(new FlowLayout());
			pNombreU.add(Usuario);
			pNombreU.add(txtUsuario);
			
			pContraseña.setLayout(new FlowLayout());
			pContraseña.add(Contraseña);
			pContraseña.add(txtContraseña);
			
			pAvisos.setLayout(new FlowLayout());
		
			pAvisos.add(pol);
			
			pPrivacidad.setLayout(new FlowLayout());
			pPrivacidad.add(PoliticaDePrivacidad);
			
			pBoton.setLayout(new FlowLayout());
			pBoton.add(btnRegistro);
			
			central.setLayout(new GridLayout(12, 1));
			
			central.add(pRegistrarse);
			central.add(pDNI);
			central.add(pNombre);
			central.add(pApellido);
			central.add(pFecha);
			central.add(pNombreU);
			central.add(pContraseña);
			central.add(pAvisos);
			central.add(pPrivacidad);
			central.add(pBoton);
			
			add(central);
			
			
								
			btnRegistro.setEnabled(false);
			String fecha= "yyyy-MM-dd";
			txtFecha.setText(fecha);
	

}
	
	
	public static void main(String[] args) {
		SwingUtilities.invokeLater(new Runnable() {
			
			@Override
			public void run() {
				new VentanaRegistrarse();
				
			}
		});
	}
	
	
	}
