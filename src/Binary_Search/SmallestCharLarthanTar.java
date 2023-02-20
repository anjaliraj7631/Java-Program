package Binary_Search;

import com.sun.source.tree.BreakTree;

public class SmallestCharLarthanTar {
    public static void main(String[] args) {
        char[] letters={'a','c','f','j'};
        char tar='j';
        System.out.println(nextGreatestNum(letters,tar));
    }
    static char nextGreatestNum(char[] letters,char target) {
        int start = 0;
        int end = letters.length - 1;
        if(target>=letters[end]){
            return letters[start];
        }
        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (target < letters[mid]) {
                end = mid - 1;
            } else {
                start = mid + 1;
            }
        }
        return letters[start];//letters[start%letters.length];
    }
}
