package core.basesyntax;

public abstract class Figure {
    private String color;

    public Figure(String color) {
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    public abstract double getArea();

    public abstract String getName();

    public void draw() {
        System.out.println("Figure: " + getName()
                + ", area: " + getArea()
                + " sq.units, color: " + color);
    }
}
