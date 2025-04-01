package org.example.externalserverclient;

import org.example.externalserverclient.IPService;
import org.example.externalserverclient.IPServiceSoap;


public class Main {
    public static void main(String[] args) {
        // Tworzenie instancji serwisu
        IPService service = new IPService();
        IPServiceSoap soap = service.getIPServiceSoap();

        // Sprawdzenie kraju na podstawie adresu IP
        String ip = "8.8.8.8"; // Przykładowy adres IP (Google DNS)
        String country = soap.getIpLocation(ip);

        // Wyświetlenie wyniku
        System.out.println("IP: " + ip + " -> Kraj: " + country);
    }
}
