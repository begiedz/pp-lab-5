import company.beans.Person;
import company.exceptions.InvalidAgeException;
import company.implementations.EmailMessenger;
import company.interfaces.Messenger;
import company.utils.MathUtils;

public class Main {
    public static void main(String[] args) {
        try {
            Person person = new Person("John", 30);
            System.out.println("Name: " + person.getName());
            System.out.println("Age: " + person.getAge());

            int result = MathUtils.add(10, 20);
            System.out.println("Result of adding: " + result);

            Messenger messenger = new EmailMessenger();
            messenger.sendMessage("The result of adding 10 and 20 is: " + result);
        } catch (InvalidAgeException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
