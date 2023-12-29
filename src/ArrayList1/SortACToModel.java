package ArrayList1;

import java.util.Comparator;

class SortACToModel implements Comparator<Car> {
    @Override
    public int compare(Car c1,Car c2){
        return c1.model- c2.model;
    }
}
