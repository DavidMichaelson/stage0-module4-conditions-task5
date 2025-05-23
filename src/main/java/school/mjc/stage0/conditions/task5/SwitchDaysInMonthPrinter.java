package school.mjc.stage0.conditions.task5;

public class SwitchDaysInMonthPrinter {
    public void amountOfDays(int month) {

        String days;

        switch (month) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                days = "31";
                System.out.println(days);
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                days = "30";
                System.out.println(days);
                break;
            case 2:
                days = "28";
                System.out.println(days);
                break;
            default:
                System.out.println("wrong number!");
                break;
        }
    }

    public static void main(String[] args) {
        SwitchDaysInMonthPrinter printer = new SwitchDaysInMonthPrinter();
        printer.amountOfDays(0);
        printer.amountOfDays(1);
        printer.amountOfDays(2);
        printer.amountOfDays(3);
        printer.amountOfDays(4);
        printer.amountOfDays(5);
        printer.amountOfDays(6);
        printer.amountOfDays(7);
        printer.amountOfDays(8);
        printer.amountOfDays(9);
        printer.amountOfDays(10);
        printer.amountOfDays(11);
        printer.amountOfDays(12);
    }
}
