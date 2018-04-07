class Person {
    private String name;
    private int age;

     Person(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return name + " " + age;
    }
}
public class f1{
    public static void main(String[] args) {
        Person person = new Person("Andrius", 12);
        System.out.println(person);


    }
}