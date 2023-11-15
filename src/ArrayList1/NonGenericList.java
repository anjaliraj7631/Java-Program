package ArrayList1;

import java.util.ArrayList;

public class NonGenericList {
    public static void main(String[] args) {
        ArrayList l = new ArrayList();
        l.add(10.21f);
        l.add(15);
        l.add(523);
        l.add(25.45f);
        l.add(12.254f);
        l.add("sun");
        l.add("sum");
        l.add("sql");
        l.add("summation");
        l.add("html");
        l.add("java");
        l.add("jaya");
        IntegerValue(l);
        StringWithS(l);
        StringEndWithA(l);
        FloatRangeFrom10To20(l);
    }

    public static void IntegerValue(ArrayList l) {
        for (Object o : l) {
            if (o instanceof Integer) {
                System.out.println(o);
            }
        }
    }

    public static void StringWithS(ArrayList l) {
        for (Object o : l) {
//            String s=(String) o;
//            if(s.startsWith("s"));
            if (o instanceof String) {
                if (((String) o).charAt(0) == 's') {
                    System.out.println(o);
                }
            }
        }
    }

    public static void StringEndWithA(ArrayList l) {
        for (Object o : l) {
            if (o instanceof String) {
                if (((String) o).charAt(((String) o).length() - 1) == 'a') {
                    System.out.println(o);
                }
            }
        }
    }

    public static void FloatRangeFrom10To20(ArrayList l) {

//        for (Object o : l) {
//            if(o instanceof Float){
//                Float f=(Float)o;
//                if(f>=10 && f<=20 ){
//                    System.out.println(o);
//                }
//            }
//        }
            for (int i = 0; i < l.size(); i++) {
                if (l.get(i) instanceof Float) {
                    Object o=l.get(i);
                    Float f = (Float) o;
                    if (f >= 10 && f <= 20) {
                        System.out.println(l.get(i));
                    }
                }
            }
        }
    }

