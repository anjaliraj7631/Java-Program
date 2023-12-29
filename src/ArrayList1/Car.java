package ArrayList1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

class Car {
    String color;
    int model;
    double price;
    Car(){
    }
    Car(String color,int model,double price){
        this.color=color;
        this.model=model;
        this.price=price;
    }
    public String toString() {
        return "Car{" +
                "color='" + color + '\'' +
                ", price=" + price +
                ", model='" + model + '\'' +
                '}';
    }
    public static void whiteColor(ArrayList<Car> carlist){
        for (Car c : carlist) {
            if (c.color.equalsIgnoreCase("white")) {
                System.out.println(c);
            }
        }
    }
    public static void modelRange(ArrayList<Car> carlist){
        for (Car c:carlist) {
            if(c.model>2021 && c.model<2023){
                System.out.println(c);
            }
        }
    }
    public static void price(ArrayList<Car> carlist){
        for (Car c:carlist){
            if(c.price>=5000000.00){
                System.out.println(c);
            }
        }
    }
    public static void sortModel(ArrayList<Car> carlist){
        for (int i = 0; i < carlist.size(); i++) {
            for (int j = i+1; j < carlist.size(); j++) {
                if(carlist.get(i).model>carlist.get(j).model){
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
    public static void removeBlackCar(ArrayList<Car> carlist){
        ArrayList<Car> newCarlist=new ArrayList<>();
        for (Car c:carlist) {
            if(!c.color.equalsIgnoreCase("black")){
                newCarlist.add(c);
            }
        }
        for (Car c1:newCarlist) {
            System.out.println(c1);
        }
    }
}

class CarMain{
    public static void main(String[] args) {
        ArrayList<Car>  carlist=new ArrayList<>();
        carlist.add(new Car("blue",2024,7020548.2));
        carlist.add(new Car("black",2021,5424484.2));
        carlist.add(new Car("white",2020,10055120.22));
        carlist.add(new Car("black",2023,4057221.2));
        carlist.add(new Car("white",2022,3426302.21));

//        System.out.println("-----------Based on white color--------------");
//        Car.whiteColor(carlist);
//        System.out.println();
//
//        System.out.println("-----------Based on model---------------");
//        Car.modelRange(carlist);
//        System.out.println();
//
//        System.out.println("------------Based on price-------------");
//        Car.price(carlist);
//        System.out.println();
//
//        System.out.println("----------Sorting based on model-------");
//        Car.sortModel(carlist);
//        System.out.println();
//
//        System.out.println("---------Removing black color car------");
//        Car.removeBlackCar(carlist);

        Scanner sc=new Scanner(System.in);
        boolean exist=false;
        while (!exist){
            System.out.println("1.White Car \n2.Model Range \n3.Price \n4.Sort A/C Model \n5.Remove Black Car \n6.Exit");
            System.out.println("Enter choice:");
            int ch=sc.nextInt();
            switch (ch){
                case 1: System.out.println("-----------Based on white color--------------");
                         Car.whiteColor(carlist);
                         System.out.println();
                         break;
                case 2:System.out.println("-----------Based on model---------------");
                         Car.modelRange(carlist);
                         System.out.println();
                         break;
                case 3:System.out.println("------------Based on price-------------");
                         Car.price(carlist);
                         System.out.println();
                         break;
                case 4:System.out.println("----------Sorting based on model-------");
                        Car.sortModel(carlist);
//                        Collections.sort(carlist,new SortACToModel());
//                         for (Car c: carlist) {
//                        System.out.println(c);
//                    }
                        System.out.println();
                        break;
                case 5:System.out.println("---------Removing black color car------");
                         Car.removeBlackCar(carlist);
                         System.out.println();
                         break;
                case 6:exist=true;
                break;
                default:
                    System.out.println("Invalid Choice");
            }
        }
    }
}
