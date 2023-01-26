public class Calculator {
    public static int sum(int num1, int num2) {
        return num1 + num2;
    }
    public static int multiply(int num1, int num2){
        return num1 * num2;
    }
    public static int divide(int num1, int num2) {
        return num1 / num2;
    }
    public static double divide(double num1, double num2){
        return num1 / num2;
    }

    public static int subtract(int num1, int num2){
        return num1 - num2;
    }

    public static void main(String[] args) {
        System.out.println(sum(3, 2)); // 5
        System.out.println(multiply(3, 2));  // 6
        System.out.println(subtract(3, 2)); // 1
        System.out.println(divide(3, 2));  // 1
        System.out.println(divide(3.0, 2.0));  // 1.5
        System.out.println(divide((int) 3.0, (int) 2.0));  // 1
        System.out.println(divide((double) 3, (double) 2));  // 1.5
    }
}