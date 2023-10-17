package check;

import constants.Constants;

public class Check {
    private static String firstName = "みき";
    private static String lastName = "まや";

    private static void printName(String firstName, String lastName) {
        System.out.println("printNameメソッド → " + firstName + lastName);
    }

    public static void main(String[] args) {
        Check check = new Check();
        check.printName(firstName, lastName);

        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_JAVA);
        pet.introduce();

        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
        robotPet.introduce();
    }
}
