public class Mars {
    public static void main(String[] args) throws InterruptedException {
        String colonyName = "Colony 1";
        int shipPopulation = 300;
        double meals = 4000.0;
        boolean landing = true;

        meals = meals - (0.75 * shipPopulation);
        meals = meals - (0.75 * shipPopulation);
        System.out.println(meals);
        meals*= 1.5;
        System.out.println(meals);

        shipPopulation += 5;
        System.out.println(shipPopulation);

        String landingLocation = "The Plain";
        if (landingLocation.equalsIgnoreCase("The Plain")){
            System.out.println("Bbzzz Landing on the Plain");
        } else {
            System.out.println("ERROR!!! Flight plan already set. Landing on the Plain");
        }
        landing = landingCheck(24);
        new GuessingGame();
    }
    private static boolean landingCheck(int minutesLeft) throws InterruptedException {
        for(int minute = 0; minute <= minutesLeft; minute++) {
            if(((minute%3) == 0) && ((minute%2) == 0)){
                System.out.println("Keep Center");
            } else if ((minute % 3) == 0){
                System.out.println("Left");
            } else if((minute % 2)== 0){
                System.out.println("Right");
            } else {
                System.out.println("Calculating");
            }
            Thread.sleep(250);
        }
        System.out.println("Landed");
        return false;
    }

}
