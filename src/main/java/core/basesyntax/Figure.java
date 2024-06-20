package core.basesyntax;

public abstract class Figure implements Draw, Area {
    protected String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
