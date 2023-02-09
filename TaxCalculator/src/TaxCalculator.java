public class TaxCalculator {
    public static int taxPercentage(int salary){
        int taxRate;
        if (salary < 15_000) taxRate = 0;
        else if (salary < 20_000) taxRate = 10;
        else if (salary < 30_000) taxRate = 15;
        else if (salary < 45_000) taxRate = 20;
        else taxRate = 25;

        return taxRate;
    }

    public static int amountToPay(int salary){
        int taxRate = taxPercentage(salary);
        return (salary * taxRate) / 100;
    }

    public static void main(String[] args) {
        System.out.println(amountToPay(10_000));
        System.out.println(amountToPay(17_000));
        System.out.println(amountToPay(25_000));
        System.out.println(amountToPay(35_000));
        System.out.println(amountToPay(45_000));
    }
}
