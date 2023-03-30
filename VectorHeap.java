import java.util.Vector;

/**
 * VectorHeap es la clase que modela la implementacion de la estructura VectorHeap.
 * Código recuperado de: Bailey, D.A. (2007) “Vector-Based Heaps,” in Java Structures. 2nd edn. Williams College, pp. 335–342. 
 * @author Leonel Contreras 
 * @version 1.0
 */
public class VectorHeap<E> implements PriorityQueue<E> {
    // atributos
    protected Vector<E> data;

    // metodos
    /**
     * VectorHeap es el constructor de la clase
     */
    public  VectorHeap() {
        this.data = new Vector<E>();
    }

    /**
     * VectorHeap es un constructor que hace overloading al constructor anterior.
     * Construye un nuevo priority queue a partir de un vector sin ordenar
     * @param v
     */
    public  VectorHeap(Vector<E> v) {
        
        data = new Vector<E>(v.size());
        for (int i = 0; i < data.size(); i++) {
            add(v.get(i));
        }
    }

    @Override
    public int compareTo(E o) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'compareTo'");
    }

    @Override
    public E getFirst() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'getFirst'");
    }

    @Override
    public E remove() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'remove'");
    }

    @Override
    public void add(E value) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'add'");
    }

    @Override
    public boolean isEmpty() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'isEmpty'");
    }

    @Override
    public int size() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'size'");
    }

    @Override
    public void clear() {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'clear'");
    }

    
}