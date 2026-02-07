package Dz3.Task4;

public class Main {
    public static void main(String[] args) {
        // Создаем дом
        House house = new House();

        // Создаем бригаду: 2 рабочих и бригадир
        IWorker[] team = {
                new Worker("Вася"),
                new Worker("Петя"),
                new TeamLeader("Иван Иванович")
        };

        // Строим
        Team buildingTeam = new Team(team);
        buildingTeam.buildHouse(house);
    }
}
