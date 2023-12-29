//package ProgStringArray;

//public class SubstringCheck {
//    public static void main(String[] args) {
//        String s1="hello";
//        String s2 = "lo";
//        subString(s1,s2);
//    }
//
//    public static void subString(String s1,String s2){
////        int index=0;
////        for (int i = 0; i < s1.length(); i++) {
////                if(s1.charAt(i)==s2.charAt(0)){
////                    index=i;
////                    break;
////                }
////        }
////
////        int k=0;
////        boolean b=true;
////        for (int i = index; i <s2.length();i++) {
////            if(s1.charAt(i)!=s2.charAt(k++)){
////                b=false;
////                break;
////            }
////        }
////        if(b){
////            System.out.println("Substring");
////        }
////        else {
////            System.out.println("Not substring");
////        }
//
//        int count=0;
//        int temp=0;
//        char[] ch1=s1.toCharArray();
//        char[] ch2=s2.toCharArray();
////        for (int i = 0; i < ch1.length; i++) {
////            if(temp < ch2.length && ch1[i]==ch2[temp]){
////                temp++;
////                count++;
////            }
////        }
//        for (int i = 0; i < ch1.length; i++) {
//            if (temp < ch2.length && ch1[i] == ch2[temp]) {
//                temp++;
//                count++;
//            } else {
//                temp = 0; // Reset temp if the characters don't match
//                count = 0; // Reset count as well
//            }
//
//            if (count == ch2.length) {
//                break; // Exit the loop once a match is found
//            }
//        }
//
//        if(count==s2.length()){
//            System.out.println("Substring");
//        }
//        else {
//            System.out.println("Not a substring");
//        }
//    }
//}


package ProgStringArray;

public class SubstringCheck {
    public static void main(String[] args) {
        String s1 = "hello";
        String s2 = "llo";
        subString(s1, s2);
    }

    public static void subString(String s1, String s2) {
        int count = 0;
        int temp = 0;
        char[] ch1 = s1.toCharArray();
        char[] ch2 = s2.toCharArray();

        for (int i = 0; i < ch1.length; i++) {
            if (temp < ch2.length && ch1[i] == ch2[temp]) {
                temp++;
            } else {
                temp = 0; // Reset temp if the characters don't match
            }

            if (temp == ch2.length) {
                count = ch2.length;
                break; // Exit the loop once a match is found
            }
        }

        if (count == ch2.length) {
            System.out.println("Substring");
        } else {
            System.out.println("Not a substring");
        }
    }
}
