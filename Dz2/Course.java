package Dz2;

public class Course {
    private String name;
    private int semester;
    private int grade;
    private boolean isPassed;

    public Course(String name, int semester) {
        this.name = name;
        this.semester = semester;
        this.grade = 0;
        this.isPassed = false;
    }

    public void passCourse(int grade) {
        if (grade >= 1 && grade <= 5) {
            this.grade = grade;
            this.isPassed = true;
        }
    }

    public String getName() {
        return name;
    }

    public int getSemester() {
        return semester;
    }

    public int getGrade() {
        return grade;
    }

    public boolean isPassed() {
        return isPassed;
    }

    public boolean isDebt() {
        return !isPassed;
    }

    @Override
    public String toString() {
        return name + " (сем." + semester + "): " + (isPassed ? grade : "не сдан");
    }
}
