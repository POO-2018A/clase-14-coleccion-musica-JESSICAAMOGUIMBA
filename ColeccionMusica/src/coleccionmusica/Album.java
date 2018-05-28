
package coleccionmusica;




public class Album {
    
    public int año;
    public String nombreA;
    Genero []genero;
    public int numeroCanciones;
    
    //CONSTRUCTOR

    public Album() {
    }
    
    
    
    
    //GET Y SET 
    
    public int getAño() {
        return año;
    }

    public void setAño(int año) {
        this.año = año;
    }

    public String getNombreA() {
        return nombreA;
    }

    public void setNombreA(String nombreA) {
        this.nombreA = nombreA;
    }

    public Genero[] getGenero() {
        return genero;
    }

    public void setGenero(Genero[] genero) {
        this.genero = genero;
    }

    public int getNumeroCanciones() {
        return numeroCanciones;
    }

    public void setNumeroCanciones(int numeroCanciones) {
        this.numeroCanciones = numeroCanciones;
    }
    
    
    
    
    
    
    
    
    
    
    
}
