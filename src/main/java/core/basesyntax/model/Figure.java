package core.basesyntax.model;

public abstract class Figure {
    protected String name;
    protected double area;
    protected Color color;

    public Figure(String name, double area, Color color) {
        this.name = name;
        this.area = area;
        this.color = color;
    }

    @Override
    public String toString() {
        return "Figure: " + name + ", area: " + area + "sq.units, color: " + color;
    }
}
