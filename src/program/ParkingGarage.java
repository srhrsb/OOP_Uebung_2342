package program;

import program.Building;

public class ParkingGarage extends Building {

    private int parkingSpaces;

    public ParkingGarage(String name, int floors, int parkingSpaces){
        super(name, floors);
        this.parkingSpaces = parkingSpaces;
    }

    @Override //Anmerkung für den Compiler um besser Fehler identifizieren zu können
    public void print(){
         super.print(); //Funktion der Basisklasse

        //Methode aus Basisklasse wird zusätzlich implementiert
        System.out.println("Park Garage");
    }

    public int getParkingSpaces() {
        return parkingSpaces;
    }
}
