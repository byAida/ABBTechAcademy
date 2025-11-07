package Homework8;

import java.time.Duration;
import java.time.LocalDateTime;
import java.util.*;

class Car {
    private int id;
    private String brand;
    private String model;
    private int year;

    public Car(int id, String brand, String model, int year) {
        this.id = id;
        this.brand = brand;
        this.model = model;
        this.year = year;
    }

    public int getId() {
        return id;
    }

    public String getBrand() {
        return brand;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Car)) return false;
        Car car = (Car) o;
        return id == car.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return brand + " " + model + " (" + year + ")";
    }
}

class Customer {
    private int id;
    private String name;
    private String licenseNumber;

    public Customer(int id, String name, String licenseNumber) {
        this.id = id;
        this.name = name;
        this.licenseNumber = licenseNumber;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getLicenseNumber() {
        return licenseNumber;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Customer)) return false;
        Customer that = (Customer) o;
        return id == that.id;
    }

    @Override
    public int hashCode() {
        return Objects.hash(id);
    }

    @Override
    public String toString() {
        return name + " (" + licenseNumber + ")";
    }
}

class CarRentalSystem {
    private Set<Car> allCars = new HashSet<>();
    private Set<Car> availableCars = new HashSet<>();
    private Map<Customer, Car> rentedCars = new HashMap<>();
    private Map<Car, LocalDateTime> rentStartTimes = new HashMap<>();
    private Map<Car, LocalDateTime> rentalHistory = new HashMap<>();

    // Avtomobili əlavə etmək üçün metod yaratdım
    public void addCar(Car car) {
        allCars.add(car);
        availableCars.add(car);
    }

    // Avtomobili icarəyə vermək üçün metod yaratdım
    public void rentCar(Customer c, Car car) {
        if (!availableCars.contains(car)) {
            System.out.println("Avtomobil icarəyə uyğun deyil: " + car);
            return;
        }
        rentedCars.put(c, car);
        LocalDateTime start = LocalDateTime.now();
        rentStartTimes.put(car, start);
        availableCars.remove(car);
        System.out.println(c.getName() + " " + car.getModel() + " avtomobilini " + start + " tarixində icarəyə götürdü.");
    }

    // Avtomobili geri qaytarmaq üçün isə bu metoddan istifadə edirik
    public void returnCar(Customer c) {
        Car car = rentedCars.get(c);
        if (car == null) {
            System.out.println(c.getName() + " hazırda heç bir avtomobil icarəyə götürməyib.");
            return;
        }

        LocalDateTime start = rentStartTimes.get(car);
        LocalDateTime end = LocalDateTime.now();
        Duration duration = Duration.between(start, end);

        long hours = duration.toHours();
        long days = hours / 24;
        long remainingHours = hours % 24;

        System.out.println(" " + c.getName() + " " + car.getModel() + " avtomobilini qaytardı.");
        System.out.println("Bu avtomobil " + days + " gün " + remainingHours + " saat icarədə olub.");

        availableCars.add(car);
        rentedCars.remove(c);
        rentalHistory.put(car, end);
    }

    public void printActiveRentals() {
        System.out.println("Aktiv icarələr:");
        if (rentedCars.isEmpty()) {
            System.out.println("Heç bir aktiv icarə yoxdur.");
            return;
        }
        for (Map.Entry<Customer, Car> entry : rentedCars.entrySet()) {
            LocalDateTime start = rentStartTimes.get(entry.getValue());
            System.out.println(entry.getKey().getName() + " -> " + entry.getValue().getModel() + " (icarə tarixi: " + start + ")");
        }
    }

    public void printAvailableCars() {
        System.out.println("Azad avtomobillər:");
        if (availableCars.isEmpty()) {
            System.out.println("Hazırda bütün avtomobillər icarədədir.");
            return;
        }
        for (Car car : availableCars) {
            System.out.println(car);
        }
    }


    public void printHistory() {
        System.out.println("İcarə tarixçəsi:");
        if (rentalHistory.isEmpty()) {
            System.out.println("Hələ heç bir avtomobil qaytarılmayıb.");
            return;
        }
        for (Map.Entry<Car, LocalDateTime> entry : rentalHistory.entrySet()) {
            System.out.println(entry.getKey().getModel() + " sonuncu dəfə " + entry.getValue() + " tarixində qaytarılıb.");
        }
    }
}

