import java.io.BufferedReader;
import java.io.FileReader;
import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.PriorityQueue;
import java.util.Queue;
import java.util.Scanner;

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

        // Creamos un objeto de tipo HeapUsingIterativeBinaryTree
        HeapUsingIterativeBinaryTree<Integer, Proceso> heap = new HeapUsingIterativeBinaryTree<Integer, Proceso>(new ComparadorPrioridades<Integer>());

        // leemos el documento procesos.txt
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

        // creamos los objetos Proceso para agregarlos al priorityqueue
        // recorremos cada string en la lista de procesos
        for (String string : lectura) {
            // separamos los datos por coma
            String[] datos = string.split(",");
            // asignamos los valores que vamos a pasar como parametros al constructor de la clase proceso
            String nombreproceso = datos[0];
            String nombreusuario = datos[1];
            int valornice = Integer.parseInt(datos[2]);
            // creamos una instancia de la clase proceso 
            Proceso proceso = new Proceso(nombreproceso, nombreusuario, valornice);
            // agregamos la instancia de proceso al priority queue
            priorityqueue.add(proceso);
        }

        //agregamos la pareja prioridad, valor al heap
        // recorremos cada string de la lista de procesos
        
        for (String string : lectura) {
            //System.out.println(string);
            String[] datos = string.split(",");
            String nombreproceso = datos[0];
            String nombreusuario = datos[1];
            int valornice = Integer.parseInt(datos[2]);
            Proceso proceso = new Proceso(nombreproceso, nombreusuario, valornice);
            int prioridad = proceso.getPriority();
            heap.Insert(prioridad, proceso);

        }

        Scanner numero = new Scanner(System.in);

        System.out.println("Ingrese la opcion que desea implementar para ver los procesos que seran atendidos por el CPU");
        System.out.println("1. Priority Queue del Java Collection");
        System.out.println("2. Heap using Iterative Binary Tree");
        int opcionimplementar = numero.nextInt();
        numero.nextLine();    

        while(opcionimplementar < 3){
            switch (opcionimplementar){
                case 1:{
                    System.out.println("El CPU atendera los procesos en el siguiente orden:");
                    while (!priorityqueue.isEmpty()) {
                        System.out.println(priorityqueue.poll().toString());
                    }
                    break;
                } 
                
                case 2:{
                    List<Proceso> procesos = heap.getElements();
                    // Imprimir los elementos removidos del heap
                    for (Proceso proceso : procesos) {
                        System.out.println(proceso.toString());
                    }
                   /* while (!heap.isEmpty()) {
                        System.out.println(heap.remove().toString()); 
                    }
                    break;*/
                }
            }
            System.out.println("Ingrese la opcion que desea implementar para ver los procesos que seran atendidos por el CPU");
            System.out.println("1. Priority Queue del Java Collection");
            System.out.println("2. Heap using Iterative Binary Tree");
            opcionimplementar = numero.nextInt();
            numero.nextLine();        
        }
    }
}
