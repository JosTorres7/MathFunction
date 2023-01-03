public class MathFunction {
    public static void main(String[] args) {
        int num1 = 1;
        int num2 = 2;
        int num3 = 3;
        if (num1 * num2 == num3) {
            System.out.println("*");
        }
        else if (num1 / num2 == num3) {
            System.out.println("/");
        }
        else if (num1 + num2 == num3) {
            System.out.println("+");
        }
        else if (num1 - num2 == num3) {
            System.out.println("-");
        }
        else {
            System.out.println("None");
        }
    }
}
