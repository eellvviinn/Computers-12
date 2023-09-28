package School;

import java.util.ArrayList;

public class Student {

    private String name = "";
    private int id = 0;
    public static int idd = 0;
    private ArrayList<Course> courses = new ArrayList<>();
    private static int idgenerator() {
        idd++;
        return idd;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", id=" + id +
                '}';
    }

    public Student(String name) {
        this.name = name;
        id = idgenerator();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public int averageCourse() {
        int x = 0;
        for (int i = 0; i < courses.size(); i++) {
            x = x + courses.get(i).getGrade();
        }
        x = x/courses.size();
        return x;
    }

    public void printCourses() {
        String x = "";
        for (int i = 0; i < courses.size(); i++) {
            x = x + courses.get(i).getSubject() + "\n";
        }
        System.out.println(x);
    }


}
