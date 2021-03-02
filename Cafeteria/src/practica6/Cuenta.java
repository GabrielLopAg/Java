package practica6;
import java.io.Serializable;

/**
 * clase Cuenta, clase padre de la clase Producto
 */
public abstract class Cuenta implements Serializable {
    /** Atributo de tipo String llamado mesa */
    private String mesa;
    /** Atributo de tipo boolean llamado disponibilidad */
    private boolean disponibilidad;
    /** Atributo de tipo String llamado fecha */
    private String fecha;
    /** Atributo de tipo String llamado hora */
    private String hora;

    public String getMesa() {
        return mesa;
    }

    public void setMesa(String mesa) {
        this.mesa = mesa;
    }

    public String getFecha() {
        return fecha;
    }

    public void setFecha(String fecha) {
        this.fecha = fecha;
    }

    public String getHora() {
        return hora;
    }

    public void setHora(String hora) {
        this.hora = hora;
    }

    public boolean isDisponibilidad() {
        return disponibilidad;
    }
    
    public void setDisponibilidad(boolean disponibilidad) {
        this.disponibilidad = disponibilidad;
    }        
}
