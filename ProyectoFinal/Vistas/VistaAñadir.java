import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;


public class VistaAñadir implements ActionListener{
	private JFrame VntAñadirP;
	private JButton bSalir,bAñadir;
	private JLabel nombre, empresa, ubicacion, departamento, tlf;
	private JTextField aNombre, aEmpresa, aUbicacion, aDepartamento, aTlf;
	private JPanel panel1,panel2,panel3,panel4,panel5,panel6;
	private GestionProveedores gp;
	
	public VistaAñadir(){
		VntAñadirP = new JFrame();
		VntAñadirP.setTitle("Añadir Proveedor a la Lista");
		VntAñadirP.setSize(265,330);
		VntAñadirP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		VntAñadirP.setLocationRelativeTo(null);
		VntAñadirP.setResizable(false);
		VntAñadirP.setVisible(true);
		botones();
		paneles();
		VntAñadirP.setLayout(new GridLayout(6,1));
		VntAñadirP.add(panel1);
		VntAñadirP.add(panel2);
		VntAñadirP.add(panel3);
		VntAñadirP.add(panel4);
		VntAñadirP.add(panel5);
		VntAñadirP.add(panel6 , BorderLayout.SOUTH);
		acciones();
		gp = new GestionProveedores();
	}
	
	
	

	public void botones(){
		
		//Creamos los botones
		bSalir = new JButton("Salir");
		bAñadir = new JButton("Añadir");
		
		//Etiquetas
		nombre = new JLabel("Nombre: ");
		empresa = new JLabel("Empresa: ");
		ubicacion = new JLabel("Ubicación: ");
		departamento = new JLabel("Departamento: ");
		tlf = new JLabel("Telefono: ");
		
		//Areas de Texto
		aNombre = new JTextField(20);
		aEmpresa = new JTextField(20);
		aUbicacion = new JTextField(20);
		aDepartamento = new JTextField(20);
		aTlf = new JTextField(20);
		
	}
	
	public void paneles(){

	//Creamos los paneles,con GridLayout en la cual los botones se colocan segun columnas y filas
	
	panel1 = new JPanel();
	panel1.setLayout(new FlowLayout());
	panel1.add(nombre);
	panel1.add(aNombre);

	panel2 = new JPanel();
	panel2.setLayout(new FlowLayout());
	panel2.add(empresa);
	panel2.add(aEmpresa);
	
	 panel3 = new JPanel();
	panel3.setLayout(new FlowLayout());
	panel3.add(ubicacion);
	panel3.add(aUbicacion);
	
	panel4 = new JPanel();
	panel4.setLayout(new FlowLayout());
	panel4.add(departamento);
	panel4.add(aDepartamento);
	
	panel5 = new JPanel();
	panel5.setLayout(new FlowLayout());
	panel5.add(tlf);
	panel5.add(aTlf);
	
	panel6 = new JPanel();
	panel6.setLayout(new GridLayout(1,2));
	panel6.add(bAñadir);
	panel6.add(bSalir);
	}
	
	
	//Añadimos los paneles al contenedor y con el BorderLayaout posicionamos ambos paneles.
	
	public void acciones(){
		bSalir.addActionListener(this);
		bAñadir.addActionListener(this);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== bSalir){
			VntAñadirP.dispose();
		}
		if(e.getSource()== bAñadir){
			//VntAñadirP.hide();
			
			Proveedor p = new Proveedor(aNombre.getText(),aEmpresa.getText(),aUbicacion.getText(),aDepartamento.getText(), aTlf.getText());
			gp.add(p);
			gp.guardar();
			VistaProveedor vp = new VistaProveedor();
		}
	}

	
	
	
	
	
	
	
	
	
	
}
