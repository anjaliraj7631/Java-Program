package Comparator;

import Array.CarCompare;

import java.util.Arrays;
import java.util.Comparator;

public class Car {
    double price;
    String model;
    String color;
    String brand;
    Car(){

    }

    public Car(String brand,String model,String color,double price) {
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "Car{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }
}
class SortAccToPrice implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Car c1=(Car)o1;
        Car c2=(Car) o2;
        return (int)(c1.price-c2.price);
    }
}
class SortAccToModel implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Car c1=(Car)o1;
        Car c2=(Car) o2;
        return c1.model.compareToIgnoreCase(c2.model);
    }
}
class SortAccToColor implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Car c1=(Car)o1;
        Car c2=(Car) o2;
        return c1.color.compareToIgnoreCase(c2.color);
    }
}
class SortAccToBrand implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Car c1=(Car)o1;
        Car c2=(Car) o2;
        return c1.brand.compareToIgnoreCase(c2.brand);
    }
}
class Main{
    public static void main(String[] args) {
        Car[] c=new Car[5];
        c[0]=new Car("Mahindra","JDSX","Black",5000244);
        c[1]=new Car("Hyundai","HFSDS","White",8500146);
        c[2]=new Car("Ford","AJAHSD","Red",7500146);
        c[3]=new Car("Toyota","WKHD","Purple",2500146);
        c[4]=new Car("Tata","SSDXZX","Blue",1050016);
        System.out.println("-------------Price-----------------------");
        Arrays.sort(c,new SortAccToPrice());
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
        System.out.println("---------------Brand------------------------");
        Arrays.sort(c,new SortAccToBrand());
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
        System.out.println("--------------Color-------------------------");
        Arrays.sort(c,new SortAccToColor());
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
        System.out.println("----------------Model-------------------------");
        Arrays.sort(c,new SortAccToModel());
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
    }
}
