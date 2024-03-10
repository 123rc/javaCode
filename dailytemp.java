import java.util.Stack;

public class dailytemp {
    public static void main(String[] args) {
        String[] ops = {"5", "2", "C", "D", "+"};
        Stack<Integer> st = new Stack<>();
        int sum = 0;
        for(int i=0;i< ops.length;i++)
        {
            if(ops[i].equals("C"))
            {
                st.pop();
            }
            else if(ops[i].equals("D"))
            {
                int x=st.peek();
                st.push(2*x);
            }
            else if(ops[i].equals("+"))
            {
                int x=st.pop();
                int y=st.pop();
                st.push(y);
                st.push(x);
                st.push(x+y);
            }
            else{
                st.push(Integer.parseInt(ops[i]));
            }
        }
        while(!st.isEmpty())
        {
            sum+=st.pop();
        }
        System.out.println(sum);

    }
}
