package Array;

import java.util.Arrays;

public class CarCompare implements Comparable{
    double price;
    String model;
    String color;
    String brand;
    CarCompare(){

    }

    public CarCompare(String brand,String model,String color,double price) {
        this.brand=brand;
        this.model=model;
        this.color=color;
        this.price = price;
    }

    @Override
    public String toString() {
        return "CarCompare{" +
                "price=" + price +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", brand='" + brand + '\'' +
                '}';
    }


    @Override
    public int compareTo(Object o) {
        CarCompare c=(CarCompare) o;
        //sorting in descending order

//        return c.brand.compareToIgnoreCase(this.brand);
//        return c.model.compareToIgnoreCase(this.model);
//        return c.color.compareToIgnoreCase(this.color);
//        return (int)(c.price-this.price);
        //sorting in ascending order
//        return this.brand.compareToIgnoreCase(c.brand);
//        return this.model.compareToIgnoreCase(c.model);
//        return (int)(this.price-c.price);
        return this.color.compareToIgnoreCase(c.color);

    }
}

class Main{
    public static void main(String[] args) {
        CarCompare[] c=new CarCompare[5];
        c[0]=new CarCompare("Mahindra","JDSX","Black",5000244);
        c[1]=new CarCompare("Hyundai","HFSDS","White",8500146);
        c[2]=new CarCompare("Ford","AJAHSD","Red",7500146);
        c[3]=new CarCompare("Toyota","WKHD","Purple",2500146);
        c[4]=new CarCompare("Tata","SSDXZX","Blue",1050016);
        Arrays.sort(c);
        for (int i = 0; i <c.length ; i++) {
            System.out.println(c[i]);
        }
    }
}