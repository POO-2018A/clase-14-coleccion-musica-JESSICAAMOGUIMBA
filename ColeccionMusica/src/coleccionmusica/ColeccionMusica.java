
package coleccionmusica;


import java.util.*;

public class ColeccionMusica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
    //VARIABLES DE ARTISTA
    String nombre;
    String pais ;
    Date fechaNacimiento;
    //VARIABLE DE ALBUM
    int año;
    String nombreA;
    Genero []genero;
    int numeroCanciones;

          
       Scanner scan= new Scanner (System.in);
        int opc = 0 ;
        
        System.out.println("\t\t COLECCIÓN DE MÚSICA");
        System.out.println("1 INGRESE DATOS DEL ARTISTA");
        System.out.println("2 INGRESO DE DATOS DEL ALBUM");
        System.out.println("3 GENERO DE MÚSICA");
        System.out.println("4 SALIR ");
        System.out.println("SELECCIONE UNA OPCIÓN");
        opc = scan.nextInt();

        
         switch (opc){
             case 1:
                               
            System.out.println(" DATOS  DEL ARTISTA\n ");
           
            Scanner listaArtistas = new Scanner (System.in);
            Artista []nombres =  new Artista [3];    
            for (int i = 0; i < nombres.length; i++) {System.out.println("Ingrese el nombre del artista");
            nombre =listaArtistas.nextLine();
            
            }
            System.out.println("");
            
            System.out.println("PAIS DE ORIGEN DEL ARTISTA\n");
            Scanner listaPais = new Scanner (System.in);
            Artista [] paises = new Artista[3];
            for (int j = 0; j < paises.length; j++) {
                  System.out.println("Ingrese el nombre del pais del artista");
                  pais =listaPais.next();
            }
            System.out.println("");
            
            System.out.println("FECHA DEL ALBUM DEL ARTISTA\n");
            Scanner listaFecha = new Scanner (System.in);
            Artista [] fechas = new Artista[3];
            for (int j = 0; j < fechas.length; j++) {
                System.out.println("Ingrese la fecha de creacion del album: ");
                
            }
            
                 
           /* int dia, mes, anio;
            Calendar hoy = Calendar.getInstance();
            dia = hoy.get(Calendar.DATE);
            mes = hoy.get(Calendar.MONTH);
            anio = hoy.get(Calendar.YEAR);
                 System.out.println(dia+" "+mes+1 +" "+anio);*/
                 
              
                 
                 break;
                 
             case 2:
                 System.out.println(" DATOS  DEL ALBUM ");
                 break;
                 
                 
             case 3:
                 System.out.println(" GENERO MÚSICA ");
                 break;
             case 4 :
                 System.out.println("SALIR, GRACIAS");
                 break;
                 
             default:
                 System.out.println("ERROR ");
                 break;
         }
         
        //System.out.println(" PRESIONE ENTER PARA VOLVER AL MENÚ");
        scan.nextLine();
     
        
    }
        
}   
                 
                 
                 
                 
        
      
    

