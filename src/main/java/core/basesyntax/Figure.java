package core.basesyntax;

public abstract class Figure implements Draw, AreaCounter {
    private Color color;

    public Figure(String color) {
        this.color = Color.valueOf(color);
    }

    public String getColor() {
        return color.name();
    }
}
