public class Building {

    //Eigenschaften der Klasse (auch Attribute oder Felder oder Membervariablen)

   private String name; //Gilt in der gesamten Klasse
   private int floors;
   private int roomCount;
   private int squareMeters;

   //Um "Startwerte" bei der Erstellung des Objekts mitzugeben können dem Konstruktor
   //Parameter mitgegeben werden
   public Building( String name ){ //Parameter "name" gilt nur im Konstruktor

      //this.name verweist auf die Membervariable/Eigenschaften "name"
      this.name = name;

      //Standardwerte
      this.floors = 1;
      this.roomCount = 20;
      this.squareMeters = 500;
   }

   //Überladener Konstruktor
   public Building( String name, int floors ){
      this.name = name;
      this.floors = floors;

      //Standardwerte
      this.roomCount = 20;
      this.squareMeters = 500;
   }


   //Aufgabe 2 weitere Konstruktoren mit zusätzlich roomCount bzw. alle Parameter


   public Building(String name, int floors, int roomCount) {
      this.name = name;
      this.floors = floors;
      this.roomCount = roomCount;

      this.squareMeters = 500;
   }

   public Building(String name, int floors, int roomCount, int squareMeters) {
      this.name = name;
      this.floors = floors;
      this.roomCount = roomCount;
      this.squareMeters = squareMeters;
   }



}
