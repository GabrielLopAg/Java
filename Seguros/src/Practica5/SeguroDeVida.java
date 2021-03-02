
package Practica5;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;

/**
 * @author Gabriel
 * Esta es la clase hija SeguroDeVida
 */
public class SeguroDeVida extends Seguro {
    /**Este es el atributo NombreAsegurado de tipo String*/
    private String NombreAsegurado;
    /**Este es el atributo Nombre_Archivo de tipo String*/
    private String Nombre_Archivo;
    /**Este es el atributo Edad de tipo int*/
    private int Edad;        
    /**Este es el atributo listaSeguroV de tipo Arraylist*/
    public ArrayList listaSeguroV;
    
    /**Este es el constructor de la clase SeguroDeVida*/
    public SeguroDeVida() {
        Nombre_Archivo = "SeguroVida.dan";
        listaSeguroV = new ArrayList();        
    }
    
    /**
     * Este es el metodo calcularPagoMensual que se reenscribe
     * @return double
     */
    @Override    
    public double calcularPagoMensual() {
        double pago;
        if(Edad >= 60) {
            pago = super.getMontoAsegurado() * .2;
        }
        else {
            pago = super.getMontoAsegurado() * .005;
        }                
        return pago;
    }
    
    /**Este es el metodo que se encarga de guardas los datos en un archivo binario*/
    public void imprimirEnArchivo() { 
        File archivo = new File(Nombre_Archivo);        
        FileOutputStream fos;
        ObjectOutputStream oos;        
        if(archivo.length() == 0) {
            try {
                fos = new FileOutputStream(archivo);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(listaSeguroV); // listaSeguroV es el ArrayList                
                oos.close();
            } catch (IOException ex) {
                System.out.println("Error en la localización del archivo");
            }
        }
        else {                      
            try {
                fos = new FileOutputStream(archivo);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(listaSeguroV); 
                oos.close();
            } catch (IOException ex) {
                System.out.println("Error en la localización del archivo");
            }
        }
    }

    /**Este es el metodo que se encarga de transformar los bytes del archivo en un objeto*/     
    public void leerDeArchivo() {
        FileInputStream fis;
        ObjectInputStream ois;
        listaSeguroV = new ArrayList();
        try {            
            fis = new FileInputStream(Nombre_Archivo);
            ois = new ObjectInputStream(fis);
            listaSeguroV = (ArrayList<Seguro>) ois.readObject();            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no existe");
        } catch (IOException ex) {
            System.out.println("Error en la manipulación de archivos");            
        } catch (ClassNotFoundException ex) {
            
        }        
    }

    /**Este metodo se encarga de mostrar todos los seguros*/     
    public void ListarDatos() {   
        SeguroDeVida segurodevida;
        for(Object Elemento : listaSeguroV) {
            segurodevida = new SeguroDeVida();
            segurodevida = (SeguroDeVida) Elemento;
            JOptionPane.showMessageDialog(null, "Nombre: " +  segurodevida.getNombreAsegurado() + "\nEdad: "
                + segurodevida.getEdad() + "\nCovertura: " + segurodevida.getTipoCovertura() + "\nMonto asegurado: " +
                    segurodevida.getMontoAsegurado() + "\nPago mensual: " + segurodevida.getMontoPagoMensual());                        
        }

    }            

    /**
     * Este es el metodo get del atributo NombreAsegurado
     * @return String
     */
    public String getNombreAsegurado() {
        return NombreAsegurado;
    }

    /**
     * Este es el metodo set del atributo NombreAsegurado
     * @param Nombre 
     */
    public void setNombreAsegurado(String Nombre) {
        this.NombreAsegurado = Nombre;
    }

    /**
     * Este es el metodo get del atributo Edad
     * @return int
     */
    public int getEdad() {
        return Edad;
    }

    /**
     * Este es el metodo set del atributo Edad
     * @param Edad 
     */
    public void setEdad(int Edad) {
        this.Edad = Edad;
    }          
}    