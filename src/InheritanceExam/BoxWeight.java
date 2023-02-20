package InheritanceExam;

public class BoxWeight extends Box {
    double weight;
    BoxWeight(){
        this.weight=-1;
    }
    BoxWeight(double l,double w,double h,double weight){
        super(l,w,h); //call the parent class constructor
        // used to intialise values present in parent class
        this.weight=weight;
    }
    BoxWeight(double side,double weight){
        super(side);
        this.weight=weight;
    }
    BoxWeight(BoxWeight other){
        super(other);
        this.weight= other.weight;
    }
}
