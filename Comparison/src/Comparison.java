public class Comparison {
    //isSame() activity
    public static boolean isSameValue(Object obj1, Object obj2) {
        return obj1 == obj2 ? true : false;
    }

    //compareTo() and equals() activity
    public static boolean isStringEqual(String string1, String string2) {
        return string1.equals(string2);
    }

    public static boolean compareStrings(String string1, String string2){
        return string1.compareTo(string2) != 0 ? false : true;
    }


    public static void main(String[] args) {
        //isSame() activity
        Object myObject1 = 5;
        Object myObject2 = 5;
        System.out.println(isSameValue(myObject1, myObject2));  // prints true

        myObject1 = new String("The content of the object is the same");
        myObject2 = new String("The content of the object is the same");
        System.out.println(isSameValue(myObject1, myObject2));  // prints false

        myObject2 = myObject1;
        System.out.println(isSameValue(myObject1, myObject2));   // prints true

        //compareTo() and equals() activity

        String string1 = new String("Aardvark comes before apple");
        String string2 = new String("Aardvark comes before apple");

        System.out.println(isStringEqual(string1, string2));  // prints true
        System.out.println(compareStrings(string1, string2)); // prints true

        string2 = new String("Apple comes after aardvark");

        System.out.println(isStringEqual(string1, string2));  // false
        System.out.println(compareStrings(string1, string2));  // prints false
    }
}
