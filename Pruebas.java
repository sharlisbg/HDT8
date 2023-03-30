import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertThrows;
import static org.junit.Assert.fail;

import java.util.ArrayList;
import java.util.Vector;

import org.junit.Test;

import java.lang.Exception;

/**
 * @author Sharis Barrios
 *
 */

public class Pruebas {

    @Test
	public void AddTest() {
		VectorHeap<Integer> Pruebas = new VectorHeap<Integer>();
		Pruebas.add(2);
		Pruebas.add(9);
		Pruebas.add(20); 
		Pruebas.add(30);		
		
	}

	@Test
	public void DeleteTest() {
		VectorHeap<Integer> Pruebas = new VectorHeap<Integer>();
		Pruebas.add(2);
		Pruebas.add(9);
		Pruebas.add(20); 
		Pruebas.add(30);		
		
	}
    
}
