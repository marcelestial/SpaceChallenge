import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

public class Simulation {

    public static void main (String[] args) throws Exception{
        File itemsFile = new File("itemsFile");

        runSimulation(loadU1(loadItems(itemsFile)));
        runSimulation(loadU2(loadItems(itemsFile)));
    }

    public static ArrayList loadItems(File file) throws Exception{
        ArrayList items = new ArrayList();
        Scanner scanner = new Scanner(file);

        /*read text file line by line, create Item object for each, add it to an Arraylist of items
        return Item ArrayList*/
        for(int i = 0; scanner.hasNextLine(); i++){
            String itemLine = scanner.nextLine();
            String itemName = itemLine.substring(0, itemLine.indexOf("="));
            int itemWeight = 0; //weight of the item equal to the integer at the end of the line
            items.set(i, new Item(itemName, itemWeight));
        }

        return items;
    }

    public static ArrayList loadU1(ArrayList<Item> items){
        ArrayList <Rocket> u1Rockets = new ArrayList<>();

        /*take the ArrayList from loadItems and start creating U1 rockets.
        fill first rocket with as many items as possible, then move to next
        return ArrayList of U1s that are fully loaded*/
        return u1Rockets;
    }

    public static ArrayList loadU2(ArrayList<Item> items){
        ArrayList <Rocket> u2Rockets = new ArrayList<>();

        /*take the ArrayList from loadItems and start creating U2 rockets.
        fill first rocket with as many items as possible, then move to next
        return ArrayList of U2s that are fully loaded*/

        return u2Rockets;
    }

    public static int runSimulation(ArrayList<Rocket> rockets){
        int totalBudget = 0;
        /*take an arraylist of rockets, call launch and land for each
        if a rocket's launch or land returns false, it has exploded and has to be sent again
        keep track of total budget required for each
        return total budget for all, including crashes*/
        return totalBudget;
    }
}
