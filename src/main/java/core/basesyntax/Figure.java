package core.basesyntax;

public abstract class Figure implements Draw, Area {
    public String color;

    public Figure(String color) {
        this.color = color;
    }
}
