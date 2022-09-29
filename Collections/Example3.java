//3) Design a Data Structure SpecialStack that supports all the stack operations like push(),
//   pop(), isEmpty(), isFull() and an additional operation getMin() which should
//   return minimum element from the SpecialStack. (Expected complexity O(1))
public class Example3 {
    public static void main(String[] args) {
        SpecialStack stack = new SpecialStack();
        stack.push(11);
        stack.push(12);
        stack.push(13);
        stack.pop();
        stack.push(10);
        System.out.println(stack.getmin());
    }
}
