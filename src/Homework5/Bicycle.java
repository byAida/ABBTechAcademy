package Homework5;

class Bicycle implements Transport {
    private final double ratePerKm = 0.1;
    private final double speed = 15;

    @Override
    public double calculateFare(double distance) {
        return distance * ratePerKm;
    }

    @Override
    public double calculateFare(double distance, int passengers) {
        // Velosiped tək şəxs üçündür
        if (passengers > 1) {
            System.out.println("Velosiped yalnız bir nəfərlikdir!");
        }
        return calculateFare(distance);
    }

    @Override
    public double calculateTime(double distance) {
        return distance / speed;
    }

    @Override
    public String getTransportInfo() {
        return "Bicycle - ekoloji və sağlam seçim. Sürət: " + speed + " km/h, Tarif: " + ratePerKm + " ₼/km";
    }
}
