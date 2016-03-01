

public class GestionProveedores {
	
	private Lista l;
	
	public GestionProveedores(){
		l = new Lista();
	}
	
	public Lista getL() {
		return l;
	}


	public void setL(Lista l) {
		this.l = l;
	}

	public boolean add(Proveedor p){
		return  l.add(p);
	}
	
	public boolean remove(int posEliminar ){
		return l.remove(posEliminar);
		
	}
	public void mostrar(){
	
	}
	public Entidades [] buscar (String bsq){
		return l.search(bsq);
	}
	public void guardar(){
		l.save();
	}
	
	
	
	
	
	
}
