package Dz4.Task1;

import java.util.List;
import java.util.ArrayList;

class RequestStatistics {
    private List<Client> history = new ArrayList<>();

    public void addRecord(Client client) {
        history.add(client);
    }

    public void printStatistics() {
        System.out.println("\n========== СТАТИСТИКА ЗАПРОСОВ ==========");
        System.out.println("Всего запросов: " + history.size());
        System.out.println("----------------------------------------");

        for (Client c : history) {
            System.out.println(c);
        }
        System.out.println("========================================");
    }
}
