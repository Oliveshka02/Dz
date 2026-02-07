package Dz2;

import java.util.ArrayList;
import java.util.List;

public class Student {
    private String name;
    private String id;
    private List<Course> courses;

    public Student(String name, String id) {
        this.name = name;
        this.id = id;
        this.courses = new ArrayList<>();
    }

    public void addCourse(Course course) {
        courses.add(course);
    }

    public List<Course> getCoursesBySemester(int semester) {
        List<Course> result = new ArrayList<>();
        for (Course c : courses) {
            if (c.getSemester() == semester) {
                result.add(c);
            }
        }
        return result;
    }

    public boolean hasDebts() {
        for (Course c : courses) {
            if (c.isDebt()) {
                return true;
            }
        }
        return false;
    }

    public int getDebtCount() {
        int count = 0;
        for (Course c : courses) {
            if (c.isDebt()) count++;
        }
        return count;
    }

    public double getAverageRating() {
        int sum = 0;
        int count = 0;
        for (Course c : courses) {
            if (c.isPassed()) {
                sum += c.getGrade();
                count++;
            }
        }
        return count > 0 ? (double) sum / count : 0;
    }

    public List<Course> getDebts() {
        List<Course> debts = new ArrayList<>();
        for (Course c : courses) {
            if (c.isDebt()) {
                debts.add(c);
            }
        }
        return debts;
    }

    public String getName() {
        return name;
    }

    public List<Course> getAllCourses() {
        return courses;
    }

    @Override
    public String toString() {
        return name + " (" + id + ")";
    }
}