
package practica6;
/**
 * Clase llamada Producto, es heredada de la clase Cuenta
 * y es clase padre de la clase Café
 */
public abstract class Producto extends Cuenta  {
    /** Atributo tipo String llamado descripcion */
    private String descripcion;
    /** Atributo tipo doble llamdo costoBase */
    private double costoBase;

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }

    public double getCostoBase() {
        return costoBase;
    }

    public void setCostoBase(double costoBase) {
        this.costoBase = costoBase;
    }
}
