package sample;

public class StudentuPazymiai {
    private int id;
    private int student_id;
    private String title;
    private String mark;
    private String time_stamp;

    public StudentuPazymiai(int id, int student_id, String title, String mark, String time_stamp) {
        this.id = id;
        this.student_id = student_id;
        this.title = title;
        this.mark = mark;
        this.time_stamp = time_stamp;
    }

    public int getId() {
        return id;
    }

    public int getStudent_id() {
        return student_id;
    }

    public String getTitle() {
        return title;
    }

    public String getMark() {
        return mark;
    }

    public String getTime_stamp() {
        return time_stamp;
    }
}
