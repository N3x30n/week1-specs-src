import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.HashMap;
import java.util.Scanner;
import java.util.*;
public class FindingsList {
    public void main() throws InterruptedException {
        Thread.sleep(500);
        System.out.println("Welcome back to the ship Team Leader. What are your findings?");
        ArrayList<String> findings = new ArrayList<String>();
        findings.add("rock");
        findings.add("weird rock");
        findings.add("smooth rock");
        findings.add("rick");
        System.out.println(findings);
        System.out.println("It seems like there is a finding that is not a rock. Let me remove that from the list Team Leader");
        findings.remove("rick");
        System.out.println(findings);
        System.out.println("Perfect");
        Thread.sleep(1000);
        HashMap<String,String> fossils = new HashMap<>();
        fossils.put("Bird Fossil", "The fossil jas wings implying it was capable of flight");
        fossils.put("Fish Fossil", "The fossil is vaguely fish shaped implies there was once water");
        fossils.put("Tooth Fossil", "The tooth from an unknown fossil");
        System.out.println("Fossil data downloaded");
        System.out.println("Which of the fossils would you like to learn more about (Spelling and Spacing is important)?");
        Scanner input = new Scanner(System.in);

        String choice = input.nextLine();

        if (choice.equalsIgnoreCase("Bird")){
            System.out.println("Fossil: " + choice + "\nDescription: " + fossils.get(choice + " Fossil"));
        } else if(choice.equalsIgnoreCase("Fish")) {
            System.out.println("Fossil: " + choice + "\nDescription: " + fossils.get(choice + " Fossil"));
        } else if(choice.equalsIgnoreCase("Tooth")){
            System.out.println("Fossil: " + choice + "\nDescription: " + fossils.get(choice + " Fossil"));
        }

        Thread.sleep(700);

        HashSet<String> supplies = new HashSet<String>();
        supplies.add("Oxygen Tank");
        supplies.add("10 Meter Rope");
        supplies.add("Bowie Knife");

        Iterator itr = supplies.iterator();
        System.out.println("Supplies Before Expedition: ");
        while(itr.hasNext()){
            System.out.println(itr.next());
        }
    }
}
