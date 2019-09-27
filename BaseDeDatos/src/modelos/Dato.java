
package modelos;

public class Dato {
    
	private String id;
	private Object dato;

    public Dato() {
    }
        
        public Dato(String id, Object dato) {
		this.id = id;
		this.dato = dato;
	}
		
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public Object getDato() {
		return dato;
	}
	public void setDato(Object dato) {
		this.dato = dato;
	}
	public String toString() {
		return "Dato [id=" + id + ", data=" + dato + "]";	}	
}
