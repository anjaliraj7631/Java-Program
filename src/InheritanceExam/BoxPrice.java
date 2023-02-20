package InheritanceExam;

public class BoxPrice {
    double cost;

    BoxPrice(double cost){
        this.cost=10;
    }
    BoxPrice(double side,double weight,double cost){
        super();
        this.cost=cost;
    }
    BoxPrice(double l,double w,double h, double weight,double cost){
        super();
        this.cost=cost;
    }
    BoxPrice(BoxPrice other){
        super();
        this.cost= other.cost;
    }

}
