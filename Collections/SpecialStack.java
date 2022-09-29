import java.util.Stack;

public class SpecialStack {
    Stack<Integer> stack = new Stack<>();
    Stack<Integer> minimum = new Stack<>();

    void push(int ele){
        if(stack.isEmpty()){
            stack.push(ele);
            minimum.push(ele);

        }
        else{
            stack.push(ele);
            int topOfMinimum = minimum.pop();
            minimum.push(topOfMinimum);
            if (ele < topOfMinimum){
                minimum.push(ele);
            }
            else{
                minimum.push(topOfMinimum);
            }

        }
    }

    public int pop()
    {
        int ele = stack.pop();
        minimum.pop();
        return ele;
    }
    public int getmin(){
        int ele = minimum.pop();
        minimum.push(ele);
        return ele;
    }
}
