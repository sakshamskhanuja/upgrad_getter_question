public class Main {
    public static void main(String[] args) {
        // Write code here
        Person person = new Person("Ankit");
        System.out.println(person.getName());
    }
}

class Person {
    private String name;
    public Person(String name) {
        this.name = name;
    }

    // Declare a getter method here
    public String getName() {
        return name;
    }
}