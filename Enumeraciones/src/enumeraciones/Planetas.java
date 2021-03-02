
package enumeraciones;

/**
 * @author GABRIEL LÓPEZ AGUIRRE
 * Esta es la clase especial Planetas
 */
public enum Planetas{
    /**Este es el elemento MERCURIO que tiene dos parametros*/
    MERCURIO("3.303e+23","2.4397e6"),
    /**Este es el elemento VENUS que tiene dos parametros*/
    VENUS("4.869e+24","6.0518e6"),
    /**Este es el elemento TIERRA que tiene dos parametros*/
    TIERRA("5.976e+24","6.37814e6"),
    /**Este es el elemento MARTE que tiene dos parametros*/
    MARTE("6.421e+23","3.3972e6"),
    /**Este es el elemento JUPITER que tiene dos parametros*/
    JUPITER("1.9e+27","7.1492e7"),
    /**Este es el elemento SATURNO que tiene dos parametros*/
    SATURNO("5.688e+26","6.0268e7"),
    /**Este es el elemento URANO que tiene dos parametros*/
    URANO("8.686e+25","2.5559e7"),
    /**Este es el elemento NEPTUNO que tiene dos parametros*/
    NEPTUNO("1.024e+24","2.4746e7"),
    /**Este es el elemento PLUTON que tiene dos parametros*/
    PLUTON("1.27e+22","1.137e6");
    /**Este es el atributo masa de tipo String*/
    public final String masa;
    /**Este es el atributo radio de tipo String*/
    public final String radio;
    
    /**
     * Este es el consructor privado que tiene dos parametros
     */
    private Planetas(String masa1, String radio1){
        this.masa = masa1;
        this.radio = radio1;
    }
    
    /**
     * Este es el metodo calcularPeso
     * @param cajaDeTexto
     * @return peso
     */
    public double calcularPeso(double cajaDeTexto){        
        double G = 6.67300*(Math.pow(10, -11));
        double radioM = 2.4397*(Math.pow(10,6));
        double masaM = 3.303*(Math.pow(10,23)); 
        double g = (G*masaM/Math.pow(radioM,2));
        double peso = cajaDeTexto * g;
        
        return peso;
    }
                        
}
    
    
