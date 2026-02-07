package Dz2;

public class Main1 {
    public static void main(String[] args) {
        Book book1 = new Book("Война и мир", "Лев Толстой", 1869, "Русский вестник", "Роман", 1225);
        book1.displayInfo();

        System.out.println("\n---");

        Book book2 = new Book();
        book2.setTitle("1984");
        book2.setAuthor("Джордж Оруэлл");
        book2.setYear(1949);
        book2.setPublisher("Секер и Варбург");
        book2.setGenre("Антиутопия");
        book2.setPages(328);

        System.out.println("Книга: " + book2.getTitle());
        System.out.println("Автор: " + book2.getAuthor());
    }
}