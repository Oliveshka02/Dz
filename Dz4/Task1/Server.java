package Dz4.Task1;

import java.util.PriorityQueue;

class Server {
    public PriorityQueue<Client> queue = new PriorityQueue<>();
    private RequestStatistics statistics = new RequestStatistics();
    public boolean isRunning = true;

    // Добавить клиента в очередь
    public void addClient(Client client) {
        queue.offer(client);
        statistics.addRecord(client);
        System.out.println("Добавлен: " + client.getName() + " (приоритет " + client.getPriority() + ")");
    }

    // Обработать следующий запрос
    public void processNext() {
        if (queue.isEmpty()) {
            System.out.println("Очередь пуста");
            return;
        }
        Client client = queue.poll();
        System.out.println("Обработан: " + client.getName());
    }

    // Закрыть сервер и вывести статистику
    public void shutdown() {
        isRunning = false;
        System.out.println("\nСервер остановлен");
        statistics.printStatistics();
    }

    public boolean isRunning() { return isRunning; }
}