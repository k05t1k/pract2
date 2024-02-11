package org.example;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Введите долготу первой точки в градусах: ");
        double lon1 = scanner.nextDouble();
        System.out.print("Введите широту первой точки в градусах: ");
        double lat1 = scanner.nextDouble();

        System.out.print("Введите долготу второй точки в градусах: ");
        double lon2 = scanner.nextDouble();
        System.out.print("Введите широту второй точки в градусах: ");
        double lat2 = scanner.nextDouble();

        final double R = 6371; // Земной радиус в километрах

        double rad_lat = Math.toRadians(lat2 - lat1);
        double rad_lon = Math.toRadians(lon2 - lon1);

        double a = Math.sin(rad_lat / 2) * Math.sin(rad_lon / 2) + Math.cos(Math.toRadians(lat1)) * Math.cos(Math.toRadians(lat2)) * Math.sin(rad_lon / 2) * Math.sin(rad_lon / 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));

        double distance = R * c;

        System.out.println("Расстояние между точками: " + distance);
    }
}