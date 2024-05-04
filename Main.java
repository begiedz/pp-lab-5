import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        Person[] people = new Person[5];

        final int b = 10;

        try {
            people[0] = new Person("John Doe", 30);
            people[1] = new Person("Alice Smith", 25);
            people[2] = new Person("Bob Johnson", 40);
            people[3] = new Person("Emily Davis", 35);
            people[4] = new Person("Michael Brown", 28);

            for (Person person : people) {
                int result = MathUtils.add(person.getAge(), b);
                System.out.println("Result for " + person.getName() + ": " + result);

                Messenger messenger = new EmailMessenger();
                messenger.sendMessage("Hello, " + person.getName() + "! Your result is: " + result);
            }
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
