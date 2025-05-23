package school.mjc.stage0.conditions.task5;

public class LeapYearPrinter {
    public void isLeapYear(int year) {

        if (((year % 4 == 0) && (year % 100 != 0) || (year % 400) == 0)) {
            System.out.println("leap");
        } else {
            System.out.println("not leap");
        }
    }

    public static void main(String[] args) {
        LeapYearPrinter printer = new LeapYearPrinter();
        printer.isLeapYear(2024);
        printer.isLeapYear(1900);
        printer.isLeapYear(2000);
        printer.isLeapYear(2023);
    }
}
