package Comparator;

import java.awt.desktop.SystemEventListener;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Objects;
import java.util.Scanner;

public class Book {
    private String title;
    private double price;
    private int yop;

    public String getAuthor() {
        return author;
    }

    public void setAuthor(String author) {
        this.author = author;
    }

    public int getYop() {
        return yop;
    }

    public void setYop(int yop) {
        this.yop = yop;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    private String author;
    Book(){

    }
    Book(String title,double price,int yop,String author){
        super();
        this.title=title;
        this.price=price;
        this.yop=yop;
        this.author=author;
    }

    @Override
    public String toString() {
        return "Book{" +
                "title='" + title + '\'' +
                ", price=" + price +
                ", yop=" + yop +
                ", author='" + author + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Book book = (Book) o;
        return Double.compare(book.price, price) == 0 && yop == book.yop && title.equals(book.title) && author.equals(book.author);
    }

    @Override
    public int hashCode() {
        return Objects.hash(title, price, yop, author);
    }
}

class SortAccToTitle implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Book b1=(Book) o1;
        Book b2=(Book) o2;
        return b1.getTitle().compareToIgnoreCase(b2.getTitle());
    }
}
class SortAccToPric implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Book b1=(Book) o1;
        Book b2=(Book) o2;
        return (int)(b1.getPrice()-b2.getPrice());
    }
}
class SortAccToYop implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Book b1=(Book) o1;
        Book b2=(Book) o2;
       return b1.getYop()- b2.getYop();
    }
}
class SortAccToAuthor implements Comparator{
    @Override
    public int compare(Object o1, Object o2) {
        Book b1=(Book) o1;
        Book b2=(Book) o2;
        return b1.getAuthor().compareToIgnoreCase(b2.getAuthor());
    }
}
class BookMain{
    public static void main(String[] args) {
        Book[] b=new Book[3];
        b[0]=new Book("The India Story",5021.2,1920,"Bimal");
        b[1]=new Book("Abbot",6021.2,2000,"Walter");
        b[2]=new Book("Harry Potter",1002.2,1820,"J K Rowiling");
        boolean exit=false;
        while (!exit){
            System.out.println("1.Sort ACC to Title \n2.Sort ACC to Price \n3.Sort ACC to YOP \n4.Sort ACC to Author \n5.Exit");
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Choice");
            int ch=sc.nextInt();
            switch (ch){
                case 1: Arrays.sort(b,new SortAccToTitle());
                    System.out.println("Sorted A/C to Title");
                    for (int i = 0; i <b.length ; i++) {
                        System.out.println(b[i]);
                    }
                        break;
                case 2:Arrays.sort(b,new SortAccToPric());
                    System.out.println("Sorted A/C to Price");
                    for (int i = 0; i <b.length ; i++) {
                        System.out.println(b[i]);
                    }
                        break;
                case 3:Arrays.sort(b,new SortAccToYop());
                    System.out.println("Sorted A/C to YOP");
                    for (int i = 0; i <b.length ; i++) {
                        System.out.println(b[i]);
                    }
                        break;
                case 4:Arrays.sort(b,new SortAccToAuthor());
                    System.out.println("Sorted A/C to Author");
                    for (int i = 0; i <b.length ; i++) {
                        System.out.println(b[i]);
                    }
                        break;
                case 5: exit = true;
                    break;
                default:
                    System.out.println("Invalid choice");
            }
        }
    }
}
