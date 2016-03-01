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


public class VistaA�adir implements ActionListener{
	private JFrame VntA�adirP;
	private JButton bSalir,bA�adir;
	private JLabel nombre, empresa, ubicacion, departamento, tlf;
	private JTextField aNombre, aEmpresa, aUbicacion, aDepartamento, aTlf;
	private JPanel panel1,panel2,panel3,panel4,panel5,panel6;
	private GestionProveedores gp;
	
	public VistaA�adir(){
		VntA�adirP = new JFrame();
		VntA�adirP.setTitle("A�adir Proveedor a la Lista");
		VntA�adirP.setSize(265,330);
		VntA�adirP.setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		VntA�adirP.setLocationRelativeTo(null);
		VntA�adirP.setResizable(false);
		VntA�adirP.setVisible(true);
		botones();
		paneles();
		VntA�adirP.setLayout(new GridLayout(6,1));
		VntA�adirP.add(panel1);
		VntA�adirP.add(panel2);
		VntA�adirP.add(panel3);
		VntA�adirP.add(panel4);
		VntA�adirP.add(panel5);
		VntA�adirP.add(panel6 , BorderLayout.SOUTH);
		acciones();
		gp = new GestionProveedores();
	}
	
	
	

	public void botones(){
		
		//Creamos los botones
		bSalir = new JButton("Salir");
		bA�adir = new JButton("A�adir");
		
		//Etiquetas
		nombre = new JLabel("Nombre: ");
		empresa = new JLabel("Empresa: ");
		ubicacion = new JLabel("Ubicaci�n: ");
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
	panel6.add(bA�adir);
	panel6.add(bSalir);
	}
	
	
	//A�adimos los paneles al contenedor y con el BorderLayaout posicionamos ambos paneles.
	
	public void acciones(){
		bSalir.addActionListener(this);
		bA�adir.addActionListener(this);
	}




	@Override
	public void actionPerformed(ActionEvent e) {
		if(e.getSource()== bSalir){
			VntA�adirP.dispose();
		}
		if(e.getSource()== bA�adir){
			//VntA�adirP.hide();
			
			Proveedor p = new Proveedor(aNombre.getText(),aEmpresa.getText(),aUbicacion.getText(),aDepartamento.getText(), aTlf.getText());
			gp.add(p);
			gp.guardar();
			VistaProveedor vp = new VistaProveedor();
		}
	}

	
	
	
	
	
	
	
	
	
	
}
