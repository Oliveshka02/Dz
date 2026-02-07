package Dz4.Task1;

public class Main {
    public static void main(String[] args) throws InterruptedException {
        Server server = new Server();

        // Имитируем поток клиентов
        server.addClient(new Client("Иванов", 3, "Запрос на поддержку"));
        Thread.sleep(100);
        server.addClient(new Client("Петров", 1, "Критическая ошибка")); // высший приоритет
        Thread.sleep(100);
        server.addClient(new Client("Сидоров", 5, "Общий вопрос"));
        Thread.sleep(100);
        server.addClient(new Client("Смирнов", 2, "Важный баг")); // второй по важности
        Thread.sleep(100);
        server.addClient(new Client("Кузнецов", 4, "Консультация"));

        System.out.println("\n--- Обработка очереди ---");
        while (server.isRunning && !server.queue.isEmpty()) {
            server.processNext();
            Thread.sleep(500);
        }

        server.shutdown();
    }
}
