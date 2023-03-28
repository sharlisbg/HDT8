/**
 * Proceso es la clase que modela los procesos que deben ser atendidos por el CPU. Implementa la interfaz Comparable
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class Proceso {

    // atributos
    private String nombre;
    private String nombreusuario;
    private int valornice;
    private int priority;

    // metodos

    /**
     * Proceso es el constructor de la clase
     * @param nombre es el nombre del proceso
     * @param nombreusuario es el nombre del usuario
     * @param valornice es el valor nice correspondiente al usuario
     */
    public  Proceso(String nombre, String nombreusuario, int valornice) {
        // asignamos los valores pasados como parametro
        this.nombre = nombre;
        this.nombreusuario = nombreusuario;
        this.valornice = valornice;
        // usamos el metodo CalcularPriority para asignar este atributo
        this.priority = this.CalcularPriority();
    }

    // set y get nombre
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getNombre() {
        return this.nombre;
    }

    // set y get nombre usuario
    public void setNombreUsuario(String nombreusuario) {
        this.nombreusuario = nombreusuario;
    }

    public String getNombreUsuario() {
        return this.nombreusuario;
    }

    // set y get nice
    public void setValorNice(int valornice) {
        this.valornice = valornice;
    }

    public int getValorNice() {
        return this.valornice;
    }

    public int CalcularPriority() {
        // preguntar esta formula
        return this.valornice + 120;
    }

    // get priority
    public int getPriority() {
        return this.priority;
    }

    public String toString() {
        return "Nombre del proceso:" + nombre + " Nombre del usuario: " + nombreusuario + " Valor nice: " + valornice + " Priority: " + priority;
    }

    /*@Override
    public int compareTo(Proceso o) {
       if (this.priority == o.getPriority()) {
        return 0;
       } else if (this.priority> o.getPriority()){
        return 1;
       } else {
        return -1;
       }
    }*/
}