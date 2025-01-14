package core.basesyntax;

public abstract class Figure {
    String color;
    double area;
    String name;

    public Figure(String color, double area, String name) {
        this.color = color;
        this.area = area;
        this.name = name;
    }

    public abstract String getFigure();
}
