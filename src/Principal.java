import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.PriorityQueue;

/**
 * Principal es la clase que interactua con el usuario. Tiene el metodo main
 * @author Leonel Contreras 18797
 * @version 1.0
 */
public class Principal {
    public static void main(String[] args) {
        //Creamos un objeto de tipo PriorityQueue
        PriorityQueue<Proceso> priorityqueue = new PriorityQueue<Proceso>(new ProcesoComparator());
        ArrayList<String> lectura = new ArrayList<String>();


        try {
            BufferedReader reader = new BufferedReader(new FileReader("procesos.txt"));
            String line;
            while ((line = reader.readLine())!= null) {
                lectura.add(line);
            }
            reader.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        for (String string : lectura) {
            System.out.println(string);
        }

        
    }
}
