package Practica5;
import java.io.Serializable;
/**
 * @author Gabriel
 * Esta es la clase Padre Seguro
 */
public abstract class Seguro implements Serializable {          
    /**Este es el atributo tipoCovertura de tipo String*/
    private String tipoCovertura;
    /**Este es el atributo montoAsegurado de tipo double*/
    private double montoAsegurado; 
    /**Este es el atributo montoPagoMensual de tipo double*/
    private double montoPagoMensual;
    /**Este es el metodo abstracto calcularPagoMensual*/
    public abstract double calcularPagoMensual();

    /**
     * Este es el metodo get del atributo tipoCovertura
     * @return String
     */
    public String getTipoCovertura() {
        return tipoCovertura;
    }

    /**
     * Este es el metodo set del atributo tipoCovertura
     * @param tipoCovertura 
     */
    public void setTipoCovertura(String tipoCovertura) {
        this.tipoCovertura = tipoCovertura;
    }

    /**
     * Este es el metodo get del atributo montoAsegurado
     * @return double
     */
    public double getMontoAsegurado() {
        return montoAsegurado;
    }

    /**
     * Este es el metodo set del atributo montoAsegurado
     * @param montoAsegurado 
     */
    public void setMontoAsegurado(double montoAsegurado) {
        this.montoAsegurado = montoAsegurado;
    }

    /**
     * Este es el metodo get del atributo montoPagoMensual
     * @return double
     */
    public double getMontoPagoMensual() {
        return montoPagoMensual;
    }

    /**
     * Este es el metodo set del atributo montoPagoMensual
     * @param montoPagoMensual 
     */
    public void setMontoPagoMensual(double montoPagoMensual) {
        this.montoPagoMensual = montoPagoMensual;
    }       

}
