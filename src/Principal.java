import java.util.PriorityQueue;

/**
 * Principal es la clase que interactua con el usuario. Tiene el metodo main
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class Principal {
    public static void main(String[] args) {
        PriorityQueue<Proceso> priorityqueue = new PriorityQueue<Proceso>(new ProcesoComparator());

        Proceso proceso1 = new Proceso("proceso1", "Sharis", 1);
        Proceso proceso2 = new Proceso("proceso2", "Leonel", 2);

        priorityqueue.add(proceso2);
        priorityqueue.add(proceso1);

        while (!priorityqueue.isEmpty()) {
            System.out.println(priorityqueue.poll().getPriority());
        }
    }
}
