package School;

import java.util.ArrayList;

public class Course {

    private String subject = "";
    private int grade = 0;

    public Course(String subject, int grade) {
        this.subject = subject;
        this.grade = grade;
    }

    public String getSubject() {
        return subject;
    }

    @Override
    public String toString() {
        return "Course{" +
                "subject='" + subject + '\'' +
                '}';
    }

    public int getGrade() {
        return grade;
    }
}
