import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class VistaProveedor implements ActionListener{
	private JFrame VntProveedor;
	private JButton bA�adir, bSearch, bMostrar, bAtras, bSalir;
	private JLabel bProv;
	private JPanel panelSuperior, panelInferior;
	private ImageIcon img, logo;
	
	
	
	
	public VistaProveedor(){
		
		VntProveedor = new JFrame();
		VntProveedor.setTitle("Ventana de Proveedores");
		VntProveedor.setSize(600, 470);
		VntProveedor.setResizable(false);
		VntProveedor.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		VntProveedor.setLocationRelativeTo(null);
		botones();
		frames();
		VntProveedor.setLayout(new BorderLayout());
		VntProveedor.add(panelSuperior, BorderLayout.CENTER);
		VntProveedor.add(panelInferior, BorderLayout.SOUTH);
		VntProveedor.setVisible(true);
		logo = new ImageIcon("f:/PearLogo.png");
		VntProveedor.setIconImage(logo.getImage());
		enlace();
	
	}
	
	
	
	public void botones(){
		
		//Creamos los botones y su configuraci�n
		
		bA�adir = new JButton ("A�ADIR");
		bSearch = new JButton ("BUSCAR");
		bMostrar = new JButton ("MOSTRAR");
		bAtras = new JButton ("ATRAS");
		bSalir = new JButton("SALIR");
		bProv = new JLabel();
		img = new ImageIcon ("F:/p1.jpg");
		bProv.setIcon(img);
		
	}

	public void frames(){
		
		//Creamos los paneles y asignamos los botones a cada uno de ellos.
		//Primer Panel
		panelSuperior = new JPanel();
		panelSuperior.setLayout(new GridLayout(4,1));
		panelSuperior.add(bProv);
		panelSuperior.add(bA�adir);
		panelSuperior.add(bSearch);
		panelSuperior.add(bMostrar);
		
		//Segundo panel
		panelInferior = new JPanel();
		panelInferior.setLayout(new GridLayout(0,2));
		panelInferior.add(bAtras);
		panelInferior.add(bSalir);
		
		
	}
	
	public void enlace(){
		
		bAtras.addActionListener(this);
		bSalir.addActionListener(this);
		bA�adir.addActionListener(this);
		bMostrar.addActionListener(this);
		bSearch.addActionListener(this);
		
	}
	
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bSalir){
			VntProveedor.dispose();
		}	
		
		if(e.getSource() == bA�adir){
			VistaA�adir va = new VistaA�adir();
			VntProveedor.dispose();
		}
		
		if(e.getSource() == bAtras){
			VntProveedor.dispose();
			VistaPrincipal vp = new VistaPrincipal();
		}
		
		if(e.getSource()== bMostrar){
			VntProveedor.dispose();
			VistaMostrar vm = new VistaMostrar();
		}
		if(e.getSource() == bSearch){
			//???
		}
	}
	
	


	


	
	
	



	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
