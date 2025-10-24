package Homework5;

public class TransportManager {
    // Enum-a əsasən uyğun nəqliyyat obyektini qaytarmaı üçün
    public static Transport getTransport(TransportType type) {
        switch (type) {
            case BUS:
                return new Bus();
            case TAXI:
                return new Taxi();
            case BICYCLE:
                return new Bicycle();
            case SCOOTER:
                return new Scooter();
            default:
                throw new IllegalArgumentException("Yanlış nəqliyyat növü!");
        }
    }
}