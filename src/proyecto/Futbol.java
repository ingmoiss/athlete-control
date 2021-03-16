
package proyecto;

import java.util.Date;

public class Futbol extends Atletas {
    
    private String pieDominante;
    private String posicion;

    public Futbol(String pieDominante, String posicion, String identificacion, String nombreCom, Date fechaNacimieto, int edad, float estatura, float peso, String tipoSangre) {
        super(identificacion, nombreCom, fechaNacimieto, edad, estatura, peso, tipoSangre);
        this.pieDominante = pieDominante;
        this.posicion = posicion;
    }

    public String getPieDominante() {
        return pieDominante;
    }

    public void setPieDominante(String pieDominante) {
        this.pieDominante = pieDominante;
    }

    public String getPosicion() {
        return posicion;
    }

    public void setPosicion(String posicion) {
        this.posicion = posicion;
    }

    @Override
    public String toString() {
        return "Futbol{" + "pieDominante=" + pieDominante + ", posicion=" + posicion + '}';
    }
    
    
}
