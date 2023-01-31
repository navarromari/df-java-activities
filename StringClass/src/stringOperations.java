public class stringOperations {

    //activity 1
    public static void activity1(){
        String string1 = "yesterday it was raining";
        String string2 = "today it is sunny";
        System.out.println(string2.toUpperCase()+", "+string1.toUpperCase());
        String substring1 = string2.substring(0, 11);
        String substring2 = string1.substring(16,24);
        System.out.println(substring1.toUpperCase() + substring2.toUpperCase());
    }

    //activity 2
    public static int wordCounter(String str){
        String[] words = str.split("\\s");
        return words.length;
    }

    public static void verticalString(String str){
        String[] words = str.split("\\s");
        for (String word : words){
            System.out.println(word);
        }
    }
    public static void reverseVerticalString(String str){
        String[] words = str.split("\\s");
        for (int i = words.length -1; i>=0; i-- ){
            System.out.println(words[i]);
        }
    }

    public static boolean findString(String[] args){
        return args[0].contains(args[1]);
    }

    //activity 3
    public static String stringAcronym(String sentence){
        String[] words = sentence.split("\\s");
        String acronym = "";
        for (String word: words){
            acronym += word.charAt(0);
        }
        return acronym;

    }

    //activity 4
    public static String removeWords(String sentence, char letter){
        String[] words = sentence.split("\\s");
        String result = "";
        for (String word:words){
            if (word.charAt(0) == letter){
                result += word + " ";
            }
        }
        return result;
    }

    //activity 5/6
    public static void specialStrings(){
        String string1 = "string\\with\\backlashes";
        String string2 = "string\nwith\nnew\nline";
        System.out.println(string1.length());
        System.out.println(string2.length());
        System.out.println(string1.indexOf("\\"));
        System.out.println(string1.indexOf("\\", string1.indexOf("\\") + 1));
        //printing all the \n occurrences
        int count = 0;
        int index = -1;

        while (true) {
            index = string2.indexOf("\n", index + 1);
            if (index == -1) {
                break;
            }
            System.out.println(index);
            count++;
        }
    }

    //activity 7
    public static int spacesUntilX(String str){
        int spaceCount = 0;

        for (int i =0; i<str.length(); i++){
            if (str.charAt(i) == ' ')spaceCount++;
            if (str.charAt(i) == 'x')break;
        }
        return spaceCount;
    }

    //activity8
    public static void printfNames(){
        String string1 = "Lola";
        String string2 = "Tom";
        String string3 = "Dick";
        String string4 = "Harry";

        System.out.printf("Hello, %s!%n", string1);
        System.out.printf("Any %s, %s or %s should be able to format that.", string2, string3, string4);
    }

    //activity9
    public static void internedStringCheck(){
        String str1 = "Hello";
        String str2 = str1.toString();
        String str3 = str1.substring(2);

        System.out.println("str1 == str2: " + (str1 == str2));
        System.out.println(".substring() returns a new object assigned to the heap.");
        System.out.println("str1 == str3: " + (str1 == str3));
        System.out.println(".toString() returns a reference to itself. Whether is a object on the heap (new String) or a string pool reference on the stack.");
    }

    //activity10
    public static String replaceWithX(String str){
        char[] strAsArray = str.toCharArray();

        for (int i = 0; i < strAsArray.length - 4; i++) {
            strAsArray[i] = 'X';
        }

        return new String(strAsArray);
    }

    //activity11
    public static String stringConcatenation(String[] strArray){
        String result = "";

        if (strArray == null) return result;

        for (String string: strArray){
           if(string != null) result = result.concat(string);
        }
        return result;
    }


    public static void main(String[] args){
        System.out.println("ACTIVITY 1:");
        stringOperations.activity1();

        System.out.println("ACTIVITY 2:");
        //Method1:
        System.out.println(stringOperations.wordCounter("This is a simple string."));
        //Method2:
        stringOperations.verticalString("This is a simple string.");
        //Method3:
        stringOperations.reverseVerticalString("This is a simple string.");
        //Method4:
        String[] array= {"This is a simple string.", "pão"};
        System.out.println(stringOperations.findString(array));

        System.out.println("ACTIVITY 3:");
        System.out.println(stringOperations.stringAcronym("This roast ugly evil"));

        System.out.println("ACTIVITY 4:");
        System.out.println(stringOperations.removeWords("This roast ugly evil", 'e'));

        System.out.println("ACTIVITY 5/6:");
        stringOperations.specialStrings();

        System.out.println("ACTIVITY 7:");
        System.out.println(stringOperations.spacesUntilX("This only has threex spaces before the first x"));
        System.out.println(stringOperations.spacesUntilX("This sentence has no letter we are looking for and should find 13 spaces"));

        System.out.println("ACTIVITY 8:");
        stringOperations.printfNames();

        System.out.println("ACTIVITY 9:");
        stringOperations.internedStringCheck();

        System.out.println("ACTIVITY 10:");
        System.out.println(stringOperations.replaceWithX("12345678"));

        System.out.println("ACTIVITY 11:");
        String[] array1 = {"I", "am", "concatenated"};
        String[] array2 = {null};
        String[] array3 = {null, null, "concatenated", "?"};
        System.out.println(stringOperations.stringConcatenation(array1));
        System.out.println(stringOperations.stringConcatenation(array2));
        System.out.println(stringOperations.stringConcatenation(array3));
    }
}
