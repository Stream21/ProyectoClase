import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

public class VistaPrincipal implements ActionListener{
	private JFrame VntPrincipal;
	private JButton bSalir, bProv, bArt, bCtlg;
	private JPanel panelSuperior, panelInferior;
	
	public VistaPrincipal(){
		VntPrincipal = new JFrame(); 
		VntPrincipal.setTitle("Bienvenidos a Pears SL");
		VntPrincipal.setSize(800,300);
		VntPrincipal.setResizable(false);
		VntPrincipal.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);	
		VntPrincipal.setLocationRelativeTo(null);
		botones();
		frames();
		VntPrincipal.add(panelSuperior, BorderLayout.CENTER);
		VntPrincipal.add(panelInferior, BorderLayout.SOUTH);
		VntPrincipal.setVisible(true);
		enlace();
	}

	public void botones(){
		
		//Creamos los botones y su configuración.

		bProv = new JButton ();
		ImageIcon Img = new ImageIcon ("F:/proveedores2.png");
		bProv.setIcon(Img);
				
		bArt = new JButton ();
		ImageIcon Img2 = new ImageIcon ("F:/articulos2.png");
		bArt.setIcon(Img2);
				
		bCtlg = new JButton ();
		ImageIcon Img3 = new ImageIcon ("F:/catalogo2.png");
		bCtlg.setIcon(Img3);
				
		bSalir = new JButton ("Salir");
		
		

	}
	public void frames(){
		
		//Creamos los paneles y asignamos los botones a cada uno de ellos.
		//Primer Panel
		panelSuperior = new JPanel();
		panelSuperior.setLayout(new GridLayout(0,3));
		panelSuperior.add(bProv);
		panelSuperior.add(bArt);
		panelSuperior.add(bCtlg);
		
		//Segundo Panel
		panelInferior= new JPanel();
		panelInferior.setLayout(new GridLayout(0,1));
		panelInferior.add(bSalir);
		
	}
	public void enlace(){
		//Acciones de los botones.
		bSalir.addActionListener(this);
		bProv.addActionListener(this);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bSalir){
			VntPrincipal.dispose();
		}	
		if(e.getSource() == bProv){
			VntPrincipal.dispose();
			VistaProveedor vp = new VistaProveedor();
		}
	}
}

