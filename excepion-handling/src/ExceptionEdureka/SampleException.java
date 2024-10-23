package ExceptionEdureka;

public class SampleException {
    public static void main(String[] args) {
        String str = null;
//        System.out.println(str.length());
        try {
            int a = 30, b = 0;
            int c = a/b;
            System.out.println(c);
        }
        catch (ArithmeticException e){
            System.out.println("Can't divide a number by zero");
        }
    }
}
