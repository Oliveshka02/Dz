package Dz4.Task2;

class Fine {
    private String type;
    private double amount;
    private String city;
    private String date;

    public Fine(String type, double amount, String city, String date) {
        this.type = type;
        this.amount = amount;
        this.city = city;
        this.date = date;
    }

    public String getType() { return type; }
    public String getCity() { return city; }
    public double getAmount() { return amount; }

    @Override
    public String toString() {
        return String.format("  Тип: %s | Сумма: %.2f | Город: %s | Дата: %s",
                type, amount, city, date);
    }
}
