package Homework5;

class Scooter implements Transport {
    private final double ratePerKm = 0.3;
    private final double speed = 25;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        if (passengers > 1) {
            System.out.println("Scooter yalnız bir nəfərlikdir!");
        }
        return calculateFare(distance);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Scooter - qısa məsafələr üçün rahat seçim. Sürət: " + speed + " km/h, Tarif: " + ratePerKm + " ₼/km";
    }
}
