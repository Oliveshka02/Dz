package Dz3.Task4;

class Team {
    private IWorker[] workers;

    public Team(IWorker[] workers) {
        this.workers = workers;
    }

    public void buildHouse(House house) {
        System.out.println("=== НАЧАЛО СТРОИТЕЛЬСТВА ===\n");

        while (!house.isComplete()) {
            for (IWorker worker : workers) {
                worker.work(house);
                if (house.isComplete()) break;
            }
        }

        System.out.println("=== СТРОИТЕЛЬСТВО ЗАВЕРШЕНО! ===");
    }
}

