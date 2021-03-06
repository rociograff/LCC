package Lineales.Dinamicas;

public class Nodo {
    
    private Object elem;
    private Nodo enlace;
    
    //Constructor
    public Nodo(Object elem, Nodo enlace) {
        this.elem = elem;
        this.enlace = enlace;
    }
    
    public Nodo(){
        this.elem = null;
        this.enlace = null;
    }
    
    //Modificadoras
    public void setElem(Object elem) {
        this.elem = elem;
    }
    
    public void setEnlace(Nodo enlace) {
        this.enlace = enlace;
    }
    
    //Observadoras
    public Object getElem() {
        return this.elem;
    }
    
    public Nodo getEnlace() {
        return this.enlace;
    }
}
