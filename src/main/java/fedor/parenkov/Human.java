package fedor.parenkov;

public class Human {

//  Параметры взрослого человека
    String name = "Default name";
    boolean gender = true;
    int age = 0;
    double height = 0.0;
    String state = "Default state";
    boolean married = true;
    String job = "lawyer";
    String[] manHobbies = {"running", "traveling", "gaming", "learn English"};
    String[] womanHobbies = {"swimming", "singing", "painting", "learn Spanish"};
    boolean badHabits = false;

//  Конструктор
    public Human(String name, boolean gender, int age, double height,
                 String state, boolean married, String job, boolean badHabits) {
        this.name = name;
        this.gender = gender;
        this.age = age;
        this.height = height;
        this.state = state;
        this.married = married;
        this.job = job;
        this.badHabits = badHabits;
    }

//  Знакомство с созданным человеком
    void meetTheHuman() {
        System.out.println("Hi! :)");
        System.out.println("My name is " + name + ".");

        if (gender) {
            System.out.print("I'm a man ");
        } else {
            System.out.print("I'm a woman ");
        }

        System.out.println("and I'm " + age + " years old.");
        System.out.println("My height is " + height + " m.");
        System.out.println("I live in " + state + ".");

        if (married) {
            System.out.print("I'm married ");
        } else {
            System.out.print("I'm not married ");
        }
        System.out.println("and I'm a " + job + ".");
    }

//  Хобби людей в зависимости от пола
    void getHobbies() {
        System.out.print("I like ");
        if (gender) {
            for (int i = 0; i < manHobbies.length; i++) {
                System.out.print(manHobbies[i] + ", ");
            }
            System.out.println("etc..");
        } else {
            for (int i = 0; i < womanHobbies.length; i++) {
                System.out.print(womanHobbies[i] + ", ");
            }
            System.out.println("etc..");
        }
    }

//  Способность рожать детей
    Human abilityToBearChildren() {
            if (gender) {
                System.out.println("I have NO ability to bear children because I'm a man.");
            } else {
                System.out.println("I have the ability to bear children because I'm a woman.");
            }
            return this;
    }

//  Наличие вредных привычек
    void haveBadHabits() {
        if (badHabits) {
            System.out.println("I smoke, but I going to give up. I promise!");
        } else {
            System.out.println("I have no bad habits at all!");
        }
    }
}
