package sample;

public class StudentuAdresai {
    private int id;
    private int student_id;
    private String country;
    private String city;
    private String street;
    private String post_code;

    public StudentuAdresai(int id, int student_id, String country, String city, String street, String post_code) {
        this.id = id;
        this.student_id = student_id;
        this.country = country;
        this.city = city;
        this.street = street;
        this.post_code = post_code;
    }

    public int getId() {
        return id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getCountry() {
        return country;
    }

    public String getCity() {
        return city;
    }

    public String getStreet() {
        return street;
    }

    public String getPost_code() {
        return post_code;
    }
}
