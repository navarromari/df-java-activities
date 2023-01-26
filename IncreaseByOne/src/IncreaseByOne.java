public class IncreaseByOne {
    public static void printAndUpdate(int num){
        System.out.println(num++);
    }

    public static void updateAndPrint(int num){
        System.out.println(++num);
    }
    public static void main(String[] args) {
        IncreaseByOne.printAndUpdate(1);  //1
        IncreaseByOne.updateAndPrint(1);  // 2
    }
}
