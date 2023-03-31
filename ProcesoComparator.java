import java.util.Comparator;

/**
 * ProcesoComparator es la clase que compara objetos de tipo proceso. Implementa la interfaz Comparatos
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class ProcesoComparator implements Comparator<Proceso> {

    @Override
    public int compare(Proceso o1, Proceso o2) {
        if (o1.getPriority() == o2.getPriority()) {
            return 0;
        } else if(o1.getPriority() > o2.getPriority()){
            return 1;
        } else {
            return -1;
        }
    }
}
