package Practica5;
import java.awt.Color;
import java.io.*;
import java.util.ArrayList;
import javax.swing.JOptionPane;
/**
 * @author Gabriel
 * Esta es la clase hija SeguroDeAuto
 */
public class SeguroDeAuto extends Seguro {
    /**Este es el atributo placa de tipo String*/
    private String placa;
    /**Este es el atributo marca de tipo String*/
    private String marca;
    /**Este es el atributo nombreArchivo de tipo String*/
    private String nombreArchivo;
    /**Este es el atributo modelo de tipo int*/
    private int modelo;
    /**Este es el atributo color de tipo Color*/
    private Color color;
    /**Este es el atributo listaSeguroAuto de tipo ArrayList*/
    public ArrayList listaSeguroAuto;

    /**Este es el constructor de la clase SeguroDeAuto*/
    public SeguroDeAuto() {
        nombreArchivo = "SeguroAuto.dan";
        listaSeguroAuto = new ArrayList();
    }

    /**
     * Este es el metodo calcularPagoMensual el cual se reenscribe
     * @return double
     */
    @Override
    public double calcularPagoMensual() {
        double pago;
        if(this.getModelo() < 2004) {
            pago = (super.getMontoAsegurado() * .03) / 12;
        }
        else {
            pago = (super.getMontoAsegurado() * .04) / 12;
        }        
        return pago;
    }
    
    /**Este metodo se encarga de guardar los datos en un archivo binario*/
    public void imprimirEnArchivo() {
        File archivo = new File(nombreArchivo);
        FileOutputStream fos;
        ObjectOutputStream oos;
        if(archivo.length() == 0) {
            try {
                fos = new FileOutputStream(archivo);                
                oos = new ObjectOutputStream(fos);
                oos.writeObject(listaSeguroAuto);
                oos.close();
            } catch (IOException e) {
            
            }
        }
        else {
            try {
                fos = new FileOutputStream(archivo);
                oos = new ObjectOutputStream(fos);
                oos.writeObject(listaSeguroAuto); 
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
        try {
            fis = new FileInputStream(nombreArchivo);
            ois = new ObjectInputStream(fis);
            listaSeguroAuto = (ArrayList<Seguro>) ois.readObject();            
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no existe");
        } catch (IOException ex) {
            System.out.println("Error en la manipulación de archivos");            
        } catch (ClassNotFoundException ex) {
            
        }        
    }
    
    /**Este metodo se encarga de mostrar todos los seguros*/
    public void listarDatos() {
        SeguroDeAuto seguroDeAuto;
        for(Object Elementos : listaSeguroAuto) {                   
            seguroDeAuto = new SeguroDeAuto();
            seguroDeAuto = (SeguroDeAuto) Elementos;
            JOptionPane.showMessageDialog(null, "Marca: " + seguroDeAuto.getMarca() + "\nModelo: " + seguroDeAuto.getModelo() +
                "\nPlaca: " + seguroDeAuto.getPlaca() + "\nColor: " + seguroDeAuto.getColor() + "\nCovertura: " + seguroDeAuto.getTipoCovertura() +
                "\nMonto Asegurado: " + seguroDeAuto.getMontoAsegurado() + "\nPago Mensual: " + seguroDeAuto.getMontoPagoMensual());
            }        
    }

    /**
     * Este es el metodo get del atributo placa
     * @return String
     */
    public String getPlaca() {
        return placa;
    }

    /**
     * Este es el metodo set del atributo placa
     * @param placa 
     */
    public void setPlaca(String placa) {
        this.placa = placa;
    }

    /**
     * Este es el metodo get del atributo marca
     * @return String
     */
    public String getMarca() {
        return marca;
    }

    /**
     * Este es el metodo set del atributo marca
     * @param marca 
     */
    public void setMarca(String marca) {
        this.marca = marca;
    }

    /**
     * Este es el metodo get del atributo modelo
     * @return 
     */
    public int getModelo() {
        return modelo;
    }

    /**
     * Este es el metodo set del atributo modelo
     * @param modelo 
     */
    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

    /**
     * Este es el metodo get del atributo color
     * @return Color
     */
    public Color getColor() {
        return color;
    }

    /**
     * Este es el metodo set del atributo color
     * @param color 
     */
    public void setColor(Color color) {
        this.color = color;
    }
        
}
