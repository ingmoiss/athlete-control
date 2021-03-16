
package proyecto;

import java.util.Date;


public class Karate extends Atletas{
    private String cinta;

    public Karate(String cinta, String identificacion, String nombreCom, Date fechaNacimieto, int edad, float estatura, float peso, String tipoSangre) {
        super(identificacion, nombreCom, fechaNacimieto, edad, estatura, peso, tipoSangre);
        this.cinta = cinta;
    }

    public String getCinta() {
        return cinta;
    }

    public void setCinta(String cinta) {
        this.cinta = cinta;
    }

    @Override
    public String toString() {
        return "Karate{" + "cinta=" + cinta + '}';
    }
    
}
