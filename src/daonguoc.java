import java.util.Stack;

public class daonguoc {
    public static void main(String[] args) {
        Stack<Integer> num = new Stack<>();
        num.push(1);
        num.push(2);
        num.push(3);
        num.push(4);
        System.out.print("Before: ");
        for (Integer element : num){
            System.out.print(element + "\t");
        }
        System.out.print("\nAfter: ");
        while (!num.isEmpty()){
            System.out.print(num.pop() + "\t");
        }
        String first = "hello";
        Stack<Character> string = new Stack<>();
        System.out.print("\nBefore: " + first);
        for (int i = 0; i < first.length();i++){
            string.push(first.charAt(i));
        }
        System.out.print("\nAfter: ");
        while (!string.isEmpty()){
            System.out.print(string.pop());
        }
    }
}
