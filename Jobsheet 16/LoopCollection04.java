import java.util.Iterator;
import java.util.Stack;

public class LoopCollection04 {
    public static void main(String[] args) {
        Stack<String> fruits = new Stack<>();
        fruits.push("Banana");
        fruits.add("Orange");
        fruits.add("Watermelon");
        fruits.add("Leci");
        fruits.push("Salak");
        fruits.add("Mango");
        fruits.add("Guava");
        fruits.add("Avocado");

        for (String fruit : fruits) {
            System.out.printf("%s ", fruit);
        }
        System.out.println("\n" + fruits.toString());

        while (!fruits.empty()) {
            System.out.printf("%s ", fruits.pop());
        }
        fruits.push("Melon");
        fruits.push("Strawberry");

        System.out.println(" ");
        for (Iterator<String> it = fruits.iterator(); it.hasNext();) {
            String fruit = it.next();
            System.out.printf("%s ", fruit);
        }
            System.out.println("");
            fruits.stream().forEach(e -> {
                System.out.printf("%s ", e);
            });
            System.out.println("");
            for (int i = 0; i < fruits.size(); i++) {
                System.out.printf("%s ", fruits.get(i));
        }

    }
}