package Dz3.Task4;

class House {
    private Basement basement;
    private Wall[] walls;
    private Door door;
    private Window[] windows;
    private Roof roof;

    public House() {
        basement = new Basement();
        walls = new Wall[4];
        for (int i = 0; i < 4; i++) walls[i] = new Wall();
        door = new Door();
        windows = new Window[4];
        for (int i = 0; i < 4; i++) windows[i] = new Window();
        roof = new Roof();
    }

    // Проверка что нужно строить дальше
    public IPart getNextPartToBuild() {
        if (!basement.isBuilt()) return basement;
        for (Wall w : walls) if (!w.isBuilt()) return w;
        if (!door.isBuilt()) return door;
        for (Window w : windows) if (!w.isBuilt()) return w;
        if (!roof.isBuilt()) return roof;
        return null; // все построено
    }

    public boolean isComplete() {
        return getNextPartToBuild() == null;
    }

    public Basement getBasement() { return basement; }
    public Wall[] getWalls() { return walls; }
    public Door getDoor() { return door; }
    public Window[] getWindows() { return windows; }
    public Roof getRoof() { return roof; }
}
