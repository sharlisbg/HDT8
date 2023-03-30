import java.util.Comparator;

public class ComparadorPrioridades<Integer> implements Comparator <Integer>{

    @Override
    public int compare(Integer o1, Integer o2) {
        if ((int) o1 == (int) o2) {
            return 0;
        } else if ((int)o1 < (int) o2) {
            return 1;
        } else {
            return-1;
        }
    }
    
}
