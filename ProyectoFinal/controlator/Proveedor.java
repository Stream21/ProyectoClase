

public class Proveedor extends Entidades {

	private String empresa;
	private String ubicacion;
	private String dpt;
	private String tlf;
	

	
	public Proveedor(String nombre, String empresa, String ubicacion, String dpt, String tlf){
		super(nombre);
		this.empresa = empresa;
		this.ubicacion = ubicacion;
		this.dpt = dpt;
		this.tlf = tlf;
	}

	public  String getEmpresa() {
		return empresa;
	}
	public void setEmpresa(String empresa) {
		this.empresa = empresa;
	}
	public String getUbicacion() {
		return ubicacion;
	}
	public void setUbicacion(String ubicacion) {
		this.ubicacion = ubicacion;
	}
	public String getDpt() {
		return dpt;
	}
	public void setDpt(String dpt) {
		this.dpt = dpt;
	}
	public String getTlf() {
		return tlf;
	}
	public void setTlf(String tlf) {
		this.tlf = tlf;
	}

	public String toString(){
		String proveedor = getNombre() + "\r\n" + getEmpresa() + "\r\n" + getUbicacion() + "\r\n" +  getDpt() + "\r\n" + getTlf()+ "\r\n"; 
		return proveedor;
	}
}



