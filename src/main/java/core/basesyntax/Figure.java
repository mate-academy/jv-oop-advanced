package core.basesyntax;

public abstract class Figure {
    String name;
    String color;
    double area;

    public Figure() {

    }
    public Figure(String name, String color, double area) {
        this.name = name;
        this.color = color;
        this.area = area;
    }

    public abstract void draw();
}
