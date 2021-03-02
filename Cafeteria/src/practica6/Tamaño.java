package practica6;

/**
 * Enumeración llamada Tamaño
 */
public enum Tamaño {
    /** costoAdicional del Tamaño Chico, tipo entero */
    CHICO(0),
    /** costoAdicional del tamaño mediano, tipo entero */
    MEDIANO(4),
    /** costoAdicional del tamaño grande, tipo entero */
    GRANDE(8);
    /** tipo entero llamado costoAdicional */
    public final int costoAdicional;
    
    /**
     * Constructor de la clase Tamaño
     * @param costoAdicional1 
     */
    private Tamaño(int costoAdicional1) {
        this.costoAdicional = costoAdicional1;
    }
}
