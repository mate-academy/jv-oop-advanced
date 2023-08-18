package core.basesyntax;

public abstract class Figure implements Drawable, AreaCalculator {
    private String name;
    private double area;
    private String color;

    public Figure(String name, String color) {
        this.name = name;
        this.color = color;
    }

    public void setArea() {
        this.area = getArea();
    }

    public String getName() {
        return name;
    }

    public String getColor() {
        return color;
    }
}
