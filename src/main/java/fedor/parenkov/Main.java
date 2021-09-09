package fedor.parenkov;

public class Main {

    public static void main(String[] args) {

        Human russianGirl = new Human("Mary", false, 28, 1.65,
        "Russia", true, "HR manager", false);

        russianGirl.meetTheHuman();
        russianGirl.getHobbies();
        russianGirl.abilityToBearChildren();
        russianGirl.haveBadHabits();

        
       Human russianBoy = new Human("Alex", true, 30, 1.83,
       "Russia", false, "QA engineer", true);

        russianBoy.meetTheHuman();
        russianBoy.getHobbies();
        russianBoy.abilityToBearChildren();
        russianBoy.haveBadHabits();
    }
}
