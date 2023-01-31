import java.util.Random;
import java.util.Arrays;
public class mathOperations {
    //activity1
    public static void activity1(){
        double var1;
        double var2;
        double var3;
        int var4;
        int var5;
        int var6;
        var1 = 10.2;
        var2= -5.5;
        var3= 11.4;

        var4= (int) Math.round(var1);
        var5 = (int) Math.ceil(var2);
        var6 = (int) Math.floor(var3);
        System.out.printf("var4 = %d, var5 = %d, var6 = %d", var4, var5, var6);
        // these assignments require a cast because the Math.round, Math.ceil, and Math.floor methods return a double but the variables we are assigning it to were declared as int
    }

    //activity2
    public static void activity2(){
        for (int i = 0; i < 10; i++) {
            double rand = Math.floor(Math.random() * 10+5);
            System.out.println(rand);
        }
    }

    //activity3
    public static void activity3(){
        System.out.println("Math.random");
        for (int i = 0; i < 10; i++) {
            double rand = Math.ceil(Math.random() * 10);
            System.out.println(rand);
        }

        System.out.println("Random class");
        Random random = new Random();
        for (int i = 0; i < 10; i++) {
            double rand = 1+random.nextInt(10);
            System.out.println(rand);
        }
    }

    //activity4
    public static void activity4(){
        int[] array  = {1,2,3,4,5,6};
        Random random = new Random();
        for(int i = 0; i < array.length; i++){
            int randomIndex = random.nextInt(array.length);
            int temp = array[randomIndex];
            array[randomIndex] = array[i];
            array[i]=temp;
        }
        System.out.println(Arrays.toString(array));
    }

    public static void main(String[] args){
        System.out.println("ACTIVITY 1:");
        mathOperations.activity1();
        System.out.println("ACTIVITY 2:");
        mathOperations.activity2();
        System.out.println("ACTIVITY 3:");
        mathOperations.activity3();
        System.out.println("ACTIVITY 4:");
        mathOperations.activity4();
    }

}

