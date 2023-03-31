import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.PriorityQueue;
import java.util.Vector;

import org.junit.Test;

import java.lang.Exception;

/**
 * @author Sharis Barrios
 *
 */

public class Pruebas {

    @Test
	// Pruebas para validación del orden correcto de la prioridad
	public void PruebasDePrioridad() {
		HeapUsingIterativeBinaryTree<Integer, String> Vheap = new HeapUsingIterativeBinaryTree<Integer, String>((new ComparadorPrioridades<Integer>()));
		Vheap.Insert(20, "veinte");
		Vheap.Insert(10, "diez");
		Vheap.Insert(15, "quince");
		Vheap.Insert(5, "cinco");
		Vheap.Insert(10, "diez");

		
		assertEquals("cinco", Vheap.remove());
		assertEquals("diez", Vheap.remove());
		assertEquals("diez", Vheap.remove());
		assertEquals("quince", Vheap.remove());
		assertEquals("veinte", Vheap.remove());
		
	}

	@Test
	// Pruebas con utilizando PriorityQue del Java Collection Framework
	public void PruebasPriority(){
		PriorityQueue<Proceso> priorityqueue = new PriorityQueue<Proceso>(new ProcesoComparator());
		Proceso num1 = new Proceso("AAA", "juan", 5);
		Proceso num2 = new Proceso("BBB", "pedro", 0);
		Proceso num3 = new Proceso("CCC", "luis", -20);
		priorityqueue.add(num1);
		priorityqueue.add(num2);
		priorityqueue.add(num3);
		
		assertEquals("CCC", priorityqueue.remove().getNombre());
		assertEquals("BBB", priorityqueue.remove().getNombre());
		assertEquals("AAA", priorityqueue.remove().getNombre());
		
	}

	@Test
	// Pruebas con utilizando PriorityQue creado con interfaces
	public void PruebasPriorityHeap(){
		HeapUsingIterativeBinaryTree<Integer, Proceso> heap = new HeapUsingIterativeBinaryTree<Integer, Proceso>(new ComparadorPrioridades<Integer>());
		Proceso num1 = new Proceso("AAA", "juan", 5);
		Proceso num2 = new Proceso("BBB", "pedro", 0);
		Proceso num3 = new Proceso("CCC", "luis", -20);
		heap.Insert(num1.getPriority(), num1);
		heap.Insert(num2.getPriority(), num2);
		heap.Insert(num3.getPriority(), num3);
		
		assertEquals("CCC", heap.remove().getNombre());
		assertEquals("BBB", heap.remove().getNombre());
		assertEquals("AAA", heap.remove().getNombre());
		
	}
    
}
