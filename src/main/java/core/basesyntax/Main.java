package core.basesyntax;

public class Main {
    private static final String DATE_FROM = "14.07.2019";
    private static final String DATE_TO = "10.08.2019";
    private static final String[] names = {"John", "Andrew", "Kate"};
    private static final String[] data = {
            "13.07.2019 John 60 50",
            "15.07.2019 Andrew 3 200",
            "15.07.2019 Kate 10 100",

            "16.07.2019 Andrew 3 200",
            "16.07.2019 Kate 9 100",

            "10.08.2019 John 7 100",
            "08.08.2019 Kate 3 80",
            "11.08.2019 Andrew 8 100"
    };
    private static final String[] dates = {
            "24.04.2019",
            "25.04.2019",
            "26.04.2019",
            "27.04.2019"
    };

    public static void main(String[] args) {
        SalaryInfo salaryInfo = new SalaryInfo();
        System.out.println(salaryInfo.getSalaryInfo(names, data, DATE_FROM, DATE_TO));
    }
}
