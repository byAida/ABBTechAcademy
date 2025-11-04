package Homework7;

import java.util.*;

class Passenger {
    String name;
    boolean isPriority;

    public Passenger(String name, boolean isPriority) {
        this.name = name;
        this.isPriority = isPriority;
    }

    @Override
    public String toString() {
        return name + (isPriority ? "(PRIORITY)" : "");
    }
}

public class BusSimulation {

    private static final int BUS_CAPACITY = 5;
    private static final int MAX_WAITING_PASSENGERS = 10;

    public static void main(String[] args) {
        // Avtobusun siyahısı üçün və dayanacaqda olan sərnişinlər
        List<Passenger> bus = new ArrayList<>();
        Queue<Passenger> waitingQueue = new LinkedList<>();

        waitingQueue.add(new Passenger("Aysel", true));
        waitingQueue.add(new Passenger("Rauf", false));
        waitingQueue.add(new Passenger("Ali", false));
        waitingQueue.add(new Passenger("Nigar", true));
        waitingQueue.add(new Passenger("Samir", true));
        waitingQueue.add(new Passenger("Murad", false));
        waitingQueue.add(new Passenger("Sevinc", true));
        waitingQueue.add(new Passenger("Leyla", false));
        waitingQueue.add(new Passenger("Tural", false));

        // Simulyasiya hissəsi
        for (int stop = 1; stop <= 3; stop++) {
            System.out.println("🌍 Stop " + stop + " çatdı.");
            int numOfPassengersLeaving = (int) (Math.random() * 2);
            for (int i = 0; i < numOfPassengersLeaving; i++) {
                if (!bus.isEmpty()) {
                    Passenger leavingPassenger = bus.remove((int) (Math.random() * bus.size()));
                    System.out.println(leavingPassenger + " avtobusdan düşdü");
                }
            }

            // Dayanacaqda gözləyən sərnişinlərdən minənlər üçün
            int passengersBoarded = 0;
            while (passengersBoarded < 3 && bus.size() < BUS_CAPACITY && !waitingQueue.isEmpty()) {

                // Prioritet sərnişinlər üçün
                Passenger nextPassenger = getNextPassenger(waitingQueue);
                waitingQueue.remove(nextPassenger);
                bus.add(nextPassenger);
                passengersBoarded++;
                System.out.println(nextPassenger + " avtobusa mindi");
            }

            // Avtobusun son vəziyyəti və dayancaqda olanlar
            System.out.println("Avtobusdakı sərnişinlər: " + bus);
            System.out.println("Stop " + stop + " qalan sərnişinlər: " + waitingQueue);
        }

        System.out.println("Simulyasiya bitdi");
        System.out.println("Avtobusda olan son sərnişinlər: " + bus);
    }

    // Prioritet sərnişinlər üçün metod
    private static Passenger getNextPassenger(Queue<Passenger> waitingQueue) {
        for (Passenger passenger : waitingQueue) {
            if (passenger.isPriority) {
                return passenger;
            }
        }return waitingQueue.peek();
    }
}

