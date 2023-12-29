package LinkedList1;

import java.util.Iterator;
import java.util.LinkedList;

public class Car {
    String color;
    int model;
    double price;

    Car() {
    }

    Car(String color, int model, double price) {
        this.color = color;
        this.model = model;
        this.price = price;
    }

    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
    public static void sortAsc(LinkedList<Car> carlist){
        for (int i = 0; i < carlist.size(); i++) {
            for (int j = i+1; j < carlist.size(); j++) {
                if(carlist.get(i).price>carlist.get(j).price){
                    Car temp=carlist.get(i);
                    carlist.set(i,carlist.get(j));
                    carlist.set(j,temp);
                }
            }
        }
        for (Car c:carlist) {
            System.out.println(c);
        }
    }
    public static void sortDesc(LinkedList<Car> carlist){
        Iterator it=carlist.descendingIterator();
        while (it.hasNext()){
            System.out.println(it.next());
        }
    }
}
class MainCar{
    public static void main(String[] args) {
        LinkedList<Car> carlist=new LinkedList<>();
        carlist.add(new Car("blue",2024,7020548.2));
        carlist.add(new Car("black",2021,5424484.2));
        carlist.add(new Car("white",2020,10055120.22));
        carlist.add(new Car("black",2023,4057221.2));
        carlist.add(new Car("white",2022,3426302.21));
        System.out.println("In asec");
        Car.sortAsc(carlist);
        System.out.println("In desc");
//        Iterator it=carlist.descendingIterator();
//        while (it.hasNext()){
//            System.out.println(it.next());
//        }
        Car.sortDesc(carlist);
    }
}
