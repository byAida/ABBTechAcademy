package Homework5;

import Homework5.Transport;
import Homework5.TransportType;

import java.util.Scanner;

import static Homework5.TransportManager.getTransport;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Nəqliyyat növünü seçin (BUS, TAXI, BICYCLE, SCOOTER): ");
        String inputType = sc.next().toUpperCase();
        TransportType type = TransportType.valueOf(inputType);

        System.out.print("Məsafəni daxil edin (km): ");
        double distance = sc.nextDouble();

        System.out.print("Sərnişin sayını daxil edin: ");
        int passengers = sc.nextInt();

        Transport transport = getTransport(type);

        System.out.println("Nəqliyyat Məlumatı");
        System.out.println(transport.getTransportInfo());

        double fare = transport.calculateFare(distance, passengers);
        double time = transport.calculateTime(distance);

        System.out.println("Təxmini qiymət: " + String.format("%.2f", fare) + " ₼");
        System.out.println("Təxmini vaxt: " + String.format("%.2f", time) + " saat");
    }
}