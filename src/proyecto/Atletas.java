
package proyecto;

import java.util.Date;

public class Atletas {
    private String identificacion;
    private String nombreCom;
    private Date fechaNacimieto; 
    private int edad;
    private float estatura;
    private float peso;
    private String tipoSangre;

    public Atletas(String identificacion, String nombreCom, Date fechaNacimieto, int edad, float estatura, float peso, String tipoSangre) {
        this.identificacion = identificacion;
        this.nombreCom = nombreCom;
        this.fechaNacimieto = fechaNacimieto;
        this.edad = edad;
        this.estatura = estatura;
        this.peso = peso;
        this.tipoSangre = tipoSangre;
    }

    public String getIdentificacion() {
        return identificacion;
    }

    public void setIdentificacion(String identificacion) {
        this.identificacion = identificacion;
    }

    public String getNombreCom() {
        return nombreCom;
    }

    public void setNombreCom(String nombreCom) {
        this.nombreCom = nombreCom;
    }

    public Date getFechaNacimieto() {
        return fechaNacimieto;
    }

    public void setFechaNacimieto(Date fechaNacimieto) {
        this.fechaNacimieto = fechaNacimieto;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public float getEstatura() {
        return estatura;
    }

    public void setEstatura(float estatura) {
        this.estatura = estatura;
    }

    public float getPeso() {
        return peso;
    }

    public void setPeso(float peso) {
        this.peso = peso;
    }

    public String getTipoSangre() {
        return tipoSangre;
    }

    public void setTipoSangre(String tipoSangre) {
        this.tipoSangre = tipoSangre;
    }

    @Override
    public String toString() {
        return "Atletas{" + "identificacion=" + identificacion + ", nombreCom=" + nombreCom + ", fechaNacimieto=" + fechaNacimieto + ", edad=" + edad + ", estatura=" + estatura + ", peso=" + peso + ", tipoSangre=" + tipoSangre + '}';
    }    
        
}
