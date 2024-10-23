package expressions;

import java.util.function.Consumer;
import java.util.function.Function;

public class functionInVariable {

    public static void main(String[] args) {
        Function<Integer, Integer> addOne = x -> x + 1;
// lambda assigned to a reference, where
// Function has an input and an output:
        int result1 = addOne.apply(123);
        System.out.println(result1);

// a method assigned to a reference, where
// Consumer takes an input (void return):

    }
}
