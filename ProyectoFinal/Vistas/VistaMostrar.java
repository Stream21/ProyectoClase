import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class VistaMostrar implements ActionListener {
	
	private JFrame VntMostrar;
	private JButton bAtras,bSalir;
	private JLabel titulo;
	private JPanel panelSuperior, panelInferior, panelCentral;
	private Proveedor p;
	
	
	
	
	
	
	public VistaMostrar(){
		
		VntMostrar = new JFrame();
		VntMostrar.setTitle("Ventana de Proveedores");
		VntMostrar.setSize(800, 600);
		VntMostrar.setResizable(true);
		VntMostrar.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		VntMostrar.setLocationRelativeTo(null);
		botones();
		frames();
		VntMostrar.add(panelSuperior, BorderLayout.NORTH);
		VntMostrar.add(panelInferior, BorderLayout.SOUTH);
		VntMostrar.add(panelCentral, BorderLayout.CENTER);
		VntMostrar.setVisible(true);
		enlace();
	
	}
	
	

	public void botones(){
		
		bAtras = new JButton ("ATRAS");
		bSalir = new JButton("SALIR");
		titulo = new JLabel("PROVEEDORES");
		titulo.setFont(new java.awt.Font("Tahoma", 0, 36)); 
		titulo.setHorizontalAlignment(JLabel.CENTER);
	}
	
	public void frames(){
		
		//Creamos los paneles y asignamos los botones a cada uno de ellos.
		//Primer Panel
		panelSuperior = new JPanel();
		panelSuperior.setLayout(new GridLayout(0,1));
		panelSuperior.add(titulo);
	
		
		//Segundo panel
		panelInferior = new JPanel();
		panelInferior.setLayout(new GridLayout(0,2));
		panelInferior.add(bAtras);
		panelInferior.add(bSalir);
		
		//Tercer panel
		panelCentral = new JPanel();
		panelCentral.setLayout(new GridLayout(20,5));
		panelCentral.add(new JLabel("Nombre"));
		panelCentral.add(new JLabel("Empresa"));
		panelCentral.add(new JLabel("Departamento"));
		panelCentral.add(new JLabel("Ubicacion"));
		panelCentral.add(new JLabel("Telefono"));
		for(int i = 1;i<=95; i++){
			panelCentral.add(new JTextField (20));
		}
	}
	
	public void enlace(){
		bAtras.addActionListener(this);
		bSalir.addActionListener(this);
	}
	

	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource() == bSalir){
			VntMostrar.dispose();
		}
		
		if(e.getSource() == bAtras){
			VntMostrar.dispose();
			VistaProveedor pv = new VistaProveedor();
		}
	}
		

	
	
	
	
	
	
	
	
	
	
	
}
