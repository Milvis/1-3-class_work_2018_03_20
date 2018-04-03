public class Students {
    private int id;
    private String name;
    private String surname;
    private String phone;
    private String email;
//kuriam konstruktoriu vien tam kad apsisaugot jog visad kuriant objekta butu naudojami visi parametrai
    public Students(int id, String name, String surname, String phone, String email) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.phone = phone;
        this.email = email;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getSurname() {
        return surname;
    }

    public String getPhone() {
        return phone;
    }

    public String getEmail() {
        return email;
    }
}
