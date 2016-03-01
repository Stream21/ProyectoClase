

public class Articulo extends Entidades {
	private double precio;
	private double peso;
	private String modelo;
	private String marca;
	private	String distribuidor;
	

	public Articulo(String nombre, double precio, double peso, String modelo, String marca, String distribuidor){
		super(nombre);
		this.precio = precio;
		this.peso = peso;
		this.modelo = modelo;
		this.marca = marca;
		this.distribuidor = distribuidor;
	}
	public double getPrecio() {
		return precio;
	}
	public void setPrecio(double precio) {
		this.precio = precio;
	}
	public double getPeso() {
		return peso;
	}
	public void setPeso(double peso) {
		this.peso = peso;
	}
	public String getModelo() {
		return modelo;
	}
	public void setModelo(String modelo) {
		this.modelo = modelo;
	}
	public String getMarca() {
		return marca;
	}
	public void setMarca(String marca) {
		this.marca = marca;
	}
	public String getDistribuidor() {
		return distribuidor;
	}
	public void setDistribuidor(String distribuidor) {
		this.distribuidor = distribuidor;
	}
	
	public String toString(){
		String articulo = getNombre() + " " + getPrecio() + " " + getPeso() + " " +  getModelo() + " " + getMarca() + " " + getDistribuidor(); 
		return articulo;
	}
	
}
