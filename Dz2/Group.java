package Dz2;

import java.util.ArrayList;
import java.util.List;

public class Group {
    private String name;
    private List<Student> students;

    public Group(String name) {
        this.name = name;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        students.add(student);
    }

    public List<Student> getFailingStudents() {
        List<Student> failing = new ArrayList<>();
        for (Student s : students) {
            if (s.hasDebts()) {
                failing.add(s);
            }
        }
        return failing;
    }

    public List<Student> getSuccessfulStudents() {
        List<Student> successful = new ArrayList<>();
        for (Student s : students) {
            if (!s.hasDebts()) {
                successful.add(s);
            }
        }
        return successful;
    }

    public String getCourseWithMostFailures() {
        java.util.Map<String, Integer> debtCount = new java.util.HashMap<>();

        for (Student s : students) {
            for (Course c : s.getAllCourses()) {
                if (c.isDebt()) {
                    String courseName = c.getName();
                    debtCount.put(courseName, debtCount.getOrDefault(courseName, 0) + 1);
                }
            }
        }

        String worstCourse = "нет данных";
        int maxDebts = 0;

        for (java.util.Map.Entry<String, Integer> entry : debtCount.entrySet()) {
            if (entry.getValue() > maxDebts) {
                maxDebts = entry.getValue();
                worstCourse = entry.getKey();
            }
        }

        return worstCourse + " (" + maxDebts + " неуспешных)";
    }

    public void printRatings() {
        System.out.println("--- РЕЙТИНГ СТУДЕНТОВ ---");
        for (Student s : students) {
            System.out.printf("%s: %.2f%n", s.getName(), s.getAverageRating());
        }
    }

    public void printStudentCoursesInSemester(String studentName, int semester) {
        for (Student s : students) {
            if (s.getName().equals(studentName)) {
                System.out.println("Курсы " + s.getName() + " в семестре " + semester + ":");
                List<Course> courses = s.getCoursesBySemester(semester);
                if (courses.isEmpty()) {
                    System.out.println("нет курсов");
                } else {
                    for (Course c : courses) {
                        System.out.println("  " + c);
                    }
                }
                return;
            }
        }
        System.out.println("Студент не найден");
    }

    public List<Student> getStudents() {
        return students;
    }

    public String getName() {
        return name;
    }
}
