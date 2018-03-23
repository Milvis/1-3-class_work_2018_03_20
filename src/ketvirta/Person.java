package ketvirta;

import java.util.Objects;

public class Person {
    //apsirasom kintamuosius
    private String name;
    private String surname;
//klaviaturoj alt+ins ir getter abu

//alt+ins sukuriam konstruktoriu pazyminy abu
    public Person(String name, String surname) {
//        this(name); //pridedam kita kontruktoriu
        this.name = name;
        this.surname = surname;
    }

//    public Person(String name){  //kitas konstruktorius kuri dedam i pirma
//        this.name=name;
//    }


    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Person)) return false;
        Person person = (Person) o;
        return Objects.equals(getName(), person.getName()) &&
                Objects.equals(getSurname(), person.getSurname());
    }

    @Override
    public int hashCode() {

        return Objects.hash(getName(), getSurname());
    }

    //getter abu
    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }
}
