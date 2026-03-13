package core.basesyntax;

public abstract class Figure implements Drawable {
    private String name;
    private Color color;
    private double area;

    public Figure(Color color, double area, String name) {
        this.color = color;
        this.area = area;
        this.name = name;
    }

    public Color getColor() {
        return color;
    }

    public double getArea() {
        return area;
    }

    public String getName() {
        return name;
    }
}
