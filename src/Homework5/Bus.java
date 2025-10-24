package Homework5;
class Bus implements Transport {
    private final double ratePerKm = 0.5;
    private final double speed = 60;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        // Avtobus üçün sərnişin çox olanda endirim olsun
        double baseFare = calculateFare(distance);
        if (passengers > 20) {
            baseFare *= 0.9;
        }
        return baseFare;
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Bus - ucuz, ictimai nəqliyyat vasitəsi. Sürət: " + speed + " km/h, Tarif: " + ratePerKm + " ₼/km";
    }
}

