package EnumExample;

public class Basic {
    enum Week {
        Monday, Tuesday, Wednesday, Thursday, Friday, Saturday, Sunday;
        // this is constant and this is Week type
        //public,static,final
        Week(){
            System.out.println("Constructor called for" + this);
        }
        // this is not public or protected, only private and default
        // why we don't want to create new objects
        //this is not the enum concept ,that's why
        //internally : public static final Week Monday=new Week();
    }

    public static void main(String[] args) {
        Week week;
        week=Week.Monday;
        for (Week day:Week.values()){
            System.out.println(day);
        }
        System.out.println(week);
        System.out.println(week.ordinal()); // ordinal show position of constant
    }
}
