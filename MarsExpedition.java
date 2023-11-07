import java.util.Scanner;
public class MarsExpedition {
    public static void main(String[] args) throws InterruptedException {
        System.out.println("Expedition terminal booting up");
        Thread.sleep(300);
        System.out.println("Expedition terminal launched");
        Thread.sleep(500);
        Scanner input = new Scanner(System.in);
        System.out.println("Please provide your name.");
        System.out.println("(Insert Name)");
        String userName = input.nextLine();
        Thread.sleep(100);
        System.out.println("Welcome " + userName + " -- Welcome to the Expedition prep program. Are you ready to head out into the new world? (Y) (N)");
        char response = input.next().charAt(0);
        if (response == 'Y'){
            System.out.println("I knew you would say that. You're our team leader for a reason.");
        } else {
            System.out.println("That is unfortunate. You are our team leader. You have to go. I apologize for the inconvenience");
        }
        int group = input.nextInt();
        System.out.println("How many people would you like to bring with you on your exploration?");
        System.out.println("(Input group size)");
        if(group > 2){
            System.out.println("That is too many people Team Leader. There are only 3 seats in the pod.");
            group = 2;
        } else if (group < 2){
            System.out.println("Team leader please reconsider bringing one more person.");
            group = 2;
        } else {
            System.out.println("Good choice Team leader.");
        }
        String snack = input.nextLine();
        System.out.println("You are allowed one snack on your exploration. What would you like to bring with you?");
        System.out.println("(Input snack name here)");
        Thread.sleep(100);
        System.out.println("Great choice, you will be bringing " + snack + " with you.");
        System.out.println("You have the choice of 3 vehicles" +
                "\nA: A Hoverbike" +
                "\nB: A 1989 Toyota Supra Turbo" +
                "\nC: A Warthog");
        String vehicleChoice = input.nextLine();

        if (vehicleChoice.equalsIgnoreCase("A")){
            vehicleChoice = "a Hoverbike";
        } else if (vehicleChoice.equalsIgnoreCase("B")){
            vehicleChoice = "a 1989 Toyota Supra Turbo";
        } else if (vehicleChoice.equalsIgnoreCase("C")){
            vehicleChoice = "a Warthog";
        } else {
            vehicleChoice = "Your feet";
        }

        System.out.println("Well Team Leader " + userName + ". Your team size is " + group + " and you are bringing " + snack + " with you in " + vehicleChoice);
        System.out.println("You are ready to depart for your exploration");
        System.out.println("5");
        Thread.sleep(300);
        System.out.println("4");
        Thread.sleep(300);
        System.out.println("3");
        Thread.sleep(300);
        System.out.println("2");
        Thread.sleep(300);
        System.out.println("1");
        Thread.sleep(300);
        System.out.println("Opening airlock door. Good luck " + userName + " safe travels.");
    }
}
