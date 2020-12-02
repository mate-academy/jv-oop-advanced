package core.basesyntax;

public abstract class Figure implements Print {
    private String name;
    private double area;
    private Color color;

    public Figure(String name, double area, Color color) {
        this.name = name;
        this.area = area;
        this.color = color;
    }

    public String getName() {
        return name;
    }

    public double getArea() {
        return area;
    }

    public Color getColor() {
        return color;
    }
}
