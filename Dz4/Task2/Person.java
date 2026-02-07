package Dz4.Task2;

import java.util.ArrayList;
import java.util.List;

class Person {
    private String id;
    private String name;
    private List<Fine> fines;

    public Person(String id, String name) {
        this.id = id;
        this.name = name;
        this.fines = new ArrayList<>();
    }

    public void addFine(Fine fine) {
        fines.add(fine);
    }

    public boolean removeFine(int index) {
        if (index >= 0 && index < fines.size()) {
            fines.remove(index);
            return true;
        }
        return false;
    }

    public String getId() { return id; }
    public String getName() { return name; }
    public List<Fine> getFines() { return fines; }

    public void setName(String name) { this.name = name; }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("ID: ").append(id).append(" | Имя: ").append(name).append("\n");
        if (fines.isEmpty()) {
            sb.append("  Штрафов нет\n");
        } else {
            sb.append("  Штрафы:\n");
            for (int i = 0; i < fines.size(); i++) {
                sb.append("  [").append(i).append("] ").append(fines.get(i)).append("\n");
            }
        }
        return sb.toString();
    }
}
