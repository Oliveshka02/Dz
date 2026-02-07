package Dz4.Task1;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class Client implements Comparable<Client> {
    private String name;
    private int priority; // 1 - высший, 10 - низший
    private String request;
    private LocalDateTime requestTime;

    public Client(String name, int priority, String request) {
        this.name = name;
        this.priority = priority;
        this.request = request;
        this.requestTime = LocalDateTime.now();
    }

    @Override
    public int compareTo(Client other) {
        return Integer.compare(this.priority, other.priority);
    }

    public String getName() { return name; }
    public int getPriority() { return priority; }
    public String getRequest() { return request; }
    public LocalDateTime getRequestTime() { return requestTime; }

    @Override
    public String toString() {
        return String.format("Клиент: %s | Приоритет: %d | Запрос: %s | Время: %s",
                name, priority, request,
                requestTime.format(DateTimeFormatter.ofPattern("HH:mm:ss")));
    }
}