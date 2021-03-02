package practica6;
import java.io.*;
import java.util.ArrayList;

/**
 * Clase café, es heredada de la clase Producto
 */
public class Café extends Producto  {
    /** Atributo de tipo String llamado nombreArchivo */
    private String nombreArchivo;
    /** Atributo de tipo boolean llamado jarabeExtra  */
    private boolean jarabeExtra;
    /** Atributo de tipo doble llamado costoTotal */
    private double costoTotal;
    /** Atributo de tipo entero llamado numShots */
    private int numShots;
    /** Atributo de tipo Tamaño llamado t */
    private Tamaño t;
    /** Atributo de tipo TipoLeche llamado tl */
    private TipoLeche tl;    
    /** Atributo de tipo ArrayList llamado listaCuentas */
    public ArrayList listaCuentas;    
    Café c;

    public Café() {
        nombreArchivo = "Cuentas.dan";
        listaCuentas = new ArrayList();          
    }

    public void imprimirEnArchivo() { 
        File archivo = new File(nombreArchivo);               
        if(archivo.length() == 0) {
            try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
                oos.writeObject(listaCuentas);               
                oos.close();  
            } catch (IOException ex) {
                System.out.println("Error en la localización del archivo");
            }
        }
        else {                      
            try(ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream(nombreArchivo))) {
                oos.writeObject(listaCuentas); 
                oos.close();
            } catch (IOException ex) {
                System.out.println("Error en la localización del archivo");
            }
        }
    }

    public void leerDeArchivo() {      
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream(nombreArchivo))) {                 
            listaCuentas = (ArrayList) ois.readObject();                    
        } catch( Exception e ){ 
            //System.err.println(e);
        }
    }

    public String listarDatos() {
        String txtLeido = "";                          
        txtLeido =  "Fecha: " + getFecha()+ "   Hora: " + getHora() + " \nDescripción: " + getDescripcion() +
                    " \nJarabe extra: " + isJarabeExtra() + " \nNúm. shots: " + getNumShots() +
                    " \nTamaño: " + getT() + "\nTipo de leche: " + getTl() + " \nMesa: " + getMesa() +
                    " \nCosto total: " + getCostoTotal()+"\n\n";
        return txtLeido;        
    }

    public boolean buscarMesa(String mesa) {
        try(ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Cuentas.dan"))) {
            while(true){
                listaCuentas = (ArrayList) ois.readObject();
                for(Object Elementos : listaCuentas) {
                    c = (Café) Elementos;                
                    if(c.getMesa().compareTo(mesa) == 0) {                          
                        return c.isDisponibilidad();
                    }
                }
            }           
        }
        catch( Exception e ){ 
            //System.err.println(e);
        }
        return false;
    }

    public boolean isJarabeExtra() {
        return jarabeExtra;
    }

    public void setJarabeExtra(boolean jarabeExtra) {
        this.jarabeExtra = jarabeExtra;
    }

    public double getCostoTotal() {
        return costoTotal;
    }

    public void setCostoTotal(double costoTotal) {
        this.costoTotal = costoTotal;
    }

    public int getNumShots() {
        return numShots;
    }

    public void setNumShots(int numShots) {
        this.numShots = numShots;
    }

    public Tamaño getT() {
        return t;
    }

    public void setT(Tamaño t) {
        this.t = t;
    }

    public TipoLeche getTl() {
        return tl;
    }

    public void setTl(TipoLeche tl) {
        this.tl = tl;
    }
    
}
