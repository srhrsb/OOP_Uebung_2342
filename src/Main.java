public class Main {

    public static void main(String[] args) {
        Campus campus = new Campus();

        String values = campus.toString();
        System.out.println(values);

        var buildings = campus.getBuildings();

        buildings[0].setName("BS60");

        String values2 = campus.toString();
        System.out.println(values2);

    }

}