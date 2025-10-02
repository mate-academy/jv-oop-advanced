package core.basesyntax;

public abstract class Figure {
    public abstract double getArea();
    public abstract String draw();
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }
}
