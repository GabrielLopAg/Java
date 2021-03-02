package Practica4;

/**
 *
 * @author GABRIEL LÓPEZ AGUIRRE 
 * Esta es la clase Cliente
 */
public class Cliente {
    /**Este es el atributo nombre*/
    private String nombre;
    /**Este es el atributo telefono*/
    private int telefono;
    /**Este es el atributo saldo*/
    private double saldo;
    
    /**
     * Este es el constructor de la clase Cliente
     * @param nombre1
     * @param telefono1 
     */
    public Cliente(String nombre1, int telefono1) {
        this.nombre = nombre1;
        this.telefono = telefono1;
        this.saldo = 10;
    }

    /**
     * Este es el metodo get de nombre
     * @return String
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * Este es el metodo set de nombre
     * @param nombre 
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * Este es el metodo get de telefono
     * @return int
     */
    public int getTelefono() {
        return telefono;
    }

    /**
     * Este es el metodo set de telefono
     * @param telefono 
     */
    public void setTelefono(int telefono) {
        this.telefono = telefono;
    }

    /**
     * Este es el metodo get de saldo
     * @return double
     */
    public double getSaldo() {
        return saldo;
    }

    /**
     * Este es el metodo set de saldo
     * @param saldo 
     */
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    /**
     * Este es el metodo toString
     * @return String
     */
    @Override
    public String toString() {
        return nombre;
    }        
}