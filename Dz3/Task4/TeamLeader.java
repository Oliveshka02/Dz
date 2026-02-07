package Dz3.Task4;

class TeamLeader implements IWorker {
    private String name;

    public TeamLeader(String name) {
        this.name = name;
    }

    @Override
    public String getName() { return name; }

    @Override
    public void work(House house) {
        System.out.println("\n=== ОТЧЕТ БРИГАДИРА " + name + " ===");

        // Проверяем каждую часть
        printPartStatus("Фундамент", house.getBasement());

        int builtWalls = 0;
        for (Wall w : house.getWalls()) if (w.isBuilt()) builtWalls++;
        System.out.println("Стены: " + builtWalls + "/4 построено");

        printPartStatus("Дверь", house.getDoor());

        int builtWindows = 0;
        for (Window w : house.getWindows()) if (w.isBuilt()) builtWindows++;
        System.out.println("Окна: " + builtWindows + "/4 построено");

        printPartStatus("Крыша", house.getRoof());

        // Общий прогресс
        double totalProgress = calculateTotalProgress(house);
        System.out.printf("Общий прогресс: %.1f%%%n", totalProgress);
        System.out.println("========================\n");
    }

    private void printPartStatus(String name, IPart part) {
        System.out.println(name + ": " + (part.isBuilt() ? "построено" : "не построено"));
    }

    private double calculateTotalProgress(House house) {
        double sum = house.getBasement().getBuildProgress();
        for (Wall w : house.getWalls()) sum += w.getBuildProgress();
        sum += house.getDoor().getBuildProgress();
        for (Window w : house.getWindows()) sum += w.getBuildProgress();
        sum += house.getRoof().getBuildProgress();
        return sum / 11; // 11 частей всего
    }
}