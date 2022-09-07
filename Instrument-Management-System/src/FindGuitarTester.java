import java.util.List;

public class FindGuitarTester {
    public static void main(String[] args) {
        Inventory myInventory = new Inventory();
        GuitarSpec testGuitar = new GuitarSpec(Builder.FENDER,"test",Type.ELECTRIC,Wood.BRAZILIAN_ROSEWOOD,Wood.BRAZILIAN_ROSEWOOD,12);
        myInventory.addGuitar("1", 1000,testGuitar);
        myInventory.addGuitar("2", 2000,testGuitar);

        List<Guitar> matchingGuitars = myInventory.searchGuitar(testGuitar);
        for (Guitar matchingGuitar : matchingGuitars) {
            System.out.println(matchingGuitar);
        }
    }
}
