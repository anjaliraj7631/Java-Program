package Vector1;


import java.util.Stack;

class CheckBalanced {

    public static void main(String[] args) {
        String str = "{}([]))";
//        System.out.println(isBalance(str));
        boolean b=isBalance(str);
        if(b){
            System.out.println("Balanced");
        }
        else {
            System.out.println("Not balanced");
        }
    }

    private static boolean isBalance(String str) {
        Stack<Character> s = new Stack<>();
        for (int i = 0; i < str.length(); i++) {
            char c = str.charAt(i);
            if (c == '{' || c == '(' || c == '[') {
                s.push(c);
            }
            else{
                if (s.empty()) {
                    return false;
                }
                char popped = s.pop();
                if (popped == '[' && (c == '}' || c == ')')) {
                        return false;
                }

                if (popped == '(' && (c == '}' || c == ']') ) {
                        return false;
                }
                if (popped == '{' && (c == ')' || c == ']')) {
                        return false;
                }
            }
        }
        return s.empty();
    }
}
