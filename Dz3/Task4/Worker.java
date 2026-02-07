package Dz3.Task4;

class Worker implements IWorker {
    private String name;

    public Worker(String name) {
        this.name = name;
    }

    @Override
    public String getName() { return name; }

    @Override
    public void work(House house) {
        IPart part = house.getNextPartToBuild();
        if (part != null) {
            System.out.println(name + " строит: " + part.getName());
            part.build();
        }
    }
}