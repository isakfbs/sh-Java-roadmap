package expressions;

import java.util.ArrayList;
import java.util.function.Consumer;

public class LambdaExpressions {
    // Using a lambda expression in the ArrayList
    public static void main(String[] args) {
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        numbers.add(5);
        numbers.add(9);
        numbers.add(8);
        numbers.add(1);
        numbers.add(3);
        numbers.forEach(System.out::println);

    // Lambda expressions can be stored in variables if the ariable's type is an interface which has only one method. The lambda expression should have the same number of parameters and the same return type as that method.

        Consumer<Integer> method = System.out::println;

        numbers.forEach(method);
    }
}
