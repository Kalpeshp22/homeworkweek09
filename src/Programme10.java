
// Write the programme that tell you which line pass through particular stations.
//Just use Zone 1 stations name.

import java.util.Scanner;

public class Programme10 {

    public static void main(String[] args) {
        Scanner ob = new Scanner(System.in);

        String[] Bakerloo = {"Paddington", "EdgwareRoad", "Marylebone", "Baker Street", "Regents Park", "Oxford Circus", "Piccadilly Circus"};
        String[] Piccadilly = {"Gloucester Road", "South Kensington", "Knightsbridge", "Hyde Park Corner", "Green Park", "Piccadilly Circus", "Leicester Square", "Covent Garden", "Holborn", "Russell Square", "King's Cross St. Pancras"};
        String[] Metropolitan = {"Baker Street", "Great Portland Street", "Euston Square", "King's Cross St. Pancras", "Farringdon", "Barbican", "Moorgate", "Liverpool Street", "Aldgate"};
        String[] District = {"High Street Kensington", "Gloucester Road", "South kensington", "Sloane Square", "Victoria", "St. Jame's Park", "Westminister", "Embankment", "Temple", "Blackfriars", "Mansion House", "Cannon Street", "Monument", "Tower Hill", "Aldgate East"};
        String[] Circle = {"High Street Kensington", "Gloucester Road", "South kensington", "Sloane Square", "Victoria", "St. Jame's Park", "Westminister", "Embankment", "Temple", "Blackfriars", "Mansion House", "Cannon Street", "Monument", "Tower Hill", "Aldgate", "Liverpool Street", "Moorgate", "Barbican", "Farringdon", "King's Cross St. Pancras", "Euston Square", "Great Portland Street", "Baker Street", "Edgware Road", "Paddington", "Bayswater", "Notting Hill Gate", "High Street Kensington"};
        String[] HammersmithAC = {"Aldgate East", "Liverpool Street", "Moorgate", "Barbican", "Farringdon", "King's Cross St. Pancras", "Euston Square", "Great Portland Street", "Baker Street", "Edgware Road", "Paddington", "Royal Oak", "Westbourne Park", "Ladbroke Grove", "Latimer Road", "Shepherds's Bush", "Goldhawk Road", "Hammersmith"};
        String[] Northern = {"Euston", "  King's Corss St.Pancrase", "Old Stret", "Moorgate", "Bank", "London Bridge", "Borough", "Elephant& Castle", "Waterloo", "Emmbankment", "Charging Cross", "Leicester Square", "Tottenham Court Road", "Goodge Street", "Warren Street", "Victoria"};
        String[] Jubilee = {"Baker Street", "Bond Street", "Green Park", "Westminister", "Waterloo", "SouthWalk", "London Bridge"};
        String[] Central = {"Notthing Hill Gate", " Queesway", " Lancaster Gatre", "Marble Arch", " Bond Street", "Oxfored Circuse", "Tottenham Court Road", "Holorn", "Chancery Lane", "St Pauls", "Bank", "Liverpool Street"};
        String[] Victoria = {"Vauxhall", "Pimlico", "Victoria", "Green Park", "Oxford", "Warren Street", "Euston", "King's Cross St. Pancras"};

        System.out.print("Input the Station name (Zone 1): ");
        String stationName = "";

        stationName += ob.nextLine();
        ob.close();

        for (String i : Bakerloo) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The Bakerloo line passes through this station");
            }
        }
        for (String i : Piccadilly) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The Piccadilly line passes through this station");
            }
        }
        for (String i : Metropolitan) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The Metropolitan line passes through this station");
            }
        }
        for (String i : District) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The District line passes through this station");
            }
        }
        for (String i : Circle) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The Circle line passes through this station");
            }
        }
        for (String i : HammersmithAC) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The Hammersmith and City line passes through this station");
            }
        }
        for (String i : Northern) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The Northern line passes through this station");
            }
        }
        for (String i : Jubilee) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The Jubilee line passes through this station");
            }
        }
        for (String i : Central) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The Central line passes through this station");
            }
        }
        for (String i : Victoria) {
            if (i.equalsIgnoreCase(stationName)) {
                System.out.println("The Victoria line passes through this station");
            }
        }
    }
}
