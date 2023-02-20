package linear_search;

public class searchInStr {
    public static void main(String[] args) {
        String name="Kunal";
        char target='u';
        System.out.println(search(name,target));
        System.out.println(search2(name,target));
        System.out.println(search3(name,target));
    }
    static int search(String str,char target){
        if(str.length()==0){
            return -1;
        }
        for (int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return i;
            }
        }
        return -1;
    }

    static boolean search2(String str,char target){
        if(str.length()==0){
            return false;
        }
        for (int i=0;i<str.length();i++){
            if(target==str.charAt(i)){
                return true;
            }
        }
        return false;
    }

    static boolean search3(String str,char target){
        if(str.length()==0){
            return false;
        }
        // for each
        for(char ch:str.toCharArray())  {
            if(ch==target){
                return true;
            }
        }
        return false;
    }
}
