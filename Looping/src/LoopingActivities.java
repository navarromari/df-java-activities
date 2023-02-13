import java.util.*;
public class LoopingActivities {

    //ACTIVITY 1
    public static void blink(){
        System.out.println("Blink");
    }

    public static void blinkWhileHeads() {
        do {blink();}
        while (Math.random() < 0.5);
    }

    //ACTIVITY 2
    //standard for loop
    public static int standardStringScore(String str){
        int score = 0;
        for (int i=0; i<str.length(); i++){
            if (str.charAt(i) == '!') {
                score+=3;
            }
            else if (str.charAt(i) == '?'){
                score+=2;
            }
            else{
                score+=1;
            }
        }
        return score;
    }
    //enhanced for loop
    public static int enhancedStringScore(String str){
        int score = 0;
        char[] characters = str.toCharArray();
        for (char character:characters){
            if (character == '!') {
                score+=3;
            }
            else if (character == '?'){
                score+=2;
            }
            else{
                score+=1;
            }
        }
        return score;
    }

    //ACTIVITY 3
    public static void noOneArray(int[] array){
        int count = 0;
        for(int num:array){
            if (num == 1){
                System.out.println("Ewwwww, I found a 1 and immediately stopped counting. I  only got " + count + " element(s) through the array before a darn 1 appeared.");
                break;
            }
            count++;
        }

        if (count == array.length) {
            System.out.println("Yay! No 1's!");
        }

    }

    public static void noOneCount(int[] array){
        int count = 0;
        for (int i : array){
            if (i == 1){
                System.out.print("Ugh! ");
                continue;
            }
            count+=1;
        }

        if (count == array.length){
            System.out.println("Yay! No 1's!");
        }
        else{
            System.out.println("Well chief, we got " + count + " nice elements in our array, and the rest is all darn 1's.");
        }
    }

    //Numbers Revisited
    public static void numbersInWords() {
        HashMap<Integer, String> words = new HashMap<Integer, String>(){{
        put(0, "zero");
        put(1, "one");
        put(2, "two");
        put(3, "three");
        put(4, "four");
        put(5, "five");
        put(6, "six");
        put(7, "seven");
        put(8, "eight");
        put(9, "nine");
        put(10, "ten");
        put(11, "eleven");
        put(12, "twelve");
        put(13, "thirteen");
        put(14, "fourteen");
        put(15, "fifteen");
        put(16, "sixteen");
        put(17, "seventeen");
        put(18, "eighteen");
        put(19, "nineteen");
        put(20, "twenty");
        put(30, "thirty");
        put(40, "forty");
        put(50, "fifty");
        put(60, "sixty");
        put(70, "seventy");
        put(80, "eighty");
        put(90, "ninety");
        put(100, "one hundred");
        }};

        for (int i=0; i<=100; i++){
            if (i < 20 || i%10 == 0){
                System.out.println(words.get(i));
            }
            else if (i > 20 && i < 100){
                System.out.println(words.get(i/10*10) + "-" + words.get(i%10));
            }
            else {
                System.out.println("one hundred");
            }
        }
    }

    //Coins

    public static void getChange(float cost, float amount){
        HashMap<Float, String> cashRegister = new HashMap<Float, String>(){{
            put(50.00f, "£50");
            put(20.00f, "£20");
            put(10.00f, "£10");
            put(5.00f, "£5");
            put(2.00f, "£2");
            put(1.00f, "£1");
            put(0.50f, "50p");
            put(0.20f, "20p");
            put(0.10f, "10p");
            put(0.05f, "5p");
            put(0.02f, "2p");
            put(0.01f, "1p");
        }};

        float change = amount - cost;
        List<Float> cashValues = new ArrayList<>(cashRegister.keySet());
        Collections.sort(cashValues, Collections.reverseOrder());
        for (Float value : cashValues) {
            int count = (int) (change / value);
            if (count > 0) {
                System.out.println(count + " " + cashRegister.get(value));
                change = change - count * value;
            }
        }
    }

    //Enhanced For Loop

    public static boolean isEven(int number) {
        return number % 2 == 0;
    }

    public static void loopis(){
        System.out.println("1:");
        String[] strings = {"abc", "def", "ghi", "jkl"};
        for (String string : strings){
            System.out.println(string);
        }
        System.out.println("2:");
        int[] ints = {1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16,17,18,19,20};
        for(int i : ints){
            System.out.println((int)Math.pow(i, 2));
        }
        System.out.println("4:");
        for(int i : ints){
            if (isEven(i)) {
                System.out.println((int)Math.pow(i, 2));
            }
            else{
                System.out.println((int)Math.pow(i, 3));
            }
        }
    }


    public static void main(String[] args) {
        System.out.println("ACTIVITY 1:");
        LoopingActivities.blinkWhileHeads();

        System.out.println("ACTIVITY 2:");
        //standard for loop
        System.out.println(LoopingActivities.standardStringScore("Looping???"));
        //enhanced for loop
        System.out.println(LoopingActivities.enhancedStringScore("Looping!!!"));

        System.out.println("ACTIVITY 3:");
        int[] withOne ={2,3,1,9};
        int[] withoutOne = { 2,3,4,5};
        System.out.println("a");
        LoopingActivities.noOneArray(withOne);
        LoopingActivities.noOneArray(withoutOne);
        System.out.println("b");
        LoopingActivities.noOneCount(withOne);
        LoopingActivities.noOneCount(withoutOne);
        System.out.println("Numbers Revisited:");
        LoopingActivities.numbersInWords();
        System.out.println("Coins:");
        LoopingActivities.getChange(4.58f, 20.00f);

        System.out.println("Enhanced For Loops:");
        LoopingActivities.loopis();

    }
}


