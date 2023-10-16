package check;

import constants.Constants;
public class Check {
    private static String firstName = "みき";
    private static String lastName = "まや";
    
    private static void printName(String firstName, String lastName) {
        System.out.println("フルネームは：" + firstName + " " + lastName);
    }

    public static void main(String[] args) {
        Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, "Java太郎");
        System.out.println("printNameメソッド　→　" + firstName + lastName );
        System.out.println("■僕の名前は" + pet.getName() + "です");
        System.out.println("■ご主人様は" + pet.getMasterName() + "です");

        RobotPet robotPet = new RobotPet(Constants.CHECK_CLASS_R2D2, "パンク");
        System.out.println("◇私はロボット。名前は" + robotPet.getName() + "。");
        System.out.println("◇ご主人様は" + robotPet.getMasterName() + "。");

    }
}
