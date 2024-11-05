public class Campus {
    private Building[] buildings;

    public Campus(){

        buildings = new Building[4];

        buildings[0]= new Building("BS 6");
        buildings[1] = new Building("BS 11", 4);
        buildings[2] = new Building("Cube", 1, 10);
        buildings[3] = new Building("BS 15", 3, 30, 1000);
    }

    public String toString(){
        String str = "";

        for( var building : buildings){

            //Todo: Daten via Getter holen und in String schreiben
            String name = building.getName();
            int floors = building.getFloors();
            int roomCount = building.getRoomCount();
            int squareMeters = building.getSquareMeters();

            str += "Building: " + name +" ,Floors: "
                    + floors+", RoomCount: "+ roomCount +
                    " , SquareMeters: "+ squareMeters;

            str +="\n"; //Zeilenumbruch
        }


        return str;
    }

    public Building[] getBuildings() {
        return buildings;
    }
}
