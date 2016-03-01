

import java.io.BufferedWriter;
import java.io.FileWriter;

public class Lista {
	public static final int MAX_VEC = 200;
	private static Entidades[]vec;
	private static int ultPos;
	public static final String filename = "e:\\datos3.txt";
	
	public Lista(){
		vec = new Entidades[MAX_VEC];
		ultPos = 0 ;
	}
	
	public boolean add(Entidades e){
		if(e !=null && ultPos<vec.length){
			vec[ultPos] = e;
			ultPos++;
			return true;
		} else
			return false;
		
	}
	
	public boolean remove(int pos){
		if(pos >= 0 && pos < ultPos){
			for(int i = pos ; i< ultPos -1 ; i++){
				vec[i] = vec[i+1];
			}	
			ultPos = ultPos - 1;
			vec[ultPos] = null;
			return true;
		}else{
			return false;
		}

	}
	
	public Entidades[] search (String bsq){
		Entidades[] resultados = new Entidades[ultPos];
		int cont = 0;
		for(int i = 0; i < ultPos; i++){
			if(vec[i].toString().toLowerCase().contains(bsq.toLowerCase())) {
				resultados[cont] = vec[i]; 
				cont = cont + 1;
			}
		}
		Entidades[] encontrados = new Entidades[cont];
		for (int x = 0; x < cont; x++){
			encontrados[x] = resultados[x];
		}
		return  encontrados;
	}

	public Entidades[] getVec() {
		return vec;
	}

	public void setVec(Entidades[] vec) {
		this.vec = vec;
	}

	public int getUltPos() {
		return ultPos;
	}

	public void setUltPos(int ultPos) {
		this.ultPos = ultPos;
	}
/*	
public static void main (String []args){
	
	Lista l = new Lista();
	Proveedor p = new Proveedor("Antonio","Arjones","Bello","Telde","928702530\n\n");
	Proveedor p2 = new Proveedor("Antonio12","Arjones12","Bello12","Telde12","928702530\n\n");
	l.add(p);
	l.save();
	l.add(p2);
	l.save();
	

}
*/
	public static void save(){
		try{
			FileWriter fw = new FileWriter(filename);
			BufferedWriter bw = new BufferedWriter(fw);
			for(int i = 0; i<ultPos;i++){
				bw.write(vec[i].toString());
				bw.newLine();
			}
			bw.flush();
			bw.close();
			fw.close();
		}catch(Exception ex){
			System.out.println("Error al Guardar");
		}
		
	}
	


}

