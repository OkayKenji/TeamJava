import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        SightingReader aaa = new SightingReader();
        ArrayList<Sighting> bbb =  aaa.getSightings("sightings.csv");
    }
}
