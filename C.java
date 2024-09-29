class Converter{
    
}
class CurrencyConverter extends Converter {
    public void convertDollarToINR(double dollars) {
        System.out.println(dollars + " USD = " + (dollars * 74.85) + " INR");
    }
}
class DistanceConverter extends Converter {
    public void convertMeterToKM(double meters) {
        System.out.println(meters + " meters = " + (meters / 1000) + " km");
    }
}
class TimeConverter extends Converter {
    public void convertHoursToMinutes(int hours) {
        System.out.println(hours + " hours = " + (hours * 60) + " minutes");
    }
}
public class C {
    public static void main(String[] args) {
        CurrencyConverter currency = new CurrencyConverter();
        DistanceConverter distance = new DistanceConverter();
        TimeConverter time = new TimeConverter();

        currency.convertDollarToINR(100);
        distance.convertMeterToKM(1500);
        time.convertHoursToMinutes(2);
    }
}