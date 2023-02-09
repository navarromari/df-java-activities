public class UniqueSum {
    public static int Input(int num1, int num2, int num3){
        int sum = 0;
        if (num1 != num2 && num1 != num3){
            sum += num1;
        }
        if (num2 != num1 && num2 != num3){
            sum += num2;
        }
        if (num3 != num1 && num3 != num2){
            sum += num3;
        }
        return sum;
    }

    public static void main(String[] args) {
        System.out.println(Input(1, 2, 3));
        System.out.println(Input(3, 3, 3));
        System.out.println(Input(1, 1, 2));
    }
}
