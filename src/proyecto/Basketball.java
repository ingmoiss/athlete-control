
package proyecto;

import java.util.Date;

public class Basketball extends Atletas{
    private double promedio;

    public Basketball(double promedio, String identificacion, String nombreCom, Date fechaNacimieto, int edad, float estatura, float peso, String tipoSangre) {
        super(identificacion, nombreCom, fechaNacimieto, edad, estatura, peso, tipoSangre);
        this.promedio = promedio;
    }

    public double getPromedio() {
        return promedio;
    }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    @Override
    public String toString() {
        return "Basketball{" + "promedio=" + promedio + '}';
    }
    
    
}
