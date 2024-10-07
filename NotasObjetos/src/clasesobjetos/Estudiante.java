package clasesobjetos;

public class Estudiante {
    String nombre;
    float notaParcial, notaParcial12, notaFinal;

    public Estudiante(String nombre) {
        this.nombre = nombre;
    }

    public Estudiante(String nombre, float np1, float np2){
        this.nombre = nombre;
        this.notaParcial = np1;
        this.notaParcial2 = np2;

    }

    public void asignarNotaParcial1(float np1) {
        this.notaParcial = np1;
    }

    

    public void calcularNotaFinal() {
        notaFinal = (notaParcial + notaParcial2) / 2;
    }

    public float obtenerNotaFinal() {
        return notaFinal;
    }

    public String obtnerMensaje() {
        if(notaFinal <= 3) {
            return "Reprobo";
            
        } else {
            return "Aprobo";
        }
    }

}
