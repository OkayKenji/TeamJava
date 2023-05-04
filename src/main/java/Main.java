// Main class was created in collaboration with Team Python, Team Java, and Team Prolog-Other
class Main {
    public static void main(String[] args) {
        // Creation of the animal monitor class (from TeamPython)
        AnimalMonitor animalMonitor = new AnimalMonitor();

        // loads the .csv file, uses the SightingsReader (from TeamJava) and an ArrayList of Sightings (from TeamProlog-Other)
        animalMonitor.addSightings("src/main/java/sightings.csv");

        // All sightings
        System.out.println("Printing out all sightings:");
        animalMonitor.printList();

        // Mountain Gorilla stats
        System.out.println("------------------------------------");
        System.out.println("There are " + animalMonitor.getCount("Mountain Gorilla") + " Mountain Gorillas" );
        System.out.println("Here are the specific sightings of the Mountain Gorillas:");
        animalMonitor.printSightingsOf("Mountain Gorilla");

        // Spotter 1 stats
        System.out.println("------------------------------------");
        System.out.println("Here are the specific sightings by spotter 1:");
        animalMonitor.printSightingsBy(1);


    }
}