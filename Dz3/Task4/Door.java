package Dz3.Task4;

class Door implements IPart {
    private boolean built = false;

    @Override
    public String getName() { return "Дверь"; }

    @Override
    public boolean isBuilt() { return built; }

    @Override
    public void build() { built = true; }

    @Override
    public double getBuildProgress() { return built ? 100 : 0; }
}