package Practica4;

/**
 *
 * @author GABRIEL LÓPEZ AGUIRRE 
 * Esta es la clase Prenda
 */
public class Prenda {
    /**Este es el atributo descripcion*/
    private String descripcion;       
    /**Este es el atributo tipo*/
    private String tipo;
    /**Este es el atributo valorComercial*/
    private double valorComercial;
    /**Este es el atributo valorCliente*/
    private double valorCliente;
    /**Este es el atributo fecha*/
    private Fecha fecha;
    /**Este es el atributo dueño*/
    private Cliente dueño;
    
    /**
     * Este es el constructor de la clase Prenda el cual recibe 5 parametros
     * @param descripcion1
     * @param tipo1
     * @param valorComercial
     * @param valorCliente
     * @param fecha1 
     * @param dueño1 
     */
    public Prenda(String descripcion1, String tipo1, double valorComercial, double valorCliente, Fecha fecha1, Cliente dueño1) {
        this.descripcion = descripcion1; 
        this.tipo = tipo1;
        this.valorComercial = valorComercial;
        this.valorCliente = valorCliente;
        this.fecha = fecha1;
        this.dueño = dueño1;
    }
    
    /**
     * Este es el metodo calcularMonto
     * @param valorComercial
     * @return double
     */
    public double calcularMonto(double valorComercial) {
        valorCliente = .6 * valorComercial;        
        return valorCliente;
    }
    
    /**
     * Este es el metodo set de descripcion
     * @return String
     */
    public String getDescripcion() {
        return descripcion;
    }
    
    /**
     * Este es el metodo get de descripcion
     * @param descripcion 
     */
    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    /**
     * Este es el metodo get de tipo
     * @return String
     */
    public String getTipo() {
        return tipo;
    }
    
    /**
     * Este es el metodo set de tipo
     * @param tipo 
     */
    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    /**
     * Este es el metodo get de valorComercial
     * @return double
     */
    public double getValorComercial() {
        return valorComercial;
    }

    /**
     * Este es el metodo set de valorComercial
     * @param valorComercial 
     */
    public void setValorComercial(double valorComercial) {
        this.valorComercial = valorComercial;
    }

    /**
     * Este es el metodo get de valorCliente
     * @return double
     */
    public double getValorCliente() {
        return valorCliente;
    }

    /**
     * Este es el metodo set de valorCCliente
     * @param valorCliente 
     */
    public void setValorCliente(double valorCliente) {
        this.valorCliente = valorCliente;
    }

    /**
     * Este es el metodo get de fecha
     * @return Fecha
     */
    public Fecha getFecha() {
        return fecha;
    }

    /**
     * Este es el metodo set de fecha
     * @param fecha 
     */
    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }       

    /**
     * Este es el metodo get de dueño
     * @return Cliente
     */
    public Cliente getDueño() {
        return dueño;
    }

    /**
     * Este es el metodo set de dueño
     * @param dueño 
     */
    public void setDueño(Cliente dueño) {
        this.dueño = dueño;
    }        

    /**
     * Este es el metodo toString
     * @return String
     */
    @Override
    public String toString() {
        return tipo;
    }        
}
