import java.util.Stack;

public class EvalPostfix {
    public static void main(String[] args) {
        String tokens[] = new String[]{"2", "1", "+", "3", "*"};
        Stack<Integer> st = new Stack<>();

        for (int i = 0; i < tokens.length; i++) {
            if (tokens[i].equals("+")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y + x); // Note the order of operands for addition
            } else if (tokens[i].equals("-")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y - x); // Note the order of operands for subtraction
            } else if (tokens[i].equals("*")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y * x); // Note the order of operands for multiplication
            } else if (tokens[i].equals("/")) {
                int x = st.pop();
                int y = st.pop();
                st.push(y / x); // Note the order of operands for division
            } else {
                // If the token is a number, push it onto the stack
                st.push(Integer.parseInt(tokens[i]));
            }
        }
        System.out.println(st.pop());
    }
}
