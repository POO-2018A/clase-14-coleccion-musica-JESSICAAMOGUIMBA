
package coleccionmusica;


import java.util.*;


public class Artista {
    
public String nombre;
public String pais ;
public Date fechaNacimiento;
Album[]albums;   

//CONSTRUCTOR

    public Artista() {
        
        
    }

 

//GET Y SET

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getPais() {
        return pais;
    }

    public void setPais(String pais) {
        this.pais = pais;
    }

    public Date getFechaNacimiento() {
        return fechaNacimiento;
    }

    public void setFechaNacimiento(Date fechaNacimiento) {
        this.fechaNacimiento = fechaNacimiento;
    }

    public Album[] getAlbums() {
        return albums;
    }

    public void setAlbums(Album[] albums) {
        this.albums = albums;
    }
    void VerDatos (){
    
        System.out.println("Nombre del Artista: " + nombre);
        System.out.println("Pais del Artista: " + pais);
        System.out.println("Fecha del Album del Artista: " + fechaNacimiento);
    }

     public static void main(String[] args) {
       /* Artista p = new Artista();
        System.out.println("El nombre de p es: " + p.nombre);
        
        p.nombre = "Carlos";
       
        p.fechaNacimiento = new Date("1986/05/03");
        System.out.println("El nombre de p es: " + p.nombre);
               
        p.setNombre("hi");*/
       
      
    }

    
}
