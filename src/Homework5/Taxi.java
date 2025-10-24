package Homework5;

class Taxi implements Transport {
    private final double ratePerKm = 1.5;
    private final double speed = 80;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        double baseFare = calculateFare(distance);
        if (passengers > 3) {
            baseFare += (passengers - 3) * 2; // əlavə sərnişin üçün 2 AZN
        }
        return baseFare;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Taxi - rahat, amma bahalı seçim. Sürət: " + speed + " km/h, Tarif: " + ratePerKm + " ₼/km";
    }
}