public class Weekday {
    public String numberToDay(int number) {
        switch (number) {
            case 1:
                return "Monday";
            case 2:
                return "Tuesday";
            case 3:
                return"Wednesday";
            case 4:
                return "Thursday";
            case 5:
                return "Friday";
            case 6:
                return "Saturday";
            case 7:
                return "Sunday";
            default:
                return "Not a valid day of the week";
        }

    }

    public static void main(String[] args) {
        Weekday dotw = new Weekday();
        for (int i = 0; i < 9; i++) {
            System.out.println(dotw.numberToDay(i));
        }
    }
}
