package Practica4;

import java.time.chrono.ChronoLocalDate;
import java.time.chrono.ChronoPeriod;
import java.time.format.DateTimeFormatter;
import static java.time.temporal.ChronoUnit.DAYS;
import static java.time.temporal.ChronoUnit.MONTHS;
import javax.swing.JOptionPane;
/**
 *
 * @author GABRIEL LÓPEZ AGUIRRE 
 * Esta es la clase Fecha
 */
public class Fecha {      
    /**Este es el atributo fechaI*/
    private String fechaI;
    
    /**
     * Este es el constructor de la clase Fecha
     * @param fechaInicial 
     */
    public Fecha(String fechaInicial) {
        this.fechaI = fechaInicial;
    }
    
    /**
     * Este es el metodo calcularTasaDeInteres
     * @param VComercial
     * @param VCliente
     * @param fechaI
     * @return double
     */
    public double calcularTasaDeInteres(double VComercial, double VCliente, String fechaI){        
        double TDI = 0;
        long dias;
        String fechaF;
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        ChronoLocalDate FInicio = ChronoLocalDate.from(formatter.parse(fechaI));
        fechaF = JOptionPane.showInputDialog(null, "Ingrese la fecha de salida: (dd/mm/aaaa)");
        ChronoLocalDate FFinal = ChronoLocalDate.from(formatter.parse(fechaF));
        ChronoPeriod periodo = ChronoPeriod.between(FInicio, FFinal); 
        dias = periodo.multipliedBy(30).get(MONTHS) + periodo.get(DAYS);        
                
        if(dias <= 30) {
            double VCliente1 = VCliente * .2; 
            VCliente1 = VCliente + VCliente1; 
            TDI = VCliente1;
        }                     
        else {            
            dias = dias - 30;
            double VCliente1 = VCliente * .2; 
            VCliente1 = VCliente + VCliente1;                     
            TDI = VCliente1 * (Math.pow(1.03,dias) - 1);               
            TDI = VCliente1 + TDI;                        
        }        
        return TDI;
    }

    /**
     * Este es el metodo toString
     * @return String
     */
    @Override
    public String toString() {
        return fechaI;
    }

    /**
     * Este es el metodo get de fechaI
     * @return String
     */
    public String getFechaI() {
        return fechaI;
    }

    /**
     * Este es el metodo set de fechaI
     * @param fechaI 
     */
    public void setFechaI(String fechaI) {
        this.fechaI = fechaI;
    }        
}

