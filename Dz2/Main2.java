package Dz2;

public class Main2 {
    public static void main(String[] args) {
        Group group = new Group("ПО-21");

        Student student1 = new Student("Иванов Иван", "PO2101");
        Student student2 = new Student("Петров Петр", "PO2102");
        Student student3 = new Student("Сидорова Анна", "PO2103");

        student1.addCourse(new Course("Математика", 1));
        student1.addCourse(new Course("Программирование", 1));
        student1.addCourse(new Course("Физика", 2));


        student1.getAllCourses().get(0).passCourse(4);


        student2.addCourse(new Course("Математика", 1));
        student2.addCourse(new Course("Программирование", 1));
        student2.addCourse(new Course("Физика", 2));

        student2.getAllCourses().get(0).passCourse(5);
        student2.getAllCourses().get(1).passCourse(4);
        student2.getAllCourses().get(2).passCourse(3);

        student3.addCourse(new Course("Математика", 1));
        student3.addCourse(new Course("Программирование", 1));
        student3.addCourse(new Course("Физика", 2));
        student3.addCourse(new Course("Английский", 2));

        student3.getAllCourses().get(0).passCourse(3);
        student3.getAllCourses().get(2).passCourse(4);
        student3.getAllCourses().get(3).passCourse(5);

        group.addStudent(student1);
        group.addStudent(student2);
        group.addStudent(student3);

        // ТЕСТИРОВАНИЕ ЗАПРОСОВ

        // 1. Неуспешные студенты
        System.out.println("=== 1. НЕУСПЕШНЫЕ СТУДЕНТЫ ===");
        for (Student s : group.getFailingStudents()) {
            System.out.println(s + ", долгов: " + s.getDebtCount());
            for (Course debt : s.getDebts()) {
                System.out.println("   - " + debt.getName());
            }
        }

        // 2. Успешные студенты (без долгов)
        System.out.println("\n=== 2. УСПЕШНЫЕ СТУДЕНТЫ ===");
        for (Student s : group.getSuccessfulStudents()) {
            System.out.println(s);
        }

        // 3. Курс с наибольшим числом неуспешных
        System.out.println("\n=== 3. САМЫЙ ПРОБЛЕМНЫЙ КУРС ===");
        System.out.println(group.getCourseWithMostFailures());

        // 4. Рейтинг студентов
        System.out.println("\n=== 4. РЕЙТИНГ ===");
        group.printRatings();

        // 5. Курсы студента в семестре
        System.out.println("\n=== 5. КУРСЫ В СЕМЕСТРЕ ===");
        group.printStudentCoursesInSemester("Иванов Иван", 1);
    }
}